package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;

public class AddCustomerPage {
	WebDriver ldriver;
   public AddCustomerPage(WebDriver  driver )
   {
	   ldriver = driver;
	   
	   PageFactory.initElements(new DefaultElementLocatorFactory(driver), this);
   }
   
   
   
   @FindBy(xpath="//a[normalize-space()='New Customer']")    
   WebElement AddNewCustomer;
   
   @FindBy(xpath="//input[@name='name']")
   WebElement CustomerName;
   
   @FindBy(xpath="//input[@value='f']")
   WebElement radiobutton;
   
   /*@FindBy(xpath="//input[@id='dob']")
   WebElement DateOfBirth;*/
   
   @FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/ul[1]/li[2]/a[1]")
   WebElement datElement;
	 
   @FindBy(id = "dob")
   WebElement datElement2;
   
   @FindBy(xpath="//textarea[@name='addr']")
   WebElement Address;
   
   @FindBy(xpath="//input[@name='city']")    
   WebElement City;
   
   @FindBy(xpath="//input[@name='state']")
   WebElement State;
   
   @FindBy(xpath="//input[@name='pinno']")
   WebElement Pincode;
   
   
   @FindBy(xpath="//input[@name='telephoneno']")
   WebElement MobileNo;
   
   @FindBy(xpath="//input[@name='emailid']")
   WebElement Email;
   
   @FindBy(xpath="//input[@name='password']")
   WebElement Password;
   
   @FindBy(xpath="//input[@name='sub']")
   WebElement SumbitBtn;
   
   @FindBy(xpath="//input[@name='res']")
   WebElement Resetbtn;
   
   public void addnewcust()
   {
	   AddNewCustomer.click();   
   }
   
   public void custName(String cname) {
	   CustomerName.sendKeys(cname);
   }
   
   public void custgender() {
	   radiobutton.click();
   }
   
   public void setDate(String date) throws InterruptedException
	 {
		
		 Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("window.scrollTo(0,78.66666412353516)");
		
		Actions actions = new Actions(ldriver);
		
		actions.doubleClick(datElement).build().perform();
		 
	    Thread.sleep(3000);
		datElement2.click();
		datElement2.sendKeys(date);
		// datElement.sendKeys(Keys.TAB);
	 }
   

   
   
  /* public void custdob(String mm,String dd,String yy) {
	   DateOfBirth.sendKeys("yy-mm-dd");
	  // DateOfBirth.sendKeys(dd);
	  // DateOfBirth.sendKeys(yy);
   }*/
   
   public void custadress(String cadress)
   {
	   Address.sendKeys(cadress);
   }
   
   public void custcity(String ccity)
   {
	   City.sendKeys(ccity);
   }
   
   public void custstate(String cstate)
   {
	   State.sendKeys(cstate);
   }
   
   public void custmobile(String cmobno)
   {
	   MobileNo.sendKeys(cmobno);
   }
   
   public void custpin(String cpin)
   {
	   Pincode.sendKeys(cpin);
   }
   
   public void custEmail(String cemail)
   {
	   Email.sendKeys(cemail);
   }
   
   public void custpassword(String cpass)
   {
	   Password.sendKeys(cpass);
   }
   
   public void custsubmit() {
	   SumbitBtn.click();
   }
}
