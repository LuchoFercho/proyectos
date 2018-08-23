package com.accenture.Cucumber.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import net.serenitybdd.core.pages.WebElementFacade;
import java.util.stream.Collectors;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;

import java.util.ArrayList;
import java.util.List;

@DefaultUrl("https://www.youtube.com/")
public class DictionaryPage extends PageObject {
	
	WebDriver driver;

    @FindBy(xpath="//input[@id='search']")
    private WebElementFacade searchTerms;

    @FindBy(xpath="//button[@id='search-icon-legacy']")
    private WebElementFacade lookupButton;
    
    
    @FindBy(xpath="//div[@id='contents']//ytd-video-renderer[2]//div[1]//ytd-thumbnail[1]//a[1]//yt-img-shadow[1]//img[1]")
    private WebElementFacade clickVideo;
    
    @FindBy(xpath="//ytd-button-renderer[@class='style-scope ytd-menu-renderer force-icon-button style-default size-default']//yt-formatted-string[@id='text']")
    private WebElementFacade botonCompartir;
    
    @FindBy(xpath="//div[@id='contents']//ytd-share-target-renderer[2]//button[1]")
    private WebElementFacade botonFacebook;
    
    @FindBy(xpath="//input[@id='email']")
    private WebElementFacade usuarioFacebook;
    
    @FindBy(xpath="//input[@id='pass']")
    private WebElementFacade passwordFacebook;
    
    
    @FindBy(xpath="//span[@id='u_0_1w']")
    private WebElementFacade publicar;
    
    
    public void enter_keywords(String keyword) {
        searchTerms.type(keyword);
    }

    public void lookup_terms() {
        lookupButton.click();
    }
    
    public void click_Video() {
        clickVideo.click();
    }
    
    public void click_compartir() {
    	botonCompartir.click();
    }
    
    public void click_Facebook() {
    	botonFacebook.click();
    	getDriver().close();
    }
    
    public void startSesionFacebook(String usuario, String password) throws InterruptedException {
    	driver=getDriver();
    	ArrayList<String> s=new ArrayList<String>(driver.getWindowHandles());
    	driver.switchTo().window(s.get(0));
    	usuarioFacebook.type(usuario);
    	passwordFacebook.type(password+"\n");
    	publicar.click();
    	Thread.sleep(5000);
    }
    
    
    
   
    
    
    

    public List<String> getDefinitions() {
        WebElementFacade definitionList = find(By.tagName("ol"));
        return definitionList.findElements(By.tagName("li")).stream()
                             .map( element -> element.getText() )
                             .collect(Collectors.toList());
    }
}