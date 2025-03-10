package com.easytrack.testScript;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.easytrack.generic.ListenerImplementation.class)
public class TaskModule {
	
	@Test
	public void demo() {
		Reporter.log("This is demo project-01",true);
	}
	@Test
	public void user() {
		Reporter.log("This is user project-02",true);
	}

}
