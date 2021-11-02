package pom.irctc.pages;

import wrappers.GenericWrappers;

public class RegistrationPage extends GenericWrappers{
	
	public RegistrationPage enterUserName(String username) {
		enterByXpath("//input[@id='userName']", username);
		return this;
		}
	public RegistrationPage enterPassword(String password) {
		enterByXpath("//input[@id='usrPwd']", password);
		return this;
	}
	public RegistrationPage enterConfirmPassword(String confirmpassword) {
		enterByXpath("//input[@id='cnfUsrPwd']", confirmpassword);
		return this;
	}
	public RegistrationPage  clickOnLanguage() {
		clickByXpath("//span[text()='Preferred Language']");
		return this;
	}
    public RegistrationPage clickOnEng(String option) {
		clickByXpath("//li[@aria-label='"+option+"']");
		return this;
	}
	public RegistrationPage clickOnSecurityQuestion() {
		clickByXpath("//span[text()='Security Question']");
		return this;
	}
    public RegistrationPage clickOnQstpet(String secquestion) {
		clickByXpath("//li[@aria-label='"+secquestion+"']");	
		return this;
	}
	
	public RegistrationPage enterSecurityAnswer (String secanswer) {
		enterByXpath("//input[@placeholder='Security Answer']", secanswer);
		return this;
	}
	public RegistrationPage clickOnContinue() {
		clickByXpath("//button[@label='Continue']");
		return this;
	}
	public RegistrationPage enterFirstName(String firstname) {
		enterByXpath("//input[@id='firstName']", firstname);
		return this;
	}
	public RegistrationPage enterMiddleName(String middlename) {
		enterByXpath("//input[@id='middleName']", middlename);
		return this;
	}
	public RegistrationPage enterLastName(String lastname) {
		enterByXpath("//input[@id='lastname']", lastname);
		return this;
	}
	public RegistrationPage clickOnOccupation() {
		clickByXpath("//span[text()='Select Occupation']");
		return this;
		
	}
	public RegistrationPage clickOccupationAS() {
		clickByXpath("//span[text()='PROFESSIONAL']");
		return this;
	}
	public  RegistrationPage clickOnDateOfBirth() {
		clickByXpath("//input[@placeholder='Date Of Birth']");
		return this;
	}
	public  RegistrationPage clickOnMonth() {
		clickByXpath("//input[@placeholder='Date Of Birth']");
		return this;
	}
	public RegistrationPage selectMonth(String month) {
		selectVisibileTextByXpath("//select[@tabindex='0'][1]", month);
		return this;
	}
	public RegistrationPage selectYear(String year) {
		selectVisibileTextByXpath("//select[@tabindex='0'][2]", year);
		return this;
	}
	public RegistrationPage selectDay(String day) {
		clickByXpath("//a[text()='"+day+"']");
		return this;
	}
	public RegistrationPage clickOnUnmarried() {
		clickByXpath("//p-radiobutton[@id='unmarried']");
		return this;
	}
	public RegistrationPage selectCountry(String country) {
		selectVisibileTextByXpath("//select[@class='form-control ng-untouched ng-pristine ng-valid']", country);
		return this;
	}
	public RegistrationPage clickOnGender() {
		clickByXpath("//span[text()='Female']");
		return this;
	}
	public RegistrationPage enterEmail(String email) {
		enterByXpath("//input[@id='email']", email);
		return this;
		}
	public RegistrationPage enterMobileNumber(String number) {
		enterByXpath("//input[@id='mobile']", number);
		return this;
		}
	public RegistrationPage selectNationality(String nationality) {
		selectVisibileTextByXpath("//select[@formcontrolname='nationality']", nationality);
		return this;
	}
	public RegistrationPage clickOnContinue1() {
		clickByXpath("//button[@label='Continue']");
		return this;
	}
	public RegistrationPage enterResFlatNumber(String resflatno) {
		enterByXpath("//input[@id='resAddress1']", resflatno);
		return this;
		}
	public RegistrationPage enterResStreet(String resstreet) {
		enterByXpath("//input[@id='resAddress2']", resstreet);
		return this;
		}
	public RegistrationPage enterResArea(String resarea) {
		enterByXpath("//input[@id='resAddress3']", resarea);
		return this;
		}
	public RegistrationPage enterResPincode(String respincode) {
		enterByXpath("//input[@formcontrolname='resPinCode']", respincode);
		return this;
		}
	public RegistrationPage enterResState(String resstate) {
		enterByXpath("//input[@formcontrolname='resState']", resstate);
		return this;
		}
	public RegistrationPage selectResCity(String rescity) {
		enterByXpath("//select[@formcontrolname='resCity']", rescity);
		return this;
		}
	public RegistrationPage selectResPostOffice(String respostoffice) {
		enterByXpath("//select[@formcontrolname='resPostOff']", respostoffice);
		return this;
		}
	public RegistrationPage enterResPhone(String resphone) {
		enterByXpath("//input[@id='resPhone']", resphone);
		return this;
		}
	public RegistrationPage clickOnNo() {
		clickByXpath("//label[text()='No']");
		return this;
	}
	public RegistrationPage enterOffFlatNumber(String offflatno) {
		enterByXpath("//input[@id='offAddress1']", offflatno);
		return this;
		}
	public RegistrationPage enterOffStreet(String offstreet) {
		enterByXpath("//input[@id='offAddress2']", offstreet);
		return this;
		}
	public RegistrationPage enterOffArea(String Offarea) {
		enterByXpath("//input[@id='offAddress3']", Offarea);
		return this;
		}
	public RegistrationPage clickOnCountry() {
		clickByXpath("//span[text()='Select a Country']");
		return this;
	}
	public RegistrationPage clickOnIndia() {
		clickByXpath("//li[@aria-label='India']");
		return this;
	}
	public RegistrationPage enterOffPincode(String offpincode) {
		enterByXpath("//input[@id='offPinCode']", offpincode);
		return this;
		}
	public RegistrationPage enterOffState(String offstate) {
		enterByXpath("//input[@formcontrolname='offState']", offstate);
		return this;
		}
	public RegistrationPage enterOffCity(String offcity) {
		enterByXpath("//input[@id='offCity']", offcity);
		return this;
		}
	public RegistrationPage enterOffPostOffice(String offpostoffice) {
		enterByXpath("//input[@id='offPostOff']", offpostoffice);
		return this;
		}
	public RegistrationPage enterOffPhone(String offphone) {
		enterByXpath("//input[@formcontrolname='offPhone']", offphone);
		return this;
		}
	public RegistrationPage clickOnCondition() {
		clickByXpath("//input[@formcontrolname='termCondition']");
		return this;
        }
	public RegistrationPage waitForElement(long time) {
		// TODO Auto-generated method stub
		waitproperty(time);
		return null;
	}
	public RegistrationPage scrollDown() {
		pagedown();
		return this;
		
	}
	
	
}
