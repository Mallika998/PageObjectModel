package pom.indianfrro.pages;

import wrappers.GenericWrappers;

public class IndianfrroRegistrationPage extends GenericWrappers{
     public IndianfrroRegistrationPage enterUserName(String name) {
		enterByXpath("//input[@id='u_id']", name);
		return this;
	}
     public IndianfrroRegistrationPage enterPassword(String password) {
 		enterByXpath("//input[@id='u_pwd']", password);
 		return this;
 	}
     public IndianfrroRegistrationPage enterConfirmPassword(String confirmpassword) {
  		enterByXpath("//input[@id='u_repwd']", confirmpassword);
  		return this;
  	}
     public IndianfrroRegistrationPage selectSecurityQuestion(String secquestion) {
   		selectVisibileTextByXpath("//select[@id='u_secques']", secquestion);
   		return this;
   	}
     public IndianfrroRegistrationPage enterSecurityAnswer(String secanswer) {
    	 enterByXpath("//input[@id='u_secans']", secanswer);
        return this;
    }
     public IndianfrroRegistrationPage enterName(String name) {
 		enterByXpath("//input[@id='u_name']", name);
 		return this;
 	} 
     public IndianfrroRegistrationPage selectGender(String gender) {
    		selectVisibileTextByXpath("//select[@id='u_gender']", gender);
    	return this;
    }
     public IndianfrroRegistrationPage enterDateOfBirth(String dateofbirth) {
  		enterByXpath("//input[@id='u_dob']", dateofbirth);
  		return this;
  	} 
     public IndianfrroRegistrationPage enterDesignation(String designation) {
   		enterByXpath("//input[@id='u_designation']", designation);
   		return this;
   	} 
     public IndianfrroRegistrationPage enterEmail(String email) {
    		enterByXpath("//input[@id='u_emailid']", email);
    	return this;
    } 
     public IndianfrroRegistrationPage enterMobile(String mobile) {
 		enterByXpath("//input[@id='u_mobile']", mobile);
 		return this;
    }
     public IndianfrroRegistrationPage enterPhoneNumber(String phone) {
 		enterByXpath("//input[@id='u_phone']", phone);
 		return this;
    }
     public IndianfrroRegistrationPage selectNationality() {
 		clickByXpath("//option[text()='INDIA']");
 	return this;
    }
     public IndianfrroRegistrationPage enterGuestName(String name) {
  		enterByXpath("//input[@id='name']", name);
  		return this;
    }
     public IndianfrroRegistrationPage enterCapacity(String capacity) {
   		enterByXpath("//input[@id='capacity']", capacity);
   		return this;
    }
     public IndianfrroRegistrationPage enterAddress(String address) {
    	enterByXpath("//textarea[@id='address']", address);
    	return this;
    }
     public IndianfrroRegistrationPage selectState(String state) {
 		selectVisibileTextByXpath("//select[@id='state']", state);
 	    return this;
    }  
     public IndianfrroRegistrationPage selectCity(String city) {
  		selectVisibileTextByXpath("//select[@name='city_distr']", city);
  	    return this;
    }
     public IndianfrroRegistrationPage selectFrroData(String frrodata) {
   		selectVisibileTextByXpath("//select[@id='frrodata']", frrodata);
   	    return this;
     }
     public IndianfrroRegistrationPage selectAccomodationType(String accomodationtype) {
   		selectVisibileTextByXpath("//select[@id='acco_type']", accomodationtype);
   	    return this;
     }
     public IndianfrroRegistrationPage selectAccomodationGrade(String accomodationgrade) {
   		selectVisibileTextByXpath("//select[@id='star_rat']", accomodationgrade);
   	    return this;
     }
     public IndianfrroRegistrationPage enterGuestEmail(String guestemail) {
     	enterByXpath("//input[@id='email']", guestemail);
     	return this;
     }
     public IndianfrroRegistrationPage enterGuestmobile(String guestmobile) {
      	enterByXpath("//input[@id='mcontact']", guestmobile);
      	return this;
      } 
     public IndianfrroRegistrationPage enterGuestPhoneNumber(String guestphone) {
       	enterByXpath("//input[@id='contact']", guestphone);
       	return this;
      } 
     public IndianfrroRegistrationPage enterPassengerName(String passengername) {
        enterByXpath("//input[@name='name_o']", passengername);
        return this;
       } 
     public IndianfrroRegistrationPage enterPassengerAddress(String passengeraddress) {
        enterByXpath("//input[@name='address_o']", passengeraddress);
        return this;
       }
     public IndianfrroRegistrationPage selecPassengerstate(String passengerstate) {
    		selectVisibileTextByXpath("//select[@name='state_o']", passengerstate);
    	return this;
       }
     public IndianfrroRegistrationPage selecPassengercity(String passengercity) {
 		selectVisibileTextByXpath("//select[@id='citydistr_o']", passengercity);
 	    return this;
       }
     public IndianfrroRegistrationPage enterPassengerEmail(String passengeremail) {
      	enterByXpath("//input[@name='emailid_o']", passengeremail);
      	return this;
      }
      public IndianfrroRegistrationPage enterPassengermobile(String passengermobile) {
       	enterByXpath("//input[@name='mobile_o']", passengermobile);
       	return this;
       } 
      public IndianfrroRegistrationPage enterPassengerPhoneNumber(String passengerphone) {
        	enterByXpath("//input[@name='phoneno_o']", passengerphone);
        return this;
       } 
      public IndianfrroRegistrationPage clickOnAdd() {
  		clickByXpath("//input[@name='add']");
  		return new IndianfrroRegistrationPage();
  	}
      public IndianfrroRegistrationPage waitForElement(long time) {
  		// TODO Auto-generated method stub
  		waitproperty(time);
  		return this;
  	}
  	public IndianfrroRegistrationPage scrollDown() {
  		pagedown();
  		return this;
  		
  	}
     
     
     
}
