package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tempt {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Automation_Class\\Automation Support\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElementByXPath("//*[@class='_2KpZ6l _2doB4z']").click();
		Actions act = new Actions(driver);
		driver.findElementByXPath("//*[text()='Login']").click();
		WebElement a = driver.findElementByXPath("//*[text()='Login']");
		act.moveToElement(a).build().perform();
		driver.findElementByXPath("//*[text()='My Profile']").click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);//Manage Addresses

		driver.findElementByXPath("//*[@class='_2IX_2- VJZDxU']").sendKeys("7020348482");
		driver.findElementByXPath("//*[@class='_2IX_2- _3mctLh VJZDxU']").sendKeys("Admin@12");
		driver.findElementByXPath("//*[@class='_2KpZ6l _2HKlqd _3AWRsL']").click();
		/*WebDriverWait wait1 = new WebDriverWait(driver,20);
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='exehdJ'])[1]") ) );
*//*
		Thread.sleep(5000);
		driver.findElementByXPath("(//*[@class='exehdJ'])[1]").click();
		//driver.findElementByXPath("//*[text()='More']").click();
		driver.findElementByXPath("//*[text()='My Account']").click();
		driver.findElementByXPath("//*[text()='My Profile']").click();
		//Thread.sleep(7000);
		driver.findElementByXPath("(//*[text()='Manage Addresses'])[2]").click();
		/*driver.findElementByXPath("//*[text()='ADD A NEW ADDRESS']").click();
		driver.findElementByXPath("(//*[@type='text'])[2]").sendKeys("chaitali");
		driver.findElementByXPath("(//*[@type='text'])[4]").sendKeys("7020348482");
		driver.findElementByXPath("(//*[@type='text'])[5]").sendKeys("414001");*/
		//Thread.sleep(7000);


		//_2KpZ6l _2HKlqd _3AWRsL

		/*Actions a = new Actions(driver);
		WebElement w = driver.findElementByXPath("(//*[@class='xtXmba'])[5]");
		a.moveToElement(w).build().perform();
*/
		System.out.println("HI");
	}

}
