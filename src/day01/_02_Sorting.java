package day01;

import org.testng.annotations.Test;

public class _02_Sorting {

    @Test(priority = 1)
    public void driverCreationProcedures()  // If priority is not set, it works alphabetically.
    {
        System.out.println("Driver Creation Procedures");
    }

    @Test(priority = 2)
    public void loginTest() {
        System.out.println("Login Test");
    }

    @Test(priority = 3)
    public void addingProductsToCart() {
        System.out.println("Adding Products to Cart");
    }

    @Test(priority = 4)
    public void driverShutdownProcedures() {
        System.out.println("Driver Shutdown Procedures");
    }
}