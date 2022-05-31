package Seleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Java Study material\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.amazon.in/");
		
		String url = driver.getCurrentUrl();
		
		System.out.println(url);
		
	String title = driver.getTitle();
		
		System.out.println(title);
		
		Actions Ad = new Actions (driver);
		
		WebElement More =driver.findElement(By.xpath("//a[@id='icp-nav-flyout']"));
		
		Ad.moveToElement(More).perform();
		Thread.sleep(500);
		
		WebElement Ad1 = driver.findElement(By.xpath("((//div[@class='nav-template nav-flyout-content nav-tpl-itemList'])//span[@class='nav-text'])[8]"));

		Ad.moveToElement(Ad1).click().perform();
		System.out.println(Ad1.getText());
		
		

}
}
