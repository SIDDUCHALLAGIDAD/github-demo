package myTest;

import org.testng.annotations.*;


public class base 
{
	  @BeforeClass
	  void beforeclass()
	  {
		  System.out.println("Before class");
	  }	
	  
	  @AfterClass
	  void afterclass()
	  {
		  System.out.println("After class");
	  }	
}
