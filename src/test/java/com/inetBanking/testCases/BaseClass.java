package com.inetBanking.testCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetBanking.utilities.ReadConfig;



public class BaseClass {
	ReadConfig readConfig= new ReadConfig();
	
	public String baseURL = readConfig.getApplicationURL();
	public String username = readConfig.getUserName();
	public String password = readConfig.getPassword();
	//public String browser = readConfig.getBrowser();
	
	public static WebDriver driver;
	public static Logger logger;
	
	@Parameters("browser")
	@BeforeClass
	public void initialization(String br) {
		
		
		//Log4j
		//String log4jConfPath = "//inetBankingv1//log4j.properties";
		logger = Logger.getLogger("eBanking");
		PropertyConfigurator.configure("log4j.properties");
		
		if(br.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", readConfig.getChromepath());
			driver =new ChromeDriver();
		}
		else if(br.equals("firefox")) {
			
			System.setProperty("webdriver.firefox.driver", readConfig.getfirefoxpath());
			driver =new FirefoxDriver();
		}
		else if(br.equals("ie")) {
			
			System.setProperty("webdriver.ie.driver",readConfig.getiepath());
			driver =new InternetExplorerDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseURL);
		driver.manage().window().maximize();
		
		
	}
	
	
	@AfterClass
	public void tearDown() {
		
		
		driver.quit();
		
	}

	
	public void captureScreenshot(WebDriver driver, String tname) throws IOException {
		
		TakesScreenshot ts =(TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir")+"/Screenshots/" +tname +".png");
		FileUtils.copyFile(source, target);
		System.out.println("ScreenShot taken");
	}

}
