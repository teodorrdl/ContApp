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
    @Parameters({"username", "password", "nameSubscribeSection", "emailSubscribeSection"})
    public void fiscalityBlogTest(String username, String password, String nameSubscribeSection, String emailSubscribeSection) {
        loginPageContactApp().clickAuthenticationButton();
        loginPageContactApp().addEmail(username);
        loginPageContactApp().addPassword(password);
        loginPageContactApp().clickRememberMeCheckbox();
        loginPageContactApp().clickLoginButton();
        fiscalityBlog().clickAcceptCookieButton();
        fiscalityBlog().clickFiscalityBlogButton();
        fiscalityBlog().clickPfaContability();
        fiscalityBlog().clickReadMore();
        fiscalityBlog().clickPreviousPage();
        fiscalityBlog().clickSecondPage();
        fiscalityBlog().clickNormeAgricole();
        fiscalityBlog().clickNormeDeVenit(0, 700);
        fiscalityBlog().clickGhidPFA(0, 900);
        fiscalityBlog().clickNextPage();
        fiscalityBlog().clickPfaOperation();
        fiscalityBlog().clickPrevPage();
        fiscalityBlog().clickNormeAgricolePrevPage();
        fiscalityBlog().addNameSubscribeSection(nameSubscribeSection);
        fiscalityBlog().addEmailSubscribeSection(emailSubscribeSection);
        fiscalityBlog().clickTermsAndConditios();
        fiscalityBlog().clickSubscribeSection();
    }

}
