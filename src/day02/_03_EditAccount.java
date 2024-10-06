package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utility.BaseDriver;
import utility.Tools;

public class _03_EditAccount extends BaseDriver {
    /**
     Scenario
     1- Open the site.
     2- Navigate to the Edit Account page.
     3- Change the first and last name, and save it again.
     */

    @Test
    public void EditAccount(){
        WebElement editLink = driver.findElement(By.linkText("Edit Account"));
        editLink.click();

        WebElement textFirstName = driver.findElement(By.id("input-firstname"));
        textFirstName.clear();
        textFirstName.sendKeys("Kerem");

        WebElement textLastName = driver.findElement(By.id("input-lastname"));
        textLastName.clear();
        textLastName.sendKeys("Said");

        WebElement buttonSubmit = driver.findElement(By.xpath("//input[@type='submit']"));
        buttonSubmit.click();

        Tools.successMessageValidation();
    }
}
