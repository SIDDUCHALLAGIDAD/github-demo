package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseHovering
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
	driver.get("https://amazon.com/");
	Actions a= new Actions(driver);
	WebElement move = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
	a.moveToElement(move).contextClick().build().perform();
	a.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
	a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("siddu").doubleClick().build().perform();
	Thread.sleep(2000);
	driver.close();
}
}
