package day06;

import org.openqa.selenium.support.PageFactory;
import utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import java.util.List;

public class _02_WishListElements {

    public _02_WishListElements() {
        PageFactory.initElements(BaseDriver.driver,this);
    }

    @FindBy(xpath = "//button[@data-original-title='Add to Wish List']")
    public List<WebElement> wishButtons;

    @FindBy(xpath = "//div[@class='caption']//h4")
    public List<WebElement> productList;

    @FindBy(linkText = "Wish List")
    public WebElement wishListLink;

    @FindBy(xpath = "//td[@class='text-left']/a")
    public List<WebElement> wishList;

    @FindBy(xpath="//span[@class='hidden-xs hidden-sm hidden-md' and text()='Add to Cart']")
    public List<WebElement> addToChart;

    @FindBy(linkText="Shopping Cart")
    public WebElement shoppingCart;
}
