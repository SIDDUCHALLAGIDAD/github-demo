package Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test8 
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
	 System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isSelected());
	 driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).click();
	 System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isSelected());
	 
	 //count check box
	System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
	driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
	}
}
