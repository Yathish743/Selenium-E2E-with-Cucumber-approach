package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(Cucumber.class)
public class StepDefinations {
	
	WebDriver driver;

    @Given("^User is on NetBanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
    	/*System.setProperty("webdriver.chrome.driver", "D:\\ec\\chromedriver_win32\\chromedriver.exe");

	    driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();*/
		System.out.println("User is on NetBanking landing page");
        
    }

    @When("^User login into application with username and password$")
    public void user_login_into_application_with_username_and_password() throws Throwable {
    	
    	/*System.out.println(driver.getTitle().contains("Cricket Score,"));
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.id("seriesDropDown"))).build().perform();
		driver.findElement(By.xpath("//div[@id='seriesDropDown'] //a[.='Pakistan Super League 2020']")).click();
		//WebDriverWait wait=new WebDriverWait(driver, 5);
		driver.findElement(By.xpath("//span[.='29th Match, Lahore']")).click();
		System.out.println(driver.findElement(By.xpath("//*[.='Lahore Qalandars vs Multan Sultans, 29th Match - Live Cricket Score, Commentary']")).getText());
		driver.findElement(By.xpath("//*[.='Scorecard']")).click();
		String text=driver.findElement(By.xpath("//*[contains(text(),'Multan Sultans Innings')]")).getText();
		if(text.equals("Multan Sultans Innings"))
			System.out.println(text);
		//System.out.println(driver.findElements(By.className("cb-text-link")).size());
		WebElement table=driver.findElement(By.xpath("//div[@id='innings_1'] //div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'][1]"));
		int rowsCount=table.findElements(By.xpath("//div[@id='innings_1'] //div[@class='cb-col cb-col-100 cb-scrd-itms']")).size();
		System.out.println("Rows Count: "+rowsCount);
		int count=table.findElements(By.xpath("//div[@id='innings_1'] //div[@class='cb-col cb-col-100 cb-scrd-itms']//div[3]")).size();
		System.out.println("Column Count: "+count);
		int sum =0;
		
		for(int i = 0;i<count-2;i++)
		{
			System.out.print(table.findElements(By.xpath("//div[@id='innings_1'] //div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'][1]//div[@class='cb-col cb-col-27 ']//a[@class='cb-text-link']")).get(i).getText());
			System.out.print("  :  ");
			System.out.println(table.findElements(By.xpath("//div[@class='cb-col cb-col-100 cb-scrd-itms']//div[3]")).get(i).getText());
			String value=table.findElements(By.xpath("//div[@class='cb-col cb-col-100 cb-scrd-itms']//div[3]")).get(i).getText();
			int valueInteger=Integer.parseInt(value);
		    sum=sum+valueInteger;
		    
		}*/
     System.out.println("User login into application with username and password");
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	
    	/*int Extras=0;
		
		System.out.print(driver.findElement(By.xpath("//div[@id='innings_1'] //div[text()='Extras']")).getText());
		System.out.print("  :  ");
		System.out.println(driver.findElement(By.xpath("//div[@id='innings_1'] //div[@class='cb-col cb-col-8 text-bold cb-text-black text-right']")).getText());
		String valueExtras=driver.findElement(By.xpath("//div[@id='innings_1'] //div[@class='cb-col cb-col-8 text-bold cb-text-black text-right']")).getText();
		int valueExtrasInteger=Integer.parseInt(valueExtras);
		Extras=Extras+valueExtrasInteger;*/
        System.out.println("Home page is populated");
    }

    @And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable {
    	/*int Total=0;
    	System.out.print(driver.findElement(By.xpath("//div[@id='innings_1'] //div[text()='Total']")).getText());
		System.out.print("  :  ");
		System.out.println(driver.findElement(By.xpath("//div[@id='innings_1'] //div[@class='cb-col cb-col-8 text-bold text-black text-right']")).getText());
		String valueTotal=driver.findElement(By.xpath("//div[@id='innings_1'] //div[@class='cb-col cb-col-8 text-bold text-black text-right']")).getText();
		int valueTotalInteger=Integer.parseInt(valueTotal);
		Total=Total+valueTotalInteger;
		//System.out.println("Total Runs scored by Players : "+sum);
		//System.out.println("Extras : "+Extras);
		System.out.println("Total Runs scored by Players + Extras : "+Total);
		
		
		
					driver.close();
					driver.quit();*/
    	System.out.println("Cards are displayed");

    }
    
    @When("^User login into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_with_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
        
    	System.out.println(strArg1);
    	System.out.println(strArg2);
    	
    }
    @And("^Cards are not displayed$")
    public void cards_are_not_displayed() throws Throwable {
    }
            
    	@Then("^Cards displayed are \"([^\"]*)\"$")
    	public void cards_displayed_are(String arg1) throws Throwable {
    	    // Write code here that turns the phrase above into concrete actions
    	System.out.println(arg1);


}
}