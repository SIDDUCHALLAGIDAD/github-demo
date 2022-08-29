package PhilipsTravels;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class magicbricks 
{
static
{
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException
 { 
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.get("https://www.magicbricks.com/");
	
//	driver.switchTo().frame(0);
//	driver.switchTo().alert().dismiss();
	Thread.sleep(2000);
	System.out.println(driver.getTitle());
	Thread.sleep(2000);
//	driver.switchTo().parentFrame();
	Actions a=new Actions(driver);
	WebElement mousehovring = driver.findElement(By.xpath("(//a[@class='mb-header__sub__tabs__link js-menu-link'])[4]"));
	Thread.sleep(2000);
	Actions next = a.moveToElement(mousehovring).click();
	Thread.sleep(2000);
	driver.findElement(By.id("homeloanDrop-swiper-next")).click();
	Thread.sleep(2000);
	driver.quit();
	
	
 }
}
