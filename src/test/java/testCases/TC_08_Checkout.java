package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.baseClass;
import Pages.BestBuyBrands;
import Pages.CheckoutPage;
import Pages.HomePage;
import Pages.MyAccountPage;
import Pages.PaymentPage;

public class TC_08_Checkout extends baseClass{

    @Test
    public void testCheckoutItem() {
        try
        {
            HomePage hp = new HomePage(driver);
            hp.clickMenu();
            Thread.sleep(1000);
            hp.clickBrands();
            Thread.sleep(1000);
            hp.clickBestBuyBrands();
            Thread.sleep(2000);

            BestBuyBrands bbb = new BestBuyBrands(driver);
            bbb.clickBestBuyBrandsAppliances();
            bbb.clickBestBuyBrandsAC();
            Thread.sleep(2000);
            bbb.clickBBBFirstItem();
            Thread.sleep(1000);
            bbb.clickBBBAddtoCart();
            Thread.sleep(3000);
            bbb.clickContinueShopping();

            MyAccountPage map = new MyAccountPage(driver);
            map.clickCart();
            Thread.sleep(2000);
            map.verifyCheckout();

            CheckoutPage cp = new CheckoutPage(driver);
            cp.clickCheckout();
            Thread.sleep(2000);

            //Enter Billing address details
            cp.clickContinueAsGuest();
            Thread.sleep(1000);
             cp.enterFirstName(rb.getString("firstname"));
            cp.enterLastName(rb.getString("lastname"));
            cp.enterPhone(rb.getString("phone"));
            cp.enterEmail(rb.getString("email"));
           cp.enterAddress(rb.getString("address"));
            cp.enterCity(rb.getString("city"));
            cp.selectState(rb.getString("state"));
            cp.enterZipcode(rb.getString("zip"));
            cp.clickApply();
            Thread.sleep(1000);

           cp.checkSorryMessage();

            //Enter contact information
            cp.enterEmail(rb.getString("email"));
            cp.enterPhone(rb.getString("phone"));
            cp.clickContinueInfo();

            Thread.sleep(2000);

            //Enter Card details in payment page
            PaymentPage pp = new PaymentPage(driver);
            pp.enterCardNumber(rb.getString("cardnumber"));
            pp.selectMonth(rb.getString("expmonth"));
            pp.selectYear(rb.getString("expyear"));
            pp.enterCVV(rb.getString("CVV"));

            pp.clickPlaceYourOrder();

        }
        catch(Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

}