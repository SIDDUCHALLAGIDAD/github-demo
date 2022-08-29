package PhilipsTravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	}
	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver", "F:\\JAVA\\Selenium_Project\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/drag_drop.html");

		Actions acc = new Actions(driver);

		WebElement src1 = driver.findElement(By.id("credit2"));
		WebElement des1 = driver.findElement(By.id("bank"));
		acc.dragAndDrop(src1, des1).perform();

		WebElement src2 = driver.findElement(By.id("fourth"));
		WebElement des2 = driver.findElement(By.id("amt7"));
		acc.dragAndDrop(src2, des2).perform();

		WebElement src3 = driver.findElement(By.id("credit1"));
		WebElement des3 = driver.findElement(By.id("loan"));
		acc.dragAndDrop(src3, des3).perform();

		WebElement src4 = driver.findElement(By.id("fourth"));
		WebElement des4 = driver.findElement(By.id("amt8"));
		acc.dragAndDrop(src4, des4).perform();
		}

		
}
