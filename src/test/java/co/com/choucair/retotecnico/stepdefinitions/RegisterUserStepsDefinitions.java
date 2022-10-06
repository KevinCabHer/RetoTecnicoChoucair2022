package co.com.choucair.retotecnico.stepdefinitions;


import co.com.choucair.retotecnico.runners.RegisterUser;
import co.com.choucair.retotecnico.tasks.OpenUtest;
import co.com.choucair.retotecnico.tasks.RegisterUserUtest;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class RegisterUserStepsDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^That kevin wants to create an account$")
    public void that_kevin_wants_to_create_an_account() {
        OnStage.theActorCalled("kevin").wasAbleTo(OpenUtest.thePage());
    }


    @When("^he creates a user by entering all the data$")
    public void he_creates_a_user_by_entering_all_the_data() {
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterUserUtest.register());
    }

    @Then("^he can see welcome to the site$")
    public void he_can_see_welcome_to_the_site() {

    }





}
