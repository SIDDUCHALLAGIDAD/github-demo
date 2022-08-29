package demo1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Syncronization
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
	 driver.get("https://rahulshettyacademy.com/loginpagePractise/");
	 driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
	 driver.findElement(By.id("password")).sendKeys("learning");
	 driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
	// System.out.println(driver.switchTo().alert().getText());
	 //driver.switchTo().alert().accept();
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
	 System.out.println(driver.findElement(By.id("okayBtn")).getText());
	 driver.findElement(By.id("okayBtn")).click();
	 driver.findElement(By.xpath("//select[@class='form-control']//option[@value='consult']")).click();
	 //driver.findElement(By.xpath("//option[@value='consult']")).click();
	 //driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	 driver.findElement(By.name("terms")).click();
	 driver.findElement(By.id("signInBtn")).click();
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='nav-link btn btn-primary']")));
	 for(int i=1; i<5; i++)
	 {
	 driver.findElement(By.cssSelector(".btn.btn-info")).click();
	 }
	 driver.findElement(By.cssSelector(".nav-link.btn.btn-primary")).click();
	 Thread.sleep(5000);
	 driver.close();
	}
}
