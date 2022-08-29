package Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test5 
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
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/ ");
		driver.findElement(By.id("divpaxinfo")).click();
		System.out.println("Before "+driver.findElement(By.id("divpaxinfo")).getText());
		
		/*
		 * int i=1; while(i<5) { driver.findElement(By.id("hrefIncAdt")).click();
		 * Thread.sleep(1000); i++; }
		 */
		  for(int i=1; i<5; i++)
		  {
			  driver.findElement(By.id("hrefIncAdt")).click();
		  }
		 
		System.out.println("After "+driver.findElement(By.id("divpaxinfo")).getText());
		driver.findElement(By.id("btnclosepaxoption")).click();
		driver.close();
	}

}
