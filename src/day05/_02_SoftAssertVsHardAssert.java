package day05;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _02_SoftAssertVsHardAssert {

    @Test
    public void hardAssert() {

        String s1 = "Hello!";

        System.out.println("Before Assert");
        Assert.assertEquals("Hello123!", s1,
                "What actual is not the same as expected."); // The CODE breaks when an error occurs
        System.out.println("After Assert");
    }

    @Test
    public void softAssert() {

        String strHomePage = "www.facebook.com/homepage";
        String strCartPage = "www.facebook.com/cartpage";
        String strEditAccount = "www.facebook.com/editaccountpage";

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals("www.facebook.com/homepage", strHomePage);    // pass
        System.out.println("Assert 1");

        softAssert.assertEquals("www.facebook.com/profile", strCartPage);     // fail
        System.out.println("Assert 2");

        softAssert.assertEquals("www.facebook.com/settings", strEditAccount); // fail
        System.out.println("Assert 3");

        softAssert.assertAll(); // It processes all assert results.
        System.out.println("soft assertAll: After activity");
        // Since this section is after assertAll and an error occurred before it, it will not be displayed.
    }
}
