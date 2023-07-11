package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginPageContactApp;
import pages.ReceiptsAndPayments.HouseBankJournal;
import pages.ReceiptsAndPayments.VariousReceipts;

public class ReceiptsAndPaymentsTest extends BasePage {
    public LoginPageContactApp loginPageContactApp() {
        return new LoginPageContactApp();
    }
    public HouseBankJournal accessHouseBankJournal() {
        return new HouseBankJournal();
    }
    public VariousReceipts accessVariousReceipts() {
        return new VariousReceipts();
    }
    @Test(description = "Happy Test! Add new receipts", priority = 1)

    @Parameters({"email","password",})
    public void testHouseBankJournal(String email, String password) {
        loginPageContactApp().clickAuthenticationButton();
        loginPageContactApp().addEmail(email);
        loginPageContactApp().addPassword(password);
        loginPageContactApp().clickRememberMeCheckbox();
        loginPageContactApp().clickLoginButton();
        accessHouseBankJournal().clickLinkContAppPS();
        accessHouseBankJournal().verifEnableButtonAccept();

        accessHouseBankJournal().clickLinkReceiptsAndPayments();
        accessHouseBankJournal().clickLinkHouseBankJournal();
        accessHouseBankJournal().clickButtonReceipts();
    }

    @Test(description = "Happy Test! Add new receipts", priority = 2)

    @Parameters({"email","password","textNrDoc","textMoney","textExplanation"})
    public void testHouseBankJournalVariousReceipts(String email, String password, String textNrDoc, String textMoney, String textExplanation) {
        loginPageContactApp().clickAuthenticationButton();
        loginPageContactApp().addEmail(email);
        loginPageContactApp().addPassword(password);
        loginPageContactApp().clickRememberMeCheckbox();
        loginPageContactApp().clickLoginButton();
        accessHouseBankJournal().clickLinkContAppPS();
        accessHouseBankJournal().verifEnableButtonAccept();
        accessHouseBankJournal().clickLinkReceiptsAndPayments();
        accessHouseBankJournal().clickLinkHouseBankJournal();
        accessHouseBankJournal().clickButtonReceipts();
        accessVariousReceipts().clickButtonVariousReceipts();
        accessVariousReceipts().addNrDoc(textNrDoc);
        accessVariousReceipts().addMoney(textMoney);
        accessVariousReceipts().clickFieldExplanation();
        accessVariousReceipts().addFieldExplanation(textExplanation);
        accessVariousReceipts().clikButtonAddReceipt();
        accessVariousReceipts().clickButtonClose();
    }
}
