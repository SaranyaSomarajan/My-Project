package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GenaralUtilities;

public class ManageOrders {
	GenaralUtilities utility=new GenaralUtilities();
	WebDriver driver;

	public ManageOrders(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//a[@href='http://groceryapp.uniqassosiates.com/admin/list-order'])[1]")
	WebElement manageOrders;
	
	@FindBy(xpath="(//a[contains(text(),'View')])[1]")
	WebElement viewButn;
	
	@FindBy(xpath="//div[@class='row invoice-info']")
	WebElement displayDetails;
	
	@FindBy(xpath="(//i[@class='fas fa-trash-alt'])[1]")
	WebElement delete;
	
	@FindBy(xpath="//h5[contains(text(),' Alert!')]")
	WebElement alertMsg;
	
	@FindBy(xpath="(//a[contains(text(),'Change Delivery Date')])[1]")
	WebElement changeDeliveryDate;
	public void clickManageOrders() {
		utility.clickOnElement(manageOrders);
	}
	public void clickViewButn() {
		utility.clickOnElement(viewButn);
	}
	public boolean viewedItemDisplayed() {
		return utility.isCheckDisplayed(displayDetails);
	}
	public void clickDeleteButn() {
		utility.clickOnElement(delete);
	}
	public void alertMsg() {
		utility.alertHandling(driver);
	}
	public String alertMsgText() {
		return utility.getElementText(alertMsg);
	}
	public void clickChangeDeliveryDate() {
		utility.clickOnElement(changeDeliveryDate);
	}

}
