package testscripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibrary.BaseClass;

public class Script3 extends BaseClass {
	
	@Test
	public void thirdTest() throws InterruptedException
	{
		SoftAssert soft = new SoftAssert();
		Thread.sleep(4000);
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
