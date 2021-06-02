package TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Home extends Login{
	List<WebElement> item;
	int count;
	@Test(priority=4)
  	public void Home_ForHim() {
  		driver.findElement(By.linkText("Home")).click();
  		driver.findElement(By.xpath("//div[@class='sidebarmenu']/a[1]")).click();
  		driver.findElement(By.xpath("//div[@class='sidebarmenu']/div[1]/ul/li[5]/a")).click();
  		item = driver.findElements(By.xpath("//div[@class='products']"));
  		 count = item.size();
  		System.out.println("items for him = "+count);
  	}
  	@Test(priority=5)
  	public void Home_ForHer() {
  		//driver.findElement(By.linkText("Home")).click();
  		driver.findElement(By.xpath("//div[@class='sidebarmenu']/a[2]")).click();
  		driver.findElement(By.xpath("//div[@class='sidebarmenu']/div[2]/ul/li[3]/a")).click();
  		item = driver.findElements(By.xpath("//div[@class='products']"));
  		count = item.size();
  		System.out.println("items for her = "+count);
  	}
	@Test(priority=6)
  	public void Home_ForKids() {
  		//driver.findElement(By.linkText("Home")).click();
  		driver.findElement(By.xpath("//div[@class='sidebarmenu']/a[3]")).click();
  		driver.findElement(By.xpath("//div[@class='sidebarmenu']/div[3]/ul/li[4]/a")).click();
  		item = driver.findElements(By.xpath("//div[@class='products']"));
  		count = item.size();
  		System.out.println("items for kids = "+count);
  	}
	@Test(priority=7)
  	public void Home_ForHome() {
  		//driver.findElement(By.linkText("Home")).click();
  		driver.findElement(By.xpath("//div[@class='sidebarmenu']/a[4]")).click();
  		driver.findElement(By.xpath("//div[@class='sidebarmenu']/div[4]/ul/li[4]/a")).click();
  		item = driver.findElements(By.xpath("//div[@class='products']"));
  		count = item.size();
  		System.out.println("items for home = "+count);
  	}
	@Test(priority=8)
  	public void Home_PersonalisedGifts() {
  		//driver.findElement(By.linkText("Home")).click();
  		driver.findElement(By.xpath("//div[@class='sidebarmenu']/a[5]")).click();
  		driver.findElement(By.xpath("//div[@class='sidebarmenu']/div[5]/ul/li[1]/a")).click();
  		item = driver.findElements(By.xpath("//div[@class='products']"));
  		count = item.size();
  		System.out.println("items for personalised gifts = "+count);
  	}
	@Test(priority=9)
  	public void Home_contactLink() {
  		driver.findElement(By.linkText("Contact")).click();
  		driver.findElement(By.cssSelector("[name='name']")).sendKeys("Shivani");
  		driver.findElement(By.cssSelector("[name='email']")).sendKeys("shivani.schdeva91@gmail.com");
  		driver.findElement(By.cssSelector("[name='message']")).sendKeys("Hey, what is the price of product");
  		driver.findElement(By.cssSelector("[name='submit']")).click();
  	
  	}
	@Test(priority=10)
  	public void Hii_adminLink() {
		String CurrentUrl= driver.getCurrentUrl();
		driver.findElement(By.linkText("Hii admin"));
		String NewUrl = driver.getCurrentUrl();
		if(CurrentUrl.equals(NewUrl)) {
			System.out.println("link is disabled");
		}
		else {
			System.out.println("link is enabled");
		}
  	
  	}
	@Test(priority=11)
  	public void Home_Search() {
		driver.findElement(By.linkText("Home")).click();
		driver.findElement(By.cssSelector("[class='field']")).sendKeys("Watch");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		item = driver.findElements(By.xpath("//div[@class='products']"));
  		count = item.size();
  		System.out.println("items = "+count);
  	
  	}
}
