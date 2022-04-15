package executeClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.LoginPage;
import elementRepository.ManageLocation;

public class ExecuteManageLocation extends BaseClass{
	LoginPage log;
	ManageLocation mm;
	
	  @Test
	  public void verifyListLocationDisplayed(){
		  log = new LoginPage(driver);
			log.enterUserName("admin");
			log.enterPassWord("admin");
			log.clickSignin();
			mm=new ManageLocation(driver);
			mm.clickManageLocation();
			boolean actual=mm.verifyListLocationIsDisplayed();
			Assert.assertTrue(actual,"ListLocation is not Displayed");
			
	  }
	
	
  @Test
  public void verifyListLocationTextIsGetin(){
	  log = new LoginPage(driver);
		log.enterUserName("admin");
		log.enterPassWord("admin");
		log.clickSignin();
		mm=new ManageLocation(driver);
		mm.clickManageLocation();
		String actual=mm.listLocationText();
		String expected="List Locations";
		Assert.assertEquals(actual, expected,"Text not expected");
  }
  @Test
  public void verifyResetButnText(){
	  log = new LoginPage(driver);
		log.enterUserName("admin");
		log.enterPassWord("admin");
		log.clickSignin();
		mm=new ManageLocation(driver);
		mm.clickManageLocation();
		String actual=mm.verifyResetButnText();
		String expected="Reset";
		Assert.assertEquals(actual, expected,"Missmatch");
  }
  @Test
  public void verifySelectedCountryFromDropdownIsDisplayed(){
	  log = new LoginPage(driver);
		log.enterUserName("admin");
		log.enterPassWord("admin");
		log.clickSignin();
		mm=new ManageLocation(driver);
		mm.clickManageLocation();
		mm.clickNewButn();
		mm.selectCountryFromDropDown();
		boolean actual=mm.isSelectedCountryDisplayed();
		Assert.assertTrue(actual,"CountryName is not Displayed");
		
  }
}
