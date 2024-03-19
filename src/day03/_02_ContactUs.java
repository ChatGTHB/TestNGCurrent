package day03;


import utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _02_ContactUs extends BaseDriver {

    /**
     Scenario:
     1- Click ContactUs
     2- Write a message of at least 10 characters in the message box.
     3- After submitting, verify the success text in the URL.

     ---------------------------------------------------------------

     Senaryo:
     1- ContactUs'a tıklayınız
     2- Mesaj kutusuna en az 10 karakterlik bir mesaj yazınız.
     3- Submit ettikten sonra URL'deki success yazısını doğrulayınız.
     */

    @Test
    public void contactUs(){

        WebElement contactUsButton= driver.findElement(By.linkText("Contact Us"));
        contactUsButton.click();

        WebElement enquiryArea= driver.findElement(By.id("input-enquiry"));
        enquiryArea.sendKeys("Hello testing world!");

        WebElement submitButton= driver.findElement(By.cssSelector("[type='submit']"));
        submitButton.click();

        Assert.assertTrue(driver.getCurrentUrl().contains("success"));
    }
}
