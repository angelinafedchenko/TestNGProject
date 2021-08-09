package ddt;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)

public class ParameterizedTest {

    private int getVersion = 1;
    private int checkVersion = 15;

    @Parameterized.Parameters(name = "{0} and {1}")
    public static Collection<Object[]> versionCombos() {
        List<Object[]> args = new ArrayList<>();
        for (int getVersion = 1; getVersion <= 5; getVersion++) {
            for (int version = 11; version <= 15; version++) {
                args.add(new Object[]{getVersion, version});
            }
        }
        return args;
    }

    public ParameterizedTest (int getVersion, int checkVersion) {
        this.getVersion = getVersion;
        this.checkVersion = checkVersion;
    }

    @Test
    public void canPassInMultParams() {
        System.out.println(
                String.format("running test with param getVersion = %d and checkVersion = %d", getVersion, checkVersion));

        Assert.assertTrue(getVersion>= 1 && getVersion<=5);
        Assert.assertTrue(checkVersion>=11 && checkVersion <= 15);
    }
}
