package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GenaralUtilities;

public class ManageSlider {
	GenaralUtilities utility=new GenaralUtilities();
    WebDriver driver;

	public ManageSlider(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@ href='http://groceryapp.uniqassosiates.com/admin/list-slider']")
	WebElement manageSlider;
	
	@FindBy(xpath="//h1[@class='m-0 text-dark']")
	WebElement listSlider;
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")
	WebElement newbutnBackGroundColor;
	
	public void clickManageSlider() {
		utility.clickOnElement(manageSlider);
	}
	public String ListSliderText() {
		return utility.getElementText(listSlider);
	}
	
	public boolean ListSliderDisplay() {
		return utility.isCheckDisplayed(listSlider);
	}
	public String backgroundColorOfNewButn() {
		return utility.getCssValueOfElement(newbutnBackGroundColor, "background-color");
	}

}
