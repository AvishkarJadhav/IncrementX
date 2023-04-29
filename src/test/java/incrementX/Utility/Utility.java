package incrementX.Utility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class Utility {
	
	/*Commonly used methods
	1.Read data from Excel
	2.ScreenShot
	3.Wait
	4.Scroll into view
	*/
	
	// 1.Read data from Excel
	
	public static String readDataFromExcel (int row, int cell) throws EncryptedDocumentException, IOException
	{
		File myFile=new File("D:\\Java\\Selenium\\UpstoxEx.xlsx");
		
		String value = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(row).getCell(cell).getStringCellValue();
		
		Reporter.log("reading data from excel", true);
		
		return value;
	}

	// 2.ScreenShot
	
	public static void screenshot(WebDriver driver, String screenshotName) throws IOException
	{
		wait(driver, 500);
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest= new File("./Screenshots\\S"+screenshotName+".png");
		FileHandler.copy(src, dest);
		Reporter.log("Taking screenshot", true);
	}
	
	// 3.Wait
	
	public static void wait(WebDriver driver, int waitTime)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(waitTime));
		Reporter.log("Waiting for "+waitTime+"ms",true);
	}
	
	// 4.Scroll into view
	
	public static void scrollIntoView(WebDriver driver, WebElement element)
	{
		wait(driver, 500);
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)", element);
		Reporter.log("Scrolling into view", true);
	}
}
