package executeClasses;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.LoginPage;
import elementRepository.ManagePage;

public class ExecuteManagePage extends BaseClass {
	LoginPage log;
	ManagePage mp;
	
  @Test
  public void VerifyFooterMsg() {
	    log = new LoginPage(driver);
		log.enterUserName("admin");
		log.enterPassWord("admin");
		log.clickSignin();
		mp=new ManagePage(driver);
		mp.clickManagePage();
		boolean Actual=mp.footerMsgDisplayed();
		Assert.assertTrue(Actual,"Footer Msg is not displayed");
  }
}
