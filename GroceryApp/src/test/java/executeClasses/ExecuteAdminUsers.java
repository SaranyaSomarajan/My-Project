package executeClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.AdminUsers;
import elementRepository.LoginPage;

public class ExecuteAdminUsers extends BaseClass {
	LoginPage log;
	AdminUsers au;

	@Test // (enabled=false)
	public void verifyTextOfResetButn() { // pass
		log = new LoginPage(driver);
		log.enterUserName("admin");
		log.enterPassWord("admin");
		log.clickSignin();
		au = new AdminUsers(driver);
		au.clickAdminUserArrow();
		au.selectNewButn();
		String actual = au.verifyReset();
		String expected = "Reset";
		Assert.assertEquals(actual, expected, "Text is not expected");
	}

	@Test // (enabled=false)
	public void verifyUserNameDisplayed() { // pass
		log = new LoginPage(driver);
		log.enterUserName("admin");
		log.enterPassWord("admin");
		log.clickSignin();
		au = new AdminUsers(driver);
		au.clickAdminUserArrow();
		au.verifyUserNameDisplayed();
		boolean actual = au.verifyUserNameDisplayed();
		Assert.assertTrue(actual, "Diplayed is not expected");
	}

	@Test // (enabled=false)

	public void verifySearchButn() { // pass
		log = new LoginPage(driver);
		log.enterUserName("admin");
		log.enterPassWord("admin");
		log.clickSignin();
		au = new AdminUsers(driver);
		au.clickAdminUserArrow();
		au.clickSearchButn();
		String actual = au.SearchTxtInAdminUsers();
		String expected = "Search";
		Assert.assertEquals(actual, expected, "Missmatch");
	}

	@Test // (enabled=false)
	public void verifySearchUserName() {
		log = new LoginPage(driver);
		log.enterUserName("admin");
		log.enterPassWord("admin");
		log.clickSignin();
		au = new AdminUsers(driver);
		au.clickAdminUserArrow();
		au.clickSearchButn();
		au.enterNameInNameField();
		au.clickUserSearchButn();
		String actual = au.verifySearchName();
		String expected = "Divya";
		Assert.assertEquals(actual, expected, "Name is not expected");

	}

	@Test // (enabled=false)
	public void verifybackgroundOfResetButn() {
		log = new LoginPage(driver);
		log.enterUserName("admin");
		log.enterPassWord("admin");
		log.clickSignin();
		au = new AdminUsers(driver);
		au.clickAdminUserArrow();
		String actualColor = au.backgroundColorOfResetButn();
		String expectedColor = "rgba(255, 193, 7, 1)";
		Assert.assertEquals(actualColor, expectedColor, "Background Color is not Expected");

	}

	@Test(groups= {"Critical"})
	public void verifyPasswordArrowINAdminUsersPage() {
		log = new LoginPage(driver);
		log.enterUserName("admin");
		log.enterPassWord("admin");
		log.clickSignin();
		au = new AdminUsers(driver);
		au.clickAdminUserArrow();
		au.clickPasswordArrow();
		boolean actual = au.passworDisplayed();
		Assert.assertTrue(actual, "Missmatch");

	}

	@Test // (enabled=false)
	public void verifyActiveButton() {
		log = new LoginPage(driver);
		log.enterUserName("admin");
		log.enterPassWord("admin");
		log.clickSignin();
		au = new AdminUsers(driver);
		au.clickAdminUserArrow();
		au.verifyActiveButton();
		String actual = au.verifyStatus();
		String expected = "Inactive";
		Assert.assertEquals(actual, expected, "Status is not expected");
	}

	@Test // (enabled=false)
	public void verifyBackgroundColorOfSearchButn() {
		log = new LoginPage(driver);
		log.enterUserName("admin");
		log.enterPassWord("admin");
		log.clickSignin();
		au = new AdminUsers(driver);
		au.clickAdminUserArrow();
		String actualColor = au.backgroundColorOfSearchButn();
		String expectedColor = "rgba(0, 123, 255, 1)";
		Assert.assertEquals(actualColor, expectedColor, "Background colornot expected");

	}

}
