package com.example.selenium.SeleniumTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxTests {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/checkbox");
        driver.manage().window().maximize();

        // Click the expand button to see all checkboxes
        driver.findElement(By.xpath("//button[@aria-label='Expand all']")).click();

        // Locate and click a checkbox
        WebElement checkbox = driver.findElement(By.xpath("//span[@class='rct-checkbox']"));
        checkbox.click();

        Thread.sleep(3000);

        driver.quit();
    }
}
