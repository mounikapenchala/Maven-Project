package com.TestSenarios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.ObjectRepository.Locators;
import com.Utilities.CommonFunctions;
import com.Utilities.StaticVariables;

public class Jri_signin extends StaticVariables {

	CommonFunctions cfn = new CommonFunctions();
	Locators obj = new Locators();

	@Test
	public void f() throws Exception {
		File f = new File(".\\Testdata\\Td.properties");
		// to read file
		FileInputStream fi = new FileInputStream(f);
		Properties prop = new Properties();
		prop.load(fi);

		//cfn.chromeBrowserLaunch();
		driver.get(prop.getProperty("url_jri"));
		cfn.sendKeysByAnyLocator(obj.email_jri, prop.getProperty("username_jri"));
		cfn.sendKeysByAnyLocator(obj.password_jri, prop.getProperty("password_jri"));

		cfn.clickByAnyLocator(obj.signinbutton);

	}

	@Parameters("browser")
	@BeforeClass
	public void beforeclass(@Optional("ie") String browser) {
		cfn.crossbrowserlaunch(browser);

	}
}
