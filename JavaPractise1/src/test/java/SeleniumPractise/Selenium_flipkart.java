package SeleniumPractise;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import BrowserIntializationClass.BaseClass;

public class Selenium_flipkart extends BaseClass {

	Logger log=Logger.getLogger(Selenium_flipkart.class);

	@Test
	public void flipkart() {
		log.info("calling base class");

		super.baseMethod();
		log.info("executed the base class");
		driver.get("https://www.flipkart.com/craftsfest-scenery-nature-online-wall-painting-photo-frame-home-decoration-ink-13-5-inch-x-19-5/p/itm9b01eca182a38?pid=PTGFHHXGXZXHRQMC&lid=LSTPTGFHHXGXZXHRQMCUPKMOO&marketplace=FLIPKART&srno=s_1_27&otracker=AS_QueryStore_OrganicAutoSuggest_2_19_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_2_19_na_na_na&fm=SEARCH&iid=348061ef-b8c6-4969-a533-f021edb43ef6.PTGFHHXGXZXHRQMC.SEARCH&ppt=sp&ppn=sp&ssid=m84f4wzlls0000001603635007604&qH=27767cd2b2e52e62");
		log.info("closed the browser");
		log.info("browser is closing");
		driver.findElement(By.xpath("//input[@id='pincodeInputId']")).sendKeys("524314");
		log.info("entered pincode");
		driver.findElement(By.xpath("//input[@id='pincodeInputId']//following::span[text()='Check']")).click();
		log.info("click on check button");
		try {
		WebDriverWait wait =new WebDriverWait(driver, 30);
		log.info("waiting for the webelement to visible");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='_3l12t9']//div"))));
		
		}catch(Exception e) {
			WebDriverWait wait =new WebDriverWait(driver, 30);
			log.info("waiting for the webelement to visible");
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='_3l12t9']//div"))));
			
		}
		log.info("element is present");
		String textname=driver.findElement(By.xpath("//div[@class='_3l12t9']//div")).getText();
		if(textname!=null) {

			log.info("enters in if loop and text"+textname);
		}else {
			log.info("enters else loop and value"+textname);
		}
		driver.quit();
		log.info("closed browser");	
	}
}
