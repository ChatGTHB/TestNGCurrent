package day01;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class _03_Annotations {

    @AfterClass // It works after the inside of the class
    public void finishingOperations() {
        System.out.println("after class operations worked");
    }

    @Test // Annotation : specifies the type of method and its working properties
    public void test1() {  // Test1 : test metodunun adı
        System.out.println("test 1 done");
    }

    @Test // Annotation : specifies the type of method and its working properties
    public void test2() {  // Test1 : test metodunun adı
        System.out.println("test 2 done");
    }

    @BeforeClass  // It works before the inside of the class
    public void startUpOperations() {
        System.out.println("before class operations worked");
    }
}