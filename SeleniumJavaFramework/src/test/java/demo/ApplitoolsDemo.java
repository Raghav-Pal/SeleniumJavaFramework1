package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.selenium.Eyes;

public class ApplitoolsDemo {
	
	public static void main(String[] args) {

	       // Open a Chrome browser.
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\git\\SeleniumJavaFramework1\\SeleniumJavaFramework\\drivers\\chromedriver\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();

	       // Initialize the eyes SDK and set your private API key.
	       Eyes eyes = new Eyes();
	       eyes.setApiKey("x98ITG6Y8EjdSjxIhxVfo4cCuwJYgt6YgUNh0ghCsl1g110");

	       try{

	           // Start the test and set the browser's viewport size to 800x600.
	           eyes.open(driver, "Hello World!", "My first Selenium Java test!",
	                   new RectangleSize(800, 600));

	           // Navigate the browser to the "hello world!" web-site.
	           driver.get("https://applitools.com/helloworld?diff2");

	           // Visual checkpoint #1.
	           eyes.checkWindow("Hello!");

	           // Click the "Click me!" button.
	           driver.findElement(By.tagName("button")).click();

	           // Visual checkpoint #2.
	           eyes.checkWindow("Click!");

	           // End the test.
	           eyes.close();

	       } finally {

	           // Close the browser.
	           driver.quit();

	           // If the test was aborted before eyes.close was called, ends the test as aborted.
	           eyes.abortIfNotClosed();
	       }

	   }


}
