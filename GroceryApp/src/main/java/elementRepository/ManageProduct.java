package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ExplicitWait;
import utilities.GenaralUtilities;

public class ManageProduct {
	GenaralUtilities utility = new GenaralUtilities();
	ExplicitWait waits=new ExplicitWait();
	WebDriver driver;

	public ManageProduct(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Manage Product")
	WebElement manageProductTab;

	@FindBy(xpath = "(//table[@class='table table-bordered table-hover table-sm']//i[@class='fas fa-trash-alt'])[1]")
	WebElement clickDelete;

	@FindBy(xpath="//h5[contains(text(),' Alert!')]")
	WebElement alertMsg;
	
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")
	WebElement newButn;
	
	@FindBy(xpath="//input[@id='title']")
	WebElement titleField;
	
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement saveButn;
	
	@FindBy(xpath="//li[contains(text(),'The Title field is required.')]")
	WebElement titleFieldTxt;
	
	@FindBy(name="type")
	WebElement productType;

	public void clickManageProduct() {
		utility.clickOnElement(manageProductTab);
	}

	public void clickDelete() {
		utility.clickOnElement(clickDelete);
	
	}
	public void alertMsg() {
		utility.alertHandling(driver);
	}

	public String alertMsgText() {
		return utility.getElementText(alertMsg);

	}
	public void clickNewButn() {
		utility.clickOnElement(newButn);
	}
	public void waitForUtilityButn() {
		waits.clickOnElement(driver, "//button[contains(text(),'Save')]");
	}
	public void clickSaveButn() throws InterruptedException {
		
		utility.clickOnElement(saveButn);
	}
	public String titleFieldReqrdText() {
		return utility.getElementText(titleFieldTxt);
	}
	public boolean verifyRadioButton() {
		return utility.isCheckBoxSelected(productType);
	}
	}
