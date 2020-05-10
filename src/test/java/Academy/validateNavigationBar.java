package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import pageObjects.LandingPage;
import resources.base;

public class validateNavigationBar extends base {
	
	private static Logger Log=LogManager.getLogger(validateNavigationBar.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializeBrowser();
		Log.info("Driver is initialized");
		//String Url=getUrl();
		//driver.get(getUrl());
		driver.get(pro.getProperty("Url"));
		Log.info("Url hit the Browser and Navigated to Home Page");
		driver.manage().window().maximize();
		Log.info("Window maximized");
	}
	
	@Test
	public void navigationBar() throws IOException, InterruptedException
	{
		
		
		LandingPage l = new LandingPage(driver);
    	Assert.assertTrue(l.Navbar().isDisplayed());
    	//Boolean present;
    	Log.info("Navigation tool Bar is displayed");
    	
		
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
	
	

}
