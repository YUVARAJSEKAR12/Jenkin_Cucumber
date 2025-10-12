package com.app.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.app.base.Base;

public class LoginPagelocators extends Base {
	
	public static WebElement getUsername() {
		return driver.findElement(By.id("username"));
	}

}
