package day02;

import org.testng.annotations.Test;

public class _01_Dependency {

    // The order of movement of the car: start, drive, park, stop
    @Test
    public void startCar() {
        System.out.println("startCar");
        //Assert.fail();
    }

    @Test(dependsOnMethods = {"startCar"})
    // The execution of this test is dependent on the error-free operation of startCar()
    public void driveCar() {
        System.out.println("driveCar");
    }

    @Test(dependsOnMethods = {"driveCar", "startCar"})
    public void parkCar() {
        System.out.println("parkCar");
    }

    // alwaysRun = true, it waits for its turn, it has dependencies, but it still works if an error occurs.
    @Test(dependsOnMethods = {"parkCar"}, alwaysRun = true)
    public void stopCar() {
        System.out.println("stopCar");
    }
}

/**
 * Dependent tests run in the method chain on which they depend when you run them directly from the method.
 * It can automatically call and work up to 1 level.
 * <p>
 * Dependency: The effect of one test on the results of another test or
 * indicates situations where it depends on a specific situation.
 * For example, before a test can run, another test must first be successful.
 * may need to be completed somehow.
 * In such scenarios, TestNG's Dependency feature comes into play.
 */
