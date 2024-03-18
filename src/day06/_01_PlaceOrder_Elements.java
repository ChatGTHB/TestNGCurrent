package day06;

import utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _01_PlaceOrder_Elements {

    /**
     * Scenario :
     * 1- Open the site.
     * 2- Search the word "ipod" on the site
     * 3- Put the first of the results in the basket.
     * 4- Click on Shopping Chart.
     * 5- Checkout.
     * 6- Click Continue buttons and enter the information.
     * 7- Confirm that you have placed the order with en confirm.
     * Note: Verify with the text "Your order has been placed" on the page that appears.
     * <p>
     * Senaryo :
     * 1- Siteyi açınız.
     * 2- Sitede "ipod" kelimesini aratınız.
     * 3- Çıkan sonuçlardan ilkini sepete atınız.
     * 4- Shopping Carta tıklatınız.
     * 5- Checkout yapınız.
     * 6- Continue butonlarına tıklatıp bilgileri giriniz.
     * 7- En confirm ile siparişi verdiğinizi doğrulayınız.
     * Not: Doğrulamayı çıkan sayfadaki "Your order has been placed" yazısı ile yapınız.
     */

    public _01_PlaceOrder_Elements() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(name = "search")
    public WebElement searchBox;

    @FindBy(xpath = "//span[text()='Add to Cart']")
    public WebElement addToChart;

    @FindBy(linkText = "Shopping Cart")
    public WebElement shoppingChart;

    @FindBy(linkText = "Checkout")
    public WebElement checkOut;

    @FindBy(id = "button-payment-address")
    public WebElement continue1;

    @FindBy(id = "button-shipping-address")
    public WebElement continue2;

    @FindBy(id = "button-shipping-method")
    public WebElement continue3;

    @FindBy(name = "agree")
    public WebElement agree;

    @FindBy(id = "button-payment-method")
    public WebElement continue4;

    @FindBy(id = "button-confirm")
    public WebElement confirm;

    @FindBy(css = "[id='content']>h1")
    public WebElement msg;
}
