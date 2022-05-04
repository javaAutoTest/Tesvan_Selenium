package PageFactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextBoxPage {

    WebDriver driver;
    public TextBoxPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "userName")
    private WebElement setFullName;

    @FindBy(id = "userEmail")
    private WebElement setEmail;

    @FindBy(id = "currentAddress")
    private WebElement setCurrentAddress;

    @FindBy(id = "permanentAddress")
    private WebElement setPermanentAddress;

    @FindBy(id = "submit")
    private WebElement clickButton;

    @FindBy(className ="main-header")
    private WebElement titleText;


    public String setFullName(String name) {
        setFullName.sendKeys(name);
        return name;
    }

    public String setEmail(String email) {
        setEmail.sendKeys(email);
        return email;
    }

    public String setCurrentAddress(String curAddress) {
        setCurrentAddress.sendKeys(curAddress);
        return curAddress;
    }

    public String setPermanentAddress(String permAddress) {
        setPermanentAddress.sendKeys(permAddress);
        return permAddress;
    }

    public void btnClick() {
        WebElement button = clickButton;
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)", button);
        button.click();
    }


    public String getPageTitle(){

        return titleText.getText();
    }

    public void fillData(String strUserName,String strEmail, String strCurAddress, String strPermAddress){

        this.setFullName(strUserName);

        this.setEmail(strEmail);
        this.setCurrentAddress(strCurAddress);
        this.setPermanentAddress(strPermAddress);

        this.btnClick();
    }
}
