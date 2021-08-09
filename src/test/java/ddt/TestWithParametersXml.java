package ddt;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestWithParametersXml {

    @Parameters({"param1", "param2"})

    @Test
    public void instanceDataProvider (int age, String name) {
        System.out.println("Personal data: Age, Name(" + age + ", " + name + ")");
    }
}
