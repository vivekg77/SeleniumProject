package com.example.selenium.SeleniumTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {


    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/v1/");

        //driver.findElement(By.id("user-name")).sendKeys("standard_user");




        WebElement usernameField = driver.findElement(By.cssSelector("#user-name"));
        usernameField.sendKeys(("standard_user"));
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        String text = driver.findElement(By.className("inventory_item")).getText();

        System.out.println(text);
    }

}
