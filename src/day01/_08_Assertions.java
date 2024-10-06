package day01;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _08_Assertions {

    @Test(priority = 1)
    public void equalsExample() {
        String string1 = "Hello";
        String string2 = "Hello1";

        // Actual, Expected, Messsage (Optional)
        // Assert.assertEquals(string1,string2);
        Assert.assertEquals(string1, string2, "Actual and expected are not the same.");
    }

    @Test(priority = 2)
    public void notEqualsExample() {
        String string1 = "Hello";
        String string2 = "Hello1";

        Assert.assertNotEquals(string1, string2, "Actual and expected are not the different.");
    }

    @Test(priority = 3)
    public void trueExample() {
        String string1 = "Hello";
        String string2 = "Hello";

        Assert.assertEquals(string2, string1, "Actual and expected are not the same.");
    }

    @Test(priority = 4)
    public void trueExample2() {
        int number1 = 5;
        int number2 = 5;

        Assert.assertEquals(number2, number1, "Actual and expected are not the same.");
    }

    @Test(priority = 5)
    public void nullExample() {
        String s1 = null;

        Assert.assertNull(s1, "Actual, did not become NULL.");
    }

    @Test(priority = 6)
    public void directFail() {
        int number = 56;

        if (number != 55) {
            Assert.fail();
        }
    }

    @Test(priority = 7)
    public void falseExample() {
        int number1 = 5;
        int number2 = 7;
        Assert.assertNotEquals(number2, number1, "Formed is not the same as expected");
    }
}