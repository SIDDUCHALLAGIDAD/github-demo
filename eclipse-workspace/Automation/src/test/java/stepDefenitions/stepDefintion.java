package stepDefenitions;
package my.package.name

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

import java.nio.channels.AcceptPendingException;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefintion {

    @Given("^User is on Netbanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable 
    {
       
    }

    @When("^User login into application with username and password$")
    public void user_login_into_application_with_username_and_password() throws Throwable 
    {
     
    }

    @Then("^Home page is visible$")
    public void home_page_is_visible() throws Throwable
    {
       
    }

    @And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable
    {
       
    }

}
