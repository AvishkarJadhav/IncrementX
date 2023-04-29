package incrementX.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	//Load properties file
	
	public ReadConfig()
	{

		File src=new File("./Configurations/config.properties");
		
		try {
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is "+ e.getMessage());
		}
	}
	
	
	//load variables
	
	public String getApplicationURL()
	{
		String URL = pro.getProperty("BaseURL");
		return URL;
	}
	
	public String getFullName()
	{
		String Name = pro.getProperty("FullName");
		return Name;
	}
	
	public String getEmail()
	{
		String email = pro.getProperty("Email");
		return email;
	}
	
	public String getVideoURL()
	{
		String VURL = pro.getProperty("VideoURL");
		return VURL;
	}
	
	public String getCaptcha()
	{
		String capt = pro.getProperty("Captcha");
		return capt;
	}
	

}
