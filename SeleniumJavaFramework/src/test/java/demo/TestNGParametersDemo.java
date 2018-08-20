package demo;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParametersDemo {
	
	@Test(priority=1, dependsOnGroups={"smoke.*"})
	@Parameters({"MyName"})
	public void test1(@Optional("Raghav") String name) {
		System.out.println("I am inside Test 1");
		System.out.println("Name is : "+name);
	}
	
	@Test(priority=2)
	public void test2() {
		System.out.println("I am inside Test 2");
	}
	
	@Test(groups=("smoke1"))
	public void test3() {
		System.out.println("I am inside Test 3");
	}
	
	@Test(groups=("smoke2"))
	public void test4() {
		System.out.println("I am inside Test 4");
	}

	
	
}
