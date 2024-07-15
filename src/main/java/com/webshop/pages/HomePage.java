package com.webshop.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.webshop.base.DriverScript;

public class HomePage extends DriverScript{
	
//******************** Page Locators***************************
	
	@FindBy(linkText = "Log in") private WebElement loginLink;
	@FindBy(linkText = "Log out") private WebElement logoutLink;
	@FindBy(xpath = "//img[@alt='Tricentis Demo Web Shop']") private WebElement homepagelogo;
	//@FindBy(xpath = "//h3[text()='My account']") private WebElement myaccountlink;
	@FindBy(linkText = "My account") private WebElement myaccountlink;
	
	//******************** Page Initialization***************************
	public HomePage() {
		PageFactory.initElements(driver,this);
	}
	
	//******************** Page Methods/Actions***************************
	
	public boolean isLogoutLinkPresent() {
		return logoutLink.isDisplayed();
	}
	
	public void clickLoginLink() {
		loginLink.click();
	}
	
	public void clickLogout() {
		logoutLink.click();
	}
	
	public String getHomePageTitle() {
		return driver.getTitle();
		}
	
	public void clickhomepagelogo() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,3800)");
		homepagelogo.click();
	}
	public void clickMyAccountLink() {
		myaccountlink.click();
	}
	
	public void isDisplayed() {
		myaccountlink.isDisplayed();
	}
	
}
