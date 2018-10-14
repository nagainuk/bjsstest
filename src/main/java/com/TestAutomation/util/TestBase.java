package com.TestAutomation.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class TestBase 
{
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase()
	{
		try
		{
			prop=new Properties();
			InputStream fis= getClass().getClassLoader().getResourceAsStream("config.properties");
			prop.load(fis);
		}
		
		catch(IOException e )
		{
			e.getMessage();
		}
	}
	
	public static void initialisation()
	{
		String browserName=prop.getProperty("browser");
		if(browserName.equals("Firefox"))
		{
			//System.setProperty("webdriver.chrome.driver", "C:/Users/Tarakaram/Downloads/chromedriver_win32/chromedriver.exe");
			//driver=new ChromeDriver();
//			 System.setProperty("webdriver.gecko.driver", "C:\\Users\\Tarakaram\\Downloads\\geckodriver-v0.16.0-win64\\geckodriver.exe");
			 System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		        driver = new FirefoxDriver();

		}
		
		//driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(TestUtil.PageLoadTimeOut, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(TestUtil.ImplicitWait, TimeUnit.SECONDS);
		
	    driver.get(prop.getProperty("url"));
	    
		
		
		
	}

}
