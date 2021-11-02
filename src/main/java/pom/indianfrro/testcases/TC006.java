package pom.indianfrro.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.indianfrro.pages.Indianfrro;
import wrappers.ProjectWrappers;

public class TC006 extends ProjectWrappers {
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC006";
		testCaseDescription="To verify whether the user able to register in indianfrro application";
		author="Mallika";
		category="Regression";
		browserName="chrome";
		appName="indianfrro";
		
	}
	@Test
	public void indianfrroregistration() {
		new Indianfrro()
		.clickOnRegistration()
		.enterUserName("Testing1")
		.enterPassword("Mallika@123")
		.enterConfirmPassword("Mallika@123")
		.selectSecurityQuestion("What is your favorite author?")
		.enterSecurityAnswer("abc")
		.enterName("mallika")
		.selectGender("Female")
		.enterDateOfBirth("05/06/1996")
		.enterDesignation("Testing")
		.enterEmail("mallika@gmail.com")
		.enterMobile("9876543210")
		.enterPhoneNumber("9876543210")
		.selectNationality()
		.enterGuestName("mallika")
		.enterCapacity("6")
		.enterAddress("abc colony")
		.selectState("ANDHRA PRADESH")
		.waitForElement(3000)
		.selectCity("GUNTUR")
		.selectFrroData("FRO GUNTUR URBAN")
		.selectAccomodationType("Hotel")
		.selectAccomodationGrade("Four Star")
		.enterGuestEmail("mallika123@gmail.com")
		.enterGuestmobile("9876543210")
		.enterGuestPhoneNumber("9949901713")
		.enterPassengerName("Shannu")
		.enterPassengerAddress("Shaik's street")
		.selecPassengerstate("ANDHRA PRADESH")
		.selecPassengercity("GUNTUR")
		.enterPassengerEmail("Shannu123@gmail.com")
		.enterPassengermobile("9949901713")
		.enterPassengerPhoneNumber("9888888888")
		.clickOnAdd()
		.enterPassengerName("mallika")
		.enterPassengerAddress("xyz")
		.selecPassengerstate("ANDHRA PRADESH")
		.waitForElement(3000)
		.selecPassengercity("GUNTUR")
		.enterPassengerEmail("mallika@gmail.com")
		.enterPassengermobile("9876543210")
		.enterPassengerPhoneNumber("9000000000")
		.clickOnAdd()
		.waitForElement(3000)
		.enterPassengerName("Shannu")
		.enterPassengerAddress("abc colony")
		.selecPassengerstate("ANDHRA PRADESH")
		.waitForElement(3000)
		.selecPassengercity("GUNTUR")
		.enterPassengerEmail("shaik123@gmail.com")
		.enterPassengermobile("9777777777")
		.enterPassengerPhoneNumber("9876543210")
		.clickOnAdd();
		
		
		
	}

}
