package image;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class popup {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","C:\\Selenium Webdriver\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		Properties prop = new Properties();
		File file = new File("test.properties");
		FileInputStream fis = new FileInputStream(file); 
		prop.load(fis);
		
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(prop.getProperty("url"));
	
		
 

	}

}
