package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangehrmliveEndToEnd 
{
WebDriver driver;

   public OrangehrmliveEndToEnd(WebDriver driver)
  {
   this.driver=driver;
   PageFactory.initElements(driver, this);
  }
   
   
   @FindBy(id="divLogo")
   WebElement logo;
   
   @FindBy(id="txtUsername")
   WebElement username;

   @FindBy(id="txtPassword")
   WebElement Password;

   @FindBy(name="Submit")
   WebElement Signin;
   
   @FindBy(id="menu_admin_viewAdminModule")
   WebElement adminModule ;
   
   @FindBy(id="menu_admin_Job")
   WebElement JobModule;
   
//   @FindBy(xpath="(//a[@id='menu_admin_Job'])/following-sibling::ul")
//   WebElement dropdown;
   
   @FindBy(id="menu_admin_viewJobTitleList")
   WebElement dropdown;
   
   @FindBy(name="btnAdd")
   WebElement ADDJob;
   
   @FindBy(id="jobTitle_jobTitle")
   WebElement jobTitle;
   
   @FindBy(id="jobTitle_jobDescription")
   WebElement jobDescription;
   
   @FindBy(id="jobTitle_jobSpec")
   WebElement uplodFile;
   
   @FindBy(id="jobTitle_note")
   WebElement Note;
   
   @FindBy(id="btnSave")
   WebElement saveButton;
   
   public WebElement logovaidation()
   {
	   return logo;
   }
   
   public WebElement username()
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
   
   public String loginpageValidation()
   {
	   return driver.getTitle();
   }

   public WebElement adminModule()
   {
	   return adminModule;
   }

   public WebElement JobModule()
   {
	   return JobModule;
   }
   
   public WebElement ADDJob()
   {
	   return ADDJob;
   }

   public WebElement dropdown()
   {
	   return dropdown;
   }

   public WebElement jobTitle()
   {
	   return jobTitle;
   }
   
   public WebElement jobDescription()
   {
	   return jobDescription;
   }
   
   public WebElement uplodFile()
   {
	   return uplodFile;
   }
   
   public WebElement Note()
   {
	   return Note;
   }
   
   public WebElement saveButton()
   {
	   return saveButton;
   }
   
}
   

