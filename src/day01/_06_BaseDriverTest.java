package day01;

import org.testng.annotations.Test;
import utility.BaseDriver;

public class _06_BaseDriverTest extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("https://www.google.com/");
    }
}