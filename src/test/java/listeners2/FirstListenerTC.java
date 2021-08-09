package listeners2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners2.TestNGListener.class)
public class FirstListenerTC {

    WebDriver driver;
    @Test
    public void titleVerification() {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/intl/ru/gmail/about/");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
