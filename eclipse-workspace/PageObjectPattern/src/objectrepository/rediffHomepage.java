package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class rediffHomepage 
{
	 WebDriver driver;

	public  rediffHomepage(WebDriver driver)
	{
		this.driver=driver;
	}
	By username=By.id("login1");
	By password=By.id("password");
	By signin=By.name("proceed");
	By createNewAccount=By.xpath("//u[text()='Create a new account']");
	
	public WebElement username()
	{
		return driver.findElement(username);
	}
	
	public WebElement password()
	{
		return driver.findElement(password);
	}
	
	public WebElement signin()
	{
		return driver.findElement(signin);
	}
	public WebElement createNewAccount()
	{
		return driver.findElement(createNewAccount);
	}
	
}
