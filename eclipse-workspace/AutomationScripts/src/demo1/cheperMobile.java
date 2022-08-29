package demo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class cheperMobile 
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
	driver.get("https://flipkart.com/");
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	driver.findElement(By.name("q")).sendKeys("redmi note 10 pro");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	String flipkart = driver.findElement(By.xpath("//div[@class='_30jeq3 _1_WHN1']")).getText();
	//System.out.println(driver.findElement(By.xpath("//div[@class='_30jeq3 _1_WHN1']")).getText());
	driver.navigate().to("https://amazon.com/");
	driver.findElement(By.xpath("//input[@data-action-type=\"DISMISS\"]")).click();
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("redmi note 10 pro");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();
	String amazon = driver.findElement(By.xpath("//*[text()='$245.00']")).getText();
	//System.out.println(driver.findElement(By.xpath("//*[text()='$245.00']")).getText());
	Thread.sleep(2000);
	if(flipkart==amazon)
	{
		System.out.println("Amzon Price is = "+amazon);
	}else
	{
		System.out.println("Flipkart Price is = "+flipkart);
	}
	driver.quit();
    
	
//	WebElement x = driver.findElement(By.id("twotabsearchtextbox"));
//	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("redmi");
//	Select s=new Select(x);
//	s.selectByVisibleText(" note 10 pro");
//	WebElement mi = driver.findElement(By.xpath("//input[@value='redmi note 10 pro']"));
//	Actions a=new Actions(driver);
//	WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(5));
//	Thread.sleep(2000);
//	a.moveToElement(driver.findElement(By.xpath("//input[@value='redmi note 10 pro']"))).build().perform();
//	a.click();
	}
}
