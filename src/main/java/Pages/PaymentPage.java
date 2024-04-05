package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class PaymentPage extends BasePage{

    public PaymentPage(WebDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }

    @FindBy(xpath="//input[@name='number']")
    WebElement cardnumber;

    @FindBy(id="expMonth")
    WebElement month;

    @FindBy(id="expYear")
    WebElement year;


    @FindBy(id="cvv")
    WebElement securitycode;

    @FindBy(xpath="//button[@data-track='Place your Order - Contact Card']")
    WebElement placeyourorder;

    public void clickPlaceYourOrder() {
        placeyourorder.click();
    }

    public void selectMonth(String str) {
        Select select= new Select(month);
        select.selectByValue(str);
    }

    public void selectYear(String str) {
        Select select= new Select(year);
        select.selectByValue(str);
    }

    public void enterCardNumber(String str) {
        cardnumber.sendKeys(str);
    }

    public void enterCVV(String str) {
        securitycode.sendKeys(str);
    }
}