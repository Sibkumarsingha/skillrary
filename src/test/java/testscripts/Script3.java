package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibrary.BaseClass;

public class Script3 extends BaseClass {
	
	@Test
	public void thirdTest()
	{
		SoftAssert soft = new SoftAssert();
		WebElement elem= driver.findElement(By.xpath("//input[@name='q']"));
		web.explicitwait(time,elem );
		home.searchFor("core java for selenium");
		soft.assertTrue(coreJava.getPageHeader().isDisplayed());
		coreJava.clickCoreJavaForSeleniumLink();
		soft.assertTrue(selenium.getPageHeader().isDisplayed());
	   
		
		//web.handleAlert();
		javaVideo.closepopUp();
		web.switchToFrame();
	
		javaVideo.clickPlayButton();
		javaVideo.clickPauseButton();
		web.switchBackFromFrame();
		javaVideo.clickWishList();
		soft.assertAll();
	}

}
