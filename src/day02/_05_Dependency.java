package day02;

import org.testng.annotations.Test;

public class _05_Dependency {

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
