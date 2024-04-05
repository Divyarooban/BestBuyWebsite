package testCases;

import BaseClass.baseClass;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.MyAccountPage;

public class TC_02_Login extends baseClass {

    @Test
    public void testLogin() {

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

            //MyAccountPage map =new MyAccountPage(driver);
            //map.verifySuccessfulLogin();

        }
        catch(Exception e) {
            Assert.fail();
        }

    }

}