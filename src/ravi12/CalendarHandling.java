package ravi12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class CalendarHandling {
 
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","E:\\selenim\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
 
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
					
		List<WebElement> allDates=driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[5]/td[2]/a"));
		
		
		
		
		for(WebElement ele:allDates)
		{
			
			String date=ele.getText();
			
			if(date.equalsIgnoreCase("28"))
			{
				ele.click();
				break;
			}
			
		}
		
		
	}
 
}