package com.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CommonFunctions extends StaticVariables {

	public void chromeBrowserLaunch() {
		System.setProperty("webdriver.chrome.driver", ".\\browserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	/***************** SendKeys ******************/
	public void sendKeysByAnyLocator(By locator, String inputdata) {

		try {
			WebElement ele = driver.findElement(locator);
			if (ele.isDisplayed() && ele.isEnabled()) {
				ele.clear();
				System.out.println(ele + "locator has displayed");
				ele.sendKeys(inputdata);

			} else {
				System.out.println("element is NOT displayed or Enbled state, please check*****");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/***************** Click *****************/

	public void clickByAnyLocator(By locator) {

		try {
			WebElement ele = driver.findElement(locator);
			if (ele.isDisplayed() && ele.isEnabled()) {
				ele.click();
				System.out.println(ele + "locator has displayed");
			} else {
				System.out.println("element is NOT displayed or Enbled state, please check*****");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/*********** CrossBrowserLaunch ************/
	public void crossbrowserlaunch(String browser) {
		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\browserDrivers\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", ".\\browserDrivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", ".\\browserDrivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();

		}
	}
}