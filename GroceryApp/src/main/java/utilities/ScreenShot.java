package utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	public void captureScreenShot(WebDriver driver,String image) throws IOException {
		TakesScreenshot scrShot =(TakesScreenshot)driver;
		File screenShot = scrShot.getScreenshotAs(OutputType.FILE);
		File f1=new File(System.getProperty("user.dir")+"//Output screeshot");
		  if (!f1.exists()){
			    f1.mkdirs();
			}
		  String timeStamp = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss").format(new Date());


		String destination=System.getProperty("user.dir")+"//Output screeshot//"+image+timeStamp+".png";
		File file=new File(destination);
		FileHandler.copy(screenShot, file);




	}

}
