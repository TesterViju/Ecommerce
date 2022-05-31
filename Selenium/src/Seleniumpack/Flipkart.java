package Seleniumpack;
import java.io.File;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Flipkart {
	static Flipkart a;
public static void main (String[] args) throws Throwable {
 a=new Flipkart();
 {
System.setProperty("webdriver.chrome.driver", "C:\\Java Study material\\Selenium\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get ("https://www.flipkart.com");
String url = driver.getCurrentUrl();
System.out.println(url);
String title = driver.getTitle();
System.out.println(title);

WebElement username = driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]"));
Thread.sleep(500);
username.sendKeys("vijaybahiram1212@gmail.com");
Thread.sleep(500);
WebElement password = driver.findElement(By.xpath("(//input[@autocomplete='off'])[3]"));
password.sendKeys("VIJAY121293");
Thread.sleep(500);
WebElement login = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
login.click();
Thread.sleep(5000);

Date d = new Date();
String FileName = d.toString().replace(":", "_").replace(" ", "_") + ".png";
TakesScreenshot t = (TakesScreenshot)driver ;
File source = t.getScreenshotAs(OutputType.FILE);
File dest = new File ("C:\\Java Study material\\Selenium\\" + FileName);
FileHandler.copy(source, dest);

Actions run=new Actions (driver);
WebElement fashion = driver.findElement(By.xpath("(//div[@class='xtXmba'])[4]"));
run.moveToElement(fashion).perform();
Thread.sleep(1000);
WebElement menskurta = driver.findElement(By.xpath("(//a[contains(@class,'_6WOcW9 _3YpNQe')])[5]"));
run.moveToElement(menskurta).click().perform();


JavascriptExecutor js=(JavascriptExecutor)driver;
Thread.sleep(3000);
js.executeScript("window.scrollBy(0,2000)");
Thread.sleep(3000);
js.executeScript("window.scrollBy(0,-1000)");
Thread.sleep(3000);
js.executeScript("window.scrollBy(1000,0)");
Thread.sleep(3000);
js.executeScript("window.scrollBy(-1000,0)");
Thread.sleep(3000);
WebElement kurta=driver.findElement(By.xpath("(//a[text()='Men Solid Pure Cotton Straight Kurta'])[8]"));
js.executeScript("arguments[0].scrollIntoView(true);",kurta);
Thread.sleep(3000);
run.moveToElement(kurta).click().perform();

}
}
}

