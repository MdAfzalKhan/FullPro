package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class LogIn extends Base {
	
	
	@FindBy(className="login")
	WebElement signInBtn;
	
	@FindBy(css="#email")
	WebElement email;
	
	@FindBy(css="#passwd")
	WebElement pssd;
	
	@FindBy(xpath="//p[@class='submit']//span[1]")
	WebElement submitBtn;
	
	
	public LogIn() {
		PageFactory.initElements(driver, this);
		
	}
	
	public HomePage logInToAccount(String userName, String password) {
		signInBtn.click();
		email.sendKeys(userName);
		pssd.sendKeys(password);
		submitBtn.submit();
		return new HomePage();
	}

}
