package incrementX.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
	
	@FindBy(xpath = "//a[text()=' Sign Up ']")private WebElement Signup;
	
	public MainPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnLogo()
	{
		Signup.click();
	}

}
