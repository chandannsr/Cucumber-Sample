package com.rc.cucumber.stepdefinition;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefintion1 {

	@When("^I logged in to eclipse$")
	public static void i_logged_in_to_eclipse() {
		System.out.println("I Logged in to eclipse");
	}
	
	@When("^I write program to print hello world$")
	public static void i_wirte_program_to_print_hello_world(){
		System.out.println("Print Hello World");
		
	}
	@When("^I verify hello world is print$")
	public static void i_verify_hello_world_is_print() {
		System.out.println("Hello World");
		
	}
	
	@When("^I install eclipse$")
	public static void i_install_eclipse() {
		System.out.println("Installed Eclipse");
		
	}
	
	@When("^I write program with '(.*)'$")
	public static void i_write_program(String text){
		System.out.println("I write program to print");
		System.out.println(text);		
	}
	@When("^I verify program with '(.*)'$")
	 public static void i_verify_program(String text){
	  System.out.println("I verify program to print");
	  System.out.println(text);  
	}
	
	@When("^I write program withone (\\d+)$")
	public void i_write_program_with_1(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I write program to print");
		  System.out.println(arg1);  

	}

	@Then("^I write program withtwo (\\d+)$")
	public void i_write_program_with_2(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I verify program to print");
		  System.out.println(arg1);  

	}
	 
	 @When("^I write program with datatables$")
	 public static void i_write_program_with_datatables(DataTable arg1) throws Throwable {
	  List<List<String>> data = arg1.raw();
	  System.out.println(data.get(0).get(0));
	  System.out.println(data.get(1).get(0));
	  System.out.println(data.get(0).get(1));
	  System.out.println(data.get(1).get(1));

	 }
	 
	 @When("^I write program with datatables using map$")
	 public static void i_write_program_with_datatables_using_map(DataTable arg1) throws Throwable {
	  List<Map<String,String>> data = arg1.asMaps(String.class,String.class);
	  System.out.println(data.get(0).get("Program"));
	  System.out.println(data.get(1).get("Comments"));
	  System.out.println(data.get(2).get("Serial"));

	 }
	 
	 
	 
}
