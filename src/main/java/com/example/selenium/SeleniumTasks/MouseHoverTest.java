package com.example.selenium.SeleniumTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class MouseHoverTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demoqa.com/menu");

        // Locate the menu item
        WebElement menu = driver.findElement(By.xpath("//a[text()='Main Item 2']"));

        // Perform hover action
        Actions actions = new Actions(driver);
        actions.moveToElement(menu).perform();
        Thread.sleep(2000);

        driver.quit();
    }
}
