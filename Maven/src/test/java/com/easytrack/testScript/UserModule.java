package com.easytrack.testScript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class UserModule {
	@Test
	public void name() {
		Reporter.log("User module created successfully",true);
	}
}
