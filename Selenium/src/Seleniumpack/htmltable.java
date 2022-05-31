package Seleniumpack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class htmltable {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Java Study material\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
//		String url = driver.getCurrentUrl();
//		
//		System.out.println(url);
		
//	String title = driver.getTitle();
		
//		System.out.println(title);
		
		List<WebElement> cells  = driver.findElements(By.xpath("//table[@id='customers']//tr[2]"));
		
		for(int i=0; i<cells.size(); i++)
			
		{
			String text = cells.get(i).getText();
			System.out.print(text + ",");
		}
//		int size = cells.size();
//		System.out.print(size);
		
		
		
		
		//table[@id='customers']))
		
//				
}
}//table[@id='customers']//table[@id='customers']
