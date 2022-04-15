package executeClasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.LoginPage;
import elementRepository.ManageDeliveryBoy;
import utilities.GenaralUtilities;

public class ExecuteManageDeliveryBoy extends BaseClass {
	LoginPage log;
	ManageDeliveryBoy md;
	GenaralUtilities utility;

	@Test//(enabled = false)
	public void verifySearchUsingName() {
		log = new LoginPage(driver);
		log.enterUserName("admin");
		log.enterPassWord("admin");
		log.clickSignin();
		md = new ManageDeliveryBoy(driver);
		md.clickManageDeliveryBoy();
		md.clickSearchButton();
		md.enterNameInNameField();
		md.clickUserSearchButn();
		String actual = md.verifySearchName();
		String expected = "Kira";
		Assert.assertEquals(actual, expected, "Name is not expected");
	}

	@Test
	public void verifyUpdateAlertMsg() throws InterruptedException {
		log = new LoginPage(driver);
		log.enterUserName("admin");
		log.enterPassWord("admin");
		log.clickSignin();
		md = new ManageDeliveryBoy(driver);
		md.clickManageDeliveryBoy();
		md.clickEditButn();
		md.enterEditedName();
		utility = new GenaralUtilities();
		utility.scrollDown(driver);
		md.waitForUtilityButn();
		md.clickUpdateButn();
		String actual=md.alertMsgText();
		String expected="Alert!";
		Assert.assertEquals(actual, expected, "Missmatch");
				

	}

	@Test//(enabled = false)
	public void verifyPasswordDisplayWhenArrowButnIsClick() {
		log = new LoginPage(driver);
		log.enterUserName("admin");
		log.enterPassWord("admin");
		log.clickSignin();
		md = new ManageDeliveryBoy(driver);
		md.clickManageDeliveryBoy();
		md.clickPasswordArrow();
		boolean actual = md.checkPasswordDisplay();
		Assert.assertTrue(actual, "Not Displayed");

	}
}
