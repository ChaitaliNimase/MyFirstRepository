package utility;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumbermap.ConfigReader;

public class SeleniumOperationObj1 {
		
	public static ConfigReader config;
	public static WebDriver driver=null;
	public static Hashtable<String,Object> outputParameters = new Hashtable<String,Object>();
	
	public static Hashtable<String,Object> OpenBrowser(Object[] inputParameters){
		try {
		String strkey=(String) inputParameters[0];
		//String exe=(String) inputParameters[1];
		if(strkey.equalsIgnoreCase("chrome")){
			//System.setProperty("webdriver.chrome.driver", exe);	
			System.setProperty("webdriver.chrome.driver", config.getDriverPathChrome());	

			driver=new ChromeDriver();
			driver.manage().window().maximize();	
			driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
		}else if(strkey.equalsIgnoreCase("FF")){
			driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
			//System.setProperty("webdriver.geckodriver.driver", exe);	
			System.setProperty("webdriver.geckodriver.driver", config.getDriverPathFF());	

			driver=new FirefoxDriver();
			driver.manage().window().maximize();
		}
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "methodUsed: OpenBrowser, Input Given:"+inputParameters[0].toString());

		}
		catch(Exception e) {
			System.out.println(e);
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodUsed: OpenBrowser, Input Given:"+inputParameters[0].toString());

		}
		return outputParameters;
			
	}
	public static Hashtable<String,Object> oppenApplication()
	{
		try {
		//String URL=(String) inputParameters[0];
		//driver.get(URL);
		driver.get(config.getApplicationUrl());
		driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "methodUsed: oppenApplication, Input Given:"+config.getApplicationUrl().toString());
		}
		catch(Exception e) {
			System.out.println(e);
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodUsed: oppenApplication, Input Given:"+config.getApplicationUrl().toString());

		}
		return outputParameters;

		}
	
	public static Hashtable<String,Object> clickOnElement(Object[] inputParameters)
	{
		try {
			driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
		String XPATH=(String) inputParameters[0];
		
		//driver.findElementByXPath(XPATH).click();
		driver.findElement(By.xpath(XPATH)).click();
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "methodUsed: clickOnElement, Input Given:"+inputParameters[0].toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodUsed: clickOnElement, Input Given:"+inputParameters[0].toString());
		}
		return outputParameters;

	}
	public static Hashtable<String,Object> mouseOver(Object[] inputParameters)
	{
		try {
			driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
			String XPATH=(String) inputParameters[0];
			Actions act=new Actions(driver);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebElement obj=driver.findElement(By.xpath(XPATH));
			act.moveToElement(obj).build().perform();
			outputParameters.put("STATUS", "PASS");
			outputParameters.put("MESSAGE", "methodUsed: mouseOver, Input Given:"+inputParameters[0].toString());
			
		}
		catch(Exception e) {
			System.out.println(e);
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodUsed: mouseOver, Input Given:"+inputParameters[0].toString());

		}
		return outputParameters;

	}
	public static Hashtable<String,Object> sendKey(Object[] inputParameters)
	{
		try {
			String abckey=(String) inputParameters[0];
			String abcvalue=(String) inputParameters[1];
			driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
			driver.findElement(By.xpath(abckey)).sendKeys(abcvalue);
			outputParameters.put("STATUS", "PASS");
			outputParameters.put("MESSAGE", "methodUsed: sendKey, Input Given:"+inputParameters[1].toString());
			
		}
		catch(Exception e) {
			System.out.println(e);
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodUsed: sendKey, Input Given:"+inputParameters[1].toString());


		}
		return outputParameters;		
	}
	public static Hashtable<String,Object> validation(Object[] inputParameters)
	{
		try {
			driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
			String Xpath=(String) inputParameters[0];
			String text=(String) inputParameters[1];
			
			String actualText=driver.findElement(By.xpath(Xpath)).getText();
			if(actualText.equalsIgnoreCase(text)){
				System.out.println("Test case pass");
				
			}else{
				System.out.println("Test case fail");
				
			}
			outputParameters.put("STATUS", "PASS");
			outputParameters.put("MESSAGE", "methodUsed: validation, Input Given:"+inputParameters[1].toString());
			
		}
		catch(Exception e) {
			System.out.println(e);
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodUsed: validation, Input Given:"+inputParameters[1].toString());


		}
		return outputParameters;
			
	}
	public static Hashtable<String,Object> validationForInvalid(Object[] inputParameters)
	{
		try {
			driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
			String Xpath=(String) inputParameters[0];
			String text=(String) inputParameters[1];
			
			String actualText=driver.findElement(By.xpath(Xpath)).getText();
			if(actualText.equalsIgnoreCase(text)){
				System.out.println("Test case pass");
				
			}else{
				System.out.println("Test case fail");
				
			}
			outputParameters.put("STATUS", "PASS");
			outputParameters.put("MESSAGE", "methodUsed: validationForInvalid, Input Given:"+inputParameters[1].toString());
			
		}
		catch(Exception e) {
			System.out.println(e);	
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodUsed: validationForInvalid, Input Given:"+inputParameters[1].toString());

		}
		return outputParameters;		
	}
		public static Hashtable<String,Object> sendKey1(String key,String value)
		{
			try {
			String abckey=key;
			String abcvalue=value;
			driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
			driver.findElement(By.xpath(abckey)).sendKeys(abcvalue);	
			outputParameters.put("STATUS", "PASS");
			outputParameters.put("MESSAGE", "methodUsed: sendKey1, Input Given:"+value.toString());
			
			}
			catch(Exception e) {
				System.out.println(e);
				outputParameters.put("STATUS", "FAIL");
				outputParameters.put("MESSAGE", "methodUsed: sendKey1, Input Given:"+value.toString());

			}
			return outputParameters;
		}
			public static Hashtable<String,Object> Select(Object[] inputParameters)
			{
				try {
					driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
				String selectvalue=(String) inputParameters[0];
				int ab=(Integer) inputParameters[1];
				Select State=new Select(driver.findElement(By.xpath(selectvalue)));
				 State.selectByIndex(ab);
				 outputParameters.put("STATUS", "PASS");
				outputParameters.put("MESSAGE", "methodUsed: Select, Input Given:"+inputParameters[1].toString());
					
				}
				catch(Exception e) {
					System.out.println(e);
					outputParameters.put("STATUS", "FAIL");
					outputParameters.put("MESSAGE", "methodUsed: Select, Input Given:"+inputParameters[1].toString());

				}
				return outputParameters;
			}
			
			
			
			public static Hashtable<String,Object> browserClose(){
				try {
					driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
				driver.close();
				}
				catch(Exception e) {
					System.out.println(e);
				}
				return outputParameters;
			}
			
			public static void main(String[] args) throws InterruptedException {
				//browser launch
				Object []input= new Object[2];
				input[0]="chrome";
				input[1]="D:\\Automation_Class\\Automation Support\\chromedriver.exe";
				SeleniumOperationObj1.OpenBrowser(input);
				//open application
				Object []input1= new Object[1];
				input1[0]="https://www.flipkart.com/";				
				//SeleniumOperationObj1.oppenApplication(input1);
				//click cancel login
				Object []input2= new Object[1];
				input2[0]="//*[@class='_2KpZ6l _2doB4z']";	
				SeleniumOperationObj1.clickOnElement(input2);		//"//*[@class='_2KpZ6l _2doB4z']"
				//Mouse Action
				Object []input3= new Object[1];
				input3[0]="//*[text()='Login']";
				SeleniumOperationObj1.mouseOver(input3);
				//Click on my profile
				Object []input4= new Object[1];
				input4[0]="//*[text()='My Profile']";	
				SeleniumOperationObj1.clickOnElement(input4);
				//Enter username
				Object []input5= new Object[2];
				input5[0]="//*[@class='_2IX_2- VJZDxU']";
				input5[1]="7020348482";	
				SeleniumOperationObj1.sendKey(input5);
				//Enter password
				Object []input6= new Object[2];
				input6[0]="//*[@class='_2IX_2- _3mctLh VJZDxU']";
				input6[1]="Admin@12";	
				SeleniumOperationObj1.sendKey(input6);
				//click on login
				Object []input7= new Object[1];
				input7[0]="//*[@class='_2KpZ6l _2HKlqd _3AWRsL']";	
				SeleniumOperationObj1.clickOnElement(input7);
				Thread.sleep(5000);
				//click on manage Address
				Object []input8= new Object[1];
				input8[0]="//*[@class='NS64GK']";	
				SeleniumOperationObj1.clickOnElement(input8);
				//click on Add a new Address
				Object []input9= new Object[1];
				input9[0]="//*[@class='_1QhEVk']";	
				SeleniumOperationObj1.clickOnElement(input9);
				//Enter name
				Object []input10= new Object[2];
				input10[0]="//*[@class='_1w3ZZo _2mFmU7']";
				input10[1]="Chaitu";	
				SeleniumOperationObj1.sendKey(input10);
				//Enter phone
				Object []input11= new Object[2];
				input11[0]="//*[@name='phone']";
				input11[1]="7020348482";	
				SeleniumOperationObj1.sendKey(input11);
				//Enter pin
				Object []input12= new Object[2];
				input12[0]="//*[@name='pincode']";
				input12[1]="414001";	
				SeleniumOperationObj1.sendKey(input12);
				//Enter city
				Object []input13= new Object[2];
				input13[0]="//*[@name='addressLine2']";
				input13[1]="Nagar";	
				SeleniumOperationObj1.sendKey(input13);
				//Enter add line
				Object []input14= new Object[2];
				input14[0]="//*[@name='addressLine1']";
				input14[1]="nepti naka";	
				SeleniumOperationObj1.sendKey(input14);
				//Enter state
				Object []input15= new Object[2];
				input15[0]="//*[@name='state']";
				input15[1]=21;	
				SeleniumOperationObj1.Select(input15);
				//Enter landmark
				Object []input16= new Object[2];
				input16[0]="//*[@name='landmark']";
				input16[1]="kalyan Road";	
				SeleniumOperationObj1.sendKey(input16);
				//Enter alternate phone
				Object []input17= new Object[2];
				input17[0]="//*[@name='alternatePhone']";
				input17[1]="9970024034";	
				SeleniumOperationObj1.sendKey(input17);
				//click on home
				Object []input18= new Object[1];
				input18[0]="//*[@for='HOME']";	
				SeleniumOperationObj1.clickOnElement(input18);
				//click on  save
				Object []input19= new Object[1];
				input19[0]="//*[@class='_2KpZ6l _1JDhFS _1o0c4q _3AWRsL']";	
				SeleniumOperationObj1.clickOnElement(input19);
				
				//SeleniumOperationObj1.sendKey("//*[@class='_2IX_2- _3mctLh VJZDxU']", "Admin@12");
				//SeleniumOperationObj1.clickOnElement("//*[@class='_2KpZ6l _2HKlqd _3AWRsL']");
				//Thread.sleep(5000);
				//SeleniumOperationObj1.clickOnElement("//*[@class='NS64GK']");		//NS64GK _1MZ7_i
				//SeleniumOperationObj1.clickOnElement("//*[@class='_1QhEVk']");
				//SeleniumOperationObj1.sendKey("//*[@class='_1w3ZZo _2mFmU7']", "Chaitu");
				//SeleniumOperationObj1.sendKey("//*[@name='phone']", "7020348482");
				//SeleniumOperationObj1.sendKey("//*[@name='pincode']", "414001");
				//SeleniumOperationObj1.sendKey("//*[@name='addressLine2']", "Nagar");
				//SeleniumOperationObj1.sendKey("//*[@name='addressLine1']", "nepti naka");
				//SeleniumOperationObj1.Select("//*[@name='state']", 21);
				//SeleniumOperationObj1.sendKey("//*[@name='landmark']", "kalyan Road");
				//SeleniumOperationObj1.sendKey("//*[@name='alternatePhone']", "9970024034");
				//SeleniumOperationObj1.clickOnElement("//*[@for='HOME']");
				//SeleniumOperationObj1.clickOnElement("//*[@class='_2KpZ6l _1JDhFS _1o0c4q _3AWRsL']");
				
				
				
				
				
				
			
				
				
				
				
			}
	
	}
	