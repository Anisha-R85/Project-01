package testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ATest {
	@Test
	  public void f() {
		    WebDriverManager.chromedriver().setup();
		    
		    WebDriver driver = new ChromeDriver();
		    driver.get("https://gmail.com");
		    System.out.println("gmail test");
		        
		   

}
}
