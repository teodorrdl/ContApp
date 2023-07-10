package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.FiscalityBlog;
import pages.LoginPageContactApp;

public class FiscalityBlogTest extends BasePage {

    public LoginPageContactApp loginPageContactApp() {
        return new LoginPageContactApp();
    }

    public FiscalityBlog fiscalityBlog() {
        return new FiscalityBlog();
    }

    @Test(description = "Test the fiscality blog")
    @Parameters({"username", "password"})
    public void fiscalityBlogTest(String username, String password) {
        loginPageContactApp().clickAuthenticationButton();
        loginPageContactApp().addEmail(username);
        loginPageContactApp().addPassword(password);
        loginPageContactApp().clickRememberMeCheckbox();
        loginPageContactApp().clickLoginButton();
        fiscalityBlog().clickAcceptCookieButton();
        fiscalityBlog().clickFiscalityBlogButton();
        fiscalityBlog().clickPfaContability(0, 6000);
        fiscalityBlog().clickReadMore();
        fiscalityBlog().clickPreviousPage();
        fiscalityBlog().clickSecondPage();
    }

}
