package pom.onlineusvisa.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.onlineusvisa.pages.OnlineUsVisa;
import wrappers.ProjectWrappers;

public class TC007 extends ProjectWrappers{
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC007";
		testCaseDescription="To verify whether the user able to register in onlineusvisa application";
		author="Mallika";
		category="smoke";
		browserName="chrome";
		appName="onlineusvisa";
		
	}
	@Test
	public void onlineusvisaregistration() {
		new OnlineUsVisa()
		.enterName("Mallika")
		.enterSurName("shaik")
		.enterFullName("Mallika shaik")
		.clickOnYes()
		.enterOtherSurName("Shaik")
		.enterOtherName("Shannu")
		.enterEmail("mallika@gmail.com")
		.enterConfirmEmail("mallika@gmail.com")
		.clickOnOtherEmailYes()
		.enterAdditionalEmail("mallika123@gmail.com")
		.clickOnFemale()
		.scrollDown()
		.clickOnDateOfBirth()
		.selectYear("1996")
		.selectMonth("February")
		.clickOnDay()
		.enterCity("Guntur")
		.enterState("Andhra Pradesh")
		.selectCountry("India")
		.selectNationality("India")
		.clickOnResidentNationality()
		.selectResidentCountry("India");
	}

}
