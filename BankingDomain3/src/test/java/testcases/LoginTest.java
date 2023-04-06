package testcases;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.LoginPage;
import utility.BaseClass;
import utility.ExcelUtility;

public class LoginTest extends BaseClass
{
	@DataProvider
	Object readData() throws IOException // creating | reading the data and will give the data  to another method 
	{
		String loc="C:\\Users\\Public\\BankingDomain\\src\\test\\resources\\DataforGuru99Project.xlsx";
		ExcelUtility read = new ExcelUtility(loc);
	    int rows= read.getRowCount("Sheet1");
	    int cols = read.getCellCount("Sheet1", rows);
		
		Object[][] data = new Object[rows][cols];  // creating two dim array
		
		for(int i = 1;i<=rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				    data[i-1][j]=  read.getCellData("Sheet1",i, j);
			}
			
		}
		
		
		
		return data;
	}
	

	
	
	
@Test
 void verifyvalidUser() throws InterruptedException
	{
	
	System.out.println(1);
		driver.get(baseURL);
		LoginPage login=new LoginPage(driver);
		Thread.sleep(2000);
		System.out.println("1111111111111111111111111111111111111111111111111");
		login.setUserid(username);
		log.info("entered userid");
		login.setPassword(password);          
		log.info("entered password");
		System.out.println("1111111111111111111111111111111111111111111111111");
		login.clickLoginbtn();
		log.info("clicked on login button");
		System.out.println(2);
		
		
			
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			System.out.print("itsokkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
		}
		else
		{
			Assert.assertTrue(false);
			System.out.print("Its nottttttttttttt okkkkkkkkkkkkkkkkkkkkkkkkkkk");
		}
		
		System.out.println("33333333333333333333333333333333333333333333333333333");
	
	
	
	
	
	
	}





	public boolean isAlertPresent() //user defined method for alert
	{
		try
		{ 
			System.out.println(4);
		driver.switchTo().alert();
		return true;
		}
		catch(NoAlertPresentException e)
		{
			return false;
		}
		
	}
	
	
	
	@Test(dataProvider = "readData")
	void verifyInvalidUser(String user, String pass)
	{
		System.out.println(5);
		driver.get("https://demo.guru99.com/V4/");
		LoginPage login = new LoginPage(driver);
		login.setUserid(user);
		log.info("entered userid");
		login.setPassword(pass);
		System.out.println(1);
		log.info("entered password");
		login.clickLoginbtn();
		log.info("clicked on login button");
		try {
			System.out.println(6);
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if(isAlertPresent()==true)
		{System.out.println(1);
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			//Assert.assertTrue(true);
		}
		else
		{System.out.println(7);
			Assert.assertTrue(false);
			login.clickLogout();
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
		}
	
		
	
	}



  

 }



