package wrappers;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class ProjectWrappers extends GenericWrappers {
	
	public String browserName;
	public String appName;
	
	@BeforeSuite
	public void beforeSuite() {
		startReport();
	}
	@BeforeTest
	public void beforeTest() {
		loadObjects();
	}
	
	@BeforeMethod
	public void beforeMethod() {
		startTest(testCaseName, testCaseDescription);
		switch (appName) {
		case "facebook":
			invokeApp(browserName, "https://en-gb.facebook.com");
			break;
		case "irctctest":
			invokeApp(browserName, "https://www.irctc.co.in/nget/train-search");
			break;
			case "indianfrro":
			invokeApp(browserName, "https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp");
			break;
			case "onlineusvisa":
				invokeApp(browserName, "https://www.onlineusvisa.com/basic-details/in?origin=home&country=in&type=N#");
				break;
			case "panindia":
				invokeApp(browserName, "https://panind.com/india/new_pan/");
				break;
			case "phptravel":
				invokeApp(browserName, "https://www.phptravels.org/register.php");
				break;

		default:
			break;
		}
		
	}
	@AfterMethod
	public void afterMethod() {
		closeAllBrowsers();
		
	}
	@AfterClass
	public void afterClass() {
		endTest();
	}
	@AfterTest
	public void afterTest() {
		unloadObjects();
	}
	@AfterSuite
	public void afterSuite() {
		endReport();
	}
	

}
