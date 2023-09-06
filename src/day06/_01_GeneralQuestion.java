package day06;


import utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class _01_GeneralQuestion extends BaseDriver {

    /**
     * Scenario;
     * 1- Go to the Brands menu.
     * 2- Verify that each brand starts with the letter above it.
     * <p>
     * Senaryo;
     * 1- Brands menusune gidiniz.
     * 2- Burada her bir markanın üstünde yer alan harf ile başladığını doğrulayınız.
     */

    @Test
    public void brandsValidation() {
        WebElement brandsLink = driver.findElement(By.linkText("Brands"));
        brandsLink.click();

        List<WebElement> harfler = driver.findElements(By.cssSelector("[id='content'] > h2"));    // letters
        List<WebElement> brandRows = driver.findElements(By.cssSelector("[id='content'] > div")); // brand rows

        for (int i = 0; i < harfler.size(); i++) {

            List<WebElement> markalar = brandRows.get(i).findElements(By.tagName("div"));  // brands in it
            // By.cssSelector("[class='col-sm-3']")
            // Note: xpath is not used when searching for an element in an element because it looks at the whole page.

            for (WebElement marka : markalar) {
                System.out.println(harfler.get(i).getText() + " " + marka.getText().charAt(0) + " " + marka.getText());
                Assert.assertEquals(harfler.get(i).getText().charAt(0), marka.getText().charAt(0));
            }
        }
        // TODO: Those who want can test the same question from this site  https://www.ebay.com/n/all-brands
    }
}
