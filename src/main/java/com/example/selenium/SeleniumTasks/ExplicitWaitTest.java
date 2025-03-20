package com.example.selenium.SeleniumTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitTest {

    /*
    Explicit wait allows Selenium to wait for a specific condition before proceeding with execution.
    Unlike Implicit Wait, it is Applied to specific elements rather than all elements globally.
    Use Case: When you need to wait until an element is visible, clickable, or present in the DOM.
     */


    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/dynamic-properties");

        // Explicit wait for a button to be clickable
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.id("enableAfter")));

        // Click the button once it's clickable
        button.click();

        driver.quit();
    }
}
