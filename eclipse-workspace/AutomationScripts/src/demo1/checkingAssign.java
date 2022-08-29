package demo1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkingAssign 
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
	 driver.get("https://rahulshettyacademy.com/angularpractice/");
	 driver.findElement(By.name("name")).sendKeys("Sid");
	 driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
	 driver.findElement(By.id("exampleInputPassword1")).sendKeys("sid@123");
	 driver.findElement(By.id("exampleCheck1")).click();
	 driver.findElement(By.xpath("//option[text()='Male']")).click();
	 driver.findElement(By.id("inlineRadio2")).click();
	 driver.findElement(By.name("bday")).sendKeys("12/08/1999");
	 driver.findElement(By.xpath("//input[@type='submit']")).click();
	 String Actual = driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText();
	 System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());
	 //System.out.println("Actual ="+Actual);
	 String Expected ="Success! The Form has been submitted successfully!.";
		
		  if(Actual.equals(Expected)) 
		  { System.out.println("Test Case Passed");
		  }else
		  {
		  System.out.println("Test Case Failed"); }
		 
	 driver.close();
	}
}
