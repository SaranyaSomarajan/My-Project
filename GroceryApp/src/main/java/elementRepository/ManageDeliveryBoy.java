package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ExplicitWait;
import utilities.GenaralUtilities;


public class ManageDeliveryBoy{
	GenaralUtilities utility=new GenaralUtilities();
	ExplicitWait waits=new ExplicitWait();
    WebDriver driver;

	public ManageDeliveryBoy(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//a[@href='http://groceryapp.uniqassosiates.com/admin/list-deliveryboy'])[2]")
	WebElement manageDeliveryBoy;
	
	@FindBy(xpath="//a[@onclick='click_button(2)']")
	WebElement searchBtn;
	
	@FindBy(xpath="//input[@id='un']")
	WebElement name;
	
	@FindBy(xpath="//button[@name='Search']")
	WebElement userSearchButn;
	
	@FindBy(xpath="//table[@class='table table-bordered table-hover table-sm']//tr[1]//td[1]")
	WebElement searchedName;
	
	@FindBy(xpath="(//table[@class='table table-bordered table-hover table-sm']//a[@role='button']//i[@class='fas fa-edit'])[1]")
	WebElement editButn;
	
	@FindBy(xpath="//input[@id='name']")
	WebElement nameInput;
	
	@FindBy(xpath="//button[@name='update']")
	WebElement updateButn;
	
	@FindBy(xpath="//h5[contains(text(),' Alert!')]")
	WebElement alertMsg;
	
	
	@FindBy(xpath="//li[contains(text(),'The Phone Number field is required.')]")
	WebElement updateAlert;
	
	@FindBy(xpath="(//table[@class='table table-bordered table-hover table-sm']//div[@class='action-buttons'])[1]")
    WebElement passwordArrow;
	
	@FindBy(xpath="(//div[@class='profile-info-name'])[1]")
	WebElement passwordDisplay;
	
	public void clickManageDeliveryBoy() {
		utility.clickOnElement(manageDeliveryBoy);
	}
	public void clickSearchButton() {
		utility.clickOnElement(searchBtn);
	}
	public void enterNameInNameField() {
		utility.enterTextInElement(name, "Kira");
	}
	public void clickUserSearchButn() {
		utility.clickOnElement(userSearchButn);
	}
	public String verifySearchName() {
		return utility.getElementText(searchedName);
	}
	public void clickEditButn() {
		utility.clickOnElement(editButn);
	}
	public void enterEditedName() {
		 utility.enterTextInElement(nameInput, "Krishnan");
	}
	public void waitForUtilityButn() {
		waits.clickOnElement(driver, "//button[contains(text(),'Update')]");
	}
	public void clickUpdateButn() throws InterruptedException {
		
		utility.clickOnElement(updateButn);
	}
	public String alertMsgText() {
		return utility.getElementText(alertMsg);
	}
	public boolean verifyUpdateAlertMssg() {
		return utility.isCheckBoxSelected(updateAlert);
	}
	public void clickPasswordArrow() {
		utility.clickOnElement(passwordArrow);
	}
	public boolean checkPasswordDisplay() {
		return utility.isCheckDisplayed(passwordDisplay);
	}
	


}
