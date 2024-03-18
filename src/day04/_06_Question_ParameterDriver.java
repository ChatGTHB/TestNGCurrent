package day04;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utility.BaseDriverParameter;

import java.util.List;

public class _06_Question_ParameterDriver extends BaseDriverParameter {

    /**
     * Do the Search function that we did in the previous lessons with dataprovider for mac, ipod and samsung.
     * <p>
     * ----------------------*****************************************---------------------------------------
     * <p>
     * Daha önceki derslerde yaptğımız Search fonksiyonunu mac,ipod ve samsung için dataprovider ile yapınız.
     */

    @Test(dataProvider = "getData")
    public void SearchFunction(String willBeSearchText) {

        WebElement searchInput = driver.findElement(By.name("search"));
        searchInput.clear();
        searchInput.sendKeys(willBeSearchText + Keys.ENTER);

        List<WebElement> captions = driver.findElements(By.cssSelector("[class='caption'] > h4"));

        for (WebElement caption : captions) {
            //System.out.println("caption.getText() = " + caption.getText());
            Assert.assertTrue(caption.getText().toLowerCase().contains(willBeSearchText), "Search word not found.");
        }
    }

    @DataProvider
    Object[] getData() {
        Object[] data = {"mac", "samsung", "ipod"};

        return data;
    }
}
