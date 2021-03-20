package section3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\RGUD\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("name")).sendKeys("HI My name Rithi");
		driver.findElement(By.id("alertbtn")).click();
		
		String text=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		System.out.println(text);
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(10000L);
		
		driver.switchTo().alert().dismiss();
		
		
	}

}
