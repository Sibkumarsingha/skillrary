package pompages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibrary.BaseClass;

public class Homepage extends BaseClass {

	//Declaration
	@FindBy(xpath="//img[@alt='SkillRary']")
	private WebElement logo;
	
	@FindBy(xpath="//div[@class='search_s']/form/input[@name='q']")
	private WebElement searchTF;
	
	@FindBy(xpath="//input[@value='go']")
	private WebElement searchButton;
	
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsTab;
	
	@FindBy(xpath="//ul[@class='dropdown-menu gear_menu']/li[7]")
	private WebElement demoApplink;
	
	
	//Initialization
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//Utilization
	public WebElement getLogo() {
		return logo;
	}
	
	public void searchFor(String data)
	{
		searchTF.click();
		searchTF.sendKeys(data);
		searchButton.click();
	}
	public void search_in(String data,WebDriver driver)
	{
		WebElement myElement = searchTF;
		String js = "arguments[0].setAttribute('value','"+data+"')";
		((JavascriptExecutor) driver).executeScript(js, myElement);
	
		
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", searchButton);
		

	}
	
	public void clickGears()
	{
		gearsTab.click();
	}
	public void clickSkillrarydemoApp()
	{
		demoApplink.click();
	}
}
