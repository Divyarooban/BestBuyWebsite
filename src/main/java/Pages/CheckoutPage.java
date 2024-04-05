package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage extends BasePage{

    public CheckoutPage(WebDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }

    @FindBy(xpath="//button[.='Checkout']")
    WebElement checkout;

    @FindBy(xpath="//button[.='Continue as Guest']")
    WebElement continueasguest;

    @FindBy(xpath="//button[.='Add a new pickup person']")
    WebElement pp;

    @FindBy(xpath="//input[@name='firstName']")
    WebElement firstName;

    @FindBy(id="lastName")
    WebElement lastName;

    @FindBy(id="street")
    WebElement address;

    @FindBy(id="city")
    WebElement cityName;

    @FindBy(id="zipcode")
    WebElement zipcode;

    @FindBy(id="state")
    WebElement state;

    @FindBy(xpath="//input[@id='phoneNumber']")
    WebElement phoneNumber;

    @FindBy(xpath="//input[@id='emailAddress']")
    WebElement emailAddress;

    @FindBy(xpath="//button[.='Apply']")
    WebElement apply;

    @FindBy(xpath="//button[.='Continue to Payment Information']")
    WebElement continuepaymnetinfo;

    @FindBy(id="user.emailAddress")
    WebElement email;

    @FindBy(id="user.phone")
    WebElement phone;

    @FindBy(xpath="//span[.='Sorry, but we can't ship to this address. Please enter a different U.S. address.']")
    WebElement sorrymessage;

    @FindBy(xpath="//button[.='Switch to pickup']")
    WebElement switchtopickup;

    @FindBy(xpath="//button[.='Switch to shipping']")
    WebElement switchtoshipping;

    @FindBy(xpath="(//button[.='Pick up here'])[1]")
    WebElement pickuphere;

    public void checkSorryMessage() throws Exception {
        if(sorrymessage.isDisplayed()) {
            switchtopickup.click();
            Thread.sleep(1000);
            pickuphere.click();
            Thread.sleep(1000);
        }
    }

    public void enterPhone(String str) {
        phone.sendKeys(str);
    }

    public void enterEmail(String str) {
        email.sendKeys(str);
    }

    public void clickContinueInfo() {
        continuepaymnetinfo.click();
    }

public void clickApply() {
        apply.click();
    }

    public void selectState(String str) {
        Select select= new Select(state);
        select.selectByValue(str);
    }

    public void clickContinueAsGuest() {
        continueasguest.click();
        switchtoshipping.click();
    }

    public void clickCheckout() {
        checkout.click();
    }

   public void enterFirstName(String str) {
        firstName.sendKeys(str);
    }
    public void enterLastName(String str) {
        lastName.sendKeys(str);
    }

   /* public void p_phonenumber(String str){
        phoneNumber.sendKeys(str);
    }
    public void p_emailadd(String str){
        emailAddress.sendKeys(str);
    }*/

    public void enterAddress(String str) {
        address.sendKeys(str);
    }
    public void enterCity(String str) {
        cityName.sendKeys(str);
    }
    public void enterZipcode(String str) {
        zipcode.sendKeys(str);
    }



}

