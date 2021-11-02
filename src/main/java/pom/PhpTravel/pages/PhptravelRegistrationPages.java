package pom.PhpTravel.pages;

import wrappers.GenericWrappers;

public class PhptravelRegistrationPages extends GenericWrappers {
	public PhptravelRegistrationPages enterFirstName(String firstname) {
		enterByXpath("//input[@id='inputFirstName']", firstname);
		return this;	
	}
	public PhptravelRegistrationPages enterLastName(String lastname) {
		enterByXpath("//input[@id='inputLastName']", lastname);
		return this;	
	}
	public PhptravelRegistrationPages enteremail(String email) {
		enterByXpath("//input[@id='inputEmail']", email);
		return this;	
	}
	public PhptravelRegistrationPages enterPhone(String phone) {
		enterByXpath("//input[@id='inputPhone']", phone);
		return this;	
	}
	public PhptravelRegistrationPages enterCompanyName(String companyname) {
		enterByXpath("//input[@id='inputCompanyName']", companyname);
		return this;	
	}
	public PhptravelRegistrationPages enterStreetAddress(String streetaddress) {
		enterByXpath("//input[@id='inputAddress1']", streetaddress);
		return this;	
	}
	public PhptravelRegistrationPages enterStreetAddress2(String streetaddress) {
		enterByXpath("//input[@id='inputAddress2']", streetaddress);
		return this;	
	}
	public PhptravelRegistrationPages enterCity(String city) {
		enterByXpath("//input[@id='inputCity']", city);
		return this;	
	}
	public PhptravelRegistrationPages enterState(String state) {
		enterByXpath("//input[@id='stateinput']", state);
		return this;	
	}
	public PhptravelRegistrationPages enterPincode(String pincode) {
		enterByXpath("//input[@id='inputPostcode']", pincode);
		return this;	
	}
	public PhptravelRegistrationPages selectCountry(String country) {
		selectVisibileTextByXpath("//select[@id='inputCountry']", country);
		return this;	
	}
	public PhptravelRegistrationPages enterMobileNumber(String mobile) {
		enterByXpath("//input[@id='customfield2']", mobile);
		return this;	
	}
	public PhptravelRegistrationPages enterPassword(String password) {
		enterByXpath("//input[@id='inputNewPassword1']", password);
		return this;	
	}
	public PhptravelRegistrationPages enterConfirmPassword(String confirmpassword) {
		enterByXpath("//input[@id='inputNewPassword2']", confirmpassword);
		return this;	
	}
	
	

}
