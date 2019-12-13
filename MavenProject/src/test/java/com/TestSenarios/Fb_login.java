package com.TestSenarios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.ObjectRepository.Locators;
import com.Utilities.CommonFunctions;
import com.Utilities.StaticVariables;

public class Fb_login extends StaticVariables {

	CommonFunctions cfn = new CommonFunctions();
	Locators obj = new Locators();

	@Test
	public void f() throws Exception {
		File f = new File(".\\Testdata\\Td.properties");
		//to read file
		FileInputStream fi = new FileInputStream(f);
		Properties prop = new Properties();
		prop.load(fi);
		
		//cfn.chromeBrowserLaunch();
		driver.get(prop.getProperty("url"));
        cfn.sendKeysByAnyLocator(obj.email, prop.getProperty("username"));
		cfn.sendKeysByAnyLocator(obj.password, prop.getProperty("password"));

		cfn.clickByAnyLocator(obj.loginButton);

	}
	@Parameters("browser")
	@BeforeClass
	public void beforeclass(String browser) {
		cfn.crossbrowserlaunch(browser);

	}
}
