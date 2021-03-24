package section6;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;


public class Other {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\RGUD\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();

		
		driver.get("https://the-internet.herokuapp.com/windows");
		
		//maximize window 
		
		driver.manage().window().maximize();
		
		//delete all cookies
		
		driver.manage().deleteAllCookies();
		
		//delete one cookie
		
		//driver.manage().deleteCookieNamed("cookieName");
		
		//add cookie in case if you delete session cookie
		
	//	screen shot in selenium
		
             File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
             
             FileUtils.copyFile(src,new File("C:\\Users\\RGUD\\screen.png"));
             
             //how to handle broken links
             
             
             
		
		
		
		
	}

}
