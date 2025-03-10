package com.easytrack.generic;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.easytrack.pom.LoginPage;


public class BaseClass {
	public static WebDriver driver;
	@BeforeTest
	public void openBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
	}
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
	@BeforeMethod
	public void login() throws IOException {
		FileLib f=new FileLib();
		String un = f.getPropertyData("username");
		String pwd = f.getPropertyData("password");
		LoginPage l=new LoginPage(driver);
		l.setLogin(un, pwd);
	}
	@AfterMethod
	public void logout() {
		
	}
	
}
