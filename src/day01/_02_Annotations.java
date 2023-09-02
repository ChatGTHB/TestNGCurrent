package day01;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class _02_Annotations {

    @AfterClass // It works after the inside of the class
    public void bitisIslemleri() {
        System.out.println("after class operations worked");
    }

    @Test // Annotation : specifies the type of method and its working properties
    public void test1() {  // Test1 : test metodunun adı
        System.out.println("test 1 worked");
    }

    @Test // Annotation : specifies the type of method and its working properties
    public void test2() {  // Test1 : test metodunun adı
        System.out.println("test 2 worked");
    }

    @BeforeClass  // It works before the inside of the class
    public void baslangicIslemleri() {
        System.out.println("after class operations worked");
    }

}
