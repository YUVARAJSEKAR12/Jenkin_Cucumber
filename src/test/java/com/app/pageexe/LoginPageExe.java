package com.app.pageexe;

import com.app.base.Base;
import com.app.pageobject.LoginPagelocators;

public class LoginPageExe extends LoginPagelocators {
	
	public static void username(String user) {
		Base.inputText(getUsername(), user);
		
	}
		
	

}
