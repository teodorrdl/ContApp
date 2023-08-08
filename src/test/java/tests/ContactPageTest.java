package tests;

import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.ContactPage.ContactPage;
import pages.LoginPageContactApp;
import pages.docButondeCautare;

import java.io.IOException;

public class ContactPageTest extends BasePage {
    public ContactPage contact() {
        return new ContactPage();
    }

    public LoginPageContactApp login() {
        return new LoginPageContactApp();
    }

    @Test(description = "Testare sectiune Contact")
    @Parameters({"email", "password", "name", "emailTest","message"})
    public void contactTest(String email, String password, String name, String emailTest, String message) throws IOException {
        login().clickCloseCookie();
        login().clickAuthenticationButton();
        logger.log(LogStatus.PASS, "Autentificarea s-a creat cu succes!");
        login().addEmail(email);
        login().addPassword(password);
        login().clickRememberMeCheckbox();
        login().clickLoginButton();
        contact().clickButonDocumentatie();
        contact().clickButtonContact();
        contact().verifyEnableFrame();
        contact().clickEmailChoice2();
        contact().inputName(name);
        contact().inputEmail(emailTest);
        contact().inputMessage(message);
        contact().clickButtonSendMassage();
        contact().verifyFinalMessage();
    }
}
