package ravi12;

import java.io.File;
import java.io.IOException;
 
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class Screenshot {
	public WebDriver driver;
 
public static void main(String[] args) throws Exception {
System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\LENOVO\\\\Downloads\\\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://www.edureka.co/");
TakesScreenshot ts = (TakesScreenshot)driver;
File source = ts.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(source, new File("C:\\Users\\LENOVO\\Desktop\\Testing material 2\\ravi.png"));
System.out.println("the Screenshot is taken");
driver.quit();
}
 
}