package testCases;

import BaseClass.baseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ResourceBundle;

public class TC_02_ValidateUrlIsNotBroken extends baseClass {

    String urlToValidate = "https://www.bestbuy.com/";
    @Test
    public void validateLink(){
        try {
            HttpURLConnection connection = (HttpURLConnection) new URL(urlToValidate).openConnection();
            connection.setRequestMethod("HEAD");
            connection.connect();
            int responseCode = connection.getResponseCode();
            if (responseCode >= 400) {
                System.out.println("Broken Link Found: " + urlToValidate + " (Response code: " + responseCode + ")");
            } else {
                System.out.println("Valid Link: " + urlToValidate);
            }
            connection.disconnect();
        } catch (IOException e) {
            System.out.println("Error occurred while checking link: " + urlToValidate);
            e.printStackTrace();
        }
    }


    }
