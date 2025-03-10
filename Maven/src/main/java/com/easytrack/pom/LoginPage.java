package com.easytrack.pom;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	
	@FindBy(xpath = "//input[@id='email']")
	private WebElement emailTbx;
	
	@FindBy(xpath = "//input[@id='pass']")
	private WebElement pwdTbx;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void setLogin(String un,String pw) {
		//UTILIZATION
		emailTbx.sendKeys(un);
		pwdTbx.sendKeys(pw);
	}
	
}
