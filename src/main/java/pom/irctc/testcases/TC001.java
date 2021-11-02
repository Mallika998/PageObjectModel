package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC001 extends ProjectWrappers {
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC001";
		testCaseDescription="To verify whether the user able to register in irctc application";
		author="Mallika";
		category="Regression";
		browserName="chrome";
		appName="irctctest";
		
	}

	@Test
	public void irctcregistration () {
		
		new CovidAlertPage()
		.clickOnOk()
		.clickOnRegister()
		.enterUserName("mallika")
		.enterPassword("mallika@123")
		.enterConfirmPassword("mallika@123")
		.clickOnLanguage()
		.clickOnEng("English")
		.clickOnSecurityQuestion()
		.clickOnQstpet("What is your pet name?")
		.enterSecurityAnswer("abc")
		.clickOnContinue()
		.enterFirstName("mallika")
		.enterMiddleName("shannu")
		.enterLastName("shaik")
		.clickOnOccupation()
		.clickOccupationAS()
		.clickOnDateOfBirth()
		.selectMonth("March")
		.selectYear("1996")
		.selectDay("15")
		.clickOnUnmarried()
		.selectCountry("India")
		.clickOnGender()
		.enterEmail("mallika@gmail.com")
		.enterMobileNumber("9876543210")
		.selectNationality("India")
		.clickOnContinue1()
		.enterResFlatNumber("103")
		.enterResStreet("2nd street")
		.enterResArea("shaik's street")
		.enterResPincode("522001")
		.enterResState("Andhara Pradesh")
		.selectResCity("GUNTUR")
		.selectResPostOffice("Bus Stand(Guntur) S.O")
		.enterResPhone("9876543210")
		.clickOnNo()
		.enterOffFlatNumber("6th block")
		.enterOffStreet("1st lane")
		.enterOffArea("Seruseri")
		.clickOnCountry()
		.clickOnIndia()
		.enterOffPincode("603103")
		.enterOffState("Tamil Nadu")
		.enterOffCity("Chennai")
		.enterOffPostOffice("Navalur B.O")
		.enterOffPhone("9876543210");
		
		
	
	}
}
