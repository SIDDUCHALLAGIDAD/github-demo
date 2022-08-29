package Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class end2end 
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
driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
driver.findElement(By.id("autosuggest")).sendKeys("ind");
driver.findElement(By.xpath("//a[text()='India']")).click();
Thread.sleep(2000);
driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
driver.findElement(By.xpath("//a[contains(text(),' Bengaluru')]")).click();
driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[contains(text(),' Hubli ')]")).click();
driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
driver.findElement(By.xpath("//label[text()='One Way']")).click();
System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
{
System.out.println("its enabled");
}
else
{
System.out.println("its disabled");
}
driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
driver.findElement(By.id("divpaxinfo")).click();
System.out.println("Before "+driver.findElement(By.id("divpaxinfo")).getText());
for(int i=1; i<5; i++)
{
	driver.findElement(By.id("hrefIncAdt")).click();	
}
System.out.println("After "+driver.findElement(By.id("divpaxinfo")).getText());
Thread.sleep(2000);
driver.findElement(By.id("btnclosepaxoption")).click();
driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
driver.close();
}
}
