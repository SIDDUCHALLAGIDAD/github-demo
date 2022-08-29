package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewUserRegistration 
{	
	
	 String EmailId="sidduchallagidad143@gmail.com";
	 String Password="siddu123";
	 String FirstName = "Siddu";
	 String LastName ="Challagidad";
	 String MobileNo="7022666776";
	 String DOB="12/08/1999";
	 String ShortBio = "Hi bro";
	 String Expected="Hai,Siddu! Go To SingIn";
	static
	{
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
    }
@Test //(dataProvider="getData")
public void SignUp() throws InterruptedException//(String FirstName,String LastName,String EmailId,String Password, String DOB,String MobileNo,String ShortBio,String Expected) throws InterruptedException
{

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.get("https://mobileworld.azurewebsites.net/");
    Assert.assertEquals(driver.getTitle(), "Mobile");  
	driver.findElement(By.xpath("//button[text()='SIGN IN']")).click();
	Assert.assertEquals(driver.getTitle(), "Login");
	Assert.assertEquals("https://mobileworld.azurewebsites.net/sign.html",driver.getCurrentUrl());
	driver.findElement(By.xpath("//*[text()='Sign up']")).click();
	Assert.assertEquals(driver.getTitle(), "Register");
	driver.findElement(By.xpath("//*[@placeholder='First Name']")).sendKeys(FirstName );
	driver.findElement(By.xpath("//*[@placeholder='Last Name']")).sendKeys(LastName);
	driver.findElement(By.xpath("//*[@placeholder='Enter Email']")).sendKeys(EmailId);
	driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys(Password);
	driver.findElement(By.xpath("//*[@type='date']")).sendKeys(DOB);
	driver.findElement(By.name("gender")).click();
	driver.findElement(By.xpath("//*[@type='number']")).sendKeys(MobileNo);
	driver.findElement(By.xpath("//*[@placeholder='Short Bio']")).sendKeys(ShortBio);
	driver.findElement(By.xpath("//button[text()='Register']")).click();
	Thread.sleep(2000);
	driver.switchTo().alert().getText();
	Assert.assertEquals(driver.switchTo().alert().getText(), Expected);
	driver.switchTo().alert().accept();
	System.out.println("Account created is Successfully");
	driver.quit();
}
}

//@DataProvider
//public Object[][] getData()
//{
//	Object[][] data = new Object[8][8];
//	data[0][0]="Siddu";
//	data[0][1]="Challagidad";
//	data[0][2]="sidduchallagidad143@gmail.com ";
//	data[0][3]="xxxxx";
//	data[0][4]="12/08/1999";
//	data[0][5]="7022666776";
//	data[0][6]="Hi bro";
//	data[0][7]="Hai,Siddu! Go To SingIn";
//	
//	data[1][0]="Siddu";
//	data[1][1]="Challagidad";
//	data[1][2]="sidduchallagidad143@gmail.com ";
//	data[1][3]="xxxxx";
//	data[1][4]="12/08/1999";
//	data[1][5]="7022666776";
//	data[1][6]="Hi bro";
//	data[1][7]="Hai,Siddu! Go To SingIn";
//	
//	data[2][0]="Siddu";
//	data[2][1]="Challagidad";
//	data[2][2]="sidduchallagidad143@gmail.com ";
//	data[2][3]="xxxxx";
//	data[2][4]="12/08/1999";
//	data[2][5]="7022666776";
//	data[2][6]="Hi bro";
//	data[2][7]="Hai,Siddu! Go To SingIn";
//	
//	data[3][0]="Siddu";
//	data[3][1]="Challagidad";
//	data[3][2]="sidduchallagidad143@gmail.com ";
//	data[3][3]="xxxxx";
//	data[3][4]="12/08/1999";
//	data[3][5]="7022666776";
//	data[3][6]="Hi bro";
//	data[3][7]="Hai,Siddu! Go To SingIn";
//	
//	data[4][0]="Siddu";
//	data[4][1]="Challagidad";
//	data[4][2]="sidduchallagidad143@gmail.com ";
//	data[4][3]="xxxxx";
//	data[4][4]="12/08/1999";
//	data[4][5]="7022666776";
//	data[4][6]="Hi bro";
//	data[4][7]="Hai,Siddu! Go To SingIn";
//	
//	data[5][0]="Siddu";
//	data[5][1]="Challagidad";
//	data[5][2]="sidduchallagidad143@gmail.com ";
//	data[5][3]="xxxxx";
//	data[5][4]="12/08/1999";
//	data[5][5]="7022666776";
//	data[5][6]="Hi bro";
//	data[5][7]="Hai,Siddu! Go To SingIn";
//	
//	data[6][0]="Siddu";
//	data[6][1]="Challagidad";
//	data[6][2]="sidduchallagidad143@gmail.com ";
//	data[6][3]="xxxxx";
//	data[6][4]="12/08/1999";
//	data[6][5]="7022666776";
//	data[6][6]="Hi bro";
//	data[6][7]="Hai,Siddu! Go To SingIn";
//	
//	data[7][0]="Siddu";
//	data[7][1]="Challagidad";
//	data[7][2]="sidduchallagidad143@gmail.com ";
//	data[7][3]="xxxxx";
//	data[7][4]="12/08/1999";
//	data[7][5]="7022666776";
//	data[7][6]="Hi bro";
//	data[7][7]="Hai,Siddu! Go To SingIn";
//	
//	return data;
//}

//}



