package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumOperation {
		
		public static ChromeDriver driver=null;
	
	public static void OpenBrowser(String key,String value){
		
		String strkey=key;
		String strvalue=value;
		
		System.setProperty(strkey, strvalue);
		
		 driver=new ChromeDriver();
		driver.manage().window().maximize();	
	}
	public static void oppenApplication(String url)
	{
		String URL=url;
		driver.get(URL);
		}
	public static void clickOnElement(String xpath)
	{
		String XPATH=xpath;
		
		driver.findElementByXPath(XPATH).click();
	}
		public static void mouseOver(String xpath)
		{
			String XPATH=xpath;
			Actions act=new Actions(driver);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebElement obj=driver.findElementByXPath(XPATH);
			act.moveToElement(obj).build().perform();
		}
		public static void sendKey(String key,String value)
		{
			String abckey=key;
			String abcvalue=value;
			
			driver.findElementByXPath(abckey).sendKeys(abcvalue);	
			
		}
			public static void Select(String value,int a)
			{
				String selectvalue=value;
				int ab=a; 
				Select State=new Select(driver.findElementByXPath(selectvalue));
				 State.selectByIndex(ab);
			}
			public static void main(String[] args) throws InterruptedException {
				
				SeleniumOperation.OpenBrowser("webdriver.chrome.driver", "D:\\Automation_Class\\Automation Support\\chromedriver.exe");
				SeleniumOperation.oppenApplication("https://www.flipkart.com/");
				SeleniumOperation.clickOnElement("//*[@class='_2KpZ6l _2doB4z']");		//"//*[@class='_2KpZ6l _2doB4z']"
				SeleniumOperation.mouseOver("//*[text()='Login']");
				SeleniumOperation.clickOnElement("//*[text()='My Profile']");
				SeleniumOperation.sendKey("//*[@class='_2IX_2- VJZDxU']", "7020348482");
				SeleniumOperation.sendKey("//*[@class='_2IX_2- _3mctLh VJZDxU']", "Admin@12");
				SeleniumOperation.clickOnElement("//*[@class='_2KpZ6l _2HKlqd _3AWRsL']");
				Thread.sleep(5000);
				SeleniumOperation.clickOnElement("//*[@class='NS64GK']");		//NS64GK _1MZ7_i
				SeleniumOperation.clickOnElement("//*[@class='_1QhEVk']");
				SeleniumOperation.sendKey("//*[@class='_1w3ZZo _2mFmU7']", "Chaitu");
				SeleniumOperation.sendKey("//*[@name='phone']", "7020348482");
				SeleniumOperation.sendKey("//*[@name='pincode']", "414001");
				SeleniumOperation.sendKey("//*[@name='addressLine2']", "Nagar");
				SeleniumOperation.sendKey("//*[@name='addressLine1']", "nepti naka");
				SeleniumOperation.Select("//*[@name='state']", 21);
				SeleniumOperation.sendKey("//*[@name='landmark']", "kalyan Road");
				SeleniumOperation.sendKey("//*[@name='alternatePhone']", "9970024034");
				SeleniumOperation.clickOnElement("//*[@for='HOME']");
				SeleniumOperation.clickOnElement("//*[@class='_2KpZ6l _1JDhFS _1o0c4q _3AWRsL']");
				
				
				
				
				
				
			
				
				
				
				
			}
	
	}
	
