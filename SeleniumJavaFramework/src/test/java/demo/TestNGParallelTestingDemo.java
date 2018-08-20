package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGParallelTestingDemo {
	
	WebDriver driver=null;
	
	@Test(threadPoolSize=3, invocationCount=3, timeOut=1000)
	public void test1() throws Exception {
		System.out.println("I am inside Test 1 | "+Thread.currentThread().getId());
	}
	
	@Test
	public void test2() throws Exception {
		System.out.println("I am inside Test 2 | "+Thread.currentThread().getId());
	}
	
	@Test
	public void test3() throws Exception {
		System.out.println("I am inside Test 3 | "+Thread.currentThread().getId());
	}

}
