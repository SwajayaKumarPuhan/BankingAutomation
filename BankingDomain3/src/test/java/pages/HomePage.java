package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;

public class HomePage {
	
	WebDriver ldriver;
	
	   public HomePage (WebDriver driver) 
	   {
	System.out.println("######################"+driver);
		  ldriver = driver;
		 ldriver = driver;
		 

		    PageFactory.initElements(new DefaultElementLocatorFactory(driver), this);
	   }
	   
	   @FindBy(xpath="//a[normalize-space()='New Customer']")
	   WebElement NewCustomer;
	   
	   @FindBy(xpath="//a[normalize-space()='Edit Customer']")    
	   WebElement EditCustomer;
	   
	   @FindBy(xpath="//a[normalize-space()='Delete Customer']")
	   WebElement DeleteCustomer;
	   
	   @FindBy(xpath="//a[normalize-space()='New Account']")
	   WebElement NewAccount;
	   
	   @FindBy(xpath="//a[normalize-space()='Edit Account']")
	   WebElement EditAccount;
	   
	   @FindBy(xpath="//a[normalize-space()='Delete Account']")    
	   WebElement DeleteAccount;
	   
	   @FindBy(xpath="//a[normalize-space()='Deposit']")
	   WebElement Deposit;
	   
	   @FindBy(xpath="//a[normalize-space()='Withdrawal']")
	   WebElement Withdrawl;
	   
	   @FindBy(xpath="//a[normalize-space()='Fund Transfer']")
	   WebElement FundTransfer;
	   
	   
	   @FindBy(xpath="//a[normalize-space()='Change Password']")    
	   WebElement ChangePassword;
	   
	   @FindBy(xpath="//a[normalize-space()='Balance Enquiry']")
	   WebElement BalanceEnquary;
	   
	   
	   @FindBy(xpath="//a[normalize-space()='Mini Statement']")
	   WebElement MiniStatement;
	   
	   @FindBy(xpath="//a[normalize-space()='Customised Statement']")    
	   WebElement CustomizedStatement;
	   
	   @FindBy(xpath="//a[normalize-space()='Log out']")
	   WebElement Logout;
	   
	   @FindBy(xpath="//a[normalize-space()='Home']") 
	   WebElement HomeBtn;
	   
	   
	   public void clickNewCustomer() {
		   NewCustomer.click();
	   }
	   
	   public void clickEditCustomer() {
		   EditCustomer.click();
	   }

	   public void clickDeleteCustomer() {
		   DeleteCustomer.click();
	   }

	   public void clickNewAccount() {
		   NewAccount.click();
	   }

	   public void clickEditAccount() {
		   EditAccount.click();
	   }
	   
	   public void clickDeleteAccount() {
		   DeleteAccount.click();
	   }
	   
	   public void clickDeposit() {
		   Deposit.click();
	   }

	   
	   public void clickWithdrwal() {
		   Withdrawl.click();
	   }

	   public void clickFundTransfer() {
		   FundTransfer.click();
	   }

	   public void clickChangePassword() {
		   ChangePassword.click();
	   }

	   public void clickBalanceEnquary() {
		   BalanceEnquary.click();
	   }

	   public void clickMiniStatement() {
		   MiniStatement.click();
	   }

	   public void clickCustomizedStatement() {
		   CustomizedStatement.click();
	   }
	   
	   public void clickLogout() {
		   Logout.click();
	   }

	   public void clickHomeBtn() {
		   HomeBtn.click();
	   }







}
