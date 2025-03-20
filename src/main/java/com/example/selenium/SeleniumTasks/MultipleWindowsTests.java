package com.example.selenium.SeleniumTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class MultipleWindowsTests {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows");

        // Get the main window handle
        String mainWindow = driver.getWindowHandle();

        // Click the "New Window" button
        driver.findElement(By.id("windowButton")).click();

        // Get all window handles
        Set<String> allWindows = driver.getWindowHandles();

        // Switch to the new window
        for (String window : allWindows) {
            if (!window.equals(mainWindow)) {
                driver.switchTo().window(window);
                System.out.println("Switched to new window: " + driver.getTitle());
            }
        }

        // Close the new window and switch back
        //driver.close() here will close the latest window we have switched to
        driver.close();
        driver.switchTo().window(mainWindow);

        System.out.println("Switched back to main window: " + driver.getTitle());
        driver.quit();
    }
}
