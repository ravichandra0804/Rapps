package ravi12;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Gmail 
{
	
	public WebDriver driver;
	public void openurl()
	{
	System.setProperty("webdriver.chrome.driver","E:\\selenim\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://www.Gmail.com");

	}
	
	public void login() throws InterruptedException
	{
		driver.findElement(By.id("identifierId")).sendKeys("ravitesting427@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click(); 
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("9505207816");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click();
		driver.findElement(By.xpath("//*[@id=\":lw\"]/div/div")).click();
		Thread.sleep(3000);
		
	}
		public void compose() throws InterruptedException
		{
		driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3 T-I-JW']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(":rh")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(":rh")).sendKeys("ravichandra");
		}		
	
	public static void main(String[] args) throws InterruptedException
	{
		Gmail g=new Gmail();
		g.openurl();
		g.login();
	   g.compose();

	}
}
