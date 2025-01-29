package packageofamazon.project_maven_Amazon;

import java.util.concurrent.ConcurrentHashMap.KeySetView;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	WebDriver driver;
	//Step 1
	
	@FindBy(id="twotabsearchtextbox")
	WebElement searchbox;
	
	@FindBy(xpath="//span[@class='nav-line-2 ']")
	WebElement accountlist;
	
	@FindBy(xpath="(//span[.='Sign in'])[1]")
	WebElement signup;
	
	
	//step 2
	public void searchproduct()
	{
	searchbox.sendKeys("shoe"+Keys.ENTER);
	}
	
	public void accountlist(WebDriver driver) 
	{
		Actions a1= new Actions(driver);
		a1.moveToElement(accountlist).perform();
	}
	
	public void loginaccout()
	{
		signup.click();
	}
	
	
	//step 3
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
