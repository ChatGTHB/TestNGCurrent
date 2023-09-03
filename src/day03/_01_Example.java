package day03;


import utility.BaseDriver;
import utility.MyFunction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class _01_Example extends BaseDriver {

    /**
     Scenario:
     1- Open the site.
     2- Access the Edit Account page.
     3- Change the name and surname and save again.

     --------------------------------------------

     Senaryo:
     1- Siteyi açınız.
     2- Edit Account sayfasına ulaşınız.
     3- Ad ve soyadı değiştirip tekrar kaydediniz.
     */

    @Test
    public void editAccount(){
        WebElement edit=driver.findElement(By.linkText("Edit Account"));
        edit.click();

        WebElement txtFirstName=driver.findElement(By.id("input-firstname"));
        txtFirstName.clear();
        txtFirstName.sendKeys("ismet 2");

        WebElement txtLastName=driver.findElement(By.id("input-lastname"));
        txtLastName.clear();
        txtLastName.sendKeys("temur 2");

        WebElement btnSubmit = driver.findElement(By.xpath("//input[@type='submit']"));
        btnSubmit.click();

        MyFunction.successMessageValidation();
    }
}
