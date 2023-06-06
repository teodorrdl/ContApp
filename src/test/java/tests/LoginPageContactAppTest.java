package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginPageContactApp;

public class LoginPageContactAppTest extends BasePage {
    public LoginPageContactApp loginPageContactApp() {
        return new LoginPageContactApp();
    }

    @Test(description = "Happy Test!",priority = 3)
    @Parameters({"username", "password"})
    public void verifyLogin(String username, String password) {
        loginPageContactApp().clickAuthenticationButton();
        loginPageContactApp().addEmail(username);
        loginPageContactApp().addPassword(password);
        loginPageContactApp().clickRememberMeCheckbox();
        loginPageContactApp().clickLoginButton();
    }

    @Test(description = "Verify the login page for both, when the field is blank and Submit button is clicked.",priority = 1)
    @Parameters({"username", "password"})
    public void verifyLoginWithBlankFields(String username, String password) {
        loginPageContactApp().clickAuthenticationButton();
        loginPageContactApp().addEmail(username);
        loginPageContactApp().addPassword(password);
        loginPageContactApp().clickRememberMeCheckbox();
        loginPageContactApp().clickLoginButton();
        loginPageContactApp().verifyAlertMessages();
    }

    @Test(description = "Verify if a user cannot login with a valid username and an invalid password.",priority = 2)
    @Parameters({"username", "invalidPassword"})
    public void verifyLoginWithInvalidPassword(String username, String invalidPassword) {
        loginPageContactApp().clickAuthenticationButton();
        loginPageContactApp().addEmail(username);
        loginPageContactApp().addPassword(invalidPassword);
        loginPageContactApp().clickRememberMeCheckbox();
        loginPageContactApp().clickLoginButton();
        loginPageContactApp().verifyAlertMessages();
    }
}

