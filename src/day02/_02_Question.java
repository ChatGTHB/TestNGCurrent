package day02;

import utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _02_Question extends BaseDriver {

    @Test
    public void loginTest() {  // When this section will be tested, the method named logintesti from BaseDriver should be commented out.

        driver.get("https://opencart.abstracta.us/index.php?route=account/login");

        WebElement inputEmail = driver.findElement(By.id("input-email"));
        inputEmail.sendKeys("testng1@gmail.com");

        WebElement inputpassword = driver.findElement(By.id("input-password"));
        inputpassword.sendKeys("123qweasd");

        WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
        loginBtn.click();

        Assert.assertEquals(driver.getTitle(), "My Account");
    }
}
