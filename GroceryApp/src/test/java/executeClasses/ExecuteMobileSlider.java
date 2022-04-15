package executeClasses;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.LoginPage;
import elementRepository.ManageDeliveryBoy;
import elementRepository.MobileSlider;

public class ExecuteMobileSlider extends BaseClass{
	LoginPage log;
	MobileSlider ms;
  @Test
  public void verifyUploadFile() throws AWTException {
	  log = new LoginPage(driver);
		log.enterUserName("admin");
		log.enterPassWord("admin");
		log.clickSignin();
		ms=new MobileSlider(driver);
		ms.clickMobileSlider();
		ms.clickNewButn();
		ms.clickChoseFile();
		ms.uploadChoseFile();
		ms.clickSave();
		ms.navigateToImageUploadPage();
		boolean actual=ms.checkImageUploadedIsDisplayed();
		Assert.assertTrue(actual, "Image not displayed");
  }
  
}
