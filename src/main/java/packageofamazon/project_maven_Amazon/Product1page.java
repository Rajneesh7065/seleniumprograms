package packageofamazon.project_maven_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product1page {
	
	@FindBy(xpath ="//input[@id='add-to-wishlist-button-submit']")
	WebElement Wishlistlink;
	
	@FindBy(xpath = "//span[.='Continue shopping']")
	WebElement continueshoping;
	
	@FindBy(id = "add-to-cart-button")
	WebElement Addtocart;
	
	@FindBy(partialLinkText = "Go to")
	WebElement gotocart;
	
	@FindBy(xpath = "//span[@data-a-selector='increment-icon']")
	WebElement Increamentcountproduct;
	
	@FindBy(name="proceedToRetailCheckout")
	WebElement paymentpage;
	
	@FindBy(id="checkout-secondary-continue-button-id-announce")
	WebElement payment;
	
	public void Addtowishlist()
	
	{
		Wishlistlink.click();
	}
	
	
	public void continueshopingbutton()
	{
		continueshoping.click();
	}
	
	public void Gotocart()
	{
		Addtocart.click();
	}
	
	public void Cart()
	{
		gotocart.click();
	}	
	
	public void productcount(int count) throws InterruptedException {
        for (int i = 1; i < count; i++) {
            Increamentcountproduct.click();
            Thread.sleep(2000);
        }
    }
	
	public void procedToPayment()
	{
		paymentpage.click();
	}
	public void payment()
	{
		payment.click();
	}
	
	
	
	public Product1page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
