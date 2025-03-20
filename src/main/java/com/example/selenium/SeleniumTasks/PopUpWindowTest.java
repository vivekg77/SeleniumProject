package com.example.selenium.SeleniumTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;

public class PopUpWindowTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.way2automation.com/demo.html");

        // Click the link that opens a new window
        driver.findElement(By.xpath("//a[contains(text(),'New Browser Tab')]")).click();

        // Store window handles
        Set<String> allWindows = driver.getWindowHandles();
        for (String window : allWindows) {
            driver.switchTo().window(window);
        }

        // Perform an action in the new window
        System.out.println("Switched to window: " + driver.getTitle());

        // Close new window and switch back
        driver.close();
        driver.switchTo().defaultContent();
        System.out.println("Back to main window: " + driver.getTitle());

        driver.quit();
    }
}

