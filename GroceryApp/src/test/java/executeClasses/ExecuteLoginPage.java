package executeClasses;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.LoginPage;

public class ExecuteLoginPage extends BaseClass{
	LoginPage log;
	List<String> loginList;
	  @Test
	  public void verifyLoggedUsers() {
		  log=new LoginPage(driver);
		  List<String> loginList=log.getLoginData();
		  log.enterUserName(loginList.get(0));
		  log.enterPassWord(loginList.get(1));
		  log.clickSignin();
		  String actual=log.verifyLoggedUsers();
		  String expected="Admin";
		  Assert.assertEquals(expected, actual,"Admin Name is not expected");
		  
	  }
	  @Test
	  public void vertifyLogginBtnText() {
		  log=new LoginPage(driver);
		  String actual=log.loginButnTxt();
		  String expected="Sign In";
		  Assert.assertEquals(actual, expected, "Text is not expected");
	  }
	  @Test
	  public void verifyRemberCheckBoxSelected() {
		  log=new LoginPage(driver);
		  log.clickRememberButn();
		boolean actual=log.verifyRemberCheckBox();
		Assert.assertTrue(actual, "check box is not expected");
		  
		  
	  }
	}

 
  

