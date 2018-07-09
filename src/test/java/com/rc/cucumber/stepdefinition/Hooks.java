package com.rc.cucumber.stepdefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Hooks {

	@Before
	public static void beforehook() {
		System.out.println("Before hooks");
	}

	@After
	public static void afterhooks() {
		System.out.println("Afterhooks");
		
	}
}
