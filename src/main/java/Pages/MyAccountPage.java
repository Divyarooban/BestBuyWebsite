package Pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{

    public MyAccountPage(WebDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }

    @FindBy(xpath="//span[contains(text(),'Hi')]")
    WebElement usernameDispaly;

    @FindBy(id="logout-button-bby")
    WebElement logout;

    @FindBy(xpath="//a[.='Top Deals']")
    WebElement topdeals;

    @FindBy(xpath="//a[text()='Deal of the Day']")
    WebElement dealsoftheday;

    @FindBy(xpath="(//a[@aria-hidden='false'])[3]")
    WebElement MyBestBuyMemberships;

    @FindBy(xpath="(//a[@aria-hidden='false'])[4]")
    WebElement CreditCards;

    @FindBy(xpath="//button[@data-button-state='ADD_TO_CART']")
    WebElement Addtocart;

    @FindBy(xpath="//a[.='Go to Cart']")
    WebElement gotocart;

    @FindBy(xpath="//button[.='Checkout']")
    WebElement checkout;

    @FindBy(xpath="//span[.='Cart']")
    WebElement cart;

    @FindBy(xpath="//div[contains(text(),'Oops')]")
    WebElement err;

    public void clickCart() {
        cart.click();
    }

    public void verifyCheckout() {
        assertTrue(checkout.isDisplayed());
    }

    public void clickGotoCart() {
        gotocart.click();
    }

    public void clickAddToCart() {
        Addtocart.click();
    }


    public void verifySuccessfulLogin() {
        usernameDispaly.click();
        assertEquals(logout.getText(),"Sign out");
    }

    public void verifyUnsuccessfulLogin(){
        assertEquals(err.getText(),"Oops");
    }

}