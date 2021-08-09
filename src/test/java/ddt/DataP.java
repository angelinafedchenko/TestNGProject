package ddt;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataP {

    @Test(dataProvider = "getData")
    public void instanceDataProvider (int param1, String param2) {
        System.out.println("Data Provider Example: Data (" + param1 + " " + param2 + ")");
    }

    @DataProvider
    public Object[][] getData() {
        return new Object[][] {
                {5, "five"},
                {6, "six"},
                {5, "five"},
                {6, "six"},
        };
    }

    @BeforeTest
    public void preconditions() {
        System.out.println("Before test (DataP).");
    }

}
