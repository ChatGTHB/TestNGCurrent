package day03;


import utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class _04_SearchFunctionality extends BaseDriver {
    /**
     * Scenario:
     * 1- Open the site.
     * 2- Search by sending the word mac.
     * 3- Verify that the word "mac" is included in the results.
     * 4- Do the same for Samsung.
     * ------------------------------------------------------------
     * Senaryo:
     * 1- Siteyi açınız.
     * 2- mac kelimesini göndererek aratınız.
     * 3- Çıkan sonuçlarda "mac" kelimesinin geçtiğini doğrulayınız.
     * 4- Aynı işlemi samsung için de yapınız.
     */

    @Test
    @Parameters("searchText")
    void searchFunction(String searchedWord) {

        WebElement searchInput = driver.findElement(By.name("search"));
        searchInput.sendKeys(searchedWord + Keys.ENTER);

        List<WebElement> captions = driver.findElements
                (By.cssSelector("[class='caption'] > h4"));

        for (WebElement caption : captions) {
            //System.out.println("caption.getText() = " + caption.getText());
            Assert.assertTrue(caption.getText().toLowerCase().contains(searchedWord), "search word not found");
        }
    }
}
