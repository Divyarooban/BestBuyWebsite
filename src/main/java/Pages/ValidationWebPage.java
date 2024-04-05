package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ValidationWebPage extends BasePage{

    public ValidationWebPage(WebDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }

    @FindBy(xpath="//a[.='Top Deals']")
    WebElement topDeals;

    @FindBy(xpath="//a[.='Deal of the Day']")
    WebElement dealOfTheDay;

    @FindBy(xpath="(//a[.='My Best Buy Memberships'])[1]")
    WebElement myBestBuyMemberships;

    @FindBy(xpath="//a[.='Credit Cards']")
    WebElement creditCards;


    //Action Methods
    public void clcikTopDeals() {
        topDeals.click();
    }

    public void clickDealsOfTheDay() {
        dealOfTheDay.click();
    }

    public void clickMyBestBuyMemberships() {
        myBestBuyMemberships.click();
    }

    public void clickCreditCards() {
        creditCards.click();
    }

}
