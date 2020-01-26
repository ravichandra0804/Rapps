package BANK;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Bank {
	public WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.findElement(By.id("//*[@id=\"closeBtn\"]")).click();
	  Thread.sleep(3000);
	  String WinHandleBefore =driver.getWindowHandle();
	  
	  for(String winHandle : driver.getWindowHandles()){
	      driver.switchTo().window(winHandle);
	  }
	  driver.findElement(By.xpath("//*[@id=\"closeBtn\"]")).click();
	  driver.findElement(By.linkText("Bank Project")).click();
	  driver.findElement(By.name("name")).sendKeys("mngr239658");
	  driver.findElement(By.name("password")).sendKeys("password");
	  driver.findElement(By.name("btnLogin")).click();
		  
	  }
		
      
	  

  @BeforeTest
  public void beforeTest()   throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		  driver.findElement(By.id("details-button")).click();
		  driver.findElement(By.linkText("Proceed to demo.guru99.com (unsafe)")).click();
		  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
