package packageofamazon.project_maven_Amazon;
//login-->searching-->wishlist-->cart-->logout

import org.testng.annotations.Test;

public class TestCase2 extends LaunchQuit{
	
	@Test
	public void login_search_wishlist_cart_logout() throws InterruptedException
	
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
		product3.Addtowishlist();
		product3.continueshopingbutton();
		Thread.sleep(2000);
		product3.Gotocart();
		Thread.sleep(5000);
		h1.accountlist(driver);
		//lp.logout();
		
		
		
		
		
		
	}

}
