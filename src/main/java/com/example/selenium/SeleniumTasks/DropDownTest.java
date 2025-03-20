package com.example.selenium.SeleniumTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/select-menu");
        driver.manage().window().maximize();

        // Locate dropdown element
        WebElement dropdown = driver.findElement(By.id("oldSelectMenu"));

        // Create Select instance
        Select select = new Select(dropdown);
        select.selectByVisibleText("Purple");  // Select by text
        select.selectByIndex(3);               // Select by index
        select.selectByValue("5");             // Select by value

        Thread.sleep(2000);
        driver.quit();
    }
}
