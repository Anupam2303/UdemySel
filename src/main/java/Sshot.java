import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Sshot {


    WebDriver driver;

    public void setUp()  {
        System.setProperty("webdriver.gecko.driver", "C:\\Learning\\geckodriver.exe");
        driver = new FirefoxDriver();
    }

    public void tearDown() {
        driver.quit();

    }
    public void test(){

        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
// Code to copy the screenshot in the desired location

        //FileUtils.copyFile(scrFile, new File("C:\\CaptureScreenshot\\google.jpg"));
    }

    public static void main(String[] args) {
        Sshot sshot = new Sshot();
        sshot.setUp();
        sshot.test();
        sshot.tearDown();
    }
}


