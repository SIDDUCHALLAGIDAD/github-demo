package Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.RediffLoginpagePF;

@Test
public class loginApplication 
{
	public void login()
	{
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\siddappa.challagidad\\eclipse-workspace\\AutomationScripts\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	
//	rediffHomepage si=new rediffHomepage(driver);
//	si.username().sendKeys("siddu");
//	si.password().sendKeys("hello");
//	si.signin().click();
//	si.createNewAccount().click();
	
	RediffLoginpagePF rh=new RediffLoginpagePF(driver);
	rh.Emaild().sendKeys("Siddu");
	rh.Password().sendKeys("hello");
	rh.Signin().click();
	rh.createNewAccount().click();
	
	
	}
}
