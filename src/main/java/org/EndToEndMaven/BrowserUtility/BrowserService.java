package org.EndToEndMaven.BrowserUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserService {
	private WebDriver driver; 
	
	public void launchBrowser() {
		System. setProperty("webdriver.chrome.driver", "./LocalDriver/chromedriver.exe");
		 this.driver = new ChromeDriver();
	}
	
	public void launchURL() {
			driver.get("https://www.google.com");	
	}

	public void closeBrowser() {
		driver.quit();
	}

}
