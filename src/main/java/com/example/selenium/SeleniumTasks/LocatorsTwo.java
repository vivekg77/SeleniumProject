package com.example.selenium.SeleniumTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorsTwo {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/");

        List<WebElement> list = driver.findElements(By.tagName("div"));

        list.forEach(text-> System.out.println(text.getText()));

    }
}
