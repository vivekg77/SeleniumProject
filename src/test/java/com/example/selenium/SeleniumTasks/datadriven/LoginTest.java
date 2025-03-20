//package com.example.selenium.SeleniumTasks.datadriven;
//
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.DataProvider;
//
//import java.io.IOException;
//import java.time.Duration;
//
//public class LoginTest {
//
//    WebDriver driver;
//
//    @BeforeEach
//    public void setUp() {
//        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//    }
//
//    @DataProvider(name = "loginData")
//    public Object[][] loginDataProvider() throws IOException {
//        return ExcelUtils.getTestData("C:\\vivek\\Selenium\\SeleniumTasks\\SeleniumTasks\\src\\main\\resources\\testData.xlsx", "Sheet1");
//    }
//
//    @Test
//    public void loginTest() {
//        driver.get("https://example.com/login");  // Replace with a real login page
//
//        // Locate username and password fields
//        WebElement userField = driver.findElement(By.id("username"));
//        WebElement passField = driver.findElement(By.id("password"));
//        WebElement loginButton = driver.findElement(By.id("login"));
//
//        // Enter credentials and click login
//        userField.sendKeys(username);
//        passField.sendKeys(password);
//        loginButton.click();
//
//        // Validation (Example: Check if login was successful)
//        System.out.println("Tested login with: " + username + " | " + password);
//    }
//
//    @AfterEach
//    public void tearDown() {
//        driver.quit();
//    }
//}
