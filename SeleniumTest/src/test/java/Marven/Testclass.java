package Marven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testclass {
	public static void main (String[] args) { 
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Java Study material\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.flipkart.com/");
}
}

		