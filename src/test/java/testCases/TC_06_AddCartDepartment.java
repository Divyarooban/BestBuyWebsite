
package testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.baseClass;
import Pages.HomePage;
import Pages.MyAccountPage;

public class TC_06_AddCartDepartment extends baseClass{

    @Test
    public void AddCartbyShopDepartment() {

        try {
            HomePage hp= new HomePage(driver);

            hp.clickMenu();
            Thread.sleep(1000);

            hp.clickApplianceShopByDepartment();
            Thread.sleep(1000);

            hp.clickWasherDryers();
            Thread.sleep(1000);

            hp.clickFrontLoadMachines();
            Thread.sleep(1000);

            hp.clickFirstProduct();
            Thread.sleep(1000);

            MyAccountPage map = new MyAccountPage(driver);

            //JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

            // jsExecutor.executeScript("arguments[0].scrollIntoView({ behavior: 'auto', block: 'center', inline: 'center' });", element);

            map.clickAddToCart();
            Thread.sleep(2000);

            map.clickCart();
            Thread.sleep(2000);

            map.verifyCheckout();


        }
        catch(Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

}
