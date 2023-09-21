package utility;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;


import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver {

    public static WebDriver driver; // SingletonDriver method
    public static WebDriverWait wait;
    public static final org.apache.logging.log4j.Logger logger4j = LogManager.getLogger();

    @BeforeClass
    public void initialOperations() {  // The condition of this is that it is extends and takes place in the first place.

        Logger logger = Logger.getLogger(""); // Get output logs.
        logger.setLevel(Level.SEVERE);              // Show only ERRORs

        driver = new ChromeDriver();
        driver.manage().window().maximize(); // It maximizes the screen.
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30)); // 30 sec delay: time to load the page
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));  // 30 sec delay: time to find the element
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        loginTest();
    }

    public void loginTest() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        driver.get("https://opencart.abstracta.us/index.php?route=account/login");
        MyFunction.wait(2);

        wait.until(ExpectedConditions.elementToBeClickable(By.id("details-button"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("proceed-link"))).click();

        WebElement inputEmail = driver.findElement(By.id("input-email"));
        inputEmail.sendKeys("testng1@gmail.com");

        WebElement inputpassword = driver.findElement(By.id("input-password"));
        inputpassword.sendKeys("123qweasd");

        WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
        loginBtn.click();

        Assert.assertTrue(driver.getTitle().equals("My Account"));
    }

    @AfterClass
    public static void finishingOperations() {
        MyFunction.wait(5);
        driver.quit();
    }

    @BeforeMethod
    public void beforeMethod() {
        logger4j.info("Test Method has started.");
    }

    @AfterMethod
    public void afterMethod(ITestResult result) {
        logger4j.info(result.getName() + " test method has finished. --> " + (result.getStatus() == 1 ? "Passed" : "Failed"));
    }
}
