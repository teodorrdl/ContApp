package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.ReceiptsAndPayments.PaymentOfSuppliers;
import pages.LoginPageContactApp;
import pages.SettingCompany.SettingCompany;

public class PaymentOfSuppliersTest extends BasePage {
    public PaymentOfSuppliers houseAndBankJournalPage() {
        return new PaymentOfSuppliers();
    }

    public LoginPageContactApp loginPageApp() {
        return new LoginPageContactApp();
    }

    public SettingCompany settingCompany() {
        return new SettingCompany();
    }

    @Test(description = "Add the supplier's payment to the bank journal")
    @Parameters({"email","password","supplierName", "bankName","activityPlace","activityCode","paymentValue", "documentNumber"})
    public void addSupplierPaymentToBankJournal(String email, String password, String supplierName, String bankName,
                                                String activityPlace, String activityCode, String paymentValue, String documentNumber) {
        loginPageApp().clickAuthenticationButton();
        loginPageApp().addEmail(email);
        loginPageApp().addPassword(password);
        loginPageApp().clickRememberMeCheckbox();
        loginPageApp().clickLoginButton();
        settingCompany().clickContAppPs();
        houseAndBankJournalPage().clickReceiptsPaymentsBtnLink();
        houseAndBankJournalPage().clickHouseAndBankJournalBtnLink();
        houseAndBankJournalPage().addPaymentToSupplier(supplierName, bankName, activityPlace, activityCode, paymentValue, documentNumber);
    }
}
