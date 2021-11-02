package pom.panindia.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.panindia.pages.PanIndiaRegistrationPage;
import wrappers.ProjectWrappers;

public class TC008 extends ProjectWrappers {
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC008";
		testCaseDescription="To verify whether the user able to register in panindia application";
		author="Mallika";
		category="Regression";
		browserName="chrome";
		appName="panindia";
		
	}
	@Test
	public void panindiaregistration() {
		new PanIndiaRegistrationPage()
		.selectTitile("MISS")
		.enterFirstName("Mallika")
		.enterMiddleName("Shannu")
		.enterLastName("shaik")
		.enterFatherFirstName("Pappa")
		.enterFatherMiddleName("Abu")
		.enterFatherLastName("Shaik")
		.enterMobileNumber("9876543210")
		.enterEmail("mallika@gmail.com")
		.selectSourceIncome("Salary")
		.clickOnOffice()
		.enterDateOfBirth("15082021")
		.enterResidenceHouseNo("10th block")
		.enterResidenceArea("abc colony")
		.enterResidenceCity("Guntur")
		.selectResidenceState("Andhra Pradesh")
		.scrollDown()
		.enterResidencePincode("522001")
		.selectResidenceCountry("INDIA")
		.enterOfficeName("TCS")
		.enterOfficeHouseNo("5th block")
		.enterOfficeArea("seruseri")
		.enterOfficeCity("Chennai")
		.selectOfficeState("Tamil Nadu")
		.enterOfficePincode("603103")
		.selectOfficeCountry("INDIA")
		.selectIdentityProof("Aadhar Card issued by UIDAI(In Copy)")
		.selectAddressProof("Aadhar Card issued by UIDAI(In Copy)")
		.selectDobProof("Aadhar Card issued by UIDAI(In Copy)")
		.selectAadhaarProof("Copy of Aadhaar Card / Letter")
		.selectGuardianId("Passport(In Copy)")
		.scrollDown()
		.selectOfficeAddressProof("Bank statement carrying Office Address")
		.selectGuardianTitle("MR.")
		.enterGuardianFirstName("abc")
		.enterGuardianMiddleName("xyz")
		.enterGuardianLastName("shaik")
		.enterGuardianHouseNo("2nd lane")
		.enterGuardianArea("shaik's street")
		.enterGuardianCity("Guntur")
		.selectGuardianState("Andhra Pradesh")
		.enterGuardianPincode("522001")
		.selectGuardianCountry("INDIA")
		.clickOnCheckMark();
		
		
		
	}

}
