package day02;


import utility.BaseDriver;
import utility.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class _02_EditAccount extends BaseDriver {

    /**
     * Scenario:
     * 1- Open the site.
     * 2- Access the Edit Account page.
     * 3- Change the name and surname and save again.
     * <p>
     * --------------------------------------------
     * <p>
     * Senaryo:
     * 1- Siteyi açınız.
     * 2- Edit Account sayfasına ulaşınız.
     * 3- Ad ve soyadı değiştirip tekrar kaydediniz.
     */

    @Test
    public void editAccount() {

        WebElement editLink = driver.findElement(By.linkText("Edit Account"));
        editLink.click();

        WebElement firstName = driver.findElement(By.id("input-firstname"));
        firstName.clear();
        firstName.sendKeys("Kerem");

        WebElement lastName = driver.findElement(By.id("input-lastname"));
        lastName.clear();
        lastName.sendKeys("Said");

        WebElement submitButton = driver.findElement(By.xpath("//input[@type='submit']"));
        submitButton.click();

        Tools.successMessageValidation();
    }
}
