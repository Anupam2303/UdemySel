import org.apache.http.util.Asserts;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import javax.swing.*;

public class GetCommand {

    public static void main(String[] args) {
        //System.setProperty("webdriver.edge.driver", "C:\\Learning\\MicrosoftWebDriver.exe");
        //WebDriver Driver = new EdgeDriver();
        System.setProperty("webdriver.gecko.driver", "C:\\Learning\\geckodriver.exe");
        WebDriver Driver = new FirefoxDriver();
        Driver.get("https://www.facebook.com");
        Driver.findElement(By.xpath(".//input[@name='email']")).sendKeys("9900284138");
        Driver.findElement(By.xpath(".//input[@type='password']")).sendKeys("Anup_508");
        Driver.findElement(By.xpath("//input[@id='u_0_2']")).click();
        //System.out.println(Driver.getPageSource());
        System.out.println(Driver.getCurrentUrl());
        System.out.println(Driver.getTitle());
        Driver.close();
/*        DesiredCapabilities capabilities = new DesiredCapabilities.firefox();
        capabilities.setBrowserName("fire");
        capabilities.setPlatform(Platform.WIN10);*/
        //Actions act = new Actions();
    }

}
