package com.accenture.Cucumber.steps.serenity;

import com.accenture.Cucumber.pages.DictionaryPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class EndUserSteps {

    DictionaryPage dictionaryPage;

    @Step
    public void enters(String keyword) {
        dictionaryPage.enter_keywords(keyword);
    }

    @Step
    public void starts_search() {
        dictionaryPage.lookup_terms();
    }
    
    @Step
    public void select_video() {
        dictionaryPage.click_Video();
    }
    
    @Step
    public void compartir() {
        dictionaryPage.click_compartir();
    }
    
    @Step
    public void facebook() {
        dictionaryPage.click_Facebook();
        
    }
    
    @Step
    public void start_sesion_facebook(String usuario,String password) throws InterruptedException {
        dictionaryPage.startSesionFacebook(usuario,password);
    }
    
    
    

    @Step
    public void should_see_definition(String definition) {
        assertThat(dictionaryPage.getDefinitions(), hasItem(containsString(definition)));
    }

    @Step
    public void is_the_home_page() {
        dictionaryPage.open();
    }

    @Step
    public void looks_for(String term) {
        enters(term);
        starts_search();
    }
    
    /*@Step
    public void confirmar () {
    	dictionaryPage.getDriver().navigate().to("https://www.facebook.com/practicetest.practica.9?lst=100027751716301%3A100027751716301%3A1532718649");
    	
    }*/
    
 
    
}