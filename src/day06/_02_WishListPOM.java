package day06;

import utility.BaseDriver;
import utility.Tools;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class _02_WishListPOM extends BaseDriver {

    /**
     * Scenario ;
     * 1- Go to the site...
     * 2- Search "ipod" product, send "ipod" from xml
     * 3- Click on the Add Wish button of a random element among the resulting elements.
     * 4- Then click on WishList
     * 5- Verify whether the name of the product that appears here is the same as the product that was clicked.
     * <p>
     * ========================================================================================================
     * <p>
     * Senaryo ;
     * 1- Siteye gidiniz.
     * 2- "ipod" ürününü aratınız."ipod" u xml den gönderiniz
     * 3- Çıkan elemanlardan random bir elemanın Add Wish butonuna tıklatınız.
     * 4- Daha sonra WishList e tıklatınız
     * 5- Burada çıkan ürünle tıklanan ürünün isminin aynı olup olmadığını doğrulayınız.
     */

    @Test
    @Parameters("searchText")
    public void addToWishList(String searchWord) {

        _01_PlaceOrder_Elements poe = new _01_PlaceOrder_Elements();
        _02_WishListElements wle = new _02_WishListElements();

        poe.searchBox.sendKeys(searchWord + Keys.ENTER);

        int randomSelection = Tools.randomGenerator(wle.productList.size()); // A random number is generated
        String wishItemText = wle.productList.get(randomSelection).getText();      // The name of the product in random was taken
        wle.wishButtons.get(randomSelection).click(); // The wish button of the relevant Random product was clicked
        wle.wishListLink.click();

        // Is the product we are looking for on the list or not?
        boolean found = Tools.listContainsString(wle.wishList, wishItemText);
        Assert.assertTrue(found, "The product assigned to the Wish List could not be found.");
    }
}
