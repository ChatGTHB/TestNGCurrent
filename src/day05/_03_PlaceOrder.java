package day05;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.BaseDriver;

public class _03_PlaceOrder extends BaseDriver {

    /**
        Scenario :
        1- Open the site.
        2- Search the word "ipod" on the site
        3- Put the first of the results in the basket.
        4- Click on Shopping Chart.
        5- Checkout.
        6- Click Continue and enter the information.
        7- Confirm that you have placed the order with the last confirm.
        Note: Verify with the text "Your order has been placed" on the page that appears.

        Senaryo :
        1- Siteyi açınız.
        2- Sitede "ipod" kelimesini aratınız
        3- Çıkan sonuçlardan ilkini sepete atınız.
        4- Shopping Chart a tıklatınız.
        5- Checkout yapınız.
        6- Continue butonlarına tıklatıp bilgileri giriniz.
        7- En son confirm ile siparişi verdiğinizi doğrulayınız.
        Not: Doğrulamayı çıkan sayfadaki "Your order has been placed" yazısı ile yapınız.
     */

    @Test
    public void proceedToCheckout() {
        WebElement searchBox = driver.findElement(By.name("search"));
        searchBox.sendKeys("ipod" + Keys.ENTER);

        WebElement addToChart = driver.findElement(By.xpath("//span[text()='Add to Cart']"));
        addToChart.click();

        WebElement shoppingChart = driver.findElement(By.linkText("Shopping Cart"));
        shoppingChart.click();

        WebElement checkOut = driver.findElement(By.linkText("Checkout"));
        checkOut.click();

        WebElement continue1 = wait.until(ExpectedConditions.elementToBeClickable(By.id("button-payment-address")));
        continue1.click();

        WebElement continue2 = wait.until(ExpectedConditions.elementToBeClickable(By.id("button-shipping-address")));
        continue2.click();

        WebElement continue3 = wait.until(ExpectedConditions.elementToBeClickable(By.id("button-shipping-method")));
        continue3.click();

        WebElement agree = driver.findElement(By.name("agree"));
        agree.click();

        WebElement continue4 = wait.until(ExpectedConditions.elementToBeClickable(By.id("button-payment-method")));
        continue4.click();

        WebElement confirm = driver.findElement(By.id("button-confirm"));
        confirm.click();

        //wait.until(ExpectedConditions.urlToBe("http://opencart.abstracta.us/index.php?route=checkout/success"));
        wait.until(ExpectedConditions.urlContains("success"));

        WebElement screenLetter = driver.findElement(By.xpath("//div[@id='content']/h1"));
        Assert.assertEquals(screenLetter.getText(), "Your order has been placed!");
    }
}
