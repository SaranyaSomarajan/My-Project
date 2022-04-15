package executeClasses;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.Category;
import elementRepository.LoginPage;

public class ExecuteCategory extends BaseClass {
	LoginPage log;
	Category cg;
	
  @Test
  public void verifyListCategoryText() {
	  log=new LoginPage(driver);
	  log.enterUserName("admin");
	  log.enterPassWord("admin");
	  log.clickSignin();
	  cg=new Category(driver);
	  cg.selectCategoryPage();
	  String actual=cg.listCategoryText();
	  String expected="List Categories";
	  Assert.assertEquals(actual, expected,"Text is not expected");
  }
}
