package PhilipsTravels;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmzonOrder_TakeScreenShot 
{
  static
  {
	  System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
  }
  public static void main(String[] args) throws InterruptedException, IOException 
  {
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	 driver.get("https://www.amazon.in/");
	 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone xr");
	 driver.findElement(By.id("nav-search-submit-button")).click();
	 driver.findElement(By.xpath("//span[contains(text(),'Apple iPhone XR')]")).click();
	 Set<String> window = driver.getWindowHandles();
	 Iterator<String> it = window.iterator();
	 String pid = it.next();
	 String cid = it.next();
	 driver.switchTo().window(cid);
	 driver.findElement(By.id("add-to-cart-button")).click();
	 Thread.sleep(2000);
     System.out.println(driver.findElement(By.xpath("//span[@class='a-size-medium-plus a-color-base sw-atc-text a-text-bold']")).getText());
     File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
     FileUtils.copyFile(f, new File("C:\\Users\\siddappa.challagidad\\Desktop\\Automation ScreenShot\\AddedToCart.png"));
    
	 driver.quit();	 
  }
}
