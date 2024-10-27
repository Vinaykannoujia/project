package wiz.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import  org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	public static WebDriver driver;
	public static Properties prop;
	
	@BeforeTest
	
	public void LoadConfig() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\hmaca\\eclipse-workspace\\Wizcommerce\\Configuration\\Config.properties");
			prop.load(ip);
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	public static void LaunchApp() {
		String browserName = prop.getProperty("browser");
		if(browserName.contains("Chrome")) {
			driver= new ChromeDriver();
		}
		else if(browserName.contains("FireFox")) {
			driver = new FirefoxDriver();
		}
		driver.get(prop.getProperty("url"));
	}
}
