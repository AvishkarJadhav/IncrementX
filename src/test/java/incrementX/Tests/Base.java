package incrementX.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import incrementX.PageObjects.MainPage;
import incrementX.Utility.ReadConfig;
import incrementX.Utility.Utility;

public class Base {
	
	//Declaration of variables 
	
	ReadConfig rg=new ReadConfig();
	
	public String BaseURL=rg.getApplicationURL();
	public String FullName=rg.getFullName();
	
	//Global declaration of POM objects 
	MainPage mp;
	
	
	
	//Launching web application on Chrome browser
	protected static WebDriver driver;
	@BeforeClass
	public void Setup()
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		options.addArguments("--remote-allow-origins=*");
		
		driver=new ChromeDriver(options);
		mp=new MainPage(driver);

	}
	
	
	//Passing URL
	@BeforeMethod
	public void launchApplication()
	{
		driver.get(BaseURL);
		Utility.wait(driver, 500);
		driver.manage().window().maximize();
	}
	
	
	//Minimizing window after test
	@AfterMethod
	public void minimizeApplication()
	{
		Utility.wait(driver, 500);
		driver.manage().window().minimize();
	}
	
	
	//Closing browser after test
	@AfterClass
	public void closeBrowser()
	{
		Utility.wait(driver, 500);
		driver.close();
	}
	
}
