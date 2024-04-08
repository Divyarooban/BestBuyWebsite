package testCases;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.baseClass;

public class TC_06_ValidateBottomLinks extends baseClass {

    @Test
    public void validateBottomLinks() {
        try {
            List<WebElement> bottomLinks = driver.findElements(By.xpath("//a[@class='body-copy-sm mr-200']"));

            // Assert that there are more than 0 bottom links
            assert bottomLinks.size() > 0 : "No bottom links found!";

            // Validate each bottom link
            for (WebElement link : bottomLinks) {
                // Assert link text is not empty
                assert !link.getText().isEmpty() : "Empty link text found!";

                // Assert href attribute is not empty
                assert link.getAttribute("href") != null && !link.getAttribute("href").isEmpty() : "Empty href attribute found!";

                // Print out the link text and href attribute for verification
                System.out.println("Link Text: " + link.getText() + ", Href: " + link.getAttribute("href"));
            }


        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }
}

