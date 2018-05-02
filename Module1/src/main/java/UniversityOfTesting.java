import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UniversityOfTesting {
    public static WebDriver driver=null; // webdriver initialization set up

    @Test
    public void setUpMethod() // this is a setUp method{
        System.getProperty("webdriver.chromedriver","../src/driver/chromedriver");
        driver.get("http://webdriveruniversity.com/");

    }
}
