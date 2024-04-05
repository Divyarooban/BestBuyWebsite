package Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath="//span[.='Account']")
    WebElement Account;

    @FindBy(xpath="//a[.='Sign In']")
    WebElement Signin;

    @FindBy(xpath="//a[.='Create Account']")
    WebElement CreateAccount;

    @FindBy(id="gh-search-input")
    WebElement  searchInput;

    @FindBy(className="header-search-button")
    WebElement searchInoutButton;

    @FindBy(xpath="//button[@aria-label='Menu']")
    WebElement Menu;

    @FindBy(xpath="(//li[@class='liDropdownList '])[4]")
    WebElement appliances;

    @FindBy(xpath="//button[@data-id='node-135']")
    WebElement washerDryers;

    @FindBy(xpath="(//a[@data-t='header-navigation-anchor'])[3]")
    WebElement frontloadmachines;

    @FindBy(xpath="(//h4[@class='sku-title'])[1]")
    WebElement FirstItem;

    @FindBy(xpath="//button[.='Brands']")
    WebElement brands;

    @FindBy(xpath="//h4[.='Best Buy Brands']")
    WebElement bestbuybrands;



    public void clickBestBuyBrands() {
        bestbuybrands.click();
    }

    public void clickBrands() {
        brands.click();
    }

    public void clickFirstProduct() {
        FirstItem.click();
    }

    public void clickFrontLoadMachines() {
        frontloadmachines.click();
    }

    public void clickWasherDryers() {
        washerDryers.click();
    }

    public void clickApplianceShopByDepartment() {
        appliances.click();
    }

    public void clickMenu() {
        Menu.click();
    }


    public void searchInput(String str) {
        searchInput.sendKeys(str);
    }

    public void searchInputButton() {
        searchInoutButton.click();
    }

    public void clickAccount() {
        Account.click();
    }

    public void clickSignIn() {
        Signin.click();
    }

    public void clickCreateAccount() {
        CreateAccount.click();
    }

}