package executeClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.LoginPage;
import elementRepository.ManageExpense;
import utilities.GenaralUtilities;

public class ExecuteManageExpense extends BaseClass {
	LoginPage log;
	ManageExpense manage;
	GenaralUtilities utility;
  @Test
  public void verifyManageExpense() {
	  log=new LoginPage(driver);
	  log.enterUserName("admin");
	  log.enterPassWord("admin");
	  log.clickSignin();
	  utility = new GenaralUtilities();
	  utility.scrollDown(driver);
	  manage=new ManageExpense(driver);
	  manage.waitForUtilityButn();
	  manage.clickManageExpense();
	  String actual=manage.listExpenseText();
	  String expected="List Expense";
	  Assert.assertEquals(actual, expected, "Missmatch");
  }
	 
}
