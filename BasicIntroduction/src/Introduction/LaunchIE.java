package Introduction;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchIE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "C:\\RGUD\\IEDriverServer.exe");
		
		
		WebDriver driver=new InternetExplorerDriver();
		
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		//driver.close();
		
		
		
	}

}
