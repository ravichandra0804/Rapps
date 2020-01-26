package ravi12;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class OnlyAction {
	public WebDriver driver;
	public Actions action;
	
  @Test
  public void mouseover() throws Exception {
	  Actions action=new Actions(driver);  
	WebElement element=(driver.findElement(By.id("highlight-addons")));
	action.moveToElement(element).build().perform();
	driver.findElement(By.xpath ("//*[@id=\"header-addons\"]/ul/li[10]/a")).click();
	 Thread.sleep(3000); 
	  
  }
  @BeforeTest
  public void openurl() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver.exe");  
		 driver=new ChromeDriver();
		 driver.get("https://www.spicejet.com/");
		  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
