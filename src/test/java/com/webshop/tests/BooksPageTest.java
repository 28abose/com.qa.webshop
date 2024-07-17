package com.webshop.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BooksPageTest extends BaseTest{

	@Test(priority = 1)
	public void testBookPageTitle() {
		Logger = report.createTest("test books page title");
		homePage.clickBooksMenu();
		Logger.pass("clicked on books menu");
		String title = booksPage.getBooksPageTitle();
		Logger.pass("got the page title");
		Assert.assertTrue(title.contains("Books"));
		Logger.pass("verified the page title contains books");
	}
	
	@Test(priority = 2)
	public void testDisplaySize() {
		Logger = report.createTest("test books display size");
		homePage.clickBooksMenu();
		Logger.pass("clicked on books menu");
		String title = booksPage.getBooksPageTitle();
		Logger.pass("got the page title");
		booksPage.changeDisplaySize(0);
		int expected = 4;
		int actual = booksPage.getBooksGridSize();
		System.out.println(actual);
		Assert.assertEquals(actual, expected);
		Logger.pass("verified the books grid size change to 4");
	}
	
}
