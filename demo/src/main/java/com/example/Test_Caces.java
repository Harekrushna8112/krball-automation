package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test_Caces {
    WebDriver driver;

    public Test_Caces(WebDriver driver){
        this.driver=driver;
    }
    public void Testcase_01() throws InterruptedException{
        System.out.println("Test Case 01 is Started...");
        Wrapper.navigatetoWebsite(driver,"https://smartpad-customer-feedback.vercel.app/");
        WebElement text_show= driver.findElement(By.xpath("//div[text()='Review Products']"));
        if(text_show.isDisplayed()){
            System.out.println("Test Case 01 is Passed...");
        }else{
            System.out.println("Test Case 01 is Failed...");
        }

        System.out.println("Test Case 01 is Completed...");
       
    }

    public void Testcase_02() throws InterruptedException{
        System.out.println("Test Case 02 is Started...");
        Wrapper.navigatetoWebsite(driver,"https://smartpad-customer-feedback.vercel.app/");
        WebElement get_started_button= driver.findElement(By.xpath("//div[text()='Get started']"));
        if(get_started_button.isEnabled()){
            System.out.println("Test Case 02 is Passed...");
        }else{
            System.out.println("Test Case 02 is Failed...");
        }
        System.out.println("Test Case 02 is Completed...");
       
    }

    public void Testcase_03() throws InterruptedException{
        System.out.println("Test Case 03 is Started...");
        Wrapper.navigatetoWebsite(driver,"https://smartpad-customer-feedback.vercel.app/");
        WebElement get_started_button= driver.findElement(By.xpath("//div[text()='Get started']"));
        get_started_button.click();
        WebElement text=driver.findElement(By.xpath("//h1[text()='What type of']"));
        if(text.isDisplayed()){
            System.out.println("Test Case 03 is Passed...");
        }else{
            System.out.println("Test Case 03 is Failed...");
        }
        System.out.println("Test Case 03 is Completed...");
       
    }

    public void Testcase_04() throws InterruptedException{
        System.out.println("Test Case 04 is Started...");
        Wrapper.navigatetoWebsite(driver,"https://smartpad-customer-feedback.vercel.app/");
        Wrapper.click(driver, By.xpath("//div[text()='Get started']"));
        Wrapper.click(driver, By.xpath("//div[text()='Wine']"));
        WebElement element= driver.findElement(By.xpath("//div[text()='Continue without an account']"));
        if(element.isDisplayed()){
            System.out.println("Unresister user can see the continue without an account...");
            Wrapper.click(driver, By.xpath("//div[text()='Continue without an account']"));
        }else{
            System.out.println("Unresister user can not see the continue without an account...");
        }
        
        Wrapper.age_popup(driver);
        
        Wrapper.click(driver, By.xpath("(//div[contains(@class,'0 justify-between')])[3]"));
        Wrapper.click(driver, By.xpath("//p[text()='Share Feedback']"));
        Wrapper.feedbackform(driver, "John Doe", "john@gmail.com","verygood");
        System.out.println("Test Case 04 is Completed...");
       
    }

    public void Testcase_05() throws InterruptedException{
        System.out.println("Test Case 05 is Started...");
        Wrapper.navigatetoWebsite(driver,"https://smartpad-customer-feedback.vercel.app/");
        Wrapper.click(driver, By.xpath("//div[text()='Get started']"));
        Wrapper.click(driver, By.xpath("//div[text()='Wine']"));
        Wrapper.click(driver, By.xpath("//div[text()='Continue without an account']"));
        
       
        Wrapper.age_popup(driver);
       

        Wrapper.click(driver, By.xpath("(//div[contains(@class,'0 justify-between')])[3]"));
        Wrapper.click(driver, By.xpath("//p[text()='Share Feedback']"));
        Wrapper.incomplete_feedbackform(driver, "", "john@gmail.com","verygood");
        WebElement text= driver.findElement(By.xpath("//div[@class='go3958317564']"));
        if(text.isDisplayed()){
            String message = text.getText();
            System.out.println(message+"  Message is displayed ...");
            
        }else{
            System.out.println("Message is not displayed ...");
        }
        System.out.println("Test Case 05 is Completed...");
       
    }
    
}
