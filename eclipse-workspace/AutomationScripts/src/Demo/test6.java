package Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test6 
{
static
{
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException 
{
 WebDriver driver=new ChromeDriver();
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
 driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
 driver.findElement(By.xpath("//a[text()=' Hubli (HBX)']")).click();
 Thread.sleep(2000);
 driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
 //driver.findElement(By.xpath("(//a[@text='Goa (GOI)'])[2]")).click(); 
 //or without using index parent to child by giving one blank space.
 driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@text='Goa (GOI)']")).click();
 Thread.sleep(2000); 
 driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
 Thread.sleep(2000);
 driver.close();
 
 
}
}
