package org.EndToEndMaven;

import org.EndToEndMaven.BrowserUtility.BrowserService;

public class BrowserLaunchTest {

	public static void main(String[] args) {
		BrowserService browserService = new BrowserService();
		browserService.launchBrowser();
		browserService.launchURL();
		browserService.closeBrowser();
	}

}
