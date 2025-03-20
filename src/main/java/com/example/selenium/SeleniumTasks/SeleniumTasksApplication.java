package com.example.selenium.SeleniumTasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SeleniumTasksApplication {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(SeleniumTasksApplication.class, args);


		System.setProperty("webdriver.chrome.driver","C:\\vivek\\Selenium\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		Thread.sleep(3000);

		driver.close();

	}

}
