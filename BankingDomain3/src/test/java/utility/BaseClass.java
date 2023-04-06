package utility;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	
	ReadconfigFile read = new ReadconfigFile();
	
	public String browser= read.getBrowser();
	public String baseURL=read.getURL();
	public String username=read.getUserid();
	public String password=read.getPassword();
	public static Logger log;
	public static  WebDriver driver;
	
	

	@BeforeTest
	public void setup()
	
	{
		
		System.out.println(browser+"999999999999999999999999999999999999999999999999999");
		if(browser.equalsIgnoreCase("chrome"))
		{
     WebDriverManager.chromedriver().setup();
     
	driver = new ChromeDriver();
	log=Logger.getLogger("BankingDomain");
    PropertyConfigurator.configure("logfile.properties");
		}
		
		if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",".\\src\\test\\resources\\driver\\geckodriver.exe");
			 	driver = new FirefoxDriver();
	log=Logger.getLogger("BankingDomain");
	   PropertyConfigurator.configure("logfile.properties");
		}
		
		
		log=Logger.getLogger("BankingDomain");
	    PropertyConfigurator.configure("logfile.properties");
	}
	/*public String generated() {
   	String generatedstring= RandomStringUtils.randomAlphabetic(7);
   	 return(generatedstring);
    }
    

    public String randomNum()
    {
   	 String generatedstring2= RandomStringUtils.randomNumeric(4);
   	 return(generatedstring2);
    }*/
	
	@AfterTest
	public void tearDown()
	{
		
	driver.close(); 
	}
	
	 
}



