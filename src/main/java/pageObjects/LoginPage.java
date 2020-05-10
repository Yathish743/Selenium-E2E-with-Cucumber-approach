package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	
	By Email=By.id("user_email");
	By Password=By.id("user_password");
	By LogIn=By.name("commit");
	By ErrorMsg=By.xpath("//div[contains(text(),'Invalid email or password.')]");
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement Email()
	{
		return driver.findElement(Email);
	}
	
	public WebElement Password()
	{
		return driver.findElement(Password);
	}
	public WebElement LogIn()
	{
		return driver.findElement(LogIn);
	}
	public WebElement ErrorMsg()
	{
		return driver.findElement(ErrorMsg);
	}

}
