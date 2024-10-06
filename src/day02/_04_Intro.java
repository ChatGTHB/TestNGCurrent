package day02;

import org.testng.annotations.*;

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

 /**
 Instead of importing separately for each annotation below
 When placed at the root * it covers all of them,so there is no need for separate imports
 */

public class _04_Intro {

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
    public void _04_Intro_Test1() {
        System.out.println("_04_Intro Test1");
    }

    @Test
    public void _04_Intro_Test2() {
        System.out.println("_04_Intro Test2");
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