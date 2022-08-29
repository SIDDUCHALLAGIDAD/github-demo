package Demo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicit 
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
	    driver.get("https://rahulshettyacademy.com/seleniumPractise/");
	}
}
