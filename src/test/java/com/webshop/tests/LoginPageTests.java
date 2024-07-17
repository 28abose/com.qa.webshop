package com.webshop.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTests extends BaseTest {	

	@Test(priority = 1,enabled = false)
	public void testLoginPageTitle() {
		Logger = report.createTest("test login page title");
		homePage.clickLoginLink();
		Logger.info("clicked on login link");
		String pageTitle = loginPage.getLoginPageTitle();
		Logger.info("got the login page title");
		Assert.assertTrue(pageTitle.contains("Login"));
		Logger.pass("login page title matched");
	}

	@Test(priority = 2,enabled = false)
	public void testWelcomeSignIn() {
		Logger = report.createTest("test welcome sign in");
		homePage.clickLoginLink();
		Logger.info("clicked on login link");
		String actual = loginPage.validateWelcomeText();
		System.out.println(actual);
		Logger.info("retrived the text from welcome sign in");
		Assert.assertTrue(actual.contains("Welcome"));
		Logger.pass("text contains welcome word");
	}

	@Test(priority = 3,enabled = false)
	public void testForgotPasswordPasswordIsDisplayed() {
		Logger = report.createTest("test forgot password link is displayed");
		homePage.clickLoginLink();
		Logger.info("clicked on login link");
		boolean flag = loginPage.isForgotPasswordLinkPresent();
		System.out.println(flag);
		Logger.info("element forgot password link is located");
		Assert.assertTrue(flag);
		Logger.pass("forgot password link is displayed");
	}

	@Test(priority = 4,dataProvider = "wsdata")
	public void testLoginFunction(String username, String password) {
		Logger = report.createTest("test login functionality");
		homePage.clickLoginLink();
		Logger.info("clicked on login link");
		loginPage.enterEmailId(username);
		Logger.info("entered email id");
		loginPage.enterPassword(password);
		Logger.info("entered password");
		loginPage.clickLoginButton();
		Logger.info("clicked on login button");
		boolean flag = homePage.isLogoutLinkPresent();
		System.out.println(flag);
		Logger.info("located logout link");
		Assert.assertTrue(flag);
		Logger.pass("user able to successfully log in");
		homePage.clickLogout();
		Logger.info("clicked on logout");
	}

	@Test(priority = 5,enabled = false)
	public void testLoginInvalidCredientials() {
		Logger = report.createTest("test login functionality");
		homePage.clickLoginLink();
		Logger.info("clicked on login link");
		loginPage.enterEmailId("selauto1@test.com");
		Logger.info("entered email id");
		loginPage.enterPassword("");
		Logger.info("entered password");
		loginPage.clickLoginButton();
		Logger.info("clicked on login button");
		boolean flag = homePage.isLogoutLinkPresent();
		System.out.println(flag);
		Logger.info("located logout link");
		Assert.assertTrue(flag);
		Logger.pass("user able to successfully log in");
		homePage.clickLogout();
		Logger.info("clicked on logout");
	}
}
