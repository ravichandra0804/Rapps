package ravi12;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Redbus {
public WebDriver driver;	
	
	
	
  @Test
  public void f() throws Exception {
		/*
		 * ? alert_obj = driver.switchTo().alert() alert_obj.accept()
		 */
	  //driver.switchTo().alert().accept();
	  //driver.switchTo().alert().dismiss();
		/*
		 * Map<String, Object> prefs = new HashMap<String, Object>();
		 * 
		 * // Set the notification setting it will override the default setting
		 * prefs.put("profile.default_content_setting_values.notifications", 2);
		 * 
		 * // Create object of ChromeOption class ChromeOptions options = new
		 * ChromeOptions();
		 * 
		 * // Set the experimental option options.setExperimentalOption("prefs", prefs);
		 */
	driver.findElement(By.id("src")).sendKeys("Hyderabad (All Locations)");
	//new Select(driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[1]/div/ul/li"))).selectByVisibleText("Hyderabad (All Locations)");
	driver.findElement(By.xpath("//*[@id=\"src\"]")).click();
	driver.findElement(By.id("dest")).click();
	//driver.findElement(By.xpath("//*[@id=\\\"search\\\"]/div/div[1]/div/ul/li[1]")).click();
		/*
		 * driver.findElement(By.xpath("//*[@id=\\\"search\\\"]/div/div[1]/div/ul/li[1]"
		 * )).sendKeys("hyderabad");
		 * driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[1]/div/ul/li[1]")).
		 * click();
		 */
	driver.findElement(By.id("dest")).sendKeys("guntur");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[2]/div/ul/li[1]")).click();
	driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[7]/td[7]")).click();
	Thread.sleep(6000);
	driver.findElement(By.id("search_btn")).click();
	
	
  }
  @BeforeTest  void openurl() {
	  ChromeOptions options = new ChromeOptions();
	  options.addArguments("--disable-notifications");
	  //ChromeOptions options = new ChromeOptions();
	  //options.addArguments("--disable-notifications");
	  System.setProperty("webdriver.chrome.driver","E:\\selenim\\chromedriver.exe");  
	  driver=new ChromeDriver(options);
		 driver.get("https://www.redbus.in/");  
		 driver.manage().window().maximize();
		 //driver.switchTo().alert().accept();
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }
  
  

}
