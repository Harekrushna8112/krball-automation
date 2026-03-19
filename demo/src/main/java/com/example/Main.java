package com.example;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        // Maximize Window....
        driver.manage().window().maximize();

        // Adding Implicit Wait...
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        Test_Caces test = new Test_Caces(driver);
        
        test.Testcase_01();
        test.Testcase_02();
        test.Testcase_03();
        test.Testcase_04();
        test.Testcase_05();

        driver.quit();


        

    }
}