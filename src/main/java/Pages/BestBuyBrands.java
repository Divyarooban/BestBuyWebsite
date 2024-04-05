package Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BestBuyBrands extends BasePage{

    public BestBuyBrands(WebDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }

    @FindBy(xpath="//a[.='Insignia']")
    WebElement bestbuybrandInsignia;
    @FindBy(xpath="//a[.='Appliances']")
    WebElement bestbuybrandsappliances;

    @FindBy(xpath="//a[contains(.,'air conditioning')]")
    WebElement bbbairconditioning;

    @FindBy(xpath="(//h4[@class='sku-title'])[1]")
    WebElement bbbfirstitem;

    @FindBy(xpath="(//button[@data-button-state='ADD_TO_CART'])[1]")
    WebElement bbbAddtocart;

    @FindBy(xpath="//button[.='Continue shopping']")
    WebElement continueshopping;



    public void clickContinueShopping() {
        continueshopping.click();
    }

    public void clickBBBAddtoCart() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOf(bbbAddtocart));
        bbbAddtocart.click();
    }

    public void clickBBBFirstItem() {
        bbbfirstitem.click();
    }

    public void clickBestBuyBrandsAC() {
        bbbairconditioning.click();
    }

    public void clickBestBuyBrandsAppliances() {
        bestbuybrandInsignia.click();
        bestbuybrandsappliances.click();
    }

}

