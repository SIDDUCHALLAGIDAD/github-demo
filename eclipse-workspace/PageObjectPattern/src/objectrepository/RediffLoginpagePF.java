package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginpagePF  
{
	WebDriver driver;
public RediffLoginpagePF(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);	
}

@FindBy(id="login1")
WebElement username;

@FindBy(id="password")
WebElement Password;

@FindBy(name="proceed")
WebElement Signin;

@FindBy(xpath="//u[text()='Create a new account']")
WebElement createNewAccount;

public WebElement Emaild()
{
   return username;
}
     
public WebElement Password()
{
   return Password;
}

public WebElement Signin()
{
	return Signin;
}

public WebElement createNewAccount()
{
   return createNewAccount;
}

}
