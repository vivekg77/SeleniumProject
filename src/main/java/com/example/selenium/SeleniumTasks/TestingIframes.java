package com.example.selenium.SeleniumTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingIframes {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/frames");

        // Switch to iframe by ID
        driver.switchTo().frame("frame1");

        // Get text inside the iframe
        WebElement heading = driver.findElement(By.id("sampleHeading"));
        System.out.println("Text inside iframe: " + heading.getText());

        // Switch back to main content
        driver.switchTo().defaultContent();

        driver.quit();
    }
}
