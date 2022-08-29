package PhilipsTravels;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PHP_NewCustomerRegistration
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
	 driver.findElement(By.xpath("(//a[text()='Signup'])[3]")).click();
	 //driver.get("https://www.phptravels.net/signup");
	 driver.findElement(By.name("first_name")).sendKeys("Sid");
	 driver.findElement(By.name("last_name")).sendKeys("India");
	 driver.findElement(By.name("phone")).sendKeys("7022666776");
	 driver.findElement(By.name("email")).sendKeys("xyz@gmail.com");
	 driver.findElement(By.name("password")).sendKeys("xyz@123");
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='submit'])//span[text()='Signup']"))).click();
	 //driver.findElement(By.xpath("(//button)[6]")).click();
	 //driver.findElement(By.cssSelector(".btn.btn-default.btn-lg.btn-block.effect.ladda-button.waves-effect")).click();
	 //Thread.sleep(2000);
	 //driver.findElement(By.xpath("//span[text()='Signup']")).click();
	 //driver.findElement(By.xpath("(//button[@type='submit'])//span[text()='Signup']")).click();
	 //driver.findElement(By.cssSelector("button[data-style=\"zoom-in\"]")).click();
	 driver.close();
	 
	}
}
