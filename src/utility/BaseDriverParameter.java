package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriverParameter {

    public WebDriver driver;
    public static WebDriverWait wait;

    @BeforeClass
    @Parameters("browserType")
    public void initialOperations(String browserType) {

        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);

        switch (browserType.toLowerCase()) {
            case "firefox":
                driver = new FirefoxDriver();
                break;

            case "safari":
                driver = new SafariDriver();
                break;

            case "edge":
                driver = new EdgeDriver();
                break;

            default:
                driver = new ChromeDriver();
        }

        driver.manage().window().maximize(); // It maximizes the screen.
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30)); // 30 sec delay: time to load the page
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));  // 30 sec delay: time to find the element
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        loginTest();
    }

    public void loginTest() {

        driver.get("https://opencart.abstracta.us/index.php?route=account/login");

        WebElement inputEmail = driver.findElement(By.id("input-email"));
        inputEmail.sendKeys("testng1@gmail.com");

        WebElement inputPassword = driver.findElement(By.id("input-password"));
        inputPassword.sendKeys("123qweasd");

        WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
        loginButton.click();

        Assert.assertEquals(driver.getTitle(), "My Account");
    }

    @AfterClass
    public void finishingOperations() {
        Tools.wait(5);
        driver.quit();
    }
}
