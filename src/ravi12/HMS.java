package ravi12;

import org.testng.annotations.Test;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class HMS {
	//public WebDriver driver;
	
	
  @Test
  public void f() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver.exe");  
		WebDriver driver=new ChromeDriver();
		 driver.get("http://www.computechis.com/DemoSite/");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  
	driver.findElement(By.name("username")).sendKeys("admin"); 
	driver.findElement(By.name("password")).sendKeys("admin"); 
	driver.findElement(By.name("submit")).click();
	driver.findElement(By.linkText("Registration")).click();
	
	  new Select(driver.findElement(By.name("PATIENT_CAT"))).selectByVisibleText("Self");
	    new Select(driver.findElement(By.name("TITLE"))).selectByVisibleText("Mr.");
	    driver.findElement(By.name("PNT_NAME")).sendKeys("Vaddepati"); 
	    driver.findElement(By.name("MIDDLE_NAME")).sendKeys("Ravi"); 
	    driver.findElement(By.name("LAST_NAME")).sendKeys("Chandra"); 
	    driver.findElement(By.name("DOB")).sendKeys("8-4-2019");
	    
	    
	    driver.findElement(By.name("AGE")).sendKeys("25"); 
	    new Select(driver.findElement(By.name("SEX"))).selectByVisibleText("Male");
	    new Select(driver.findElement(By.name("MTRL_STATUS"))).selectByVisibleText("Single");
	    new Select(driver.findElement(By.name("RELIGION"))).selectByVisibleText("Hindu");
	    new Select(driver.findElement(By.name("PLANGUAGE"))).selectByVisibleText("Telugu");
	    new Select(driver.findElement(By.name("RELATION"))).selectByVisibleText("Brother");
	    driver.findElement(By.name("MOTHER_NAME")).sendKeys("Subhadra Devi");
	    new Select(driver.findElement(By.name("PAT_IDENTITY"))).selectByVisibleText("Voter ID");
	    driver.findElement(By.name("PAT_IDENTITY_PROOF")).sendKeys("57282837282");
	    new Select(driver.findElement(By.name("NATIONALITY"))).selectByVisibleText("Indian");
	    new Select(driver.findElement(By.name("IS_MLC"))).selectByVisibleText("No");
	    new Select(driver.findElement(By.name("EDUCATION"))).selectByVisibleText("B.Tech");
	    new Select(driver.findElement(By.name("OCCUPATION"))).selectByVisibleText("Self Employeed");
	    new Select(driver.findElement(By.name("BLOOD_GRP_CODE"))).selectByVisibleText("O+");
	    new Select(driver.findElement(By.name("CITIZENSHIP"))).selectByVisibleText("Indian");
	    new Select(driver.findElement(By.name("SC_PROOF"))).selectByVisibleText("Yes");
	    driver.findElement(By.name("ADDRESS1")).sendKeys("At agraharam guntur");
	    driver.findElement(By.name("MOBILE_NO")).sendKeys("9505207816");
	    driver.findElement(By.name("EMAIL_ID")).sendKeys("ravichandra0804@gmail.com");
	    new Select(driver.findElement(By.name("COUNTRY_CODE"))).selectByVisibleText("India");
	    driver.findElement(By.name("ADDRESS2")).sendKeys("Kondapur KIMS hospital");
	    driver.findElement(By.name("ZIP")).sendKeys("522004");
	    Thread.sleep(3000);	    
	    driver.findElement(By.xpath("//a[text()='Feedback']")).click();
		 

		  // Switch to new window opened
		  for(String winHandle : driver.getWindowHandles()){
		      driver.switchTo().window(winHandle);
		  }

		  Thread.sleep(2000);


		 
	driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys("Sitara");
	 driver.findElement(By.id("email")).sendKeys("admin");
	  new Select(driver.findElement(By.id("car"))).selectByIndex(4);
	  driver.findElement(By.name("radio")).click();
	  driver.findElement(By.xpath("/html/body/div[2]/div/div/form/ul/li[5]/label/input")).click();
driver.findElement(By.xpath("/html/body/div[2]/div/div/form/ul/li[6]/input")).click();	
	 // driver.findElement(By.xpath("/html/body/div[2]/div/div/form/ul/li[6]")).click();
	Thread.sleep(5000);
	Runtime.getRuntime().exec("C:\\Users\\LENOVO\\Desktop\\hms2.exe");	
	Thread.sleep(2000);
	  driver.findElement(By.id("message")).sendKeys("Hello");
	    
	  
	  
  }
   

	    
	    
  
 // @BeforeTest
  //public void beforeTest() {
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver.exe");  
	//WebDriver driver=new ChromeDriver();
	// driver.get("http://www.computechis.com/DemoSite/");
	// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  
	  
  //}

 // @AfterTest
 // public void afterTest() {
	//driver.close();  
	  
	  
	  
	  
  }

//}
