package cucumbermap;

import java.util.Hashtable;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperationObj1;

public class Login {
	
	@When ("^User open \"(.*)\" browser with exe as$")
	public void bLaunch(String bName, String exe) throws Throwable {
		Object [] input = new Object[1];
		input[0]=bName;
		//input[1]=exe;
		SeleniumOperationObj1.OpenBrowser(input);

	    
	}

	@When("^user enter URL as$")
	public void user_enter_URL_as(String url) throws Throwable {
		//Object[] input1 = new Object[1];
		//input1[0]=url;
		 SeleniumOperationObj1.oppenApplication();			    
	}

	@When("^user cancel initial Login window$")
	public void user_cancel_initial_Login_window() throws Throwable {
		Object []input2= new Object[1];
		input2[0]="//*[@class='_2KpZ6l _2doB4z']";	
		 SeleniumOperationObj1.clickOnElement(input2);
	}

	@When("^user navigate on Login button$")
	public void user_navigate_on_Login_button() throws Throwable {
		//Mouse Action
		Object []input3= new Object[1];
		input3[0]="//*[text()='Login']";
		Hashtable<String,Object> output3 = SeleniumOperationObj1.mouseOver(input3);
		HTMLReportGenerator.StepDetails(output3.get("STATUS").toString(), "^user navigate on Login button$", output3.get("MESSAGE").toString());

	    
	}

	@When("^user click on MyProfile$")
	public void user_click_on_MyProfile() throws Throwable {
		//Click on my profile
		Object []input4= new Object[1];
		input4[0]="//*[text()='My Profile']";	
		Hashtable<String,Object> output4 = SeleniumOperationObj1.clickOnElement(input4);	
		HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(), "^user click on MyProfile$", output4.get("MESSAGE").toString());

	}

	@When("^user enter \"([^\"]*)\" as username$")
	public void user_enter_as_username(String uName) throws Throwable {
		//Enter username
		Object []input5= new Object[2];
		input5[0]="//*[@class='_2IX_2- VJZDxU']";
		input5[1]=uName;	
		Hashtable<String,Object> output5 = SeleniumOperationObj1.sendKey(input5);	
		HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(), "^user enter \\\"([^\\\"]*)\\\" as username$", output5.get("MESSAGE").toString());

	}

	@When("^user enter \"([^\"]*)\" as password$")
	public void user_enter_as_password(String pwd) throws Throwable {
		//Enter password
		Object []input6= new Object[2];
		input6[0]="//*[@class='_2IX_2- _3mctLh VJZDxU']";
		input6[1]=pwd;	
		Hashtable<String,Object> output6 = SeleniumOperationObj1.sendKey(input6);
		HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(), "^user enter \\\"([^\\\"]*)\\\" as password$", output6.get("MESSAGE").toString());

	    
	}

	@When("^user click on Login button$")
	public void user_click_on_Login_button() throws Throwable {
		//click on login
		Object []input7= new Object[1];
		input7[0]="//*[@class='_2KpZ6l _2HKlqd _3AWRsL']";	
		Hashtable<String,Object> output7 = SeleniumOperationObj1.clickOnElement(input7);
		HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(), "^user click on Login button$", output7.get("MESSAGE").toString());
		Thread.sleep(5000);

	}

	@Then("^Application shows user profile to user$")
	public void application_shows_user_profile_to_user() throws Throwable {
		//click on manage Address
		Thread.sleep(5000);
		Object []input8= new Object[2];
		input8[0]="//*[text()='Hello']";	
		input8[1]="Hello";	
		Hashtable<String,Object> output8=SeleniumOperationObj1.validation(input8);
		HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(), "^Application shows user profile to user$", output8.get("MESSAGE").toString());

	    
	}
	@Then ("^Application shows appropraite error message$")
	public void inValid() throws InterruptedException{
		//click on manage Address
		Thread.sleep(5000);
		Object []input9= new Object[2];
		input9[0]="(//*[text()='Login'])[2]";	
		input9[1]="Login";	
		Hashtable<String,Object> output9=SeleniumOperationObj1.validationForInvalid(input9);
		HTMLReportGenerator.StepDetails(output9.get("STATUS").toString(), "^Application shows appropraite error message$", output9.get("MESSAGE").toString());

	}
	
	@Then ("browser close")
	public void bclose() throws InterruptedException{
		Thread.sleep(5000);
		 SeleniumOperationObj1.browserClose();
	}
	
	@When ("^user enters (.+) as username$")
	public void unameP(String given) {
		//Enter username
		Object []input10= new Object[2];
		input10[0]="//*[@class='_2IX_2- VJZDxU']";
		input10[1]=given;	
		Hashtable<String,Object> output10=SeleniumOperationObj1.sendKey(input10);
		HTMLReportGenerator.StepDetails(output10.get("STATUS").toString(), "^user enters (.+) as username$", output10.get("MESSAGE").toString());

	}
	
	@When ("^user enters (.+) as password$")
	public void pass(String given) {
		//Enter password
		Object []input11= new Object[2];
		input11[0]="//*[@class='_2IX_2- _3mctLh VJZDxU']";
		input11[1]=given;	
		Hashtable<String,Object> output11=SeleniumOperationObj1.sendKey(input11);
		HTMLReportGenerator.StepDetails(output11.get("STATUS").toString(), "^user enters (.+) as password$", output11.get("MESSAGE").toString());

	}




}
