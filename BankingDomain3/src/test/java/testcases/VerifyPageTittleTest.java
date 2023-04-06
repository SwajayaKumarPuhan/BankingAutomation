package testcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import utility.BaseClass;

public class VerifyPageTittleTest extends BaseClass{

	@Test
	 void verifyvalidUser() throws InterruptedException, AWTException
		{
		
		System.out.println(1);
			driver.get(baseURL);
			LoginPage login=new LoginPage(driver);
			Thread.sleep(2000);
			login.setUserid(username);
			log.info("entered userid");
			login.setPassword(password);          
			log.info("entered password");
			login.clickLoginbtn();
			log.info("clicked on login button");
			
			
			if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
			{
				Assert.assertTrue(true);
				System.out.println("VERIFIED TITTLE OF MANAGER HOMEPAGE");
			}
			else
			{
				Assert.assertTrue(false);
				System.out.println("Its nottttttttttttt okkkkkkkkkkkkkkkkkkkkkkkkkkk");
			}
			
			HomePage lofi=new HomePage(driver);
			//login.clickEditCustomer();
			lofi.clickEditCustomer();
			   Robot r = new Robot();
		       String text = "Welcome to the world of automation.";
		       StringSelection stringSelection = new StringSelection(text);
		       Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		       clipboard.setContents(stringSelection, stringSelection);
		        
		       r.keyPress(KeyEvent.VK_CONTROL);
		       r.keyPress(KeyEvent.VK_V);
		       r.keyRelease(KeyEvent.VK_V);
		       r.keyRelease(KeyEvent.VK_CONTROL);
			log.info("Clicked on edit Customer");
			System.out.println("Edit Customer button Worked Properly");
			Thread.sleep(3000);
			
			
			if(driver.getTitle().equals("Guru99 Bank Edit Customer Page"))
			{
				Assert.assertTrue(true);
				System.out.println("VERIFIED TITTLE OF EDIT CUSTOMER PAGE");
			}
			else
			{
				Assert.assertTrue(false);
				System.out.println("Its nottttttttttttt okkkkkkkkkkkkkkkkkkkkkk NOT NOT NOT NOT");
			}
		}	
			
	
	
	@Test
	 void verifyanothervalidUser() throws InterruptedException, AWTException
		{
		System.out.println(1);
		driver.get(baseURL);
		LoginPage login=new LoginPage(driver);
		Thread.sleep(2000);
		login.setUserid(username);
		log.info("entered userid");
		login.setPassword(password);          
		log.info("entered password");
		login.clickLoginbtn();
		log.info("clicked on login button");
		
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			System.out.println("VERIFIED TITTLE OF MANAGER HOMEPAGE");
		}
		else
		{
			Assert.assertTrue(false);
			System.out.println("Its nottttttttttttt okkkkkkkkkkkkkkkkkkkkkkkkkkk");
		}
		
		HomePage lofi=new HomePage(driver);
			//login.clickDeleteCustomer();
			lofi.clickDeleteCustomer();
			  Robot r = new Robot();
		       String text = "Welcome to the world of automation.";
		       StringSelection stringSelection = new StringSelection(text);
		       Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		       clipboard.setContents(stringSelection, stringSelection);
		        
		       r.keyPress(KeyEvent.VK_CONTROL);
		       r.keyPress(KeyEvent.VK_V);
		       r.keyRelease(KeyEvent.VK_V);
		       r.keyRelease(KeyEvent.VK_CONTROL);
			log.info("Clicked on Delete Customer");
			System.out.println("Delete Customer button Worked Properly");
			Thread.sleep(4000);
			//driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);			
			if(driver.getTitle().equals("Guru99 Bank Delete Customer Page"))
			{
				Assert.assertTrue(true);
				System.out.println("VERIFIED TITTLE OF DELETE CUSTOMER PAGE");
			}
			else
			{
				Assert.assertTrue(false);
				System.out.println("Its nottttttttttttt okkkkkkkkkkkkkkkkkkkkkkkkkkk NOTSWAJAYA NOTSWAJAYA NOTSWAJAYA");
			}
			
			
	
   }

	
}

