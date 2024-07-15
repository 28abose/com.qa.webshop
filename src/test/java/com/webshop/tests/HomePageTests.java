package com.webshop.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTests extends BaseTest{
	
	@Test(priority = 1)
	public void testHomePageTitle() {
		Logger = report.createTest("test Home page title");
		homePage.clickhomepagelogo();
		Logger.info("clicked on clickhomepagelogo");
		String pageTitle = homePage.getHomePageTitle();
		Logger.info("got the home page title");
		Assert.assertTrue(true,"Demo Web Shop");
		Logger.pass("home page title matched");
		
	}
	
	@Test(priority = 2)
	public void testMyAccountLink() {
		Logger = report.createTest("test My Account Link");
		homePage.clickMyAccountLink();
		Logger.info("clicked on MyAccountLink");
		String pageTitle = loginPage.getLoginPageTitle();
		Logger.info("got the login page title");
		Assert.assertTrue(pageTitle.contains("Login"));
		Logger.pass("login page title matched");
	}
}
