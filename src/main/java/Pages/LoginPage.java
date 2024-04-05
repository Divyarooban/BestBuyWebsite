package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }

    @FindBy(id="fld-e")
    WebElement email;

    @FindBy(id="fld-p1")
    WebElement password;

    @FindBy(xpath="//button[@type='submit']")
    WebElement SigninButton;

    //Action methods
    public void enterValidEmail(String str) {
        email.sendKeys(str);
    }

    public void enterValidPassword(String str) {
        password.sendKeys(str);
    }

    public void clickSignin() {
        SigninButton.click();
    }

}
