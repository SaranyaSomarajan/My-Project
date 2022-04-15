package executeClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.LoginPage;
import elementRepository.ManageOrders;

public class ExecuteManageOrders extends BaseClass {
	LoginPage log;
	ManageOrders mo;
	
  @Test
  public void verifyViewedDetailsIsDisplayed() {
	  log=new LoginPage(driver);
	  log.enterUserName("admin");
	  log.enterPassWord("admin");
	  log.clickSignin();
	  mo=new ManageOrders(driver);
	  mo.clickManageOrders();
	  mo.clickViewButn();
	  boolean actual=mo.viewedItemDisplayed();
	  Assert.assertTrue(actual, "details not displayed");
  }
  @Test
  public void verifyAlertMsgText() {
	  log=new LoginPage(driver);
	  log.enterUserName("admin");
	  log.enterPassWord("admin");
	  log.clickSignin();
	  mo=new ManageOrders(driver);
	  mo.clickManageOrders();
	  mo.clickDeleteButn();
	  mo.alertMsg();
	  String actual=mo.alertMsgText();
	  String expected="Alert!";
	  Assert.assertEquals(actual, expected, "Alert Text is not expected");
  }
}
