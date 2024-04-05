package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InitialHomePage extends BasePage{


    public InitialHomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath="//a[@class='us-link']")
    WebElement uslink;

    @FindBy(xpath="//a[@class='canada-link']")
    WebElement canadalink;


    //Action Methods
    public void clickUnitedStates() {
        uslink.click();
    }

    public void clickCanada() {
        canadalink.click();
    }

}
