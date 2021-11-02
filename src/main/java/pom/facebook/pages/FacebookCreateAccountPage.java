package pom.facebook.pages;

import wrappers.GenericWrappers;

public class FacebookCreateAccountPage  extends GenericWrappers{
	
    public FacebookCreateAccountPage enterFirstName(String firstname) {
	enterByXpath(prop.getProperty("FacebookCreateAccountPage.FirstName.XPath"), firstname);
	return this;
     }
    public FacebookCreateAccountPage enterLastName(String lastname) {
    	enterByXpath(prop.getProperty("FacebookCreateAccountPage.LastName.XPath"), lastname);
    return this;
     }
    public FacebookCreateAccountPage enterMobileNumber(String number) {
    	enterByXpath(prop.getProperty("FacebookCreateAccountPage.MobileNumber.Xpath"), number);
    return this;
     }
    public FacebookCreateAccountPage enterPassword(String password) {
    	enterByXpath(prop.getProperty("FacebookCreateAccountPage.Password.Xpath"), password);
    return this;
     }
    public FacebookCreateAccountPage selectDay(String day) {
    	selectVisibileTextByXpath(prop.getProperty("FacebookCreateAccountPage.Day.Xpath"), day);
    return this;
     }
    public FacebookCreateAccountPage selectMonth(String month) {
    	selectVisibileTextByXpath(prop.getProperty("FacebookCreateAccountPage.Month.Xpath"), month);
    return this;
     }
    public FacebookCreateAccountPage selectYear(String year) {
    	selectVisibileTextByXpath(prop.getProperty("FacebookCreateAccountPage.Year.Xpath"), year);
    return this;
     }
    public FacebookCreateAccountPage clickOnGender() {
    	clickByXpath(prop.getProperty("FacebookCreateAccountPage.Gender.Xpath"));
    return this;
     }
}
