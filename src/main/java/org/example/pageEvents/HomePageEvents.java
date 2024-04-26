package main.java.org.example.pageEvents;

import main.java.org.example.pageObjects.HomePageElements;
import main.java.org.example.utils.ElementFetch;
import test.java.BaseTest;

public class HomePageEvents {

    public void clickOnSignInButton(){
        ElementFetch elementFetch = new ElementFetch();
        BaseTest.logger.info("Clicking on signin button");
        elementFetch.getWebElement("XPATH", HomePageElements.signInButton).click();
    }
}
