package test;

import test.BaseTests;
import PageFactory.TextBoxPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Family on 03.05.2022.
 */
public class TestCases extends BaseTests{
    WebDriver driver;
    TextBoxPage page = new TextBoxPage(driver);
  //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));

    @Test
    public void verifyPageTitle(){
        Assert.assertEquals(baseURL, driver.getCurrentUrl());
        System.out.println(driver.getCurrentUrl());
    }
//    @Test
//    public void setData() {
//        page.fillData("Marine Melkonyan",
//                "user@mail.ru",
//                "Yerevan, my current address",
//                "Yeravan, my permanent address");
//        page.btnClick();
//    }

    //
    @Test
    public void prints(){
        System.out.println("Pass");
    }

//    @Test
//    public void setData2(){
//        page.setFullName("Marine Melkonyan");
//        page.setEmail("user@mail.ru");
//        page.setCurrentAddress("Yerevan, my current address");
//        page.setPermanentAddress("Yeravan, my permanent address");
//        page.btnClick();
//    }


}
