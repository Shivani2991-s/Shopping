package TestCases;

import org.testng.annotations.Test;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class LaunchApplicationn {
 
	String path;
	WebDriver driver; 
  @BeforeSuite
  public void beforeSuite() {
	  path = System.getProperty("user.dir")+ "\\Browser\\chromedriver.exe";
	  System.setProperty("webdriver.chrome.driver", path);
	  driver = new ChromeDriver();
	  driver.navigate().to("http://182.76.176.205/giftshop/");
	  
  }
  @AfterSuite
  public void afterSuite() {
	// driver.close();
  }

}
