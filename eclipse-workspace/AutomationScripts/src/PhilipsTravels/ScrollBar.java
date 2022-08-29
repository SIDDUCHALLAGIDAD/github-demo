package PhilipsTravels;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBar 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	 driver.get("https://opensource-demo.orangehrmlive.com/");
	 JavascriptExecutor js=(JavascriptExecutor)driver;
	 js.executeScript("window.scrollBy(0,250)"); //Vertical Scroll Bar
	 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	 driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	 driver.findElement(By.id("btnLogin")).click();
	 
	}
}
