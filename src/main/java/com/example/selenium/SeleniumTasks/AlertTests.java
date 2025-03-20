package com.example.selenium.SeleniumTasks;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTests {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();

        // Click button to trigger alert
        driver.findElement(By.id("alertButton")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText()); // Print alert text
        alert.accept(); // Click OK
//
//        Thread.sleep(2000); // Pause to see the alert handling

//        // Click button to trigger confirmation alert
//        driver.findElement(By.id("confirmButton")).click();
//        alert = driver.switchTo().alert();
//        alert.dismiss(); // Click Cancel
//
//        Thread.sleep(2000);

        // Click button to trigger prompt alert
//        driver.findElement(By.id("promtButton")).click();
//        Alert alert = driver.switchTo().alert();
//        alert.sendKeys("Test input"); // Enter text in prompt
//        alert.accept(); // Click OK

//        driver.quit();
    }
}
