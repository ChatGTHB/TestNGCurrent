package day03;

     /*
      @BeforeSuit
        @BeforeTest -> içinde çok metod,group,class olan test Grubu
          @BeforeGroup
            @BeforeClass
              @BeforeMetod
                @Test test1()  test metodu
              @AfterMetod
            @AfterClass
          @AfterGroup
        @AfterTest
      @AfterSuit
     */

import org.testng.annotations.*;

public class _02_Intro {


    @BeforeSuite
    public void bSuite() { System.out.println("Before Suite"); }

    @BeforeTest
    public void bTest() { System.out.println("Before Test"); }

    @BeforeGroups
    public void bGroups() { System.out.println("Before Groups"); }

    @BeforeClass
    public void bClass() { System.out.println("Before Class"); }

    @BeforeMethod
    public void bMethod() { System.out.println("Before Method"); }


    @Test
    public void Intro2_Test1() { System.out.println("Intro2 -> Test1"); }

    @Test
    public void Intro2_Test2() { System.out.println("Intro2 -> Test2"); }


    @AfterMethod
    public void aMethod() { System.out.println("After Method"); }

    @AfterClass
    public void aClass() { System.out.println("After Class"); }

    @AfterGroups
    public void aGroups() { System.out.println("After Groups"); }

    @AfterTest
    public void aTest() { System.out.println("After Test"); }

    @AfterSuite
    public void aSuite() { System.out.println("After Suite"); }
}











