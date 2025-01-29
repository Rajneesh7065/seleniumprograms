package packageofamazon.project_maven_Amazon;

//Login->Search a product->add it to cart->make paymnt using COD->logout				
import org.testng.annotations.Test;

public class Testcase4 extends LaunchQuit{
	
	@Test
	public void login_searchp_addtocart_makecodpayment_logout() throws InterruptedException
	{
		Homepage h1= new Homepage(driver);
		h1.accountlist(driver);
		h1.loginaccout();
		LoginPage lp= new LoginPage(driver);
		lp.unserinput();
		lp.usercontinue();
		lp.passwordinput();
		lp.loginButton();
		h1.searchproduct();
		SearchResultPage product= new SearchResultPage(driver);
		product.selectproduct();
		Product1page product3= new Product1page(driver);
		product3.Gotocart();
		product3.procedToPayment();
		lp.logout();
		
		
	}
	

}
