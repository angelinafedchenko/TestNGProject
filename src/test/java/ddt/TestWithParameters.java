package ddt;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestWithParameters {

    @Test(dataProvider="getData")
    public void instanceDataProvider (int age, String name) {
        System.out.println("Personal data: Age, Name(" + age + ", " + name + ")");
    }

    @DataProvider
    public Object[][] getData() {
        return new Object[][]{
                {30, "Ivan"},
                {40, "Petro"}
        };


    }
}
