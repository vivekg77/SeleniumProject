package com.example.selenium.SeleniumTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtonsTests {

    public static void main(String[] args) {
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://demoqa.com/radio-button");
//
//        // Locate and click a radio button
//        WebElement radioButton = driver.findElement(By.xpath("//input[@id='yesRadio']"));
//        radioButton.click();
//
//        // Verify if the radio button is selected
//        if (radioButton.isSelected()) {
//            System.out.println("Radio button is selected.");
//        }
//
//        driver.quit();
//    }

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.ironspider.ca/forms/checkradio.htm");

        // Find radio buttons in the "Preferred Contact Method" section
        List<WebElement> radioButtons = driver.findElements(By.name("browser"));

        // Click the last radio button
        radioButtons.get(radioButtons.size() - 1).click();

        // Verify the selection
        for (WebElement radio : radioButtons) {
            if (radio.isSelected()) {
                System.out.println("Selected radio button: " + radio.getAttribute("value"));
            }
        }

        driver.quit();
    }
}
