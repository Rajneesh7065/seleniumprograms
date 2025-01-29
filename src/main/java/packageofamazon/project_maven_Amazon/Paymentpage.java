package packageofamazon.project_maven_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Paymentpage {
	
	@FindBy(xpath = "//span[@id='nav-checkout-cart-icon']")
	WebElement cart;
	
	
	public void Backtocart()
	{
		cart.click();
	}
	
	public Paymentpage(WebDriver driver)
	
	{
		PageFactory.initElements(driver, this);
	}
	
}
