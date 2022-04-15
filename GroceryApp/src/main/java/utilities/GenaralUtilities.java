package utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class GenaralUtilities {
	

	public String getElementText(WebElement element) {
		String text=element.getText();
		return text;
		
	}
	public boolean isCheckBoxSelected(WebElement element) {
		boolean select=element.isSelected();
		return select;
		
	}
	public boolean isCheckDisplayed(WebElement element) {
		boolean textDisplay=element.isDisplayed();
		return textDisplay;
	}
	
	public void clickOnElement(WebElement element) {
		element.click();
	}
	
	public void enterTextInElement(WebElement element,String textToEnter) {
		element.sendKeys(textToEnter);
	}
	public String getCssValueOfElement(WebElement element, String cssValue) {
		String value=element.getCssValue(cssValue);
		return value;
	}
	public void enterTextInElementlogin(String textToEnter,WebElement element) {
		element.sendKeys(textToEnter);
	}


	public void selectFromDropDown(WebElement element , int index) {
		Select select=new Select(element);
		select.selectByIndex(index);
		
	}
	public void mouseOverElement(WebDriver driver,WebElement element) {
		Actions actions=new Actions(driver);
		actions.moveToElement(element).click().perform();
	}
	public void alertHandling(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	public void scrollDown(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");	
	}
	public void imageUpload(String path) throws AWTException {
		Robot robot=new Robot();
         StringSelection ss = new StringSelection(path);
	     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	     robot.delay(500);
	     
	     robot.keyPress(KeyEvent.VK_CONTROL);
	     robot.keyPress(KeyEvent.VK_V);
	     robot.delay(500);
	     robot.keyRelease(KeyEvent.VK_CONTROL);
	     robot.keyRelease(KeyEvent.VK_V);
	     robot.delay(500);
	     robot.keyPress(KeyEvent.VK_ENTER);
	     robot.keyRelease(KeyEvent.VK_ENTER);
	     robot.delay(500);
	}
	public void navigateToPage(WebDriver driver,String url) {
		driver.navigate().to(url);
	}
	

}
