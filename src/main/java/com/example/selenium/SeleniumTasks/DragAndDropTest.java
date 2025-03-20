package com.example.selenium.SeleniumTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DragAndDropTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demoqa.com/droppable");

        // Locate source (drag) and target (drop) elements
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));

        // Perform drag and drop action
        Actions actions = new Actions(driver);
        actions.dragAndDrop(source, target).perform();

        //When dragAndDrop() does not work due to some conflicts
        //You might want to use
        //actions.clickAndHold(source).move|ToElement(target).release().perform();

        // Verify the drop
        String droppedText = target.getText();
        System.out.println("Dropped text: " + droppedText);

        driver.quit();
    }
}
