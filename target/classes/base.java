package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {
	
	 public static WebDriver driver;
	 public Properties pro;
	 public FileInputStream fis;
	
	public WebDriver initializeBrowser() throws IOException {
		
		pro=new Properties();
	    fis=new FileInputStream("D:\\Selenium\\apache-maven-3.6.3\\E2EProject\\src\\main\\java\\resources\\Data.properties");
		pro.load(fis);
		
		String BrowserName=pro.getProperty("Browser");
		if(BrowserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			System.out.println("Chrome");
		}
		else if(BrowserName.equals("Firefox"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver=new FirefoxDriver();
		}
		else if(BrowserName.equals("Internet Explorer"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver=new InternetExplorerDriver();
		}
		else
		{
			System.out.println("Browser not initialized");
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}
	public void getScreenshot(String result) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File("D:\\Selenium\\apache-maven-3.6.3\\E2EProject\\"+result+"Screenshot.png"));
	}
	
	
	
	
	
	public String getUrl() throws IOException
	{
		pro=new Properties();
	    fis=new FileInputStream("D:\\Selenium\\apache-maven-3.6.3\\E2EProject\\src\\main\\java\\resources\\Data.properties");
		pro.load(fis);
		
		String Url=pro.getProperty("Url");
		return Url;
		
	}

}
