package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC002 extends ProjectWrappers {
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC002";
		testCaseDescription="To verify whether the user able to register in irctc application";
		author="Mallika";
		category="Regression";
		browserName="chrome";
		appName="irctctest";
		
	}
	@Test
	public void CoachBook() {
		new CovidAlertPage()
		.clickOnOk()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchToLoungeWindow()
		.clickOnMenu()
		.clickOnBookYourCoach()
		.switchToLoginWindow()
		.waitForElement(3000)
		.clickOnSignUp()
		.enterUserId("shaikm")
		.enterPassword("Shannu456")
		.enterConfirmPassword("Shannu456")
		.selectSecurityQuestion("What was the name of your first school?")
		.enterSecurityAnswer("abc")
		.clickOnDateOfBirth()
		.waitForElement(3)
		.selectMonth("Mar")
		.selectYear("1996")
		.selectDay()
		.clickOnGender()
		.clickOnMaritalStatus()
		.enterEmail("mallika@gmail.com")
		.selectOccupation("Professional")
		.enterFirstName("mallika")
		.enterMiddleName("shannu")
		.enterLastName("shaik")
		.selectNationality("Indian")
		.enterFlatNumber("103")
		.enterStreet("2nd lane")
		.enterArea("xyz")
		.selectCountry("India")
		.enterMobileNumber("9876543210")
		.enterPincode("522001")
		.scrollDown()
		.selectState("ANDHRA PRADESH")
		.selectPostOffice("Bus Stand(Guntur) S.O")
		.scrollDown()
		.waitForElement(3)
		.clickOnNo()
		.enterOfficeFlatNumber("6th block")
		.enterOfficeStreet("1st lane")
		.enterOfficeArea("Seruseri")
		.selectOfficeCountry("India")
		.enterOfficeMobileNumber("9876543210")
		.enterOfficePincode("603103")
		.scrollDown()
		.selectOfficePostOffice("Navalur B.O");
	}

}
