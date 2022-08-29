package PhilipsTravels;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.Assert;

public class PHP_ExistingUserLogin_TestCase 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	 driver.get("https://www.phptravels.net/");
	 driver.findElement(By.xpath("(//a[text()='Login'])[3]")).click();
	 System.out.println(driver.getTitle());
	 String expected = "Login - PHPTRAVELS";
	 String Actual = driver.findElement(By.xpath("(//a[text()='Login'])[3]")).getText();
	 if(expected.equals(Actual))
	 {
		 System.out.println("Test case passed");
	 }else
	 {
		 System.out.println("Test case Failed");
	 }
	 //Assert.assertTrue(().equals("Login - PHPTRAVELS"));
	 driver.findElement(By.name("email")).sendKeys("xyz@gmail.com");
	 driver.findElement(By.name("password")).sendKeys("Sid@123");
	 System.out.println(driver.findElement(By.xpath("//label[text()='Remember Me']")).isSelected());
	 driver.findElement(By.xpath("//label[text()='Remember Me']")).click();
	 System.out.println(driver.findElement(By.xpath("//label[text()='Remember Me']")).isSelected());
	 driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
	 //System.out.println(driver.findElement(By.xpath("//button[contains(text(),'Please enter your ']")).getText());
	 driver.close();
	}
}
