package executeClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.LoginPage;
import elementRepository.ManageUsers;

public class ExecuteManageUsers extends BaseClass{
	LoginPage log;
	ManageUsers mu;
  @Test
  public void verifyListUserTextInMnageUser() {
	        log = new LoginPage(driver);
			log.enterUserName("admin");
			log.enterPassWord("admin");
			log.clickSignin();
			mu=new ManageUsers(driver);
			mu.clickManageUsers();
			String actual=mu.listUserTextInManageUser();
			String expected="List Users";
			Assert.assertEquals(actual, expected, "Text is not expected");
  }
  @Test
  public void verifyPasswordIsDiplayed() {
	        log = new LoginPage(driver);
			log.enterUserName("admin");
			log.enterPassWord("admin");
			log.clickSignin();
			mu=new ManageUsers(driver);
			mu.clickManageUsers();
			mu.clickPasswordArrow();
			boolean actual=mu.passwordDisplayed();
			Assert.assertTrue(actual, "Password not displayed");
  
  }
  @Test
  public void verifySearchButnBackgroundColor() {
	        log = new LoginPage(driver);
			log.enterUserName("admin");
			log.enterPassWord("admin");
			log.clickSignin();
			mu=new ManageUsers(driver);
			mu.clickManageUsers();
			String actual=mu.backgroundColorOfSearchButton();
			String expected="rgba(0, 123, 255, 1)";
			Assert.assertEquals(actual, expected, "Missmatch");
  }
}
