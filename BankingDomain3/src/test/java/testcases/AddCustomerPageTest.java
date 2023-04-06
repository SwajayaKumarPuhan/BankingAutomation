package testcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AddCustomerPage;
import pages.LoginPage;
import utility.BaseClass;

public class AddCustomerPageTest extends BaseClass{
	
	@Test
	public void addNewCustomer() throws InterruptedException, AWTException 
	{
		driver.get(baseURL);
		LoginPage login=new LoginPage(driver);
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		System.out.println("1");
		login.setUserid(username);
		log.info("entered userid");
		System.out.println("2");
		login.setPassword(password);          
		log.info("entered password");
		System.out.println("3");
		login.clickLoginbtn();
		log.info("clicked on login button");
		System.out.println("LoginSucessfulllllllllllllllllllllllllllllllllllll");
		
		
		AddCustomerPage addcustomer=new AddCustomerPage(driver);
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,78.66666412353516)");
		//addcustomer.addnewcust();
		Actions action = new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/ul[1]/li[2]/a[1]"));
		action.doubleClick(ele).build().perform();
		//Thread.sleep(3000);
		Thread.sleep(2000);
		
		Robot r = new Robot();
	       String text = "Welcome to the world of automation.";
	       StringSelection stringSelection = new StringSelection(text);
	       Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
	       clipboard.setContents(stringSelection, stringSelection);
	        
	       r.keyPress(KeyEvent.VK_CONTROL);
	       r.keyPress(KeyEvent.VK_V);
	       r.keyRelease(KeyEvent.VK_V);
	       r.keyRelease(KeyEvent.VK_CONTROL);
		
		
		/*if(driver.switchTo().activeElement().isDisplayed())
		{
			driver.switchTo().activeElement().clear();
			System.out.println("advertismenthandleded try ===================");
		}
		
	   boolean var = driver.findElement(By.id("dob")).isDisplayed();
		System.out.println("00000000000000000000000000000000000");
		//addcustomer.setDate("2023-10-12"); //.sendKeys("2023-03-01");
		//Thread.sleep(2000);*/
	   
		
		
		
		 boolean var= driver.findElement(By.id("dob")).isDisplayed();
		 if(var)
		 {
	     driver.findElement(By.id("dob")).sendKeys("2022-03-02");
		 }
		addcustomer.custName("Swyanshree Nayak");
		Thread.sleep(1000);
		
		
	    addcustomer.custgender();
		
		addcustomer.custadress("Nandapur Chandbali");
		Thread.sleep(2000);
		addcustomer.custcity("Bhadrak");
		Thread.sleep(2000);
		addcustomer.custstate("Odisha");
		Thread.sleep(2000);
		addcustomer.custpin("756124");
		Thread.sleep(2000);
		addcustomer.custmobile("7381480855");
		Thread.sleep(3000);
		
		
		
		
		String email=randomstring()+"@gmail.com";
		addcustomer.custEmail(email);
		
		addcustomer.custpassword("Swajaya@73");
		System.out.print("THIS IS TILL PASSWORDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD");
		Thread.sleep(2000);
		addcustomer.custsubmit();
		
		
		
		
		Thread.sleep(2000);
		
		
		boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
		
		if(res==true)
		{
			//Assert.assertTrue(true);
		}
		else
		{
			//Assert.assertTrue(false);
		}
		
		
	}

	public String randomstring()
	{
		String generatedstring=RandomStringUtils.randomAlphabetic(8);
		return generatedstring;
		
	}
	

	
	
	
}
