package TestCases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;

public class Login extends LaunchApplicationn{
	List<WebElement> item;
	int count;
  @Test(priority=1)
  public void test_LoginButton() {
	  WebDriverWait w = new WebDriverWait(driver,5);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Login")));
	  driver.findElement(By.linkText("Login")).click();
		  String ExpectedUrl = "http://182.76.176.205/giftshop/login.php";
		 String CurrentUrl = driver.getCurrentUrl();
		 if(ExpectedUrl.equals(CurrentUrl) )
		 {
			  System.out.println("validate");
		 }
		 else
		 {
			 System.out.println("not validate");
			 
			 
			 
		 }
  }
  @Test(priority=2,enabled = false)
 
   public void test_LoginPage1() {
 	  //invalid credentials
 	  driver.findElement(By.cssSelector("[type='text']")).sendKeys("admin1");
 	  driver.findElement(By.cssSelector("[type='password']")).sendKeys("admin");
 	  driver.findElement(By.cssSelector("[name='submit']")).click();
 	  
 	  String ExpectedUrl = "Shop Around";
 		 String CurrentUrl = driver.getTitle();
 		 if(ExpectedUrl.equals(CurrentUrl))
 		 {
 			  System.out.println("validate");
 		 }
 		 else
 		 {
 			 System.out.println("not validate");
 		 }
  }
  @Test(priority=3,enabled = false)
  @Parameters({"username","password"})
  public void test_LoginPage(String username,String password) {
	  //valid credentials
	  driver.findElement(By.cssSelector("[type='text']")).sendKeys(username);
	  driver.findElement(By.cssSelector("[type='password']")).sendKeys(password);
	  driver.findElement(By.cssSelector("[name='submit']")).click();
	  
	  String ExpectedUrl = "Shop Around";
		 String CurrentUrl = driver.getTitle();
		 if(ExpectedUrl.equals(CurrentUrl))
		 {
			  System.out.println("validate");
		 }
		 else
		 {
			 System.out.println("not validate");
		 }
  }
  	
  @Test(dataProvider="LoginTest",priority =4)
  public void test_Login2(String username,String password)
  {
	  driver = new ChromeDriver();
	  driver.navigate().to("http://182.76.176.205/giftshop/");
	  driver.findElement(By.linkText("Login")).click();
	  driver.findElement(By.cssSelector("[type='text']")).sendKeys(username);
	  driver.findElement(By.cssSelector("[type='password']")).sendKeys(password);
	  driver.findElement(By.cssSelector("[name='submit']")).click();
	 
  }
  @DataProvider(name = "LoginTest")
  public Object[][]log(){
	  
	 Object [][] data = new Object[2][2];
	 data[0][0]="user1";
	 data[0][1]="pwd";
	 data[1][0]="admin";
	 data[1][1]="admin";
	 return data;
	
	  
  }
  	
}
