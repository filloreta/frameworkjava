package main.java.org.example.pageEvents;

import com.aventstack.extentreports.util.Assert;
import main.java.org.example.pageObjects.LoginPageElements;
import main.java.org.example.utils.ElementFetch;
import test.java.BaseTest;

public class LoginPageEvents {

    public void verifyLoginPageOpenOrNot(){
        ElementFetch elementFetch = new ElementFetch();
        BaseTest.logger.info("Verifying that the login page opened or not ");
        Assert.notNull(elementFetch.getWebElements("XPATH", LoginPageElements.loginText).size()==0,
                "Login page did not open");
    }
    public void enterEmailId(){
        ElementFetch elementFetch = new ElementFetch();
        BaseTest.logger.info("Entering the email ID");
        elementFetch.getWebElement("ID", LoginPageElements.emailAddress).sendKeys("f3shoshi@gmail.com");
    }

}
