package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GenaralUtilities;

public class ManageCOD {
	GenaralUtilities utility = new GenaralUtilities();
    WebDriver driver;

	public ManageCOD(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//p[text()='Manage COD']")
	WebElement manageCODTab;
	
	@FindBy(name="cod")
	WebElement yesButton;
	
	@FindBy(xpath="//button[text()='Save']")
	WebElement clickSave;

	public void clickManageCOD() {
		utility.clickOnElement(manageCODTab);
	}
	
	public void clickYesButton() {
		utility.clickOnElement(yesButton);
	}
public boolean checkRadioButtonSelected() {
	return utility.isCheckBoxSelected(yesButton);
	}
}
