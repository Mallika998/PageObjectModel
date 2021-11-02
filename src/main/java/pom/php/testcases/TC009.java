package pom.php.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.PhpTravel.pages.PhptravelRegistrationPages;
import wrappers.ProjectWrappers;

public class TC009 extends ProjectWrappers {
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC009";
		testCaseDescription="To verify whether the user able to register in phptravel application";
		author="Mallika";
		category="smoke";
		browserName="chrome";
		appName="phptravel";
		
	}
	@Test
	public void phptravelregistration() {
		new PhptravelRegistrationPages()
		.enterFirstName("mallika")
		.enterLastName("shaik")
		.enteremail("mallika@gmail.com")
		.enterPhone("9876543210")
		.enterCompanyName("TCS")
		.enterStreetAddress("shaik's street")
		.enterStreetAddress2("abc colony")
		.enterCity("Guntur")
		.enterState("Andhra pradesh")
		.enterPincode("522001")
		.selectCountry("India")
		.enterMobileNumber("mallika123@")
		.enterPassword("mallika123@")
		.enterConfirmPassword("9876543210");
	}

}
