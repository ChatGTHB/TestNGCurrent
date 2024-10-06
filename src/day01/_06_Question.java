package day01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.BaseDriver;

public class _06_Question extends BaseDriver {

    @Test
    public void loginTest() {  // When this section will be tested, the method named loginTest from BaseDriver should be commented out.
        driver.get("https://opencart.abstracta.us/index.php?route=account/login");

        System.out.println("driver.getTitle() = " + driver.getTitle());
        WebElement inputEmail = driver.findElement(By.id("input-email"));
        inputEmail.sendKeys("testng1@gmail.com");

        WebElement inputpassword = driver.findElement(By.id("input-password"));
        inputpassword.sendKeys("123qweasd");

        WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
        loginBtn.click();

        System.out.println("driver.getTitle() = " + driver.getTitle());
        wait.until(ExpectedConditions.titleIs("My Account"));
        System.out.println("driver.getTitle() = " + driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "My Account");
    }
}