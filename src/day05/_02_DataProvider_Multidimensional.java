package day05;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _02_DataProvider_Multidimensional {

    @Test(dataProvider = "UserData")
    public void userTest(String username, String password) {
        //username,password
        System.out.println(username + " " + password);
    }

    @DataProvider
    public Object[][] UserData() {
        Object[][] data = {
                {"Kerem", "122334"},
                {"Said", "said5"},
                {"Zeynep", "zeynep111"},
                {"Salih", "salih500"}
        };
        return data;
    }
}
