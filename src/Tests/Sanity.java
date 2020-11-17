package Tests;

/*************************************************
 * 
 * Author: LJA
 * Version: v1.0
 * Comment:
 *      v1.0 - working ok with firefox and Chrome. 
 */


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import po.HomePage;

//comment the above line and uncomment below line to use Chrome
//import org.openqa.selenium.chrome.ChromeDriver;
public class Sanity {

	public Sanity() {
		// TODO Auto-generated constructor stub
	}
	WebDriver driver;
	HomePage hp;
	
	@Before
	public void setUp(){
		// declaration and instantiation of objects/variables
	   	System.setProperty("webdriver.gecko.driver","D:\\apps2\\Selenium\\geckodriver.exe");
	    driver = new FirefoxDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
	//	System.setProperty("webdriver.chrome.driver","D:\\apps2\\Selenium\\chromedriver.exe");
	//	driver = new ChromeDriver();
	}
	
	@After
	public void tearDown(){
		driver.quit();
	}

 
	@Test
	public void JobServeTitleCheck(){	
        String baseUrl = "http://www.jobserve.com/";
        String expectedTitle = "IT Jobs, Engineering Jobs, Healthcare Jobs… Find your next job with JobServe";
        String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);
        hp = new HomePage(driver);
        
        // get the actual value of the title
        actualTitle = hp.getTitle();
        System.out.println(actualTitle);

        assertTrue(expectedTitle.equals(actualTitle));
       
        //close Fire fox
        //driver.close();
       
    }

}
