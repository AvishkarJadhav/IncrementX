package incrementX.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
	
	@FindBy (id = "fname")private WebElement Fname;
	
	@FindBy (id = "emailid")private WebElement Email;
	
	@FindBy (id = "r3")private WebElement TypeRadioBt;
	
	@FindBy (id = "propertyname")private WebElement VideoURL;
	
	@FindBy (id = "pv1")private WebElement pageviewer;
	
	@FindBy (id = "txtInput")private WebElement Captcha;
	
	@FindBy (id = "ck")private WebElement Checkbox;
	
	@FindBy (id = "no")private WebElement radiobt;
	
	@FindBy (xpath = "//input[@class='sbutton']")private WebElement submitBt;
	
	
	public SignUpPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void EnterName(String fname)
	{
		Fname.sendKeys(fname);
	}

	public void EnterEmail(String email)
	{
		Email.sendKeys(email);
	}
	
	public void SelectType()
	{
		TypeRadioBt.click();
	}
	
	public void EnterVideoURL(String VideoUrl)
	{
		VideoURL.sendKeys(VideoUrl);
	}
	
	public void SelectPageViewer()
	{
		pageviewer.click();
	}
	
	public void EnterCaptcha(String Capt)
	{
		Captcha.sendKeys(Capt);
	}
	
	public void checkCB()
	{
		Checkbox.click();
	}
	
	public void SelectRadioBT()
	{
		radiobt.click();
	}
	
	public void ClickOnSubmit()
	{
		submitBt.click();
	}
}
