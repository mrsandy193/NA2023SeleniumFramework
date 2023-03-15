package com.qa.opencart.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.opencart.constants.AppConstants;
import com.qa.opencart.utils.ElementUtil;

public class AccountsPage {

	private ElementUtil eleUtil;
	private WebDriver driver;

	private By logoutLink = By.linkText("Logout");
	private By searchTextField = By.name("search");
	private By accountsHeadersText = By.cssSelector("#content h2");
	private By searchButton = By.cssSelector("#search button");
	
	public AccountsPage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);
	}

	public String getAccountsPageTitle() {
		String pageTitle = eleUtil.waitForTitleContainsAndFetch(AppConstants.DEFAULT_MEDIUM_TIME_OUT, AppConstants.ACCOUNTS_PAGE_TITLE_VALUE);
		System.out.println("Accounts Page Title: " + pageTitle);
		return pageTitle;
	}

	public String getAccountPageURL() {
		String url = eleUtil.waitForURLContainsAndFetch(AppConstants.DEFAULT_MEDIUM_TIME_OUT, AppConstants.ACCOUNTS_PAGE_URL_FRACTION_VALUE);
		System.out.println("Accounts Page URL: " + url);
		return url;
	}

	public boolean isLogoutLinkExist() {
		return eleUtil.waitForElementVisible(logoutLink, AppConstants.DEFAULT_SHORT_TIME_OUT).isDisplayed();
	}

	public boolean isSearchExist() {
		return eleUtil.waitForElementVisible(searchTextField, AppConstants.DEFAULT_SHORT_TIME_OUT).isDisplayed();
	}

	public List<String> getAccountsPageHeadersList() {
		List<WebElement> accHeadersList = eleUtil.waitForElementsVisible(accountsHeadersText, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
		List<String> accHeadersListTexts = new ArrayList<>();
		for (WebElement e : accHeadersList) {
			accHeadersListTexts.add(e.getText());
		}
		return accHeadersListTexts;
	}
	
	public SearchPage performSearch(String searchKey)
	{
		eleUtil.doSendKeys(searchTextField, searchKey);
		eleUtil.doClick(searchButton);
		return new SearchPage(driver);
	}

}
