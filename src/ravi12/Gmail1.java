package ravi12;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Gmail1 {
	public WebDriver driver;
	  
  @Test
  public void login() throws Exception {
	driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("ravichandra0804@gmail.com");
	driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("avengers143"); 
	
	driver.findElement(By.id("yDmH0d")).click();	
	Thread.sleep(3000);
	driver.switchTo().alert().accept();
	driver.findElement(By.xpath("//*[@id=\"js_2n\"]/div[1]/div/div[1]/div[1]/div[2]/div/div/div/div")).click();
	driver.findElement(By.xpath("//*[@id=\"js_2n\"]/div[1]/div/div[1]/div[1]/div[2]/div/div/div/div")).sendKeys("Good evening friends");
	driver.findElement(By.xpath("//*[@id=\"js_1m\"]/div[2]/div[3]/div[2]/button")).click();	
	
  }
  @BeforeTest
  public void openurl() throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https:\\www.facebook.com");
	Thread.sleep(5000);
	
	    
  }
  @AfterTest
  public void afterTest() {
	  
	  
  }

}
