package tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginPageContactApp;
import pages.OrderSubscription.OrderSubscriptionFlow;
import pages.ReceiptsAndPayments.HouseBankJournal;
import pages.UtilInformations.UtilInformations;

public class UtilInformationsTest extends BasePage {

    public LoginPageContactApp loginPageContactApp() {
        return new LoginPageContactApp();
    }
    public OrderSubscriptionFlow newOrderSubscription(){
        return new OrderSubscriptionFlow();
    }
    public HouseBankJournal accessHouseBankJournal() {
        return new HouseBankJournal();
    }
    public UtilInformations utilInfo() {
        return new UtilInformations();
    }

    @Test(description = "Happy Test! Check informatii utile!", priority = 0)

    @Parameters({"email","password","currency"})
    public void testInfo(String email, String password, String currency) {
        newOrderSubscription().verifEnableButtonTrustClose();
        loginPageContactApp().clickAuthenticationButton();
        loginPageContactApp().addEmail(email);
        loginPageContactApp().addPassword(password);
        loginPageContactApp().clickRememberMeCheckbox();
        loginPageContactApp().clickLoginButton();
        accessHouseBankJournal().clickLinkContAppPS();
        utilInfo().clickLinkUtilInfo();
        utilInfo().clickLinkCurrencyHistory();
        utilInfo().clickButtonCurrencyRate();
        Assert.assertTrue(utilInfo().readCurrencyValues(currency),"Minim calculat cu succes!");
    }
}


