package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class Tools {
    public static void wait(int sec) {

        try {
            Thread.sleep(sec * 1000L);
        } catch (InterruptedException exception) {
            throw new RuntimeException(exception);
        }
    }

    public static void successMessageValidation() {
        WebElement messageLabel = BaseDriver.driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
        Assert.assertTrue(messageLabel.getText().toLowerCase().contains("success"));
    }

    public static void jsClick(WebElement element){
        JavascriptExecutor javascriptExecutor=(JavascriptExecutor) BaseDriver.driver;
        javascriptExecutor.executeScript("arguments[0].click();", element); // javascriptExecutor click: click from within the page
    }


    public static int randomGenerator(int limit) {
        return (int) (Math.random() * limit);
    }

    public static boolean listContainsString(List<WebElement> list, String searchedWord) {
        boolean found = false;
        for (WebElement exception : list) {
            if (exception.getText().equalsIgnoreCase(searchedWord)) {
                found = true;
                break;
            }
        }
        return found;
    }
}
