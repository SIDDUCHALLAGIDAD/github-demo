package demo1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown 
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
	 driver.get("https://www.jotformpro.com/form/43514646570961?");
	 driver.switchTo().frame(0);
	 driver.findElement(By.xpath("//span[text()='Large Capacity']")).click();
	 Thread.sleep(2000);
	 WebElement staticDropdown = driver.findElement(By.xpath("//div[@id='dropdownsContainer']/select[1]"));
	// or //driver.findElement(By.xpath("//li[text()='Small Capacity or Families']")).click(); 
	 Select dropdown=new Select(staticDropdown);
	 dropdown.selectByIndex(1);
	 
	 //Robot r=new Robot();
	 
	 
	 
	}
}
