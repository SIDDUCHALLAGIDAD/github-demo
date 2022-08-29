package Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;

public class test10 
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
	 //System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
	 //driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
	 //System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
	 System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
	 System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
	 driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	 System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
	 if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
	 {
	 System.out.println("its enabled");
	 
	 }
	 else
	 {
	 System.out.println("its disabled");
	 }
	 Thread.sleep(2000);
	 driver.close();	
	}
}
