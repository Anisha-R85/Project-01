package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
  @Test
  public void f() {
	    WebDriverManager.chromedriver().setup();
	    
	    System.out.println("after mnager");
	    WebDriver driver = new ChromeDriver();
	        
	   
		driver.get("https://vst-web.cloudiumedge.com/signin");
		
		driver.manage().window().maximize(); 
		
		WebElement username= driver.findElement(By.cssSelector("input[type='text']"));
		username.sendKeys("anrvst2@gmail.com");
		
		WebElement password= driver.findElement(By.cssSelector("input[type='password']"));
		password.sendKeys("@Myvst123");
		WebElement submit= driver.findElement(By.cssSelector("button[type='submit']"));
		submit.click();
	  
  }
}
