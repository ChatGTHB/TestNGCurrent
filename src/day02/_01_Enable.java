package day02;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utility.MyFunction;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class _01_Enable {

    @Test
    public void test1() {
        System.out.println("test1 worked");
    }

    @Test(enabled = false)
    public void test2() {
        System.out.println("test2 worked");
    }

    @Test
    public void test3() {
        System.out.println("test3 worked");
    }

    public static WebDriver driver; // SingletonDriver method
    public static WebDriverWait wait;

    @BeforeClass
    public void initialOperations() {  // The condition of this is that it is extends and takes place in the first place.
        Logger logger = Logger.getLogger(""); // Get output logs.
        logger.setLevel(Level.SEVERE);              // Show only ERRORs

        driver = new ChromeDriver();
        driver.manage().window().maximize(); // It maximizes the screen.
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30)); // 30 sec delay: time to load the page
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));  // 30 sec delay: time to find the element
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    @AfterClass
    public static void finishingOperations() {
        MyFunction.wait(5);
        driver.quit();
    }
}
