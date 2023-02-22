package testscripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibrary.BaseClass;

public class Script3 extends BaseClass {
	
	@Test
	public void thirdTest()
	{
		SoftAssert soft = new SoftAssert();
		home.searchFor("core java for selenium");
		soft.assertTrue(coreJava.getPageHeader().isDisplayed());
		coreJava.clickCoreJavaForSeleniumLink();
		soft.assertTrue(selenium.getPageHeader().isDisplayed());
	   
		web.handleAlert();
		
		web.switchToFrame();
		javaVideo.closepopUp();
		javaVideo.clickPlayButton();
		javaVideo.clickPauseButton();
		web.switchBackFromFrame();
		javaVideo.clickWishList();
		soft.assertAll();
	}

}
