package demo1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakesScreenShot
{
 static
 {
	 System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
 }
 public static void main(String[] args) throws IOException 
 {
  WebDriver driver = new ChromeDriver();
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
  driver.get("https://www.amazon.in/");
//  TakesScreenshot ts =(TakesScreenshot)driver;
//  File src = ts.getScreenshotAs(OutputType.FILE);
//  File dst = new File("C:\\Users\\siddappa.challagidad\\Desktop\\Automation ScreenShot\\HomePage.jpeg");
//  FileUtils.copyFile(src, dst);
  
  File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
  FileUtils.copyFile(f, new File("C:\\Users\\siddappa.challagidad\\Desktop\\Automation ScreenShot\\Homepage.png"));
 
  driver.quit();
 }
}
