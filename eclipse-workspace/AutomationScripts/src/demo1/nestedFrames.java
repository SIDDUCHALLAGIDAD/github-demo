package demo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nestedFrames 
{
static
{
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException 
{
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
driver.get("https://the-internet.herokuapp.com/");
driver.navigate().to("https://the-internet.herokuapp.com/nested_frames");
//driver.findElement(By.linkText("Nested Frames")).click();
driver.switchTo().frame("frame-top");
driver.switchTo().frame("frame-middle");
System.out.println(driver.findElement(By.id("content")).getText());
driver.close();
}
}
