package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class HomePage extends base {
	
	private static Logger Log=LogManager.getLogger(HomePage.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializeBrowser();
		Log.info("Driver is initialized");
		//String Url=getUrl();
		//driver.get(getUrl());
		
	}
	//div[@class="sumome-react-wysiwyg-component sumome-react-wysiwyg-popup-button sumome-react-wysiwyg-button"][2]
	
	@Test(dataProvider="getData")
	public void loginWithCredentials(String Username, String Password, String Textmessage) throws IOException, InterruptedException
	{
		driver.get(pro.getProperty("Url"));
		Log.info("Url hit the Browser and Navigated to Home Page");
		driver.manage().window().maximize();
		Log.info("Window maximized");
		//Thread.sleep(10000);
		//driver.switchTo().alert().dismiss();
		//driver.findElement(By.xpath("//button[text()='NO THANKS']"));
		LandingPage l = new LandingPage(driver);
		Log.info("Langing Page Object created");
		l.SignIn().click();
		Log.info("Clicked on Login");
		LoginPage lp = new LoginPage(driver);
		Log.info("Login Page Object created");
		lp.Email().sendKeys(Username);
		Log.info("Username is Entered");
		lp.Password().sendKeys(Password);
		Log.info("Password is Entered");
		//System.out.println(Textmessage);
		Log.info(Textmessage);
		lp.LogIn().click();
	}
	
	@AfterTest
	public void CloseBrowser()
	{
		//driver.navigate().refresh();
		driver.close();
		Log.info("Window Tab Closed");
		driver.quit();
		Log.info("Browser Quited");
		driver=null;
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[2][3];
		
		//0th row
		data[0][0]="nonrestricteduser@correct.com";
		data[0][1]="correctPassword";
		data[0][2]="Am a correct User";
		
		Log.info("First row set of Data");
		
		//1st row
		data[1][0]="restricteduser@wrong.com";
		data[1][1]="WrongPassword";
		data[1][2]="Am a Wrong User";
		
		Log.info("Second row set of Data");
		
		return data;
		
		
		
		
	}
	
	

}
