package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SauceLabsDemo {

	public static final String USERNAME = "Raghav-Pal";
	public static final String ACCESS_KEY = "ba7b3b44-e6de-4f06-8d0c-5642dccb84e2";
	public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";

	public static void main(String[] args) throws Exception {

		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("platform", "Linux");
		caps.setCapability("version", "latest");
		caps.setCapability("name", "GoogleTest1");
		caps.setCapability("extendedDebugging", "true");
		caps.setCapability("buildNumber", "3.0");

		WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);

//		String projectPath = System.getProperty("user.dir");
//		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		System.out.println(driver.getTitle());
		
		driver.quit();
		System.out.println("Test Completed");
	}

}
