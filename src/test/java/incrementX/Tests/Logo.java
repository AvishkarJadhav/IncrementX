package incrementX.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Logo {
  @Test
  public void Redirect() {
	  WebDriver driver;
	  System.setProperty("webdriver.chrome.driver", "D:\\Java\\Selenium\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		options.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver(options);
		
		driver.get("https://www.incrementx.com/");
		
		driver.manage().window().maximize();
  }
}
