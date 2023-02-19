package testscripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibrary.BaseClass;

public class ThirdTest extends BaseClass{
@Test
public void thirdTest() throws Exception 
{
	SoftAssert soft=new SoftAssert();
	home.searchFor("core java for selenium");
	web.explicitwait(time, coreJava.getPageHeader());
	soft.assertEquals(coreJava.getPageHeader().getText(),"core java for selenium training");
	coreJava.clickCoreJavaForSeleniumLink();
	web.explicitwait(time,javaVideo.getpageHeader());
	soft.assertEquals(javaVideo.getpageHeader().getText(),"Core Java For Selenium Training");

	javaVideo.closepopUp();
	web.switchToFrame();
	javaVideo.clickPlayButton();
	Thread.sleep(20000);
	javaVideo.clickPauseButton();
	web.switchBackFromFrame();
	javaVideo.clickWishList();

	
	}
}
