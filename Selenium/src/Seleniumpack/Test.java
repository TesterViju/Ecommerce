package Seleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Java Study material\\Selenium\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	
	driver.get("https://www.flipkart.com/");
	
	String url = driver.getCurrentUrl();
	
	System.out.println(url);
	
String title = driver.getTitle();
	
	System.out.println(title);
	Thread.sleep(1000);
	
	WebElement User  = driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]"));
	
	User.sendKeys("9767973515");
	Thread.sleep(1000);
	
	
	WebElement Pass = driver.findElement(By.xpath("(//input[@autocomplete='off'])[3]"));
	
	Pass.sendKeys("VIJAY121293");
	Thread.sleep(1000);
	

		
	WebElement Login = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	
	Login.click();
	Thread.sleep(1000);
	
	WebElement Vijay =driver.findElement(By.xpath("(//div[@class='_28p97w'])[2]"));
 	
	 //Print the text of the searched element
	System.out.println(Vijay.getText());
	
	Thread.sleep(1000);
	
	Actions act = new Actions (driver);
	
	
	act.moveToElement(Vijay).perform();
	
	
	Thread.sleep(1000);
	WebElement Acc = driver.findElement(By.xpath("(//div[@class='_3vhnxf'])"));
	
	act.moveToElement(Acc).click().perform();
	System.out.println(Acc.getText());
		
//	WebElement More = driver.findElement(By.xpath("//div[@class=\"exehdJ\"]"));
	
//	WebElement Ad = driver.findElement(By.xpath("(//div[@class='_3vhnxf'])[3]"));
		
//		Actions act = new Actions (driver);
//		
//		
//		act.moveToElement(More);
//		
	
	
	}

}
