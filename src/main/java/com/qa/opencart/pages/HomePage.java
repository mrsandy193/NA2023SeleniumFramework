package com.qa.opencart.pages;

import org.openqa.selenium.By;

public class HomePage {
	By HomePageLog = By.id("logo");

	public void verifyHomePageLogo() {
		System.out.println("Home Page Logo Verification    ----  Sandeep");
	}

	public void clickOnHomePageLogo() {
		System.out.println("Click on Home Page Logo");
	}
}
