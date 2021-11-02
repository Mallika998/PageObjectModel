package pom.facebook.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.facebook.pages.FacebookPage;
import wrappers.ProjectWrappers;

public class TC0010 extends ProjectWrappers{
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC0010";
		testCaseDescription="To verify whether the user able to register in facebook application";
		author="Mallika";
		category="smoke";
		browserName="chrome";
		appName="facebook";
		
	}
	
	@Test
	public void facebookregistration() {
		
		new FacebookPage()
		.clickOnCreate()
		.enterFirstName("mallika")
		.enterLastName("shaik")
		.enterMobileNumber("9876543210")
		.enterPassword("mallika@123")
		.selectDay("5")
		.selectMonth("May")
		.selectYear("2018")
		.clickOnGender();
		
	}

}
