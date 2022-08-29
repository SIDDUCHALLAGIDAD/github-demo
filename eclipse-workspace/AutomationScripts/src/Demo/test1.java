package Demo;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;

public class test1 
{
	static

	{
		String key = ("webdriver.chrome.driver");
		String value = ("./Drivers/chromedriver.exe");
		System.setProperty(key, value);
	}
	public static void main(String[] args) throws InterruptedException 
	{
		String name = "rahul";
		String password="rahulshettyacademy";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
	    driver.findElement(By.id("inputUsername")).sendKeys(name);
	    driver.findElement(By.name("inputPassword")).sendKeys(password);
	    driver.findElement(By.xpath("//*[text()='Sign In']")).click();
	    Thread.sleep(2000);
	    String title = driver.getTitle();
	    String verifytitle = "Rahul Shetty Academy - Login page";
	    if(title.equals(verifytitle))
	    {
	    	System.out.println("Test Case Passed");
	    }else
	    {
	    	System.out.println("Test Case Failed");
	    }
	    driver.findElement(By.xpath("//*[text()='Log Out']")).click();
	    driver.close();
	    
	   
	    
	    
	}
}
