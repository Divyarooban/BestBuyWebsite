package testCases;

import BaseClass.baseClass;
import Pages.MyAccountPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;

public class TC_04_Login extends baseClass {

    @Test(priority = 1)
    public void testLoginValid() {

        try {
            HomePage hp = new HomePage(driver);
            hp.clickAccount();
            hp.clickSignIn();

            LoginPage lp = new LoginPage(driver);
            lp.enterValidEmail(rb.getString("validemail"));
            lp.enterValidPassword(rb.getString("password"));
            Thread.sleep(2000);
            lp.clickSignin();
            Thread.sleep(5000);

            MyAccountPage map =new MyAccountPage(driver);
            map.verifySuccessfulLogin();

        }
        catch(Exception e) {
            Assert.fail();
        }

    }
    @Test(priority = 2)
    public void testLoginInValid() {

        try {
            HomePage hp = new HomePage(driver);
            hp.clickAccount();
            hp.clickSignIn();

            LoginPage lp = new LoginPage(driver);
            lp.enterValidEmail(rb.getString("validemail"));
            lp.enterValidPassword("Invalidpassword");
            Thread.sleep(2000);
            lp.clickSignin();
            Thread.sleep(5000);

            MyAccountPage map =new MyAccountPage(driver);
            map.verifyUnsuccessfulLogin();

        }
        catch(Exception e) {
            Assert.fail();
        }

    }


}