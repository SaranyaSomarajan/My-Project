package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.GenaralUtilities;

public class ManagePage {
	GenaralUtilities utility=new GenaralUtilities();
	WebDriver driver;

	public ManagePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//a[@href='http://groceryapp.uniqassosiates.com/admin/list-page'])[2]")
	WebElement managePage;
	
	@FindBy(xpath="//a[ @href='http://groceryapp.uniqassosiates.comhome']")
	WebElement footerMsg;
	
	
	public void clickManagePage() {
		utility.clickOnElement(managePage);
	}
	
	public boolean footerMsgDisplayed() {
		utility.scrollDown(driver);
		return utility.isCheckDisplayed(footerMsg);
	}
			
}
