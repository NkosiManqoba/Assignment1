package baseTest;

import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    public WebDriver driver ;
    public HomePage homePage;
    String BASEURL = "http://www.way2automation.com/angularjs-protractor/webtables/";

    @Test
    public void setUp(){

        ChromeOptions options = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(BASEURL);


        homePage = new HomePage(driver);

    }


}
