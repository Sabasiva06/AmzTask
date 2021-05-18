package org.locator;

import org.functional.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProceedToBuy extends LibGlobal {

	public ProceedToBuy() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "hlb-ptc-btn-native")
	private WebElement btnProceedToBuy;

	public WebElement getBtnProceedToBuy() {
		return btnProceedToBuy;
	}
	
	

}
