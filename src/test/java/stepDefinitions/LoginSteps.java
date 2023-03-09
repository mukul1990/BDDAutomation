package stepDefinitions;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	

	@Given("Validate the browser")
	public void validate_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Browser is validated");
	}
	@When("browser is triggered")
	public void browser_is_triggered() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Browser is triggered");
	}
	@Then("check if browser is started")
	public void check_if_browser_is_started() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Broser is started successfully");
	}



	 @Given("^user is navigated to Home page$")
	    public void user_is_navigated_to_home_page() throws Throwable {
	        System.out.println("User is redirected to Home Page");
	    }

	 @When("user enters into applcation with {string} username and {string} password")
	 public void user_enters_into_applcation_with_username_and_password(String username, String password) {
	    	 System.out.println(username);
	    	 System.out.println(password);
	    }

	    @Then("^Home page is displayed$")
	    public void home_page_is_displayed() throws Throwable {
	    	 System.out.println("Home PAge is displayed");
	    }

	    

	    @Then("user details is displayed {string}")
	    public void user_details_is_displayed(String arg) {
	        // Write code here that turns the phrase above into concrete actions
	    	 System.out.println("The details are displayed:"+arg);
	    }

	   

	    @When("user enters into applcation with following details")
	    public void user_enters_into_applcation_with_following_details(DataTable dataTable) {
//	      List<String>rows=dataTable.asList(String.class);
	      System.out.println(dataTable.cell(0, 0));
	      System.out.println(dataTable.cell(0, 1));
	      System.out.println(dataTable.cell(0, 2));
	      System.out.println(dataTable.cell(0, 3));
	      System.out.println(dataTable.cell(1, 0));
	      System.out.println(dataTable.cell(1, 1));
	      System.out.println(dataTable.cell(1, 2));
	      System.out.println(dataTable.cell(1, 3));
	    }


	    @When("^user enters into UI applcation with (.+) and (.+) details$")
	    public void user_enters_into_ui_applcation_with_and_details(String username, String password) throws Throwable {
	        System.out.println(username);
	        System.out.println(password);
	    }




}
