package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class framesTest 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
	 WebDriver driver= new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	 driver.get("https://jqueryui.com/droppable/");
	 System.out.println(driver.findElement(By.tagName("iframe")).getSize());
	 driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
	// driver.switchTo().frame(0);
	 Actions a=new Actions(driver);
	 WebElement source = driver.findElement(By.id("draggable"));
	 WebElement target = driver.findElement(By.id("droppable"));
	 System.out.println(driver.getTitle());
	 a.dragAndDrop(source, target).build().perform();
	 driver.switchTo().defaultContent();
	 System.out.println(driver.getTitle());
	 Thread.sleep(2000);
	 driver.close();
	 
	}
}
