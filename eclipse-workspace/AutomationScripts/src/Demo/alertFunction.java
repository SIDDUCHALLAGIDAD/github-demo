package Demo;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertFunction
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
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String name="Siddu";
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");	
        driver.findElement(By.id("name")).sendKeys(name);
        driver.findElement(By.id("alertbtn")).click();
        Thread.sleep(2000);
        System.out.println(driver.switchTo().alert().getText());
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
        driver.findElement(By.id("confirmbtn")).click();
        Thread.sleep(2000);
        System.out.println(driver.switchTo().alert().getText());
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();
        Thread.sleep(2000);
        driver.close();
	}
}
