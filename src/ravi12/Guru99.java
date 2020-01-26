package ravi12;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Guru99 {
	public WebDriver driver;
public Actions action; 
  @Test
  public void f() throws Exception {
	  
	  action = new Actions(driver);

	  WebElement element = driver.findElement(By.xpath("//*[@id=\"menu-3688-particle\"]/nav/ul/li[2]/div"));
	  action.moveToElement(element).build().perform();

		 List<WebElement> element1 = new Select(driver.findElement(By.xpath("//*[@id=\"menu-3688-particle\"]/nav/ul/li[2]/div"))).getOptions();
		 
		 //System.out.println(values.get(4).getText());
		 
		 for (int i = 0; i < element1.size(); i++) {
			 
			 System.out.println(element1.get(i).getText());
			   	  
  }
		 }
  @BeforeTest
  public void beforeTest() {
	 ;
	  System.setProperty("webdriver.chrome.driver","E:\\selenim\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.guru99.com/");
		driver.manage().window().maximize();
	   
	  
  }
  

}
