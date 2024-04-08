package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.baseClass;
import Pages.HomePage;

public class TC_07_SearchAddCart extends baseClass {

    @Test
    public void searchAddCart() {

        try {

            HomePage hp = new HomePage(driver);
            // Find the search input field and enter the item you want to search for
            hp.searchInput(rb.getString("searchinput"));

            // Find the search button and click it
            hp.searchInputButton();

            // Wait for search results to load
            Thread.sleep(3000);

            // Find the first search result and click on it
            WebElement firstSearchResult = driver.findElement(By.xpath("(//div[@tabindex='-1'])[3]"));
            firstSearchResult.click();

            // Wait for the product page to load
            Thread.sleep(3000);

            // Find the "Add to Cart" button and click it
            WebElement addToCartButton = driver.findElement(By.xpath("//button[@data-button-state='ADD_TO_CART']"));
            addToCartButton.click();

            // Wait for the item to be added to the cart
            Thread.sleep(3000);

            // Print a success message
            System.out.println("Item added to the cart successfully!");
        }catch(Exception e) {
            e.getStackTrace();
            Assert.fail();
        }
    }
}