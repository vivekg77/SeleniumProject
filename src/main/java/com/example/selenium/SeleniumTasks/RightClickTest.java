package com.example.selenium.SeleniumTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class RightClickTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demoqa.com/buttons");

        // Locate the right-click button
        WebElement rightClickBtn = driver.findElement(By.id("rightClickBtn"));

        // Perform right-click action
        Actions actions = new Actions(driver);
        actions.contextClick(rightClickBtn).perform();

        // Verify result
        WebElement message = driver.findElement(By.id("rightClickMessage"));
        System.out.println("Message: " + message.getText());

        driver.quit();
    }
}
