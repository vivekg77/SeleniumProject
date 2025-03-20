package com.example.selenium.SeleniumTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatorsLinkText {

    public static void main(String[] args) {


        WebDriver driver = new EdgeDriver();

        driver.get("https://www.saucedemo.com/v1/");


        driver.manage().window().maximize();

        WebElement usernameField = driver.findElement(By.cssSelector("#user-name"));
        usernameField.sendKeys(("standard_user"));
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).sendKeys(Keys.ENTER);

        //WebElement bikeLight = driver.findElement(By.linkText("Sauce Labs Bike Light"));
        WebElement bikeLight = driver.findElement(By.partialLinkText("Sauce Labs Bike"));


        bikeLight.click();



        String text = driver.findElement(By.className("inventory_details_desc_container")).getText();

        System.out.println(text);


    }
}
