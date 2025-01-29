package packageofamazon.project_maven_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage {
	
	WebDriver driver;
	@FindBy(xpath ="(//a[@class='a-link-normal s-no-outline'])[1]")
	WebElement productresult;
	
	
	public void selectproduct()
	{
		productresult.click();
		
//	Set<String>	windows=	driver.getWindowHandles();
//	Iterator<String> i2=	windows.iterator();
//	String win1=i2.next();
//	String win2=i2.next();
//	driver.switchTo().window(win2);
	
	}
	

	public SearchResultPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
