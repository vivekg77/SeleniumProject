package com.example.selenium.SeleniumTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class MultipleTabsTest {

    public static void main(String[] args) {
        // Set up the WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //It applies to all elements instead of specific elements like Explicit waits
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Open the website
        driver.get("https://demoqa.com/browser-windows");

        // Click the "New Tab" button
        WebElement newTabButton = driver.findElement(By.id("tabButton"));
        newTabButton.click();

        // Get window handles
        String mainWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();

        // Switch to the new tab
        for (String handle : allWindowHandles) {
            if (!handle.equals(mainWindowHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }

        // Get the text from the new tab
        WebElement heading = driver.findElement(By.id("sampleHeading"));
        System.out.println("Text in new tab: " + heading.getText());

        // Close the new tab and switch back to the main window
        driver.close();
        driver.switchTo().window(mainWindowHandle);

        // Close the main window
        driver.quit();
    }
}
