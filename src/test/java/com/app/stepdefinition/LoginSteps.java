package com.app.stepdefinition;

import com.app.pageexe.LoginPageExe;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps  {
	@Given("Load the browser")
	public void load_the_browser() {
	    System.out.println("Chrome");
	}
	@Given("Load the URL")
	public void load_the_url() {
	   System.out.println("url");
	}
	@When("Enter the username {string}")
	public void enter_the_username(String user) {
	    System.out.println(user);
	}
	
	@When("Enter the password {string}")
	public void enter_the_password(String pass) {
	    System.out.println(pass);
	}
	@When("Click the login button")
	public void click_the_login_button() {
		System.out.println("login Button");
	}
	@Then("Validate the home page")
	public void validate_the_home_page() {
	   System.out.println("homepage");
	}

	

}
