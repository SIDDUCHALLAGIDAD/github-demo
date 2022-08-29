package Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import graphql.Assert;
import objectrepository.OrangehrmliveEndToEnd;

@Test
public class OrangeHRMendToend_UpoladFileAndPhoto 
{
	public void end2endflow() throws InterruptedException
	{
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\siddappa.challagidad\\eclipse-workspace\\AutomationScripts\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	OrangehrmliveEndToEnd e2e=new OrangehrmliveEndToEnd(driver);

	Assert.assertTrue(e2e.logovaidation().isDisplayed());
	e2e.username().sendKeys("Admin");
	e2e.Password().sendKeys("admin123");
	e2e.Signin().click();
	Assert.assertTrue(e2e.loginpageValidation().equals("OrangeHRM"));
	e2e.adminModule().click();
	
	Actions a = new Actions(driver);
    a.moveToElement(e2e.JobModule()).build().perform();

//	WebElement jobTitle = e2e.dropdown();
//	Select s = new Select(jobTitle);
//	s.selectByIndex(0);
	
    e2e.dropdown().click();
	e2e.ADDJob().click();
	
	e2e.jobTitle().sendKeys("Sid");
	e2e.jobDescription().sendKeys("Automation Enginner");
	e2e.uplodFile().sendKeys("C:\\Users\\siddappa.challagidad\\Desktop\\PHP_Travels");  //Uploading Files or Photo
	e2e.Note().sendKeys("He is Good Automation Enginner");
	Thread.sleep(2000);
	e2e.saveButton().click();
	Thread.sleep(2000);
	
	
    }
}
