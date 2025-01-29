package packageofamazon.project_maven_Amazon;
import org.testng.annotations.Test;

//Login--search_product--logout

public class Testcase1 extends LaunchQuit{
	
	@Test
	public void logintoamazon_search_logout()
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
		h1.accountlist(driver);
		lp.logout();
		
		
		
	}

}
