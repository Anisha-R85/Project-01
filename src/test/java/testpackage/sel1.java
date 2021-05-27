package testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sel1 {
  @Test
  public void f() {
	  
			
			    WebDriverManager.firefoxdriver().setup();
			    System.out.println("after mnager");
			
			    WebDriver driver = new FirefoxDriver();			    
			   
				driver.get("http://google.com");
				
				  }
}
