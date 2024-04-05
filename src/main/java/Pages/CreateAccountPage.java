package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage extends BasePage{

    public CreateAccountPage(WebDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }

    @FindBy(id="firstName")
    WebElement firstName;

    @FindBy(id="lastName")
    WebElement lastName;

    @FindBy(id="email")
    WebElement email;

    @FindBy(xpath="//input[@id='fld-p1']")
    WebElement password;

    @FindBy(id="reenterPassword")
    WebElement confirmpassword;

    @FindBy(id="phone")
    WebElement phone;

    @FindBy(xpath="//button[@type='submit']")
    WebElement CreateAccountButton;

    //Action Methods

    public void enterFirstName(String str) {
        firstName.sendKeys(str);
    }

    public void enterLastName(String str) {
        lastName.sendKeys(str);
    }

    public void enterEmail(String str) {
        email.sendKeys(str);
    }

    public void enterPassword(String str) {
        password.sendKeys(str);
    }

    public void reEnterPassword(String str) {
        confirmpassword.sendKeys(str);
    }

    public void enterPhone(String str) {
        phone.sendKeys(str);
    }

    public void clickCreateAccountButton() {
        CreateAccountButton.click();
    }

}