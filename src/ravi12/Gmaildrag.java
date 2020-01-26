package ravi12;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Gmaildrag {
	public WebDriver driver;
	
	
	
  @Test
  public void f() throws Exception {
	  driver.findElement(By.id("identifierId")).sendKeys("ravitesting427@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click(); 
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("9505207816");
		Thread.sleep(3000);		
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click();				
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\":55\"]/div/div")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\":bn\"]")).click();
		
		//to
		//driver.findElement(By.name("to")).click();
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys("ravichandra@gmail.com");
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@id=\":ol\"]")).click();
		
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver.exe");					
      driver= new ChromeDriver();					
      driver.get("http://www.Gmail.com");	
  }
  

  @AfterTest
  public void afterTest() {
  }

}
