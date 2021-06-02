package TestCases;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SignUp extends LaunchApplicationn{
	   String Verifyregistration_Status = null;
	    String Verifyregistration_Message = null;
  @Test(priority=1,enabled=false)
  public void Register_invalid() {
	  driver.findElement(By.linkText("Sign Up")).click();
	  driver.findElement(By.cssSelector("[name='submit']")).click();
	  List<WebElement> fields= driver.findElements(By.xpath("//input"));
	  for(WebElement field:fields)
	  {
		  if(field.getAttribute("value").isEmpty())
		  {
			  System.out.println("enter details");
			  break;
		  }
	  }

  }
  @Test(priority=2,enabled=false)
  public void Register_valid(){
	
	
	  driver.findElement(By.cssSelector("[type='text']")).sendKeys("abhishekshivi9");
	  driver.findElement(By.cssSelector("[type='email']")).sendKeys("shivani.sachdeva91@gmail.com");
	  driver.findElement(By.cssSelector("[name='password']")).sendKeys("abhi123");
	  driver.findElement(By.cssSelector("[name='confirmpassword']")).sendKeys("abhi12");
	  driver.findElement(By.cssSelector("[name='submit']")).click();
	 if(driver.findElements(By.tagName("h3")).size()>0) {
		 System.out.println("user already existed");
	 }
	 else {
		 System.out.println("user created");
	 }
  }
  @Test(priority=3,enabled=true)
  public void Login_button() {
	  driver.findElement(By.linkText("Sign Up")).click();

	  driver.findElement(By.cssSelector("[src='css/images/logi.jpg']")).click();
	  String ExpectedUrl ="http://182.76.176.205/giftshop/Login.php";
	 String ActualUrl =driver.getCurrentUrl();
	 System.out.println(driver.getCurrentUrl());
	 if(ExpectedUrl.equals(ActualUrl)) {
		 System.out.println("login button is working");
	 }
	 else {
		 System.out.println("login button is not working");
	 }
  }
  @Test(priority=4,enabled=true)
  public void Back_button() {
	  
	  driver.navigate().back();
	  
	  driver.findElement(By.cssSelector("[src='css/images/back.jpg']")).click();
	  String ExpectedUrl ="http://182.76.176.205/giftshop/index.php";
	 String ActualUrl =driver.getCurrentUrl();
	 if(ExpectedUrl.equals(ActualUrl)) {
		 System.out.println("back button is working");
	 }
	 else {
		 System.out.println("back button is not working");
	 }
  }
  
}
