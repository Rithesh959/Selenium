package section2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathParentChildRelationship {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\RGUD\\geckodriver.exe");
		
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://google.com");
		
		//driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div[2]/input")).sendKeys("Parent child relationship");
		
		driver.findElement(By.xpath("//div[@class='o3j99 qarstb']/div/div/a[3]/following-sibling::a[2]")).click();
	

	}

}
