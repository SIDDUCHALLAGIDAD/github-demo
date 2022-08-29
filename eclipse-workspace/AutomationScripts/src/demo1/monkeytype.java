package demo1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class monkeytype 
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
	 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 driver.get("https://monkeytype.com");
	// driver.switchTo().alert().accept();
	 driver.findElement(By.xpath("//div[text()='Accept all']")).click();
	 //Actions a=new Actions(driver);
//	 a.keyDown(Keys.TAB).build().perform();
//	 a.keyUp(Keys.TAB).build().perform();
//	 a.keyDown(Keys.ENTER).build().perform();
//	 a.keyUp(Keys.ENTER).build().perform();
	 Robot r=new Robot();
	
	 r.keyPress(KeyEvent.VK_TAB);
	 r.keyRelease(KeyEvent.VK_TAB);
	 r.keyPress(KeyEvent.VK_ENTER);
	 r.keyRelease(KeyEvent.VK_ENTER);
	 Thread.sleep(2000);
	 
	 driver.quit();
	
	 
	}
}
