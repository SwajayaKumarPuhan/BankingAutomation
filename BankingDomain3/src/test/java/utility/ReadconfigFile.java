package utility;

import java.io.FileReader;
import java.util.Properties;

public class ReadconfigFile {

 Properties properties;
	
	
	public ReadconfigFile()  {
		try {
		FileReader reader=new FileReader("C:\\Users\\Public\\BankingDomain2\\src\\test\\resources\\configue.properties");
		properties =new Properties();
		properties.load(reader);
		}
		catch(Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
     

	}
	
	
	
	public String getURL()
	{
		return  properties.getProperty("baseURL");
	}
	
	
	
	public String getBrowser()
	{
		return  properties.getProperty("browser");
	}
	
	
	public String getUserid()
	{
		return  properties.getProperty("Userid");
	}
	
	
	
	
	public String getPassword()
	{
		return  properties.getProperty("Password");
	}

}

