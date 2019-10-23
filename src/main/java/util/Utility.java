package util;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import base.Base;

public class Utility extends Base {
	
	
	
	public static void takeScreenShot() throws IOException {
		File srcFile = null ;
		String screenShotPath = "F:\\Workspaces\\Java_2\\Project\\screenshot\\ ";
		srcFile	= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File(screenShotPath + System.currentTimeMillis() + "_" + " .jpg" ));
		
	}
	
	public static void takeScreenShotFromItestListener(String testMethodName) throws IOException {
		File srcFile = null ;
		String screenShotPath = "F:\\Workspaces\\Java_2\\Project\\screenshot\\ ";
		srcFile	= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File(screenShotPath + testMethodName + "_" + " .jpg" ));
		
	}

}
