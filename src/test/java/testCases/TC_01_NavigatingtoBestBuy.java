package testCases;

import org.htmlunit.BrowserVersion;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ResourceBundle;

public class TC_01_NavigatingtoBestBuy {

    @Test
    public void navigatingToBestBuy_Headless(){
        ResourceBundle rb;

        rb = ResourceBundle.getBundle("data");
        ChromeOptions options = new ChromeOptions();

        //add the headless argument
        options.addArguments("headless");

        //pass the options parameter in the Chrome driver declaration
        WebDriver driver = new ChromeDriver(options);

        //Navigate to toolsQA site url
        driver.get(rb.getString("url"));


        //Print the Title of the Page
        System.out.println("Title of the page is -> " + driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Best Buy International: Select your Country - Best Buy");





   /* public static void main(String[] args) {


        //Close the driver
        //driver.close();*/


    }
}