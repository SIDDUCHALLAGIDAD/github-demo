package Demo;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.language.AstSorter;

public class windowsHandle
{
static
{
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
}
public static void main(String[] args) 
{
 WebDriver driver= new ChromeDriver();
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
 driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
 driver.findElement(By.cssSelector(".blinkingText")).click();
 Set<String> windows = driver.getWindowHandles();
 Iterator<String> it = windows.iterator();
 String parentId=it.next();
 String childId=it.next();
 driver.switchTo().window(childId);
 System.out.println(driver.findElement(By.cssSelector(".icon.fa.fa-envelope")).getText());
 driver.findElement(By.cssSelector(".icon.fa.fa-envelope")).getText();
 String emailId= driver.findElement(By.cssSelector(".icon.fa.fa-envelope")).getText().trim();
 System.out.println(emailId);
 driver.switchTo().window(parentId);
 driver.findElement(By.id("username")).sendKeys(emailId);
 //driver.quit();
}
}
