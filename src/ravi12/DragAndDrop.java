package ravi12;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.WebElement;		
import org.openqa.selenium.chrome.ChromeDriver;		
import org.openqa.selenium.interactions.Actions;		
import org.testng.annotations.Test;		

public class DragAndDrop {				

    //WebDriver driver;			

    @Test		
    public void DragnDrop() throws Exception					
    {		
         System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver.exe");		
         WebDriver driver= new ChromeDriver();
         					
         driver.get("http://demo.guru99.com/test/drag_drop.html");	
         
       //Using Action class for drag and drop.
         Actions act=new Actions(driver);
         
		//Element which needs to drag.    		
        	WebElement From=driver.findElement(By.xpath("//*[@id='credit2']/a"));	
         
         //Element on which need to drop.		
         WebElement To=driver.findElement(By.xpath("//*[@id='bank']/li"));					
         		       	
         

	//Dragged and dropped
         Thread.sleep(3000);		
         act.dragAndDrop(From, To).build().perform();	
         
	}		
}