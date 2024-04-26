package test.java;

import main.java.org.example.pageEvents.HomePageEvents;
import main.java.org.example.pageEvents.LoginPageEvents;
import org.testng.annotations.Test;

public class SampleTest  extends BaseTest{

    @Test
    public void sampleMethodforEmailEntering(){
        HomePageEvents homePageEvents = new HomePageEvents();
        homePageEvents.clickOnSignInButton();

        LoginPageEvents loginPageEvents = new LoginPageEvents();
        loginPageEvents.verifyLoginPageOpenOrNot();
        loginPageEvents.enterEmailId();
    }
}
