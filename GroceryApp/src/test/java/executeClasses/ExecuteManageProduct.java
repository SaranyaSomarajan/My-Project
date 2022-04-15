package executeClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.LoginPage;
import elementRepository.ManageProduct;
import utilities.GenaralUtilities;

public class ExecuteManageProduct extends BaseClass {
	LoginPage log;
	ManageProduct manage;
	GenaralUtilities utility;
  @Test
  public void verifyManageProductTab() {
	  log=new LoginPage(driver);
	  log.enterUserName("admin");
	  log.enterPassWord("admin");
	  log.clickSignin();
	  manage=new ManageProduct(driver);
	  manage.clickManageProduct();
	  manage.clickDelete();
	  manage.alertMsg();
	  String actual=manage.alertMsgText();
	  String expected="Alert!";
	  Assert.assertEquals(actual, expected, "Alert Text is not expected");
	  
	  
  }
  @Test
  public void verifyTitleFieldReqrdAlertMsg() throws InterruptedException {
	  log=new LoginPage(driver);
	  log.enterUserName("admin");
	  log.enterPassWord("admin");
	  log.clickSignin();
	  manage=new ManageProduct(driver);
	  manage.clickManageProduct();
	  manage.clickNewButn();
	  utility = new GenaralUtilities();
	  utility.scrollDown(driver);
	  manage.waitForUtilityButn();
	  manage.clickSaveButn();
	  String actual=manage.titleFieldReqrdText();
	  String expected="The Title field is required.";
	  Assert.assertEquals(actual, expected,"Missmatch");
  }
  @Test
  public void verifyRadioButnSelected(){
	  log=new LoginPage(driver);
	  log.enterUserName("admin");
	  log.enterPassWord("admin");
	  log.clickSignin();
	  manage=new ManageProduct(driver);
	  manage.clickManageProduct();
	  manage.clickNewButn();
	  boolean actual=manage.verifyRadioButton();
	  Assert.assertTrue(actual, "Selection is not expected");
  }
}
