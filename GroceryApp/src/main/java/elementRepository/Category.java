package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.GenaralUtilities;

public class Category {
	GenaralUtilities utility=new GenaralUtilities();
	WebDriver driver;
	Select select;
	public Category(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//a[@class='small-box-footer'])[3]")
	WebElement categoryTab;
	
	@FindBy(xpath="//h1[contains(text(),'List Categories')]")
	WebElement listCategoryText;
	
	public void selectCategoryPage() {
		utility.clickOnElement(categoryTab);
	}
	
	public String listCategoryText() {
		return utility.getElementText(listCategoryText);
	}

}
