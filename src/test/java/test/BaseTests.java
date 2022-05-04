package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

/**
 * Created by Family on 03.05.2022.
 */
public class BaseTests {
    WebDriver driver;

    String driverPath = "src/main/drivers/chromedriver.exe";
    String baseURL = "https://demoqa.com/text-box";


    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.get(baseURL);
        driver.manage().window().maximize();
    }

    @AfterTest
    public void tearDown(){
        driver.close();
        driver.quit();

    }
}
