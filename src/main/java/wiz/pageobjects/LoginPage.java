package wiz.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wiz.base.BaseTest;

public class LoginPage extends BaseTest {
	
	@FindBy(xpath="//img[@src=\'/assets/LogoWithText-485698aa.png\']")
	WebElement wizlogo;
	
	@FindBy(xpath="//div//input[@id=\'outlined-basic\'][1]")
	WebElement wizemail;
	
	@FindBy(xpath="//div//input[@id=\'outlined-basic\'][2]")
	WebElement wizpasword;
	
	@FindBy(xpath="//div//button[@type='submit']")
	WebElement loginbutton;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	
}
