package com.ObjectRepository;

import org.openqa.selenium.By;

public class Locators {
	public final By email = By.name("email");
	public final By password = By.name("pass");
	public final By loginButton = By.id("loginbutton");
	
	
	
	// JRI locators
	public final By email_jri = By.name("txtUserName");
    public final By password_jri = By.name("txtPasswd");
    public final By signinbutton = By.id("imgbtnSignin");
}
