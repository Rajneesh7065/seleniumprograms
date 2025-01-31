package packageofamazon.project_maven_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(id="ap_email_login")
	WebElement username;
	
	@FindBy(id="continue")
	WebElement contunue1;
	
	@FindBy(id="ap_password")
	WebElement password;
	
	@FindBy(id="signInSubmit")
	WebElement continue2;
	
	@FindBy(xpath="//span[.='Sign Out']")
	WebElement Logoutbutton;
	
	public void unserinput()
	{
		username.sendKeys("7065101922");
	}
	public void usercontinue() {
		contunue1.click();
		
	}
	public void passwordinput()
	{
		password.sendKeys("Janvi@123#");
	}
	
	public void loginButton()
	{
		continue2.click();
	}
	public void logout() {
		Logoutbutton.click();
	}
	
	
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
