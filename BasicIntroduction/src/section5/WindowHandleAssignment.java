package section5;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WindowHandleAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\RGUD\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();

		
		driver.get("https://the-internet.herokuapp.com/windows");
		
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String> windowId =driver.getWindowHandles();
		Iterator<String> it = windowId.iterator();
		String parent = it.next();
	    String child=	it.next();
	
		
		
		
		driver.switchTo().window(child);
		String childText =driver.findElement(By.xpath("//h3")).getText();
		System.out.println(childText);
		Assert.assertEquals(childText, "New Window", "verifying child window text");
		
		driver.switchTo().window(parent);
		
		String parentText = driver.findElement(By.xpath("//*[@id='content']/div/h3")).getText();
		
		Assert.assertEquals(parentText, "Opening a new window", "verifying parent window text");
		System.out.println(parentText);
		
		
		
		
		

	}

}
