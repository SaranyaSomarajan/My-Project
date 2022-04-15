package elementRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ExcelUtility;
import utilities.GenaralUtilities;

public class LoginPage {
	GenaralUtilities utility=new GenaralUtilities();
	WebDriver driver;
	 ExcelUtility excelUtility;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="username")
	WebElement userName;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//button[@class='btn btn-dark btn-block']")
	WebElement signin;
	
	@FindBy(xpath="//a[@data-toggle='dropdown']")
	WebElement loggedUsers;
	
	@FindBy(xpath="//label[contains(text(),'Remember Me')]")
	WebElement rememberCheckBox;
	
	@FindBy(xpath="//input[@id='remember']")
	WebElement verificationOfRememberCheckBox;
	
    public void enterUserName(String userNameInput) {
		userName.sendKeys(userNameInput);
	}
	
	public void enterPassWord(String passwordInput) {
		password.sendKeys(passwordInput);
	}
	/*public void enterUserName(String inputUser) {
		utility.enterTextInElementlogin(inputUser,userName);
	}
	public void enterPassword(String inputPassword) {
		utility.enterTextInElementlogin(inputPassword,password);
	}*/

	public void clickSignin() {
		utility.clickOnElement(signin);
		//signin.click();
	}
	public String verifyLoggedUsers() {
		return utility.getElementText(loggedUsers);
	}
	public String loginButnTxt() {
		return utility.getElementText(signin);
	}
	public void clickRememberButn() {
		utility.clickOnElement(rememberCheckBox);
	}
	
	public boolean verifyRemberCheckBox() {
		return utility.isCheckBoxSelected(verificationOfRememberCheckBox);
		
	}
	
	public List<String> getLoginData(){
		List<String>excelList =excelUtility.readDataFromExcel("Book1");
		return excelList;
	}

	

}


