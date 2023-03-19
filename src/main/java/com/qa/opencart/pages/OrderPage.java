package com.qa.opencart.pages;

import org.openqa.selenium.By;

public class OrderPage {
	By loc = By.id("order");
	By price = By.id("price");
	By quantity = By.id("quantity");
	
	public void getOrder()
	{
		System.out.println("Get Order");
	}
	
	public void getPrice(int quantity, int price)
	{
		int totalPrice = price * quantity;
		System.out.println("Total Price: " + totalPrice);
	}
}
