package incrementX.Tests;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
@Listeners(listners.Listners.class)
public class Validating_URL {
  @Test (enabled = true)
  public void ValidatingURL() throws InterruptedException, EncryptedDocumentException {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\Java\\Selenium\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.incrementx.com/");
		
		driver.manage().window().maximize();
		
		String PageTitle = driver.getTitle();
		
		Thread.sleep(300);
		
		System.out.println(PageTitle);
		
		Thread.sleep(300);

		String PageURL = driver.getCurrentUrl();
		
		System.out.println(PageURL);
		
		Thread.sleep(300);
		
//		File myFile= new File("D:\\Java\\Selenium\\UpstoxEx.xlsx");
//		  
//		  Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
//		  
//		  String ExpectedURL = mySheet.getRow(1).getCell(4).getStringCellValue();
		
		String ExpectedURL = driver.getCurrentUrl();
		  
		  
		  System.out.println(ExpectedURL);
			Thread.sleep(300);
			
			SoftAssert soft=new SoftAssert();
			
			soft.assertEquals(PageURL, ExpectedURL);
			Thread.sleep(300);
			Thread.sleep(3000);

			soft.assertAll();
			Thread.sleep(300);


			driver.close();
		  
			Reporter.log("Test case is passed", false);
			System.out.println("Test case is passed");

  }
	@Test (enabled = true)
	 public void ValidatingTitle() throws InterruptedException, EncryptedDocumentException, IOException {
		  
		  System.setProperty("webdriver.chrome.driver", "D:\\Java\\Selenium\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
			options.addArguments("--remote-allow-origins=*");
			
			WebDriver driver = new ChromeDriver(options);
			
			driver.get("https://www.incrementx.com/");
			
			driver.manage().window().maximize();
			
			String PageTitle = driver.getTitle();
			
			Thread.sleep(300);
			
			System.out.println(PageTitle);
			
			File myFile=new File("D:\\Java\\Selenium\\UpstoxEx.xlsx");
			
			Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet1");

			String ExpectedTitle = mySheet.getRow(1).getCell(9).toString();
			  
			  System.out.println(ExpectedTitle);
				Thread.sleep(300);
				
				SoftAssert soft=new SoftAssert();
				
				soft.assertEquals(PageTitle, ExpectedTitle);
				Thread.sleep(300);
				Thread.sleep(3000);

				soft.assertAll();
				Thread.sleep(300);


				driver.close();
			  
				Reporter.log("Test case is passed with reporter.log", true);
				System.out.println("Test case is passed");

	  }
}
