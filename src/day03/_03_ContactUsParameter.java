package day03;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utility.BaseDriver;

public class _03_ContactUsParameter extends BaseDriver {

    /**
     * Scenario:
     1- Click ContactUs
     2- Write a message of at least 10 characters in the message box.
     3- After submitting, verify the success text in the url.
     ---------------------------------------------------------------

     Senaryo:
     1- ContactUs'a tıklayınız
     2- Mesaj kutusuna en az 10 karakterlik bir mesaj yazınız.
     3- Submit ettikten sonra url'deki success yazısını doğrulayınız.
     */

    @Test
    @Parameters("message") // must be the same name as in xml
    public void contactUs(String incomingMessage){

        WebElement contactUsButton= driver.findElement(By.linkText("Contact Us"));
        contactUsButton.click();

        WebElement enquiryArea= driver.findElement(By.id("input-enquiry"));
        enquiryArea.sendKeys(incomingMessage);

        WebElement submitButton= driver.findElement(By.cssSelector("[type='submit']"));
        submitButton.click();

        Assert.assertTrue(driver.getCurrentUrl().contains("success"));
    }
}
