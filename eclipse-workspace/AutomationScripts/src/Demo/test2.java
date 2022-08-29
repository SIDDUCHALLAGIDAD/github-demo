package Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 {
	public static void main(String[] args) throws InterruptedException {
        String name = "rahul";
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String password = getPassword(driver);
		System.out.println(password);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click();
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
		public static String getPassword(WebDriver driver) throws InterruptedException
		{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordText =driver.findElement(By.cssSelector("form p")).getText();
		String[] passwordArray = passwordText.split("'");
		String password = passwordArray[1].split("'")[0];
		return password;
		}
}
