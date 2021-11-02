package pom.panindia.pages;

import pom.indianfrro.pages.IndianfrroRegistrationPage;
import wrappers.GenericWrappers;

public class PanIndiaRegistrationPage extends GenericWrappers {
	public PanIndiaRegistrationPage selectTitile(String title) {
		selectVisibileTextByXpath("//select[@id='pan_title']", title);
		return this;	
	}
	public PanIndiaRegistrationPage enterFirstName(String firstname) {
		enterByXpath("//input[@id='pan_firstname']", firstname);
		return this;	
	}
	public PanIndiaRegistrationPage enterMiddleName(String middlename) {
		enterByXpath("//input[@id='pan_middlename']", middlename);
		return this;	
	}
	public PanIndiaRegistrationPage enterLastName(String lastname) {
		enterByXpath("//input[@id='pan_lastname']", lastname);
		return this;	
	}
	public PanIndiaRegistrationPage enterFatherFirstName(String fatherfirstname) {
		enterByXpath("//input[@id='pan_fatherfirstname']", fatherfirstname);
		return this;	
	}
	public PanIndiaRegistrationPage enterFatherMiddleName(String fathermiddlename) {
		enterByXpath("//input[@id='pan_fathermiddlename']", fathermiddlename);
		return this;	
	}
	public PanIndiaRegistrationPage enterFatherLastName(String fatherlastname) {
		enterByXpath("//input[@id='pan_fatherlastname']", fatherlastname);
		return this;	
	}
	public PanIndiaRegistrationPage enterMobileNumber(String mobilenumber) {
		enterByXpath("//input[@id='pan_mobilenumber']", mobilenumber);
		return this;	
	}
	public PanIndiaRegistrationPage enterEmail(String email) {
		enterByXpath("//input[@id='pan_email']", email);
		return this;	
	}
	public PanIndiaRegistrationPage selectSourceIncome(String sourceincome) {
		selectVisibileTextByXpath("//select[@id='pan_sourceofincome']", sourceincome);
		return this;	
	}
	public PanIndiaRegistrationPage clickOnOffice() {
		clickByXpath("//input[@id='office']");
		return this;	
	}
	public PanIndiaRegistrationPage enterDateOfBirth(String dateofbirth) {
		enterByXpath("//input[@id='pan_dob']", dateofbirth);
		return this;	
	}
	public PanIndiaRegistrationPage enterResidenceHouseNo(String houseno) {
		enterByXpath("//input[@name='pan_addressline1']", houseno);
		return this;	
	}
	public PanIndiaRegistrationPage enterResidenceArea(String area) {
		enterByXpath("//input[@name='pan_addressline2']", area);
		return this;	
	}
	public PanIndiaRegistrationPage enterResidenceCity(String city) {
		enterByXpath("//input[@name='pan_cityname']", city);
		return this;	
	}
	public PanIndiaRegistrationPage selectResidenceState(String state) {
		selectVisibileTextByXpath("//select[@name='pan_state']", state);
		return this;	
	}
	public PanIndiaRegistrationPage enterResidencePincode(String pincode) {
		enterByXpath("//input[@name='pan_pincode']", pincode);
		return this;	
	}
	public PanIndiaRegistrationPage selectResidenceCountry(String country) {
		selectVisibileTextByXpath("//select[@id='pan_country']", country);
		return this;	
	}
	public PanIndiaRegistrationPage enterOfficeName(String officename) {
		enterByXpath("//input[@id='pan_officename']", officename);
		return this;	
	}
	public PanIndiaRegistrationPage enterOfficeHouseNo(String houseno) {
		enterByXpath("//input[@name='pan_officeaddressline1']", houseno);
		return this;	
	}
	public PanIndiaRegistrationPage enterOfficeArea(String area) {
		enterByXpath("//input[@name='pan_officeaddressline2']", area);
		return this;	
	}
	public PanIndiaRegistrationPage enterOfficeCity(String city) {
		enterByXpath("//input[@name='pan_officecityname']", city);
		return this;	
	}
	public PanIndiaRegistrationPage selectOfficeState(String state) {
		selectVisibileTextByXpath("//select[@name='pan_officestate']", state);
		return this;	
	}
	public PanIndiaRegistrationPage enterOfficePincode(String pincode) {
		enterByXpath("//input[@name='pan_officepincode']", pincode);
		return this;	
	}
	public PanIndiaRegistrationPage selectOfficeCountry(String country) {
		selectVisibileTextByXpath("//select[@name='pan_officecountry']", country);
		return this;	
	}
	public PanIndiaRegistrationPage selectIdentityProof(String idproof) {
		selectVisibileTextByXpath("//select[@id='pan_identityproof']", idproof);
		return this;	
	}
	public PanIndiaRegistrationPage selectAddressProof(String aadhaarproof) {
		selectVisibileTextByXpath("//select[@id='pan_addressproof']", aadhaarproof);
		return this;	
	}
	public PanIndiaRegistrationPage selectDobProof(String dobprrof) {
		selectVisibileTextByXpath("//select[@id='pan_DOBproof']", dobprrof);
		return this;	
	}
	public PanIndiaRegistrationPage selectAadhaarProof(String aadhaarproof) {
		selectVisibileTextByXpath("//select[@id='pan_aadhaarproof']", aadhaarproof);
		return this;	
	}
	public PanIndiaRegistrationPage selectGuardianId(String guardianproof) {
		selectVisibileTextByXpath("//select[@id='pan_raproof']", guardianproof);
		return this;	
	}
	public PanIndiaRegistrationPage selectOfficeAddressProof(String officeaddressproof) {
		selectVisibileTextByXpath("//select[@name='pan_officeaddressproof']", officeaddressproof);
		return this;	
	}
	public PanIndiaRegistrationPage selectGuardianTitle(String guardiantitle) {
		selectVisibileTextByXpath("//select[@id='pan_ratitle']", guardiantitle);
		return this;	
	}
	public PanIndiaRegistrationPage enterGuardianFirstName(String firstname) {
		enterByXpath("//input[@id='pan_rafirstname']", firstname);
		return this;	
	}
	public PanIndiaRegistrationPage enterGuardianMiddleName(String middlename) {
		enterByXpath("//input[@id='pan_ramiddlename']", middlename);
		return this;	
	}
	public PanIndiaRegistrationPage enterGuardianLastName(String lastname) {
		enterByXpath("//input[@id='pan_ralastname']", lastname);
		return this;	
	}
	public PanIndiaRegistrationPage enterGuardianHouseNo(String houseno) {
		enterByXpath("//input[@id='pan_raaddressline1']", houseno);
		return this;	
	}
	public PanIndiaRegistrationPage enterGuardianArea(String area) {
		enterByXpath("//input[@id='pan_raaddressline2']", area);
		return this;	
	}
	public PanIndiaRegistrationPage enterGuardianCity(String city) {
		enterByXpath("//input[@id='pan_racityname']", city);
		return this;	
	}
	public PanIndiaRegistrationPage selectGuardianState(String state) {
		selectVisibileTextByXpath("//select[@id='pan_rastate']", state);
		return this;	
	}
	public PanIndiaRegistrationPage enterGuardianPincode(String pincode) {
		enterByXpath("//input[@id='pan_rapincode']", pincode);
		return this;	
	}
	public PanIndiaRegistrationPage selectGuardianCountry(String country) {
		selectVisibileTextByXpath("//select[@id='pan_racountry']", country);
		return this;	
	}
	public PanIndiaRegistrationPage clickOnCheckMark() {
		clickByXpath("//input[@id='pan_source']");
		return this;	
	}
	public PanIndiaRegistrationPage waitForElement(long time) {
  		// TODO Auto-generated method stub
  		waitproperty(time);
  		return null;
  	}
  	public PanIndiaRegistrationPage scrollDown() {
  		pagedown();
  		return this;
  		
  	}
	
}
