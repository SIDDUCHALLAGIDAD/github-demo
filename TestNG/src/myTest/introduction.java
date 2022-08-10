package myTest;

import org.testng.annotations.*;

public class introduction extends base
{

	
  @BeforeTest
  void beforetest()
  {
	  System.out.println("Before test");
  }
  
  @Test
  void test1()
  {
	  System.out.println("Test 1");
  }
 
  @Test
  void test2()
  {
	  System.out.println("Test 2");
  }
  
  @Test
  void test3()
  {
	  System.out.println("Test 3");
  }
  @AfterTest
  void aftertest()
  {
	  System.out.println("After test");
  }
	
  @BeforeMethod
  void beforemethod()
  {
	  System.out.println("Before Method");
  }
  
  @AfterMethod
  void aftermethod()
  {
	  System.out.println("After Method");
  }
  

}
