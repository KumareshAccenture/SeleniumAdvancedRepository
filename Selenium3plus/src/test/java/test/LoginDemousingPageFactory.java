package test;

import org.testng.annotations.Test;

import pages.Browserinvoke;
import pages.LoginPageusingPageFactory;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

public class LoginDemousingPageFactory {
  
  public static void main(String args[]) {
		//calling browser class to initialize and passing url 
	  WebDriver driver= Browserinvoke.startBrowser("chrome","http://demoaut.com");
		
	 
	  LoginPageusingPageFactory login = PageFactory.initElements(driver,LoginPageusingPageFactory.class);
				
	  // call method
	  login.form("tutorial", "tutorial");
		login.clickSubmitButton();
  }
  
}
