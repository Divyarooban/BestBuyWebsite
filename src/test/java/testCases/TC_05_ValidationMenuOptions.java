
package testCases;

import static org.testng.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import BaseClass.baseClass;

public class TC_05_ValidationMenuOptions extends baseClass{

    @Test
    public void validateMenuOptions() throws InterruptedException {

        List<WebElement> menuItems = driver.findElements(By.xpath("//div[@class='bottom-nav-left-wrapper']//li"));

        // Define the expected menu options
        List<String> expectedMenuOptions = Arrays.asList("Top Deals","Deal of the Day","Yes, Best Buy Sells That","My Best Buy Memberships","Credit Cards","Gift Cards","Gift Ideas");

        // Extract the text of each menu item
        List<String> actualMenuOptions = menuItems.stream().map(WebElement::getText).toList();

        // Assert that the actual menu options match the expected ones
        assert actualMenuOptions.containsAll(expectedMenuOptions) && actualMenuOptions.size() == expectedMenuOptions.size() :
                "Menu options validation failed!";

        // Print a success message if the assertion passes
        System.out.println("Menu options validation passed!");


    }
}
