package qaclickacademy.mavenjava;

import java.io.FileInputStream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class firefox {
    WebDriver driver;
	@Test
	public void getURL() {
	/*	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vaibhav\\Firefox driver\\geckodriver.exe");
		 driver =new FirefoxDriver();
		driver.get("https://www.youtube.com/");
		System.out.println("Test case pass");   */
		
	//	FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"src\\main\\java\\resources\\data.properties");
	/*	System.setProperty("webdriver.chrome.driver",(System.getProperty("user.dir")+ "/src/main/java\\resources\\chromedriver.exe"));
		 driver =new ChromeDriver();
		 driver.get("https://www.youtube.com/");
			System.out.println("Test case pass");     */
			
		System.setProperty("webdriver.ie.driver", (System.getProperty("user.dir")+ "/src/main/java\\resources\\IEDriverServer.exe"));
		driver =new InternetExplorerDriver();
		driver.get("https://www.youtube.com/");
		System.out.println("Test case pass");	
		driver.close();
	}
}
