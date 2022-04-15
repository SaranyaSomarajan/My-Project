package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ExplicitWait;
import utilities.GenaralUtilities;

public class ManageExpense {
	
	GenaralUtilities utility=new GenaralUtilities();
	WebDriver driver;
	ExplicitWait waits=new ExplicitWait();
	
	public ManageExpense(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="(//p[contains(text(),'Manage Expense')])[1]")
	WebElement manageExpense;
	
	@FindBy(xpath="//h1[contains(text(),'List Expense')]")
	WebElement listExpense;
	
	public void waitForUtilityButn() {
		waits.clickOnElement(driver, "(//p[contains(text(),'Manage Expense')])[1]");
	}
	public void clickManageExpense()  {
		
		utility.clickOnElement(manageExpense);
	}
	public String listExpenseText() {
		return utility.getElementText(listExpense);
	}
}
