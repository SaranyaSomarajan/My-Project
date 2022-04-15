package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GenaralUtilities;

public class ManageUsers {
	GenaralUtilities utility=new GenaralUtilities();
    WebDriver driver;

	public ManageUsers(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[@ href='http://groceryapp.uniqassosiates.com/admin/list-user'])[2]")
	WebElement manageUser;
	
	@FindBy(xpath="//h1[@class='m-0 text-dark']")
	WebElement listUserText;
	
	@FindBy(xpath="(//i[@class='fa fa-angle-double-down'])[1]")
	WebElement passwordArrow;
	
	@FindBy(xpath="(//div[@class='profile-info-name'])[1]")
	WebElement password;
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")
	WebElement searchButn;
	
	public void clickManageUsers() {
		utility.clickOnElement(manageUser);
	}
	public String listUserTextInManageUser() {
		return utility.getElementText(listUserText);
	}
	public void clickPasswordArrow() {
		utility.clickOnElement(passwordArrow);
	}
	public boolean passwordDisplayed() {
		return utility.isCheckDisplayed(password);
	}
	public String backgroundColorOfSearchButton() {
		return utility.getCssValueOfElement(searchButn, "background-color");
	}

}
