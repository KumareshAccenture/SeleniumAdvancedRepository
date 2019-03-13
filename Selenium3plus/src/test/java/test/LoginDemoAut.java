package test;

import org.testng.annotations.Test;

import pages.LoginPage;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class LoginDemoAut {
  	WebDriver driver;
	
	@Test
  public void testLogin() {
		
		LoginPage obj = new LoginPage(driver);
		obj.typeUsername("tutorial");
		obj.typePwd("tutorial");
		obj.clickSubmit();
		System.out.println(driver.getTitle());
			
  }
 
	@BeforeMethod
  public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_c2d.02.12\\Desktop\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demoaut.com");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		
  }

 
	@AfterMethod
  public void afterMethod() {
		
		driver.close();
  }

}
