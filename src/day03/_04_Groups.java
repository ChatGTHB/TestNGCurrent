package day03;

import org.testng.annotations.Test;

public class _04_Groups {

    @Test(groups = {"Smoke Test"})
    public void test1(){ System.out.println("test1"); }

    @Test(groups = {"Regression"})
    public void test3(){ System.out.println("test3"); }

    @Test(groups = {"Regression"})
    public void test5(){ System.out.println("test5"); }

    @Test(groups = {"Regression"})
    public void test2(){ System.out.println("test2"); }

    @Test(groups = {"Smoke Test"})
    public void test4(){ System.out.println("test4"); }

    @Test(groups = {"Smoke Test"})
    public void test6(){ System.out.println("test6"); }

    @Test
    public void test7(){ System.out.println("test7"); }


}
