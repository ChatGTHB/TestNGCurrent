package day02;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _03_Assertions {

    @Test
    public void equalsExample() {

        String s1 = "Hello";
        String s2 = "Hello1";

        // Actual, Expected, Messsage (Optional)
        // Assert.assertEquals(s1,s2);
        Assert.assertEquals(s1, s2, "Actual and expected are not the same.");
    }

    @Test
    public void notEqualsExample() {

        String s1 = "Hello";
        String s2 = "Hello1";

        Assert.assertNotEquals(s1, s2, "Actual and expected are not the same.");
    }

    @Test
    public void trueExample() {

        String s1 = "Hello";
        String s2 = "Hello";

        Assert.assertTrue(s1.equals(s2), "Actual and expected are not the same.");
    }

    @Test
    public void nullExample() {

        String s1 = null;

        Assert.assertNull(s1, "Actual, did not become NULL.");
    }

    @Test
    public void directFail() {

        int a = 55;

        if (a != 55) {
            Assert.fail();
        }
    }
}
