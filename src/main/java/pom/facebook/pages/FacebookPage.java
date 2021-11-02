package pom.facebook.pages;

import wrappers.GenericWrappers;

public class FacebookPage extends GenericWrappers{
	public FacebookCreateAccountPage clickOnCreate() {
		clickByXpath(prop.getProperty("FacebookPage.CreateAnAccount.XPath"));
		return new FacebookCreateAccountPage();
	}

}
