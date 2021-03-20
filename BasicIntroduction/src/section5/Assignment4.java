package section5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\RGUD\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> rows =driver.findElements(By.xpath("//*[@name='courses']/tbody/tr"));
		
		System.out.println("No of rows - "+rows.size());
		
		List<WebElement> column =driver.findElements(By.xpath("//*[@name='courses']/tbody/tr/th"));
		
		System.out.println("No of column" + column.size());
		
		
		System.out.println(rows.get(2).getText());
		
		
		
		
		
		
		
		 
		
		
	}

}
