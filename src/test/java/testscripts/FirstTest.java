package testscripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibrary.BaseClass;

public class FirstTest extends BaseClass {
@Test
public void firstTest()
{
	SoftAssert soft=new SoftAssert();
	
	home.clickGears();
	home.clickSkillrarydemoApp();
	web.handleChildBrowser();
	
	soft.assertTrue(skillraryDemo.getPageHeader().isDisplayed());
	skillraryDemo.mouseHoverToCourse(web);
	skillraryDemo.clickSeleniumTraining();
	
	soft.assertEquals(selenium.getPageHeader().getText(),"Selenium Training");
	selenium.doubleClickPlusBUtton(web);
	selenium.clickAddToCart();
	web.handleAlert();
	web.explicitwait(time, selenium.getItemAddedMesage());
	web.takeScreenshot();
	soft.assertTrue(selenium.getItemAddedMesage().isDisplayed());
	
	soft.assertAll();
	}
}

