package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoreJavaForSeleniumPage {

	//Declaration
	@FindBy(xpath="//h2[@class='list_title']")
	private WebElement pageHeader;
	
	@FindBy(xpath="//a[text()=' Core Java For Selenium Trainin']")
	private WebElement coreJavaForSeleniumLink;
	
	//Initialization
	public  CoreJavaForSeleniumPage(WebDriver driver)
	{
	    PageFactory.initElements(driver,this);
	}
	
	public WebElement getPageHeader() {
		return pageHeader;
	}
	
	public void clickCoreJavaForSeleniumLink()
	{
		coreJavaForSeleniumLink.click();
	}
}
