package tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.CreateAccountPage;
import pages.LoginPageContactApp;

public class CreateAccountTest extends BasePage {

    public CreateAccountPage createAccount() {
        return new CreateAccountPage();
    }

    @Test(description = "Happy Test!")
    @Parameters({"email", "firstname","lastname","password","confPassword"})
    public void createAccountTest(String email, String firstname, String lastname, String password, String confPassword) {
        createAccount().clickAutentification();
        createAccount().clickCreateAccountButton();
        createAccount().firstemail(email);
        createAccount().clickContinue();
        Assert.assertTrue(createAccount().verifyemail(email),"Email incorect!");
        createAccount().addfirstname(firstname);
        createAccount().addlastname(lastname);
        createAccount().addpassword(password);
        createAccount().confirmpassword(confPassword);
        createAccount().clickTermsandConditions();
        createAccount().send();

    }
}
