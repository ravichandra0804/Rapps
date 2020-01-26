package ravi12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Hms2 {
	public WebDriver driver;
  @Test
  public void f() throws InterruptedException, Exception {
		  driver.findElement(By.name("username")).sendKeys("admin");
		  driver.findElement(By.name("password")).sendKeys("admin");
		  driver.findElement(By.name("submit")).click();
		  driver.findElement(By.linkText("Feedback")).click();
		 // for(String WH : driver.switchTo().window(driver.getWindowHandles()));
		  for(String winHandle : driver.getWindowHandles()){
		      driver.switchTo().window(winHandle);
		  }

	  driver.findElement(By.id("name")).sendKeys("admin");
	  driver.findElement(By.id("email")).sendKeys("admin");
	  new Select(driver.findElement(By.id("car"))).selectByIndex(4);
	  driver.findElement(By.name("radio")).click();
	 driver.findElement(By.xpath("//input[@type='file']")).click();
	 //(//input[@class='log'])[2]
	 
	  driver.findElement(By.xpath("(//li[contains(text(),'Upload a file:')])")).click();
	  
	  
	  Thread.sleep(5000);
	  Runtime.getRuntime().exec("C:\\Users\\LENOVO\\Desktop\\hms2.exe");
	  Thread.sleep(2000);
	  driver.findElement(By.id("message")).sendKeys("Hello");
	  driver.findElement(By.xpath("/html/body/div[2]/div/div/form/p/button[1]")).click();
  }  
  
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "E:\\selenim\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://seleniumbymahesh.com/HMS");
	 // driver.manage().window().wait(10);
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
  }

 

}
