package BaseClass;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.ResourceBundle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Pages.InitialHomePage;

public class baseClass {

    public static WebDriver driver;
    public ResourceBundle rb;

    @BeforeMethod
    public void LaunchBrowser() throws Exception {
        rb = ResourceBundle.getBundle("data");

       // System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver-win64\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.get(rb.getString("url"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

        InitialHomePage ihp = new InitialHomePage(driver);
        ihp.clickUnitedStates();
        Thread.sleep(2000);

        try {
            assertEquals(driver.getTitle(),"Best Buy | Official Online Store | Shop Now & Save");
        }catch(Exception e) {
            System.out.println("The Error occured is: "+e.getMessage());
        }
    }

    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }


}