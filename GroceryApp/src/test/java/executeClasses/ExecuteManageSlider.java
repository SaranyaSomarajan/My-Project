package executeClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.LoginPage;
import elementRepository.ManageSlider;

public class ExecuteManageSlider extends BaseClass {
	LoginPage log;
	ManageSlider ms;
  @Test
  public void verifyListSliderDisplay() {
	  log=new LoginPage(driver);
	  log.enterUserName("admin");
	  log.enterPassWord("admin");
	  log.clickSignin();
	  ms=new ManageSlider(driver);
	  ms.clickManageSlider();
	  boolean actual=ms.ListSliderDisplay();
	  Assert.assertTrue(actual, "Not Displayed");
	  
  }
  @Test
  public void verifyListSliderText(){
	  log=new LoginPage(driver);
	  log.enterUserName("admin");
	  log.enterPassWord("admin");
	  log.clickSignin();
	  ms=new ManageSlider(driver);
	  ms.clickManageSlider();
	  String actual=ms.ListSliderText();
	  String expected="List Sliders";
	  Assert.assertEquals(actual, expected, "Missmatch");
	  
  }
  @Test
  public void verifyNewButnBackgroundColor(){
	  log=new LoginPage(driver);
	  log.enterUserName("admin");
	  log.enterPassWord("admin");
	  log.clickSignin();
	  ms=new ManageSlider(driver);
	  ms.clickManageSlider();
	  String actual=ms.backgroundColorOfNewButn();
	  String expected="rgba(220, 53, 69, 1)";
	  Assert.assertEquals(actual, expected, "Missmatch");
  }
}
