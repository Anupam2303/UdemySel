import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.*;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.edge.EdgeDriver;

public class SpiceJectDD {
    public static void main(String[] args) {
        //System.setProperty("webdriver.edge.driver", "C:\\Learning\\MicrosoftWebDriver.exe");
        //WebDriver Driver = new EdgeDriver();
        //List Webelement = new ArrayList();
        System.setProperty("webdriver.gecko.driver", "C:\\Learning\\geckodriver.exe");
        WebDriver Driver = new FirefoxDriver();
        /*Driver.get("http://spicejet.com/");
        //Static Dropdown
        Select S = new Select(Driver.findElement(By.xpath("//Select[@id=\"ctl00_mainContent_ddl_Adult\"]")));
        //S.selectByValue("2");
        S.selectByIndex(5);
        // Dynamic DD
        Driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_originStation1_CTXT\"]")).click();
        Driver.findElement(By.xpath("//a[@value='IXE']")).click();
        Driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();
        //CheckBox
        Boolean Sel = Driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_chk_IndArm\"]")).isSelected();
        if (!Sel)
        {
            Driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_chk_IndArm\"]")).click();
        }*/
       //radiobotton
        Driver.navigate().to("file:///C:/Users/AR042937/Desktop/New.htm");
        //input[@value=Cheese]
        Driver.findElement(By.xpath("//input[@value='Cheese']")).click();
        int C = Driver.findElements(By.xpath("//input[@name='group1']")).size();
        System.out.println(C);
        for(int i=0; i<C; i++) {
           // Driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
            String Opt = Driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
            if (Opt.equals("Cheese"))
            {
                Driver.findElement(By.xpath("//input[@name='group1']")).click();
            }
        }
    }
}
