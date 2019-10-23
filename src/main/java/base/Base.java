package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import listeners.MyListener;

public class Base {
	
	public static WebDriver driver = null;
	public static String url = "http://automationpractice.com/index.php";
	
	public static EventFiringWebDriver eventFiringWebDriver = null;
	public static MyListener myListener = null;
	
	public static void launBrowser() {
		//to set Chrome driver path 
		System.setProperty("webdriver.chrome.driver","F:\\Software\\Automation tool\\Drivers\\chrome 10-12-19\\chromedriver_win32\\chromedriver.exe");
		//to create a ChromeDriver Object
		
		driver = new ChromeDriver();
		
		eventFiringWebDriver = new EventFiringWebDriver(driver);
		myListener = new MyListener();
		eventFiringWebDriver.register(myListener);
		driver = eventFiringWebDriver;   //at this point i am setting my driver to eventFiringWebDriver so that onward events(for launching url) get captured
		
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
	}
	
	
	
	
	public static void quitBrowser() {
		driver.quit();
	}

}
