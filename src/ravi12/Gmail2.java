package ravi12;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Gmail2 {
public WebDriver driver;	
	
  @Test
  public void login() throws Exception { 
	  driver.findElement(By.id("identifierId")).sendKeys("ravitesting427@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click(); 
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("9505207816");
		Thread.sleep(3000);		
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click();				
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\":3t\"]/div/div")).click();
		//to
		driver.findElement(By.name("to")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys("ravichandra@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\":ol\"]")).click();
		
		
		
		
	  
  }
  		  
  
  private void click() {
	// TODO Auto-generated method stub
	
}


@BeforeTest
  public void openurl() {
	  System.setProperty("webdriver.chrome.driver","E:\\selenim\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.Gmail.com");
		driver.manage().window().maximize();
	 
	 
  }

}
