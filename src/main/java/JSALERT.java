import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class JSALERT {
    public static void main(String[] args) {
        //System.setProperty("webdriver.edge.driver", "C:\\Learning\\MicrosoftWebDriver.exe");
        //WebDriver Driver = new EdgeDriver();
        //List Webelement = new ArrayList();
        System.setProperty("webdriver.gecko.driver", "C:\\Learning\\geckodriver.exe");
        WebDriver Driver = new FirefoxDriver();
        Driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
        Driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
        String Txt = Driver.switchTo().alert().getText();
        System.out.println(Txt);
        Driver.switchTo().alert().accept();
        Actions actions=new Actions(Driver);
       // howering on the dropdown
        actions.moveToElement(Driver.findElement(By.id("id of the dropdown"))).perform();

    }
}
