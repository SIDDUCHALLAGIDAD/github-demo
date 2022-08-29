package demo1;

import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.zeromq.ZStar.Set;

public class script1 
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
	  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	  driver.findElement(By.xpath("(//input[@name='radioButton'])[1]")).click();
	  System.out.println(driver.findElement(By.xpath("(//input[@name='radioButton'])[1]")).isSelected());
      Thread.sleep(2000);
	  driver.findElement(By.xpath("(//input[@name='radioButton'])[2]")).click();			  
	  System.out.println(driver.findElement(By.xpath("(//input[@name='radioButton'])[2]")).isSelected());
	  Thread.sleep(2000);
	  System.out.println(driver.findElement(By.xpath("(//input[@name='radioButton'])[3]")).isSelected());
      driver.findElement(By.xpath("(//input[@name='radioButton'])[3]")).click();
	  Thread.sleep(2000);
		driver.findElement(By.id("autocomplete")).sendKeys("United States");
		driver.findElement(By.xpath("(//div[text()='United States Minor Outlying Islands'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("dropdown-class-example")).click();
		driver.findElement(By.xpath("//*[@value='option1']")).click();
		Thread.sleep(2000);
		  driver.findElement(By.id("checkBoxOption1")).click();
			//Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
			driver.findElement(By.id("checkBoxOption2")).click();
			//Assert.assertTrue(driver.findElement(By.id("checkBoxOption2")).isSelected());
			driver.findElement(By.id("checkBoxOption3")).click();
			//Assert.assertTrue(driver.findElement(By.id("checkBoxOption3")).isSelected());
			Thread.sleep(2000);
		      driver.findElement(By.id("openwindow")).click();
		      driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
			    //Set<String> s = driver.getWindowHandles();
				//Iterator<String> s = windows.iterator();
			    //String parentId = s.next();
			    //driver.switchTo().window(parentId);
			    System.out.println(driver.getTitle());
	            driver.close();
	}
}
