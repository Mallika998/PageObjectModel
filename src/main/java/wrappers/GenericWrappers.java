package wrappers;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import pom.irctc.pages.HomePage;
import utils.Reporting;

public class GenericWrappers extends Reporting implements Wrappers{
	   
	public static RemoteWebDriver driver;
	
	public static Properties prop;
	
	public void invokeApp(String browser, String url) {
		// TODO Auto-generated method stub
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				 driver = new ChromeDriver();	
			}else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				 driver = new FirefoxDriver();	
			}else if (browser.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", "./driver/IEDriverServer.exe");
				 driver = new InternetExplorerDriver();
			}
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//System.out.println("The browser "+browser+" is launched with given URL  "+url+" successfully");
			reportStep("The browser "+browser+" is launched with given URL  "+url+" successfully", "Pass");
		} catch (SessionNotCreatedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The browser "+browser+" is not launched due to session not created error");
			reportStep("The browser "+browser+ " is not opened as the session is not created","Fail");
		}catch (InvalidArgumentException e) {
			// TODO: handle exception
			//System.err.println("The browser "+browser+" is not launched due to http/https is not present in URL");
			reportStep("The browser "+browser+" is not launched due to http/https is not present in URL", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The browser "+browser+" is not launched due to unknown error");
			reportStep("The browser "+browser+" is not launched due to unknown error", "Fail");
		}
	}


	public void enterById(String idValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(idValue).sendKeys(data);
			//System.out.println("The element with id "+idValue+" is entered with data "+data);
			reportStep("\"The element with id "+idValue+" is entered with data "+data, "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block	
			//System.err.println("The element with id "+idValue+" is not found in DOM");
			reportStep("The element with id "+idValue+" is not found in DOM", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idValue+" is not visible in the application");
			reportStep("The element with id "+idValue+" is not visible in the application", "Fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idValue+" is not interactable with the data "+data+" in the application");
			reportStep("The element with id "+idValue+" is not interactable with the data "+data+" in the application", "FAil");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idValue+" is not stable in the application");
			reportStep("The element with id "+idValue+" is not stable in the application", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idValue+" is not entered with data "+data+" due to unknown error");
			reportStep("The element with id \"+idValue+\" is not entered with data \"+data+\" due to unknown error", "Fail");
		}
	}

	
	public void loadObjects() {
		
		try {
			 prop = new Properties();
			
			prop.load(new FileInputStream("./src/test/java/object.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void unloadObjects() {
		
		prop=null;
	}
	
	
	public void enterByName(String nameValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(nameValue).sendKeys(data);
			//System.out.println("The element with name "+nameValue+" is entered with data "+data);
			reportStep("The element with name "+nameValue+" is entered with data "+data, "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with name "+nameValue+" is not found in application");
			reportStep("The element with name "+nameValue+" is not found in application", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+nameValue+" is not visible in application");
			reportStep("The element with name "+nameValue+" is not visible in application", "Fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+nameValue+" is not intractable with the data  in the application");
			reportStep("The element with name "+nameValue+" is not interactable with the data  in the application", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+nameValue+" is not stable in the application");
			reportStep("The element with name "+nameValue+" is not stable in the application", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+nameValue+" is not entered with data "+data+" due to unknown error");
			reportStep("The element with name "+nameValue+" is not entered with data "+data+" due to unknown error", "Fail");
		}
			
	}

	public void enterByXpath(String xpathValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathValue).sendKeys(data);
			//System.out.println("The element with xpath "+xpathValue+" is entered with data "+data);
			reportStep("The element with xpath "+xpathValue+" is entered with data "+data, "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpathValue+" is not found in the application");
			reportStep("The element with xpath "+xpathValue+" is not found in the application", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathValue+" is not visible in the application");
			reportStep("The element with xpath "+xpathValue+" is not visible in the application", "Fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathValue+" is not interactable with data in the application");
			reportStep("The element with xpath "+xpathValue+" is not interactable with data in the application", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathValue+" is not stable in the application");
			reportStep("The element with xpath "+xpathValue+" is not stable in the application", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with xpath "+xpathValue+" is not entered with data "+data+" due to unknown error");
			reportStep("The element with xpath "+xpathValue+" is not entered with data "+data+" due to unknown error", "Fail");
		}
		
	}

	public void verifyTitle(String title) {
		// TODO Auto-generated method stub
		try {
			String actualtitle = driver.getTitle();
			if(actualtitle.equals(title)) {
				//System.out.println("The title "+title+" is matched with actual text "+actualtitle);
				reportStep("The title "+title+" is matched with actual text "+actualtitle, "Matched");
			}else {
				//System.out.println("The title "+title+" is not matched with actual text "+actualtitle);
				reportStep("The title "+title+" is not matched with actual text "+actualtitle, "Not Matched");
			}
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The title is  "+title+" not verified with  due to unknown error");	
			reportStep("The title is  "+title+" not verified with  due to unknown error", "Fail");
		}
	}

	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub
		try {
			String idtext = driver.findElementById(id).getText();
			if (idtext.equals(text)) {
				//System.out.println("The text "+text+" is matched with actual text "+idtext);
				reportStep("The text "+text+" is matched with actual text "+idtext, "Matched");
			}else {
				//System.out.println("The text "+text+" is not matched with actual text  "+idtext);
				reportStep("The text "+text+" is not matched with actual text  "+idtext, "Not Matched");
			}	
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+" not found");
			reportStep("The element with id "+id+" not found", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" not visible");
			reportStep("The element with id "+id+" not visible", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" not stable");
			reportStep("The element with id "+id+" not stable", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not verified with "+text+" due to unknown errors");
			reportStep("The element with id "+id+" is not verified with "+text+" due to unknown errors", "Fail");
		}
	}

	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
			String applicationtext = driver.findElementByXPath(xpath).getText();
			if (applicationtext.equals(text)) {
				//System.out.println("The xpathtext is "+applicationtext+" is matched  with actual text "+text);
				reportStep("The xpathtext is "+applicationtext+" is matched  with actual text "+text, "Matched");
			}else {
				//System.out.println("The xpathtext is "+applicationtext+" is not matched with actual text "+text);
				reportStep("The xpathtext is "+applicationtext+" is not matched with actual text "+text, "Not Matched");
			}
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpath+" is not found");
			reportStep("The element with xpath "+xpath+" is not found", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" not visible");
			reportStep("The element with xpath "+xpath+" not visible", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+xpath+" not stable");
			reportStep("The element with id "+xpath+" not stable", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+xpath+" is not verified with "+text+" due to unknown errors");
			reportStep("The element with id "+xpath+" is not verified with "+text+" due to unknown errors", "Fail");
		}
		
	}

	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
			String Xpathtext = driver.findElementByXPath(xpath).getText();
			if (Xpathtext.contains(text)) {
				//System.out.println("The xpathtext is "+xpath+" is matched  with actual text "+text);
				reportStep("The xpathtext is "+xpath+" is matched  with actual text "+text, "Matched");
			}else {
				System.out.println("The xpathtext is "+xpath+" is not matched  with actual text "+text);
				reportStep("The xpathtext is "+xpath+" is not matched  with actual text "+text, "Not Matched");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpath+" is not found");
			reportStep("The element with xpath "+xpath+" is not found", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" not visible");
			reportStep("The element with xpath "+xpath+" not visible", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" not stable");
			reportStep("The element with xpath "+xpath+" not stable", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with xpath "+xpath+" is not verified with "+text+" due to unknown errors");
			reportStep("The element with xpath "+xpath+" is not verified with "+text+" due to unknown errors", "Fail");
		}
		
	}

	public void clickById(String id) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(id).click();
			//System.out.println("The element with id "+id+" is clicked");
			reportStep("The element with id "+id+" is clicked", "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+" is not found");
			reportStep("The element with id "+id+" is not found", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
		//	System.err.println("The element with id "+id+" is not visible");
			reportStep("The element with id "+id+" is not visible", "Fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not clicked due to intercept ");
			reportStep("The element with id "+id+" is not clicked due to intercept ", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not stable");
			reportStep("The element with id "+id+" is not stable", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not clicked due to unknown error ");
			reportStep("The element with id "+id+" is not clicked due to unknown error ", "Fail");
		}
		
	}

	public void clickByClassName(String classVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByClassName(classVal);
			//System.out.println("The element with classname "+classVal+" is clicked");
			reportStep("The element with classname "+classVal+" is clicked", "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with classname "+classVal+" is not found");
			reportStep("The element with classname "+classVal+" is not found", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with classname "+classVal+" is not visible");
			reportStep("The element with classname "+classVal+" is not visible", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
		//	System.err.println("The element with classname "+classVal+" is not stable");
			reportStep("The element with classname "+classVal+" is not stable", "Fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
		//	System.err.println("The element with classname "+classVal+" is not clicked due to click intercept");
			reportStep("The element with classname "+classVal+" is not clicked due to click intercept", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with classname "+classVal+" is not clicked due to unknown error");
			reportStep("The element with classname "+classVal+" is not clicked due to unknown error", "Fail");
		}
		
		
	}

	public void clickByName(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(name).click();
		//	System.out.println("The element with name "+name+" is clicked");
			reportStep("The element with name "+name+" is clicked", "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
		//	System.err.println("The element with name "+name+" is not found");
			reportStep("The element with name "+name+" is not found", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not visible");
			reportStep("The element with name "+name+" is not visible", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not stable");
			reportStep("The element with name "+name+" is not stable", "Fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not clicked due to click intercept");
			reportStep("The element with name "+name+" is not clicked due to click intercept", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not clicked due to unknown error");
			reportStep("The element with name "+name+" is not clicked due to unknown error", "Fail");
		}
	}

	public void clickByLink(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
		//	System.out.println("The element with Link  "+name+" is clicked");
			reportStep("The element with Link  "+name+" is clicked", "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with Link "+name+" is not found");
			reportStep("The element with Link "+name+" is not found", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
		//	System.err.println("The element with Link "+name+" is not visible");
			reportStep("The element with Link "+name+" is not visible", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
		//	System.err.println("The element with Link "+name+" is not stable");
			reportStep("The element with Link "+name+" is not stable", "Fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
		//	System.err.println("The element with Link "+name+" is not clicked due to click intercept");
			reportStep("The element with Link "+name+" is not clicked due to click intercept", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
		//	System.err.println("The element with Link "+name+" is not clicked due to unknown error");
			reportStep("The element with Link "+name+" is not clicked due to unknown error", "Fail");
		}	
		
	}

	public void clickByLinkNoSnap(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			//System.out.println("The element with Link  "+name+" is clicked");
			reportStep("The element with Link  "+name+" is clicked", "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with Link "+name+" is not found");
			reportStep("The element with Link "+name+" is not found", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with Link "+name+" is not visible");
			reportStep("The element with Link "+name+" is not visible", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with Link "+name+" is not stable");
			reportStep("The element with Link "+name+" is not stable", "Fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with Link "+name+" is not clicked due to click intercept");
			reportStep("The element with Link "+name+" is not clicked due to click intercept", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
		//	System.err.println("The element with Link "+name+" is not clicked due to unknown error");
			reportStep("The element with Link "+name+" is not clicked due to unknown error", "Fail");
		}

		
	}

	public void clickByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			//System.out.println("The element with xpath "+xpathVal+" is clicked");
			reportStep("The element with xpath "+xpathVal+" is clicked", "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpathVal+" is not found");
			reportStep("The element with xpath "+xpathVal+" is not found", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not visible");
			reportStep("The element with xpath "+xpathVal+" is not visible", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not stable");
			reportStep("The element with xpath "+xpathVal+" is not stable", "Fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not clicked due to click intercept");
			reportStep("The element with xpath "+xpathVal+" is not clicked due to click intercept", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
		//	System.err.println("The element with xpath "+xpathVal+" is not clicked due to unknown error");
			reportStep("The element with xpath "+xpathVal+" is not clicked due to unknown error", "Fail");
		}	
		
	}

	public void clickByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			//System.out.println("The element with xpath "+xpathVal+" is clicked");
			reportStep("The element with xpath "+xpathVal+" is clicked", "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpathVal+" is not found");
			reportStep("The element with xpath "+xpathVal+" is not found", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not visible");
			reportStep("The element with xpath "+xpathVal+" is not visible", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not stable");
			reportStep("The element with xpath "+xpathVal+" is not stable", "Fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not clicked due to click intercept");
			reportStep("The element with xpath "+xpathVal+" is not clicked due to click intercept", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
		//	System.err.println("The element with xpath "+xpathVal+" is not clicked due to unknown error");
			reportStep("The element with xpath "+xpathVal+" is not clicked due to unknown error", "Fail");
		}
		
	}

	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
		String text = driver.findElementById(idVal).getText();
		try {
			
			//System.out.println("The element with id "+idVal+"  text is  "+text);
			reportStep("The element with id "+idVal+"  text is  "+text, "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+idVal+" is not found");
			reportStep("The element with id "+idVal+" is not found", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idVal+" is not visible");
			reportStep("The element with id "+idVal+" is not visible", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idVal+" is not stable");
			reportStep("The element with id "+idVal+" is not stable", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idVal+"  text  not found due to unknown error");
			reportStep("The element with id "+idVal+"  text  not found due to unknown error", "Fail");
		}
		return text;
	}

	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		String text = driver.findElementByXPath(xpathVal).getText();
		try {
			
			//System.out.println("The element with xpath "+xpathVal+"  text is  "+text);
			reportStep("The element with xpath "+xpathVal+"  text is  "+text, "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpathVal+" is not found");
			reportStep("The element with xpath "+xpathVal+" is not found", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not visible");
			reportStep("The element with xpath "+xpathVal+" is not visible", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not stable");
			reportStep("The element with xpath "+xpathVal+" is not stable", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+"  text  not found due to unknown error");
			reportStep("The element with xpath "+xpathVal+"  text  not found due to unknown error", "Fail");
		}
		return text;
	}

	public void selectVisibileTextById(String id, String value) {
		// TODO Auto-generated method stub
		 try {
			WebElement title = driver.findElementById(id);
			 Select title1 = new Select(title);
			 title1.selectByVisibleText(value);
			// System.out.println("The element with id "+id+"  value "+value+" is selected by visible text");
			 reportStep("The element with id "+id+"  value "+value+" is selected by visible text", "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+" is not found");
			reportStep("The element with id "+id+" is not found", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not visible");
			reportStep("The element with id "+id+" is not visible", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not stable");
			reportStep("The element with id "+id+" is not stable", "Fail");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not selectable");
			reportStep("The element with id "+id+" is not selectable", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+"  value is not selected due to unknown error");
			reportStep("The element with id "+id+"  value is not selected due to unknown error", "Fail");
		}
		
	}

	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub
		try {
			WebElement title = driver.findElementById(id);
			 Select title1 = new Select(title);
			 title1.selectByIndex(value);
			// System.out.println("The element with id "+id+"  value "+value+" is selected by  Index");
			 reportStep("The element with id "+id+"  value "+value+" is selected by  Index", "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+" is not not found");
			reportStep("The element with id "+id+" is not not found", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not visible");
			reportStep("The element with id "+id+" is not visible", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not stable");
			reportStep("The element with id "+id+" is not stable", "Fail");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not selectable");
			reportStep("The element with id "+id+" is not selectable", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+"  value is not selected due to unknown error");
			reportStep("The element with id "+id+"  value is not selected due to unknown error", "Fail");
		}
		
	}

	public void switchToParentWindow() {
		// TODO Auto-generated method stub
		try {
			Set<String> allwindows = driver.getWindowHandles();

			for(String eachId : allwindows) 
			{
				driver.switchTo().window(eachId);		
				break;
			}
			//System.out.println("The window is switched to parent window ");
			reportStep("The window is switched to parent window ", "Pass");
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			//System.err.println("The window is not found");
			reportStep("The window is not found", "Fail");
		}catch (SessionNotCreatedException e) {
			// TODO: handle exception
			//System.err.println("The window's session id is not created");
			reportStep("The window's session id is not created", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The window is not switched to parent window due to unknown error ");
			reportStep("The window is not switched to parent window due to unknown error ", "Fail");
		}
	}

	public void switchToLastWindow() {
		// TODO Auto-generated method stub
		try {
			Set<String> allwindows = driver.getWindowHandles();

			for(String eachId : allwindows) 
			{
				driver.switchTo().window(eachId);	
			}
			//System.out.println("The window is switched to last window ");
			reportStep("The window is switched to last window ", "Pass");
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			//System.err.println("The window is not found");
			reportStep("The window is not found", "Fail");
		}catch (SessionNotCreatedException e) {
			// TODO: handle exception
			//System.err.println("The window's session id is not created");
			reportStep("The window's session id is not created", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The window is not switched to parent window due to unknown error ");
			reportStep("The window is not switched to parent window due to unknown error ", "Fail");
		}
	}

	public void acceptAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().accept();
			//System.out.println("Alert is accepted by switching to alert frame");
			reportStep("Alert is accepted by switching to alert frame", "Pass");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("Alert is not found in application");
			reportStep("Alert is not found in application", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Alert is not accepted due to unknown error");
			reportStep("Alert is not accepted due to unknown error", "Fail");
		}
	}

	public void dismissAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().dismiss();
			//System.out.println("Alert is dismissed  by switching to alert frame");
			reportStep("Alert is dismissed  by switching to alert frame", "Pass");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("Alert is not found in application");
			reportStep("Alert is not found in application", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Alert is not accepted due to unknown error");
			reportStep("Alert is not accepted due to unknown error", "Fail");
		}
	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		String newtext = null;
		try {
			newtext = driver.switchTo().alert().getText();
			//System.out.println("The alert text is  "+newtext);
			reportStep("The alert text is  "+newtext, "Pass");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("Alert is not found in application");
			reportStep("Alert is not found in application", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Alert text is not getted due to unknown error");
			reportStep("Alert text is not getted due to unknown error", "Fail");
		}
		return newtext;
	}

	public long takeSnap() {
		// TODO Auto-generated method stub
	
		long number = 0;
		
		try {
			
			number= (long) (Math.floor(Math.random()*100000000)+100000);
			
			File tmp = driver.getScreenshotAs(OutputType.FILE);
			File dest = new File("./reports/screenshots/"+number+".png");
			FileUtils.copyFile(tmp, dest);
			//System.out.println("Screenshot is taken successfully");
			//reportStep("Screenshot is taken successfully", "Pass");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.out.println("Screenshot is not  taken due to unknown error");
			//reportStep("Screenshot is not  taken due to unknown error", "Fail");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
		
		}
		
		return number;
	}

	public void closeBrowser() {
		// TODO Auto-generated method stub
		try {
			driver.close();
			//System.out.println("The Browser is closed");
			reportStep("The Browser is closed", "Pass", false);
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.out.println("Browser not closed due to unknown error");
			reportStep("Browser not closed due to unknown error", "Fail", false);
		}
		
	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		try {
			driver.quit();
			//System.out.println("All Browser is closed");
			reportStep("All Browser is closed", "Pass", false);
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.out.println("Browser not closed due to unknown error");
			reportStep("Browser not closed due to unknown error", "Fail", false);
		}
		
	}

	public void waitproperty(long time) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(time);
			//System.out.println("waited for "+time+" milli seconds");
			reportStep("waited for "+time+" milli seconds", "Pass");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//System.err.println("Doesn't waited due to interrupted error");
			reportStep("Not  waited due to interrupted error", "Fail");
			
		}catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("Not  waited due to unknown error");
			reportStep("Not  waited due to unknown error", "Fail");
		}
		
	}

	public void selectVisibileTextByXpath(String xpath, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement title = driver.findElementByXPath(xpath);
			 Select title1 = new Select(title);
			 title1.selectByVisibleText(value);
			// System.out.println("The element with xpath "+xpath+"  value "+value+" is selected by visible text");
			 reportStep("The element with xpath "+xpath+"  value "+value+" is selected by visible text", "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpath+" is not found");
			reportStep("The element with xpath "+xpath+" is not found", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not visible");
			reportStep("The element with xpath "+xpath+" is not visible", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
		//	System.err.println("The element with xpath "+xpath+" is not stable");
			reportStep("The element with xpath "+xpath+" is not stable", "Fail");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			// System.err.println("The element with xpath "+xpath+" is not selectable");
			reportStep("The element with xpath "+xpath+" is not selectable", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+"  value is not selected due to unknown error");
			reportStep("The element with xpath "+xpath+"  value is not selected due to unknown error", "Fail");
		}
		
		
	}

	public void selectIndexByXpath(String xpath, int value) {
		// TODO Auto-generated method stub
		try {
			WebElement title = driver.findElementByXPath(xpath);
			 Select title1 = new Select(title);
			 title1.selectByIndex(value);
			// System.out.println("The element with xpath "+xpath+"  value "+value+" is selected by  Index");
			 reportStep("The element with xpath "+xpath+"  value "+value+" is selected by  Index", "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpath+" is not found");
			reportStep("The element with xpath "+xpath+" is not found", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
		//	System.err.println("The element with xpath "+xpath+" is not visible");
			reportStep("The element with xpath "+xpath+" is not visible", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not stable");
			reportStep("The element with xpath "+xpath+" is not stable", "Fail");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not selectable");
			reportStep("The element with xpath "+xpath+" is not selectable", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
		//	System.err.println("The element with xpath "+xpath+"  value is not selected due to unknown error");
			reportStep("The element with xpath "+xpath+"  value is not selected due to unknown error", "Fail");
		}
	}


	public void selectValueByXpath(String xpath, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement title = driver.findElementByXPath(xpath);
			 Select title1 = new Select(title);
			 title1.selectByValue(value);
			// System.out.println("The element with xpath "+xpath+"  value "+value+" is selected by value");
			 reportStep("The element with xpath "+xpath+"  value "+value+" is selected by value", "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpath+" is not found");
			reportStep("The element with xpath "+xpath+" is not found", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not visible");
			reportStep("The element with xpath "+xpath+" is not visible", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
		//	System.err.println("The element with xpath "+xpath+" is not stable");
			reportStep("The element with xpath "+xpath+" is not stable", "Fail");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not selectable");
			reportStep("The element with xpath "+xpath+" is not selectable", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
		//	System.err.println("The element with xpath "+xpath+"  value is not selected due to unknown error");
			reportStep("The element with xpath "+xpath+"  value is not selected due to unknown error", "Fail");
		}
		
	}

	public void clickByLinkText(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
		//	System.out.println("The element with linktext "+name+" is clicked");
			reportStep("The element with linktext "+name+" is clicked", "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with linktext "+name+" is not found");
			reportStep("The element with linktext "+name+" is not found", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with linktext "+name+" is not visible");
			reportStep("The element with linktext "+name+" is not visible", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with linktext "+name+" is not stable");
			reportStep("The element with linktext "+name+" is not stable", "Fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with linktext "+name+" is not clicked due to click intercept");
			reportStep("The element with linktext "+name+" is not clicked due to click intercept", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
		//	System.err.println("The element with linktext "+name+" is not clicked due to unknown error");
			reportStep("The element with linktext "+name+" is not clicked due to unknown error", "Fail");
		}
		
	}

	public void pagedown() {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
			//System.out.println("The page scrolled down");
			reportStep("The page scrolled down", "Pass");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The page doesn't scrolled down due to unknown error");
			reportStep("The page doesn't scrolled down due to unknown error", "Fail");
			
		}
		
	}

	public HomePage mousehoverbyxpath(String xpath) {
		// TODO Auto-generated method stub
		Actions action = new Actions(driver);
		WebElement sh =  driver.findElementByXPath(xpath);
		action.moveToElement(sh).perform();
		return  new HomePage();

	}


	
	
}