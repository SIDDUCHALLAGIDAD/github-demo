package PhilipsTravels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts 
{
 static
 {
	 System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
 }
 public static void main(String[] args) throws InterruptedException 
 {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.magicbricks.com");
	Thread.sleep(5000);
	//driver.switchTo().frame(0);
	driver.switchTo().alert().dismiss();
	driver.quit();
 }
}
