package day05;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _01_DataProvider {

    @Test(dataProvider = "myData")
    public void searchTest(String willBeSearchText) {
        System.out.println("willBeSearchText = " + willBeSearchText);
    }

    @DataProvider
    Object[] myData() {
        Object[] willBeSearch = {"mac", "samsung", "laptop"};

        return willBeSearch;
    }

    /***********************************************************************************/

    @Test(dataProvider = "datas")  // You can also call dataProvider with the given name.
    public void test2(int data) {
        System.out.println("data = " + data);
    }

    @DataProvider(name = "datas") // You can give it a name if you want.
    Object[] getData() {
        Object[] data = {1, 2, 3, 4, 5, 6};

        return data;
    }
}
