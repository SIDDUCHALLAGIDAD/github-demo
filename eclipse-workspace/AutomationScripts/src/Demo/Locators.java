package Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators
{
static

	{
		String key = ("webdriver.chrome.driver");
		String value = ("./Drivers/chromedriver.exe");
		System.setProperty(key, value);
	}
	
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	driver.findElement(By.id("inputUsername")).sendKeys("siddu");
	driver.findElement(By.name("inputPassword")).sendKeys("sid@123");
	driver.findElement(By.className("signInBtn")).click();
	System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
	driver.findElement(By.linkText("Forgot your password?")).click();
	driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Siddu");
	driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("sid@gmail.com");
	driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("435678987687");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='Reset Login']")).click();
	System.out.println(driver.findElement(By.xpath("//p")).getText());
	
	driver.close();
}
}
