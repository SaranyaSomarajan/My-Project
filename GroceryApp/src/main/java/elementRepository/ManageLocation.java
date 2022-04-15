package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GenaralUtilities;

public class ManageLocation {
	GenaralUtilities utility=new GenaralUtilities();
    WebDriver driver;

	public ManageLocation(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//a[@ href='http://groceryapp.uniqassosiates.com/admin/list-location'])[2]")
	WebElement manageLocation;
	
	@FindBy(xpath="//h1[@class='m-0 text-dark']")
	WebElement listLocationText;
	
	@FindBy(xpath="//h1[@class='m-0 text-dark']")
	WebElement listLocationDisplayed;
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-warning']")
	WebElement resetButnText;
	
	@FindBy(xpath="//a[ @class='btn btn-rounded btn-danger']")
	WebElement newButn;
	
	@FindBy(xpath="//select[@id='country_id']")
	WebElement countryDropDown;
	
	@FindBy(xpath="//select[@id='country_id']")
	WebElement selectedCountry;
	
	
	public void clickManageLocation() {
		utility.clickOnElement(manageLocation);
	}
	public String listLocationText() {
		return utility.getElementText(listLocationText);
	}
	public boolean verifyListLocationIsDisplayed() {
		return utility.isCheckDisplayed(listLocationDisplayed);
	}
	public String verifyResetButnText() {
		return utility.getElementText(resetButnText);
	}
	public void clickNewButn() {
		utility.clickOnElement(newButn);
	}
	public void selectCountryFromDropDown() {
		utility.selectFromDropDown(countryDropDown, 0);
	}
	public boolean isSelectedCountryDisplayed() {
		return utility.isCheckDisplayed(selectedCountry);
	}

}
