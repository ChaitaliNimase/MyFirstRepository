package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumOperationObj {
		
	public static ChromeDriver driver=null;
	
	public static void OpenBrowser(Object[] inputParameters){
		
		String strkey=(String) inputParameters[0];
		String strvalue=(String) inputParameters[1];
		System.setProperty(strkey, strvalue);	
		driver=new ChromeDriver();
		driver.manage().window().maximize();	
	}
	public static void oppenApplication(Object[] inputParameters)
	{
		String URL=(String) inputParameters[0];
		driver.get(URL);
		}
	public static void clickOnElement(Object[] inputParameters)
	{
		String XPATH=(String) inputParameters[0];
		
		driver.findElementByXPath(XPATH).click();
	}
	public static void mouseOver(Object[] inputParameters)
	{
			String XPATH=(String) inputParameters[0];
			Actions act=new Actions(driver);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebElement obj=driver.findElementByXPath(XPATH);
			act.moveToElement(obj).build().perform();
	}
	public static void sendKey(Object[] inputParameters)
	{
			String abckey=(String) inputParameters[0];
			String abcvalue=(String) inputParameters[1];
			
			driver.findElementByXPath(abckey).sendKeys(abcvalue);	
			
	}
		public static void sendKey1(String key,String value)
		{
			String abckey=key;
			String abcvalue=value;
			
			driver.findElementByXPath(abckey).sendKeys(abcvalue);	
			
		}
			public static void Select(Object[] inputParameters)
			{
				String selectvalue=(String) inputParameters[0];
				int ab=(Integer) inputParameters[1];
				Select State=new Select(driver.findElementByXPath(selectvalue));
				 State.selectByIndex(ab);
			}
			public static void main(String[] args) throws InterruptedException {
				//browser launch
				Object []input= new Object[2];
				input[0]="webdriver.chrome.driver";
				input[1]="D:\\Automation_Class\\Automation Support\\chromedriver.exe";
				SeleniumOperationObj.OpenBrowser(input);
				//open application
				Object []input1= new Object[1];
				input1[0]="https://www.flipkart.com/";				
				SeleniumOperationObj.oppenApplication(input1);
				//click cancel login
				Object []input2= new Object[1];
				input2[0]="//*[@class='_2KpZ6l _2doB4z']";	
				SeleniumOperationObj.clickOnElement(input2);		//"//*[@class='_2KpZ6l _2doB4z']"
				//Mouse Action
				Object []input3= new Object[1];
				input3[0]="//*[text()='Login']";
				SeleniumOperationObj.mouseOver(input3);
				//Click on my profile
				Object []input4= new Object[1];
				input4[0]="//*[text()='My Profile']";	
				SeleniumOperationObj.clickOnElement(input4);
				//Enter username
				Object []input5= new Object[2];
				input5[0]="//*[@class='_2IX_2- VJZDxU']";
				input5[1]="7020348482";	
				SeleniumOperationObj.sendKey(input5);
				//Enter password
				Object []input6= new Object[2];
				input6[0]="//*[@class='_2IX_2- _3mctLh VJZDxU']";
				input6[1]="Admin@12";	
				SeleniumOperationObj.sendKey(input6);
				//click on login
				Object []input7= new Object[1];
				input7[0]="//*[@class='_2KpZ6l _2HKlqd _3AWRsL']";	
				SeleniumOperationObj.clickOnElement(input7);
				Thread.sleep(5000);
				//click on manage Address
				Object []input8= new Object[1];
				input8[0]="//*[@class='NS64GK']";	
				SeleniumOperationObj.clickOnElement(input8);
				//click on Add a new Address
				Object []input9= new Object[1];
				input9[0]="//*[@class='_1QhEVk']";	
				SeleniumOperationObj.clickOnElement(input9);
				//Enter name
				Object []input10= new Object[2];
				input10[0]="//*[@class='_1w3ZZo _2mFmU7']";
				input10[1]="Chaitu";	
				SeleniumOperationObj.sendKey(input10);
				//Enter phone
				Object []input11= new Object[2];
				input11[0]="//*[@name='phone']";
				input11[1]="7020348482";	
				SeleniumOperationObj.sendKey(input11);
				//Enter pin
				Object []input12= new Object[2];
				input12[0]="//*[@name='pincode']";
				input12[1]="414001";	
				SeleniumOperationObj.sendKey(input12);
				//Enter city
				Object []input13= new Object[2];
				input13[0]="//*[@name='addressLine2']";
				input13[1]="Nagar";	
				SeleniumOperationObj.sendKey(input13);
				//Enter add line
				Object []input14= new Object[2];
				input14[0]="//*[@name='addressLine1']";
				input14[1]="nepti naka";	
				SeleniumOperationObj.sendKey(input14);
				//Enter state
				Object []input15= new Object[2];
				input15[0]="//*[@name='state']";
				input15[1]=21;	
				SeleniumOperationObj.Select(input15);
				//Enter landmark
				Object []input16= new Object[2];
				input16[0]="//*[@name='landmark']";
				input16[1]="kalyan Road";	
				SeleniumOperationObj.sendKey(input16);
				//Enter alternate phone
				Object []input17= new Object[2];
				input17[0]="//*[@name='alternatePhone']";
				input17[1]="9970024034";	
				SeleniumOperationObj.sendKey(input17);
				//click on home
				Object []input18= new Object[1];
				input18[0]="//*[@for='HOME']";	
				SeleniumOperationObj.clickOnElement(input18);
				//click on  save
				Object []input19= new Object[1];
				input19[0]="//*[@class='_2KpZ6l _1JDhFS _1o0c4q _3AWRsL']";	
				SeleniumOperationObj.clickOnElement(input19);
				
				//SeleniumOperationObj.sendKey("//*[@class='_2IX_2- _3mctLh VJZDxU']", "Admin@12");
				//SeleniumOperationObj.clickOnElement("//*[@class='_2KpZ6l _2HKlqd _3AWRsL']");
				//Thread.sleep(5000);
				//SeleniumOperationObj.clickOnElement("//*[@class='NS64GK']");		//NS64GK _1MZ7_i
				//SeleniumOperationObj.clickOnElement("//*[@class='_1QhEVk']");
				//SeleniumOperationObj.sendKey("//*[@class='_1w3ZZo _2mFmU7']", "Chaitu");
				//SeleniumOperationObj.sendKey("//*[@name='phone']", "7020348482");
				//SeleniumOperationObj.sendKey("//*[@name='pincode']", "414001");
				//SeleniumOperationObj.sendKey("//*[@name='addressLine2']", "Nagar");
				//SeleniumOperationObj.sendKey("//*[@name='addressLine1']", "nepti naka");
				//SeleniumOperationObj.Select("//*[@name='state']", 21);
				//SeleniumOperationObj.sendKey("//*[@name='landmark']", "kalyan Road");
				//SeleniumOperationObj.sendKey("//*[@name='alternatePhone']", "9970024034");
				//SeleniumOperationObj.clickOnElement("//*[@for='HOME']");
				//SeleniumOperationObj.clickOnElement("//*[@class='_2KpZ6l _1JDhFS _1o0c4q _3AWRsL']");
				
				
				
				
				
				
			
				
				
				
				
			}
	
	}
	
