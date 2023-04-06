package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;// wo bh i band ho gya ab ha hah  nanhi pehle toh sab chal ta tha    maina ab sabband ho gya hna 
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;


public class LoginPage {
	WebDriver ldriver;
	
   public LoginPage(WebDriver driver) 
   {
System.out.println("######################"+driver);
	  ldriver = driver;
	 ldriver = driver;
	 

	    PageFactory.initElements(new DefaultElementLocatorFactory(driver), this);
   }
   
   @FindBy(xpath="//img[@alt='Guru99 Demo Sites']")
   WebElement Logo;
   
   @FindBy(xpath="//input[@name='uid']")    
   WebElement Userid;
   
   @FindBy(xpath="//input[@name='password']")
   WebElement Password;
   
   @FindBy(xpath="//input[@name='btnLogin']")
   WebElement Loginbtn;
   
   @FindBy(xpath="/html/body/div[3]/div/ul/li[15]/a")
   WebElement lnkLogout;
   
   public void setUserid(String user)
   {System.out.println("######################");
	   Userid.sendKeys(user);
   }
   
   public void setPassword(String pass)
   {System.out.println("######################");
	   Password.sendKeys(pass);
   }
   
  public  void clickLoginbtn()
   {System.out.println("######################");
	  Loginbtn.click();
   }
  
 
  
  public void clickLogout()
  {System.out.println("######################");
	  lnkLogout.click();
  }
    
}

