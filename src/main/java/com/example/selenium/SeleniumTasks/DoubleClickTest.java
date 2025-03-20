package com.example.selenium.SeleniumTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DoubleClickTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demoqa.com/buttons");

        // Locate the double-click button
        WebElement doubleClickBtn = driver.findElement(By.id("doubleClickBtn"));

        // Perform double-click action
        Actions actions = new Actions(driver);
        actions.doubleClick(doubleClickBtn).perform();

        // Verify result
        WebElement message = driver.findElement(By.id("doubleClickMessage"));
        System.out.println("Message: " + message.getText());

        driver.quit();
    }
}
