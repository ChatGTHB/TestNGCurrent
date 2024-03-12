package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class MyFunction {
    public static void wait(int sec) {

        try {
            Thread.sleep(sec * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void successMessageValidation() {
        WebElement messageLabel = BaseDriver.driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
        Assert.assertTrue(messageLabel.getText().toLowerCase().contains("success"));
    }

    public static int randomGenerator(int limit) {
        return (int) (Math.random() * limit);
    }

    public static boolean listContainsString(List<WebElement> list, String searchWord) {
        boolean found = false;
        for (WebElement exception : list) {
            if (exception.getText().equalsIgnoreCase(searchWord)) {
                found = true;
                break;
            }
        }
        return found;
    }
}
