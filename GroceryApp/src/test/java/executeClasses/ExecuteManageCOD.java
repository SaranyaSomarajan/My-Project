package executeClasses;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.LoginPage;
import elementRepository.ManageCOD;

public class ExecuteManageCOD extends BaseClass {
	LoginPage log;
	ManageCOD cd;
	

	@Test
	public void verifyRadioButnSelected() {
		log = new LoginPage(driver);
		log.enterUserName("admin");
		log.enterPassWord("admin");
		log.clickSignin();
		cd = new ManageCOD(driver);
		cd.clickManageCOD();
		boolean actual = cd.checkRadioButtonSelected();
		Assert.assertTrue(actual, "Selection is not expected");
	}
}
