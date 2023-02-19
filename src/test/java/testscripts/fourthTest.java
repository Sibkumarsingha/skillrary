package testscripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibrary.BaseClass;

public class fourthTest extends BaseClass{
@Test
public void FourthTest()
{
SoftAssert soft=new SoftAssert();
	
	home.clickGears();
	home.clickSkillrarydemoApp();
	web.handleChildBrowser();
	
	soft.assertTrue(skillraryDemo.getPageHeader().isDisplayed());
	web.scrolltoElement();
	skillraryDemo.clickContactUs();
	//assertion to be done
	//soft.assertEquals(contact.getpageHeader().getText(), "contactus");
	contact.submitDetails("Sib", "S.kumarsingha444@gmail.com", "approval", "this is just a random message");
	
	soft.assertAll();
	}
}
