package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTesting {
@Test(priority = 1)
public void createCustomer(){
	Reporter.log("welcome", true);
}

@Test(dependsOnMethods = "createCustomer")
public void modifyCustomer(){
	Reporter.log("welcome", true);
}

@Test(dependsOnMethods = "createCustomer")
public void deleteCustomer(){
	Reporter.log("welcome", true);
}
}
