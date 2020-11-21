package FreeCRM;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import BrowserIntializationClass.BaseClass;
import SeleniumPractise.Selenium_flipkart;

public class FreeCrmDemo extends BaseClass {
	
	Logger log=Logger.getLogger(FreeCrmDemo.class);
Actions a;
	
	
	
	
	@Test
	public void freeCrm(){
		
		
		log.info("entered into the freecrm method");
		super.baseMethod();
		driver.get("https://ui.freecrm.com/");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sai.p342@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("8125900610");
		driver.findElement(By.xpath("//div[text()='Login']")).click();  
		a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//span[text()='Calendar']"))).click().build().perform();
		log.info("moved to element");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		a.moveToElement(driver.findElement(By.xpath("//span[text()='Contacts']"))).click().build().perform();
		
		a.moveToElement(driver.findElement(By.xpath("//span[text()='Calendar']"))).click().build().perform();


		//driver.findElement(By.xpath("//span[text()='Month']")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		a.moveToElement(driver.findElement(By.xpath("//div[@class='rbc-row ']//a[text()='02']"))).click().build().perform();
		WebDriverWait wait=new WebDriverWait(driver, 30);
		
//		String textnamelabel=wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//label[text()='Title']")))).getText();
//		
//		if(textnamelabel.equalsIgnoreCase("Title")) {
//			
//			log.info("enters if loop");
//		}else {
//			log.info("else statement");
//		}
//		
//		
		driver.quit();
		log.info("window close");
		
		
	}

}
