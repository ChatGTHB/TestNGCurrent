package day07;

import utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class _03_WishListElements {

    public _03_WishListElements() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "//button[@data-original-title='Add to Wish List']")
    public List<WebElement> wishButtons;

    @FindBy(xpath = "//div[@class='caption']//h4")
    public List<WebElement> productList;

    @FindBy(linkText = "Wish List")
    public WebElement wishListLink;

    @FindBy(xpath = "//td[@class='text-left']/a")
    public List<WebElement> wishList;
}
