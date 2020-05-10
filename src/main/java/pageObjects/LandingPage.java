package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	
	By SignIn=By.xpath("//a[@href='http://qaclickacademy.usefedora.com/sign_in']//span[text()='Login']");
	By FeaturedCourses=By.xpath("//div[@class='text-center']//h2[text()='Featured Courses']");
	By NavBar=By.xpath("//*[@class='nav navbar-nav navbar-right']");
	By PopUpMsg=By.xpath("//button[contains(text(),'NO THANKS')]");
	
	public LandingPage(WebDriver driver) {
		
		this.driver=driver;
	}


	public WebElement SignIn()
	{
		return driver.findElement(SignIn);
	}
	public WebElement FeaturedCouses()
	{
		return driver.findElement(FeaturedCourses);
	}
	public WebElement Navbar()
	{
		return driver.findElement(NavBar);
	}
	public WebElement PopUpMsg()
	{
		return driver.findElement(PopUpMsg);
	}
	public int PopUpMsgElements()
	{
		return driver.findElements(PopUpMsg).size();
	}

}
