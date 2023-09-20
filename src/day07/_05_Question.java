package day07;

import day06._04_PlaceOrder_Elements;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.BaseDriver;
import utility.MyFunction;

/**
 Scenario :
 1- Open the site.
 2- Search the word "ipod" on the site
 3- Add a random one of the results to the basket.
 4- Click on Shopping Chart.
 5- Verify that the selected product is in the basket.
 6- Solve with POM.

 Senaryo :
 1- Siteyi açınız.
 2- Sitede "ipod" kelimesini aratınız
 3- Çıkan sonuçlardan random birini sepete atınız.
 4- Shopping Chart a tıklatınız.
 5- Seçilen ürünün sepette olduğunu doğrulayınız.
 6- POM ile çözünüz.
 */

public class _05_Question extends BaseDriver {

    @Test
    public void addToCart() {

        _04_PlaceOrder_Elements poe=new _04_PlaceOrder_Elements();
        _03_WishListElements wle=new _03_WishListElements();
        poe.searchBox.sendKeys("ipod" + Keys.ENTER);

        int randomSecim= MyFunction.randomGenerator(wle.productList.size()); // A random number is generated
        String cartItemText=wle.productList.get(randomSecim).getText(); // The name of the product in random was taken

        wle.addToChart.get(randomSecim).click(); // The wish button of the relevant random product was clicked
        wle.shoppingCart.click();

        boolean bulundu=MyFunction.listContainsString(wle.wishList, cartItemText);
        Assert.assertTrue(bulundu,"Sepet Listesinde aranan ürün bulunamadı");
    }
}
