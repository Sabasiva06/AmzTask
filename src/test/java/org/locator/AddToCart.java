package org.locator;

import org.functional.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart extends LibGlobal {

	public AddToCart() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "add-to-cart-button")
	private WebElement btnAddToCard;

	public WebElement getBtnAddToCard() {
		return btnAddToCard;
	}

}
