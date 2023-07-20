package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginPageContactApp;
import pages.docButondeCautare;

public class docButondeCautareTest extends BasePage {
    public docButondeCautare butondeCautare() {
        return new docButondeCautare();}

    public LoginPageContactApp login() {
        return new LoginPageContactApp();}
    @Test(description = "Testare Documentatie")
    @Parameters({"email", "pass","textCampCautare"})
    public void butonCautareTest(String email,String pass, String textCampCautare){
        login().clickCloseCookie();
        login().clickAuthenticationButton();
        login().addEmail(email);
        login().addPassword(pass);
        login().clickRememberMeCheckbox();
        login().clickLoginButton();
        butondeCautare().clickButonDocumentatie();
        butondeCautare().addCampdeCautare(textCampCautare);
        butondeCautare().butondeCautare();
       butondeCautare().clikLinkPlatiDiverse();
        butondeCautare().clickbuttonSmileFace();
        butondeCautare().verifMessage();
        //butondeCautare().verifMessage2();





    }







}
