package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Wrapper {

    public static void navigatetoWebsite(WebDriver driver, String url) throws InterruptedException{
        driver.get(url);
        Thread.sleep(3000);
    }

    public static void click(WebDriver driver, By locator) throws InterruptedException{
        WebElement element= driver.findElement(locator);
        element.click();
        Thread.sleep(3000);

    }

    

    public static void feedbackform(WebDriver driver,String name,String email,String feedback) throws InterruptedException{
        WebElement name_field= driver.findElement(By.xpath("//input[@placeholder='Type your name here...']"));
        name_field.sendKeys(name);
        Thread.sleep(2000);
        WebElement email_field= driver.findElement(By.xpath("//input[@placeholder='Type your email here...']"));
        email_field.sendKeys(email);
        Thread.sleep(2000);
        WebElement rating= driver.findElement(By.xpath("(//div[contains(@class,' bg-transparent')])[4]"));
        rating.click();
        Thread.sleep(2000);
        WebElement feedback_field= driver.findElement(By.xpath("//textarea[@placeholder='Type your comments here...']"));
        feedback_field.sendKeys(feedback);
        Thread.sleep(2000);
        WebElement submit_button= driver.findElement(By.xpath("//p[text()='Submit']"));
        submit_button.click();
        Thread.sleep(3000);
        WebElement text= driver.findElement(By.xpath("//div[text()='Your feedback has been recorded!']"));
        if(text.isDisplayed()){
            System.out.println("Feedback form is submitted successfully...");
        }else{
            System.out.println("Feedback form is not submitted...");
        }
    }


    public static void incomplete_feedbackform(WebDriver driver,String name,String email,String feedback) throws InterruptedException{
        WebElement name_field= driver.findElement(By.xpath("//input[@placeholder='Type your name here...']"));
        name_field.sendKeys(name);
        Thread.sleep(2000);
        WebElement email_field= driver.findElement(By.xpath("//input[@placeholder='Type your email here...']"));
        email_field.sendKeys(email);
        Thread.sleep(2000);
        WebElement rating= driver.findElement(By.xpath("(//div[contains(@class,' bg-transparent')])[4]"));
        rating.click();
        Thread.sleep(2000);
        WebElement feedback_field= driver.findElement(By.xpath("//textarea[@placeholder='Type your comments here...']"));
        feedback_field.sendKeys(feedback);
        Thread.sleep(2000);
        WebElement submit_button= driver.findElement(By.xpath("//p[text()='Submit']"));
        submit_button.click();
        Thread.sleep(3000);
        
        
    }

   public static void age_popup(WebDriver driver) throws InterruptedException{
        
        try{
            WebElement popup = driver.findElement(By.xpath("//button[text()='Yes']"));
            if(popup.isDisplayed()){
                System.out.println("Age Popup is displayed ...");
                popup.click();
            }
        }catch(NoSuchElementException e){
            System.out.println("AgePopup is not displayed ...");
        }
    }

    
    
}
