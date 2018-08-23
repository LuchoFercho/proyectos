package com.accenture.Cucumber.steps;

import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import com.accenture.Cucumber.steps.serenity.EndUserSteps;

public class DefinitionSteps {

    @Steps
    EndUserSteps anna;

    @Given("the user is on the Wikionary home page")
    public void givenTheUserIsOnTheWikionaryHomePage() {
        anna.is_the_home_page();
    }

    @When("the user looks up the definition of the word '(.*)'")
    public void whenTheUserLooksUpTheDefinitionOf(String word) {
        anna.looks_for(word);
    }
    
    @When("the user click in the video")
    public void theUserClickInTheVideo() {
        anna.select_video();
    }
    
    @When("the user click in the bootom share")
    public void theUserClickInTheBootomShare() {
        anna.compartir();
    }
    
    @When("the user click in the bootom facebook")
    public void theUserClickInTheBootonFacebook() {
        anna.facebook();
    }
    
    @When("the User Start Sesion In Facebook '(.*)' '(.*)'")
    public void theUserStartSesionInFacebook(String usuario,String password) throws InterruptedException {
        anna.start_sesion_facebook(usuario,password);
    }
    
    
    


    @Then("they should see the definition '(.*)'")
    public void thenTheyShouldSeeADefinitionContainingTheWords(String definition) {
       // anna.confirmar();
    	anna.should_see_definition(definition);
    }

}
