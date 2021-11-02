package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC004 extends ProjectWrappers{
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC004";
		testCaseDescription="To verify whether the user able to register in irctc application";
		author="Mallika";
		category="Regression";
		browserName="chrome";
		appName="irctctest";
		
	}
	@Test
	public void Bookhotels() {
		new CovidAlertPage()
		.clickOnOk()
		.waitForElement(3000)
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchToLoungeWindow()
		.clickOnHotelsIcon()
		.switchToHotelsWindow()
		.clickOnLogin()
		.clickOnGuestUserLogin()
		.enterEmail("mallika@gmail.com")
		.enterMobile("9876543210")
		.waitForElement(10)
		.clickOnClickOnSubmit()
		.waitForElement(10)
		.clickOnEnterCity()
		.enterCityText("Delhi")
		.waitForElement(3000)
		.clickOnSelectcity()
		.clickOnCheckInDate()
		.waitForElement(3000)
		.clickOnSelectCheckInDate()
		.waitForElement(3000)
		.clickOnCheckOutDate()
		.waitForElement(5000)
		.clickOnSelectCheckOutDate()
		.clickOnGuest()
		.selectRoom()
		.selectAdult()
		.clickOnDone()
		.clickOnFindHotel()
		.waitForElement(5000)
		.clickOnFirstHotel()
		.switchToHotelDisplayWindow()
		.waitForElement(5000)
		.getHotelName()
		.getHotelPrice()
		.clickOnContinueToBook()
		.selectTitle("Mrs")
		.enterFirstName("mallika")
		.enterLastName("shaik")
		.selectCountry("India")
		.selectState("ANDHRA PRADESH")
		.selectGst()
		//.verifyHotelName()
		//.verifyHotelPrice()
		.waitForElement(3000)
		.clickOnContinue()
		.clickOnCheckMark()
		.waitForElement(3000)
		.clickOnMakePayment()
		.clickOnVerifyOtp();
		//.VerifyOtp("otp is required.");
		
	}

}
