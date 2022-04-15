package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.GenaralUtilities;

public class AdminUsers {
	
	GenaralUtilities utility=new GenaralUtilities();
	WebDriver driver;
	Select select;
	public AdminUsers(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[@ href='http://groceryapp.uniqassosiates.com/admin/list-admin'])[2]")
	WebElement adminUsers;
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")
	WebElement searchText;
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-warning']")
	WebElement resetText;
	
	@FindBy(linkText="Admin Users")
	WebElement adminUser;
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")
	WebElement newButn;
	

	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")
	WebElement searchButn;
	
	@FindBy(id="//input[@id='un']")
	WebElement name;
	
	@FindBy(xpath="//button[@name='Search']")
	WebElement userSearchButn;
	
	@FindBy(xpath="//input[@id='un']")
	WebElement searchedName;
	
	@FindBy(xpath="//select[@id='ut']")
	WebElement userDropDown;
	
	@FindBy(xpath="//table[@class='table table-bordered table-hover table-sm']//tr[3]//td[3]")
	WebElement userType;
	
	@FindBy(xpath="//table[@class='table table-bordered table-hover table-sm']//tr[3]//td[3]")
	WebElement activeButn;
	
	@FindBy(xpath="//table[@class='table table-bordered table-hover table-sm']//tr[3]//td[4]")
	WebElement clickPasswordArrow;
	
	@FindBy(xpath="//table[@class='table table-bordered table-hover table-sm']//tr[4]")
	WebElement password;
	
	
	@FindBy(xpath="//table[@class='table table-bordered table-hover table-sm']//tr[1]//td[5]//a[@class='btn btn-sm btn btn-success btncss']")
    WebElement activeButton;
	
	@FindBy(xpath="(//table[@class='table table-bordered table-hover table-sm']//a[@role='button']//span[@class='badge bg-warning'])[1]")
	WebElement statusBtn;
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-warning']")
	WebElement resetButn;
	

	

	
	public void clickAdminUserArrow() {
		utility.clickOnElement(adminUsers);
	}
	public boolean verifyUserNameDisplayed() {
		return utility.isCheckDisplayed(adminUser);
	}
	
	public void selectNewButn() {
		utility.clickOnElement(newButn);
	}
	public String verifyReset() {
		return utility.getElementText(resetText);
	}
    
	public void clickSearchButn() {
		utility.clickOnElement(searchButn);
	}
	public void enterNameInNameField() {
		utility.enterTextInElement(name, "Divya");
	}
	public void clickUserSearchButn() {
		utility.clickOnElement(userSearchButn);
	}
	public String verifySearchName() {
		return utility.getElementText(searchedName);
	}
	public String SearchTxtInAdminUsers() {
		return utility.getElementText(searchText);
	}
	/*public void searchUserName(String userNameInput) {
		utility.enterTextInElement(userNameSearch, userNameInput);;
	}
	public void clickSearchINUserNameField() {
		utility.clickOnElement(clickSearch);
	}*/
	public void selectUserType() {
	 utility.selectFromDropDown(userDropDown,1);
	}
	
	public String getTextUserTypeInTable() {
		return utility.getElementText(userType);
	}	
	
	public void clickPasswordArrow() {
		 utility.clickOnElement(clickPasswordArrow);;;
	}
	public boolean passworDisplayed() {
		return utility.isCheckDisplayed(password);
	
	}
	public void verifyActiveButton() {
		utility.clickOnElement(activeButton);
	}
	public String verifyStatus() {
		return utility.getElementText(statusBtn);
	} 
	public String backgroundColorOfResetButn() {
		return utility.getCssValueOfElement(resetButn, "background-color");
	}
	public String resetButnText() {
		return utility.getCssValueOfElement(resetText, "test");
	}
	public String backgroundColorOfSearchButn() {
		return utility.getCssValueOfElement(searchButn, "background-color");
	}
		
	}


