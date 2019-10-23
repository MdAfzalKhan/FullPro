package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.Base;
import listeners.MyListener;
import pages.HomePage;
import pages.LogIn;

@Listeners (MyListener.class)
public class LogInTest  extends Base{
	
	LogIn logIn;
	HomePage homePage;
	
	public LogInTest() {
		super();
	}
	
	String email = "Random@test.com";
	String pssd = "random1234";
	
	@BeforeMethod
	public void setUp() {
		launBrowser();
		logIn = new LogIn();
	}
	
	@Test(priority =1)
	public void verifyURL() {
		String urlRunTime = driver.getCurrentUrl();
		Assert.assertEquals(url, urlRunTime);
	}
	
	@Test(priority=2)
	public void logIn() {
		homePage = logIn.logInToAccount(email, pssd);
		
	}
	
	@AfterMethod
	public void tearDown() {
		quitBrowser();
	}

}
