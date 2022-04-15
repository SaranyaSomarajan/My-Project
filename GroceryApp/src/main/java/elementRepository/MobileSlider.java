package elementRepository;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ExplicitWait;
import utilities.GenaralUtilities;

public class MobileSlider {
	GenaralUtilities utility=new GenaralUtilities();
	ExplicitWait waits=new ExplicitWait();
    WebDriver driver;

	public MobileSlider(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//a[@href='http://groceryapp.uniqassosiates.com/admin/list-mobileslider'])[1]")
	WebElement mobileSlider;
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")
	WebElement newButn;
	
	@FindBy(xpath="//input[@id='main_img']")
	WebElement choseFile;
	
	@FindBy(xpath="//button[text()='Save']")
	WebElement saveButn;
	
	@FindBy(xpath="//tbody//tr[1]//td[1]//img")
	WebElement imageUploaded;
	
	@FindBy(xpath="//a[text()='Home']")
	WebElement homeButn;
	
	@FindBy(xpath="//h1[text()='List Mobile Slider']")
	WebElement headerIcon;
	
	public void clickMobileSlider() {
		utility.clickOnElement(mobileSlider);
	}
	public void clickNewButn() {
		utility.clickOnElement(newButn);
	}
	public void clickChoseFile() {
		utility.mouseOverElement(driver, choseFile);
		//utility.clickOnElement(choseFile);
	}
	public void uploadChoseFile() throws AWTException {
		
		//utility.clickOnElement(choseFile);
		utility.imageUpload("C:\\Users\\saran\\OneDrive\\Desktop\\grocery\\o-HEALTHY-GROCERY-SHOPPING-facebook.jpg");
	}
	public void clickSave() {
		utility.clickOnElement(saveButn);
	}
	public void navigateToImageUploadPage() {
		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/list-mobileSlider");
	}
	public boolean checkImageUploadedIsDisplayed() {
		return utility.isCheckDisplayed(imageUploaded);
	}

}
