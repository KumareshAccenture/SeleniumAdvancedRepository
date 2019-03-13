package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	By Username = By.name("userName");
	By pwd = By.name("password");
	By Submit_button = By.name("login");

	public LoginPage(WebDriver driver)

	{
		this.driver = driver;
	}

	public void typeUsername(String name)
	{
		driver.findElement(Username).sendKeys(name);
	}

	public void typePwd(String pass)
	{
		driver.findElement(pwd).sendKeys(pass);
	}

	public void clickSubmit()
	{
		driver.findElement(Submit_button).click();
	}

}
