package Academy;

import java.io.IOException;

import org.apache.logging.log4j.*;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import pageObjects.LandingPage;
import resources.base;

public class validateTitle extends base {
	
	private static Logger Log=LogManager.getLogger(validateTitle.class.getName());
	
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
	public void textMessage() throws IOException, InterruptedException
	{
		LandingPage l = new LandingPage(driver);
    	Assert.assertEquals(l.FeaturedCouses().getText(), "FEATURED");
    	Log.info("Successfully validated Text Message");
    	
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
