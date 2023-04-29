package incrementX.Tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listners.Listners.class)
public class INTX001 extends Base {
  @Test
  public void ValidatingURL() {
	  
	  mp.ClickOnLogo();
	  driver.navigate().back();
	  String ActualURL = driver.getCurrentUrl();
	  Assert.assertEquals(BaseURL, ActualURL,"URL is matching TC is passed");
  }
}
