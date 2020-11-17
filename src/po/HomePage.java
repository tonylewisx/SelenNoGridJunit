package po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class HomePage {

	WebDriver driver;
	
	public HomePage(WebDriver dr) {
		
		this.driver = dr;
	}

	 public String getTitle(){
		 return( driver.getTitle());
	 }
}
