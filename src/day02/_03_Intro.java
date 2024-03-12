package day02;

 /**
 @BeforeSuite                  -->   Date, general title, log
    @BeforeTest                -->   Name of the test, report start operations, language settings
         @BeforeGroup          -->   Name of the group, log
            @BeforeClass       -->   It will run at the beginning of the class (driver operations)
                @BeforeMethod  -->   It will run before each method (test methods)
                    @Test      -->   Methods where tests run
                    @Test      -->   Methods where tests run
                @AfterMethod   -->   It will run after every method
             @AfterClass       -->   It will run at the end of the class's execution (close the driver)
        @AfterGroup            -->   What to do when the relevant group is finished
    @AfterTest                 -->   Log, report completion operations
 @AfterSuit                    -->   All tests finished, log
 */



import org.testng.annotations.*;
 /**
 Instead of importing separately for each annotation below
 When placed at the root * it covers all of them,so there is no need for separate imports
 */

public class _03_Intro {


    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test");
    }

    @BeforeGroups
    public void beforeGroups() {
        System.out.println("Before Groups");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method");
    }

    @Test
    public void _03_Intro_Test1() {
        System.out.println("_03_Intro Test1");
    }

    @Test
    public void _03_Intro_Test2() {
        System.out.println("_03_Intro Test2");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class");
    }

    @AfterGroups
    public void afterGroups() {
        System.out.println("After Groups");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After Test");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite");
    }
}











