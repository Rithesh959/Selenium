package section6;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\RGUD\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();

		
		//java methods can be used to click on the link and give the status
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
	WebElement footer=	driver.findElement(By.id("gf-BIG"));

	  List<WebElement> links =footer.findElements(By.tagName("a"));
	  
	  System.out.println("Broken links ");
	  
	  for(WebElement link : links)
	  {
		  String url =link.getAttribute("href");
		 
		  HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
		  
		  conn.setRequestMethod("HEAD");
		  conn.connect();
		  int status=conn.getResponseCode();
		  if(status>=400)
		  {
			 System.out.println( link.getText());
			 
			  
		  }
		  
				//soft Assertions used to continue the execution still if we have an failure for assertion 
		     //softAssertion sa = new SoftAssertions();
		  //a.AssertEqualTrue(condition, message);
		  
		  
		  
				  
		  
		  
	  }
	  
	   
	   
	   
		
		
		

	}

}
