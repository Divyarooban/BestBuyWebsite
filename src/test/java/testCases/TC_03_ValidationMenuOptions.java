
package testCases;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import BaseClass.baseClass;
import Pages.ValidationWebPage;

public class TC_03_ValidationMenuOptions extends baseClass{

    @Test
    public void validateMenuOptions() throws InterruptedException {

        WebElement mainMenu = driver.findElement(By.xpath("//div[@class='bottom-nav-left-wrapper']"));

        List<WebElement> menuItems = mainMenu.findElements(By.tagName("li"));

        for (WebElement menuItem : menuItems) {

            try {
                //Click on the menu item
                menuItem.click();
                Thread.sleep(2000); // Adjust the wait time as needed


                String str = menuItem.getText();
                // System.out.println(str);
                if(str.equals("Top Deals")) {
                    assertEquals(driver.getTitle(),"Top Deals and Featured Offers on Electronics - Best Buy");
                }
                else if(str.equals("Deal of the Day")) {
                    assertEquals(driver.getTitle(),"Deal of the Day: Electronics Deals - Best Buy");
                }
                else if(str.equals("My Best Buy Memberships")) {
                    assertEquals(driver.getTitle(),"My Best Buy Memberships");
                }
                else if(str.equals("Credit Cards")) {
                    assertEquals(driver.getTitle(),"Best Buy Credit Card: Rewards & Financing");
                }
                Thread.sleep(2000);



            } catch (StaleElementReferenceException e) {
                menuItem.click();
            }

            Thread.sleep(4000);
            // Navigate back to the main menu
            driver.navigate().refresh();
        }


    }
}
