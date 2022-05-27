package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Tempt1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","D:\\Automation_Class\\Automation Support\\chromedriver.exe");

				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.flipkart.com/");
				driver.findElementByXPath("//*[@class='_2KpZ6l _2doB4z']").click();
				Actions act=new Actions(driver);
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				WebElement obj=driver.findElementByXPath("//*[text()='Login']");
				act.moveToElement(obj).build().perform();
				driver.findElementByXPath("//*[text()='My Profile']").click();
				driver.findElementByXPath("//*[@class='_2IX_2- VJZDxU']").sendKeys("7020348482");
				driver.findElementByXPath("//*[@class='_2IX_2- _3mctLh VJZDxU']").sendKeys("Admin@12");
				driver.findElementByXPath("//*[@class='_2KpZ6l _2HKlqd _3AWRsL']").click();
				Thread.sleep(5000);
				driver.findElementByXPath("//*[text()='Manage Addresses']").click();
				driver.findElementByXPath("//*[@class='_1QhEVk']").click();
				driver.findElementByXPath("//*[@name='name']").sendKeys("Chaitu");
				driver.findElementByXPath("//*[@name='phone']").sendKeys("9970024034");
				driver.findElementByXPath("//*[@name='pincode']").sendKeys("414001");
				driver.findElementByXPath("//*[@name='landmark']").sendKeys("abc");
				driver.findElementByXPath("//*[@name='addressLine2']").sendKeys("NAGAR");
				driver.findElementByXPath("///*[@name='addressLine1']").sendKeys("Torana Heights");
				driver.findElementByXPath("//*[@name='alternatePhone']").sendKeys("7020348482");
				driver.findElementByXPath("//*[@class='_1sQQBU _1w3ZZo _1TO48q']").sendKeys("test");
				Select State=new Select(driver.findElementByXPath("//*[@name='state']"));
				 State.selectByIndex(21);
				driver.findElementByXPath("//*[@for='HOME']").click();
				driver.findElementByXPath("//*[@class='_2KpZ6l _1JDhFS _1o0c4q _3AWRsL']").click();
				/*SeleniumOperation.sendKey("//*[@name='addressLine2']", "Ahmednagar");
				SeleniumOperation.sendKey("//*[@name='addressLine1']", "Torana Heights");
				SeleniumOperation.Select("//*[@name='state']", 21);
				SeleniumOperation.sendKey("//*[@name='landmark']", "Nagar Kalyan Road");
				SeleniumOperation.sendKey("//*[@name='alternatePhone']", "9970024034");
				SeleniumOperation.clickOnElement("//*[@for='HOME']");
				SeleniumOperation.clickOnElement("//*[@class='_2KpZ6l _1JDhFS _1o0c4q _3AWRsL']");*/
				

				


	}
}
