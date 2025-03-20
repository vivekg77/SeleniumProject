package com.example.selenium.SeleniumTasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {



    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.google.com/");

        Thread.sleep(3000);
        driver.navigate().to("https://www.selenium.dev/downloads/");

        Thread.sleep(3000);

        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(3000);

        driver.navigate().back();  //back in the browser history
        Thread.sleep(3000);

        driver.navigate().back();  //back in the browser history
        Thread.sleep(3000);
        driver.navigate().forward();

        driver.navigate().refresh();

        System.out.println("End");

        driver.close();




    }
}
