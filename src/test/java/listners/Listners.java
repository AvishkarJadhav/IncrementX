package listners;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import incrementX.Tests.Base;
import incrementX.Utility.Utility;
import net.bytebuddy.utility.RandomString;

public class Listners extends Base implements ITestListener {
	
	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		Reporter.log("Test case "+result.getName()+" is failed try again", true);
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		try {
			String Rts = RandomString.make(4);
			Utility.screenshot(driver, result.getName()+Rts);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Reporter.log("Test case "+result.getName()+" is passed , Good job!", true);

	}

}
