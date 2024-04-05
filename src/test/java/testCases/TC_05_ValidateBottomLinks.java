package testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.baseClass;

public class TC_05_ValidateBottomLinks extends baseClass{

    @Test
    public void validateBottomLinks() {
        try {
            // Find all the bottom links
            List<WebElement> bottomLinks = driver.findElements(By.xpath("//a[@class='body-copy-sm mr-200']"));

            // Loop through the bottom links
            for (WebElement link : bottomLinks) {
                // Get the link text
                String linkText = link.getText();

                // Click on the link
                link.click();

                // Wait for the page to load
                try {
                    Thread.sleep(2000); // Adjust the wait time as needed
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                // Get the title of the current page
                String pageTitle = driver.getTitle();

                // Print the link text and page title to the console
                System.out.print("Link Text: " + linkText+"................");
                System.out.println("Page Title: " + pageTitle);

                // Navigate back to the homepage
                driver.navigate().back();
                Thread.sleep(2000);
            }

        }
        catch(Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }
}