package testcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.HomePage;
import pages.LoginPage;
import utility.BaseClass;

public class VerifyHomeButtonTest extends BaseClass {
	
	

	@Test
	void test1() throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.gecko.driver",".\\src\\test\\resources\\driver\\geckodriver.exe");
			WebDriver	driver = new FirefoxDriver();
			
			driver.get("https://demo.guru99.com/V4/index.php");
			WebElement unamElement=driver.findElement(By.name("uid"));
			unamElement.sendKeys("mngr490852");
			WebElement passElement =driver.findElement(By.name("password"));
			passElement.sendKeys("gEgEbar");
			WebElement loginElement=driver.findElement(By.xpath("//input[@name='btnLogin']"));
			loginElement.click();
			Thread.sleep(3000);
			String real =driver.getTitle();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0,78.66666412353516)");
		    //driver.findElement(By.linkText("New Customer")).click();
			//driver.findElement(By.partialLinkText("Manager")).click();
			Actions action = new Actions(driver);
			WebElement ele=driver.findElement(By.partialLinkText("New Customer"));
			action.doubleClick(ele).build().perform();
			Thread.sleep(3000);
			
			
			   Robot r = new Robot();
		       String text = "Welcome to the world of automation.";
		       StringSelection stringSelection = new StringSelection(text);
		       Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		       clipboard.setContents(stringSelection, stringSelection);
		        
		       r.keyPress(KeyEvent.VK_CONTROL);
		       r.keyPress(KeyEvent.VK_V);
		       r.keyRelease(KeyEvent.VK_V);
		       r.keyRelease(KeyEvent.VK_CONTROL);
		       
		       
		       WebDriverWait wait=new WebDriverWait(driver, 20);
		       wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Home")));
		       driver.findElement(By.linkText("Home")).click();	
		       
		       
		       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(" //marquee[@class='heading3']")));
		    
		    
		       String exp =driver.getTitle();
		       Assert.assertEquals(real,exp);
		       Thread.sleep(3000);
		       driver.close();
	}
	
	
	@Test
	void test2() throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.gecko.driver",".\\src\\test\\resources\\driver\\geckodriver.exe");
			WebDriver	driver = new FirefoxDriver();
			
			driver.get("https://demo.guru99.com/V4/index.php");
			WebElement unamElement=driver.findElement(By.name("uid"));
			unamElement.sendKeys("mngr490852");
			WebElement passElement =driver.findElement(By.name("password"));
			passElement.sendKeys("gEgEbar");
			WebElement loginElement=driver.findElement(By.xpath("//input[@name='btnLogin']"));
			loginElement.click();
			Thread.sleep(3000);
			String real =driver.getTitle();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0,78.66666412353516)");
		    //driver.findElement(By.linkText("New Customer")).click();
			//driver.findElement(By.partialLinkText("Manager")).click();
			Actions action = new Actions(driver);
			WebElement ele=driver.findElement(By.partialLinkText("Edit Customer"));
			action.doubleClick(ele).build().perform();
			Thread.sleep(3000);
			
			
			   Robot r = new Robot();
		       String text = "Welcome to the world of automation.";
		       StringSelection stringSelection = new StringSelection(text);
		       Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		       clipboard.setContents(stringSelection, stringSelection);
		        
		       r.keyPress(KeyEvent.VK_CONTROL);
		       r.keyPress(KeyEvent.VK_V);
		       r.keyRelease(KeyEvent.VK_V);
		       r.keyRelease(KeyEvent.VK_CONTROL);
		       
		       
		       WebDriverWait wait=new WebDriverWait(driver, 20);
		       wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Home")));
		       driver.findElement(By.linkText("Home")).click();	
		       
		       
		       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(" //marquee[@class='heading3']")));
		    
		    
		       String exp =driver.getTitle();
		       Assert.assertEquals(real,exp);
		       Thread.sleep(3000);
		       driver.close();
	}


	
	
	@Test
	void test3() throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.gecko.driver",".\\src\\test\\resources\\driver\\geckodriver.exe");
			WebDriver	driver = new FirefoxDriver();
			
			driver.get("https://demo.guru99.com/V4/index.php");
			WebElement unamElement=driver.findElement(By.name("uid"));
			unamElement.sendKeys("mngr490852");
			WebElement passElement =driver.findElement(By.name("password"));
			passElement.sendKeys("gEgEbar");
			WebElement loginElement=driver.findElement(By.xpath("//input[@name='btnLogin']"));
			loginElement.click();
			Thread.sleep(3000);
			String real =driver.getTitle();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0,78.66666412353516)");
		    //driver.findElement(By.linkText("New Customer")).click();
			//driver.findElement(By.partialLinkText("Manager")).click();
			Actions action = new Actions(driver);
			WebElement ele=driver.findElement(By.linkText("Delete Customer"));
			action.doubleClick(ele).build().perform();
			Thread.sleep(3000);
			
			
			   Robot r = new Robot();
		       String text = "Welcome to the world of automation.";
		       StringSelection stringSelection = new StringSelection(text);
		       Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		       clipboard.setContents(stringSelection, stringSelection);
		        
		       r.keyPress(KeyEvent.VK_CONTROL);
		       r.keyPress(KeyEvent.VK_V);
		       r.keyRelease(KeyEvent.VK_V);
		       r.keyRelease(KeyEvent.VK_CONTROL);
		       
		       
		       WebDriverWait wait=new WebDriverWait(driver, 20);
		       wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Home")));
		       driver.findElement(By.linkText("Home")).click();	
		       
		       
		       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(" //marquee[@class='heading3']")));
		    
		    
		       String exp =driver.getTitle();
		       Assert.assertEquals(real,exp);
		       Thread.sleep(3000);
		       driver.close();
	}


	
	
	
}