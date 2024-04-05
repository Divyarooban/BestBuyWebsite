
package Utilities;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class utilities {

    public static WebDriver driver;

    public String randomString() {
        String str = RandomStringUtils.randomAlphabetic(6);
        return str;
    }

    public String randomeNumber() {
        String num = RandomStringUtils.randomNumeric(10);
        return num;
    }

    public String randomAlphaNumeric() {
        String str = RandomStringUtils.randomAlphabetic(4);
        String num = RandomStringUtils.randomNumeric(4);
        return (str+num);
    }
    public String takeScreenshot(String testName) throws IOException {
        //capture the screenshot and store it inf file objects
        File srcScreenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        //define the path where screenshpt will be saved
        String screenShotFilepath = System.getProperty("user.dir") + "\\Screenshots\\" + testName + ".jpg";
        FileUtils.copyFile(srcScreenshot, new File(screenShotFilepath));
        return screenShotFilepath;
    }
   /* public String captureScreenshot(String tname) {
        //tname is method name(testName) for which screenshot to be captured

        String timeStamp = new SimpleDateFormat("yyyymmddhhss").format(new Date());

        TakesScreenshot takeScreenshot = (TakesScreenshot) driver;
        File source = takeScreenshot.getScreenshotAs(OutputType.FILE);
        //screenshot captured and stored somewhere, So need to copy into destination folder
        String destination = ".\\screenshots\\"+tname+"_"+timeStamp+".png";

        try {
            FileUtils.copyFile(source, new File(destination));
        } catch(Exception e) {
            e.getMessage();
        }
        return destination;

    }*/

    public static void SwitchWindow() {
        String parentwindow=driver.getWindowHandle();
        Set<String> windowhandles=driver.getWindowHandles();
        windowhandles.size();

        for(String childwindow:windowhandles) {
            if(!childwindow.contentEquals(parentwindow)) {
                driver.switchTo().window(childwindow);
                break;
            }
        }
    }

}
