package ravi12;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Tagname {
	public WebDriver driver;
  @Test
  public void f() {
	  driver.findElement(By.xpath("//*[@id=\"heading86396\"]/h5/a")).click();
	  List<WebElement> List = new Select(driver.findElement(By.xpath("//*[@id=\\\"heading86396\\\"]/h5/a"))).getOptions();
		 
		 
		 
		 for (int i = 0; i < List.size(); i++) {
			 
			 System.out.println(List.get(i).getText());
		 }			 
			 
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  ChromeOptions options = new ChromeOptions();
	  options.addArguments("--disable-notifications");
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver.exe");  
		 driver=new ChromeDriver();
		 driver.get("https://www.edureka.co/blog/selenium-chromedriver-and-geckodriver/");
		 driver.findElement(By.id("wzrk-cancel")).click();
  }

  @AfterTest
  public void afterTest() {
  }

}
