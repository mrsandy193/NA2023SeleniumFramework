package com.qa.opencart.pages;

import org.openqa.selenium.By;

public class HomePage {
	By HomePageLogo = By.id("logo");

	public void verifyHomePageLogo() {
		System.out.println("Home Page Logo Verification    ----  Sandeep");
	}

	public void clickOnHomePageLogo() {
		System.out.println("Click on Home Page Logo");
	}
	
	public void navigateToAccountsPage()
	{
		System.out.println("Navigate To Accounts Page");
	}
}
