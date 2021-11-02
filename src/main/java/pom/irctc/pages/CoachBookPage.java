package pom.irctc.pages;

import wrappers.GenericWrappers;

public class CoachBookPage  extends  GenericWrappers{
	public CoachBookPage  switchToLoginWindow() {
		switchToLastWindow();
		return this;
	}
	public CoachBookPage clickOnSignUp() {
		clickByXpath("//a[text()='New User? Signup']");
		return this;
	}
	public CoachBookPage enterUserId(String userid) {
		enterByXpath("//input[@id='userId']", userid);
		return this;
	}
	public CoachBookPage enterPassword(String password) {
		enterByXpath("//input[@id='password']", password);
		return this;
	}
	public CoachBookPage enterConfirmPassword(String cnfpassword) {
		enterByXpath("//input[@id='cnfPassword']", cnfpassword);
		return this;
	}
	public CoachBookPage selectSecurityQuestion(String secquestion) {
		selectVisibileTextByXpath("//select[@id='secQstn']", secquestion);
		return this;
	}
	public CoachBookPage enterSecurityAnswer(String secanswer) {
		enterByXpath("//input[@id='secAnswer']", secanswer);
		return this;
	}
	public CoachBookPage clickOnDateOfBirth() {
		clickByXpath("//input[@id='dateOfBirth']");
		return this;
	}
	public CoachBookPage selectMonth(String month) {
		selectVisibileTextByXpath("//select[@class='ui-datepicker-month']", month);
		return this;
	}
	public CoachBookPage selectYear(String Year) {
		selectVisibileTextByXpath("//select[@class='ui-datepicker-year']", Year);
		return this;
	}
	public CoachBookPage selectDay() {
		clickByXpath("//a[text()='12']");
		return this;
	}
	public CoachBookPage clickOnGender() {
		clickByXpath("//label[text()='Female']");
		return this;
	}
	public CoachBookPage clickOnMaritalStatus() {
		clickByXpath("//label[text()='UnMarried']");
		return this;
	}
	public CoachBookPage enterEmail(String email) {
		enterByXpath("//input[@id='email']", email);
		return this;
	}
	public CoachBookPage selectOccupation(String occupation) {
		selectVisibileTextByXpath("//select[@id='occupation']", occupation);
		return this;
	}
	public CoachBookPage enterFirstName(String firstname) {
		enterByXpath("//input[@id='fname']", firstname);
		return this;
	}
	public CoachBookPage enterMiddleName(String middlename) {
		enterByXpath("//input[@id='mname']", middlename);
		return this;
	}
	public CoachBookPage enterLastName(String lastname) {
		enterByXpath("//input[@id='lname']", lastname);
		return this;
	}
	public CoachBookPage selectNationality(String nationality) {
		selectVisibileTextByXpath("//select[@id='natinality']", nationality);
		return this;
	}
	
	public CoachBookPage enterFlatNumber(String flatno) {
		enterByXpath("//input[@id='flatNo']", flatno);
		return this;
	}
	public CoachBookPage enterStreet(String street) {
		enterByXpath("//input[@id='street']", street);
		return this;
	}
	public CoachBookPage enterArea(String area) {
		enterByXpath("//input[@id='area']", area);
		return this;
	}
	public CoachBookPage selectCountry(String Country) {
		selectVisibileTextByXpath("//select[@id='country']", Country);
		return this;
	}
	public CoachBookPage enterMobileNumber(String mobilenumber) {
		enterByXpath("//input[@id='mobile']", mobilenumber);
		return this;
	}
	public CoachBookPage enterPincode(String pincode) {
		enterByXpath("//input[@id='pincode']", pincode);
		return this;
	}
	public CoachBookPage selectCity(String City) {
		selectVisibileTextByXpath("//select[@id='city']", City);
		return this;
	}
	public CoachBookPage selectState(String state) {
		selectVisibileTextByXpath("//select[@id='state']", state);
		return this;
	}
	public CoachBookPage selectPostOffice(String postoffice) {
		selectVisibileTextByXpath("//select[@id='postOffice']", postoffice);
		return this;
	}
	public CoachBookPage clickOnNo() {
		clickByXpath("//input[@id='sameAddresses1']");
		return this;
	}
	public CoachBookPage enterOfficeFlatNumber(String offflatno) {
		enterByXpath("//input[@id='flatNoOffice']", offflatno);
		return this;
	}
	public CoachBookPage enterOfficeStreet(String offstreet) {
		enterByXpath("//input[@id='streetOffice']", offstreet);
		return this;
	}
	public CoachBookPage enterOfficeArea(String offarea) {
		enterByXpath("//input[@id='areaOffice']", offarea);
		return this;
	}
	public CoachBookPage selectOfficeCountry(String offCountry) {
		selectVisibileTextByXpath("//select[@id='countryOffice']", offCountry);
		return this;
	}
	public CoachBookPage enterOfficeMobileNumber(String offmobilenumber) {
		enterByXpath("//input[@id='mobileOffice']", offmobilenumber);
		return this;
	}
	public CoachBookPage enterOfficePincode(String offpincode) {
		enterByXpath("//input[@id='pincodeOffice']", offpincode);
		return this;
	}
	public CoachBookPage selectOfficeCity(String offCity) {
		selectVisibileTextByXpath("//input[@id='cityOffice']", offCity);
		return this;
	}
	public CoachBookPage selectOfficeState(String offstate) {
		selectVisibileTextByXpath("//input[@id='stateOffice']", offstate);
		return this;
	}
	public CoachBookPage selectOfficePostOffice(String offpostoffice) {
		selectVisibileTextByXpath("//select[@id='postOfficeOffice']", offpostoffice);
		return this;
	}
	public CoachBookPage waitForElement(long time) {
		// TODO Auto-generated method stub
		waitproperty(time);
		return this;
	}
	public CoachBookPage scrollDown() {
		// TODO Auto-generated method stub
		pagedown();
		return this;
	}
	
	
}
