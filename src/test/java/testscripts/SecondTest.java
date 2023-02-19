package testscripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibrary.BaseClass;

public class SecondTest extends BaseClass {
@Test
public void secondTest() 
{
	SoftAssert soft=new SoftAssert();
	home.clickGears();
	home.clickSkillrarydemoApp();
	web.handleChildBrowser();
	
	soft.assertTrue(skillraryDemo.getPageHeader().isDisplayed());
    skillraryDemo.selectCategory(web, 2);
    //web.explicitwait(time, testing.getPageHeader());
    //soft.assertEquals(testing.getPageHeader().getText(),"Testing");
  

    web.scrollToElement(testing.getfacebookIcon());
    
    testing.clickfacebookIcon();
    
    soft.assertAll();
    
    
}
}
