package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC003  extends ProjectWrappers{
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC003";
		testCaseDescription="To verify whether the user able to register in irctc application";
		author="Mallika";
		category="Regression";
		browserName="chrome";
		appName="irctctest";
		
	}
	@Test
	public void saloonmandatorycheck() {
		new CovidAlertPage()
		.clickOnOk()
		.waitForElement(3000)
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchToLoungeWindow()
		.clickOnMenu()
		.clickOnCharter()
		.switchToCharterWindow()
		.waitForElement(3000)
		.clickOnEnquiryForm()
		.enterName("mallika")
		.enterOrganisation("TCS")
		.enterAddress("abc colony")
		.enterMobileNumber("98765432")
		.enterEmail("mallika@gmail.com")
		.selectCharter("Saloon Charter")
		.enterCharterPurpose("visiting")
		.enterOriginStation("Guntur")
		.enterDestinationStation("Chennai")
		.clickOnCheckInDate()
		.clickOnmonth()
		.clickOnDay()
		.clickOnCheckOutDate()
		.clickOnDayChekout()
		.enterDuration("3")
		.enterTypeOfCoach("98,97,96 AC Sleeper")
		.enterNumberOfPassengers("2")
		.enterService("South Indian food")
		.clickOnSubmit()
		.verifyInformation();
		
	}

}
