package PopUpPractise;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import BrowserIntializationClass.BaseClass;
import FreeCRM.FreeCrmDemo;

public class PopUpClass extends BaseClass {
	
	Logger log=Logger.getLogger(FreeCrmDemo.class);

	
	@Test(enabled = false)
	public void popUp() {
		
		super.baseMethod();
		log.info("class called");
		String name=driver.getWindowHandle();

		System.out.println(name);
		driver.get("https://www.inctouch.com/crmproduct?gclid=EAIaIQobChMIqeK0w6WH7QIV2ARyCh2y8gkEEAAYAyAAEgINHvD_BwE");
		driver.findElement(By.xpath("//span[text()='Sign In']")).click();
		Set<String> y=driver.getWindowHandles();
		System.out.println(y);
		//Alert a=driver.switchTo().alert();
	//	if(driver.switchTo().alert() == null) {
	//	log.info("switched to alert");
		WebDriverWait wait=new WebDriverWait(driver, 30);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//wait.until(ExpectedConditions.alertIsPresent());
		Actions action=new Actions(driver);
	//	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='__privateStripeMetricsController2170']")));

		try {
			try {
		WebElement element=driver.findElement(By.xpath("//form[@class='login ng-pristine ng-invalid ng-touched']//div[@class='ui-grid-col-12']//input[@class='password ui-inputtext ui-corner-all ui-state-default ui-widget ng-untouched ng-pristine ng-invalid']"));
		action.doubleClick(element).sendKeys("dhdn").build().perform();
		//element.sendKeys("sgdhnnm@293");
		
			}catch(Exception e) {
				e.printStackTrace();
			}
//			WebElement ele=driver.findElement(By.xpath("//div[@role='dialog']//input[@formcontrolname='Email']"));
//			action.doubleClick(ele).sendKeys("hdbwhsjbsx");
			WebElement element=driver.findElement(By.xpath("//form[@class='login ng-pristine ng-invalid ng-touched']//div[@class='ui-grid-col-12']//input[@class='password ui-inputtext ui-corner-all ui-state-default ui-widget ng-untouched ng-pristine ng-invalid']"));
element.sendKeys("dvhbsxhb");
		log.info("email");
		driver.findElement(By.xpath("//div[@class='ui-grid-col-12']//input[@class='password ui-inputtext ui-corner-all ui-state-default ui-widget ng-untouched ng-pristine ng-invalid']")).sendKeys("teurujr");
		log.info("passcode");
		//}else {
			//System.out.println("else");
		//}
		
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}finally {
		//driver.quit();
		log.info("quite");
		
		}
		
		
		
		
	}
	
	public WebDriverWait wait;
	@Test
	public void popUpDetails() {
		try {
		super.baseMethod();
		driver.get("https://www.inctouch.com/crmproduct?gclid=EAIaIQobChMIqeK0w6WH7QIV2ARyCh2y8gkEEAAYAyAAEgINHvD_BwE");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		waitFew();
		afterInvoke();
		emailEnter();
		passwordEnter();
		capcha();
		browserClose();
		
		
		}catch(Exception e) {
			
			try {
				System.out.println("next finally block");
				
			}finally {
				driver.quit();
				
			}
			
			
		}
	}
	public void waitFew() {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}
	
	
	public void afterInvoke() {
		WebElement signinbtn=driver.findElement(By.xpath("//span[text()='Sign In']"));
		signinbtn.click();
		waitFew();
		
	}
	
	public void emailEnter() {
		
		WebElement emailfield=driver.findElement(By.xpath("(//div[@class='ui-grid-col-12']//input)[1]"));
		emailfield.sendKeys("iuaiiai");
	}
	public void passwordEnter() {
		
		WebElement passwordfield=driver.findElement(By.xpath("(//div[@class='ui-grid-col-12']//input)[2]"));
		passwordfield.sendKeys("yusduu");
	}
	
	public Actions action;
	public void capcha() {
		wait=new WebDriverWait(driver, 70);
		
		
		
		WebElement checkbox=driver.findElement(By.xpath("(//span[@id='recaptcha-anchor']//div)[1]"));
		wait.until(ExpectedConditions.visibilityOf(checkbox));
		if(checkbox.isDisplayed()) {
			action=new Actions(driver);
			action.click(checkbox).build().perform();
			//checkbox.click();
		}else {
			
			if(checkbox.isSelected()) {
				checkbox.click();
				checkbox.click();
				}
		}
	}
	
	public void browserClose() {
		
		try {
			Thread.sleep(3000);
			driver.quit();
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
	}

}
