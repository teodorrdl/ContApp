package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.Income.IncomePage;
import pages.Income.TotalIncome;
import pages.LoginPageContactApp;
import pages.SettingCompany.SettingCompany;

public class TotalIncomeTest extends BasePage {

    public LoginPageContactApp loginPageApp() {
        return new LoginPageContactApp();
    }

    public SettingCompany settingCompany() {
        return new SettingCompany();
    }

    public IncomePage incomePage() {
        return new IncomePage();
    }

    public TotalIncome totalIncome() {
        return new TotalIncome();
    }

    @Test(description = "Add new bill with a new client ", priority = 1)
    @Parameters({"email","password","chooseClient","typeofEntity", "cnpNif", "fullName", "invoiceDue", "iban","bankName",
            "county", "city","address", "currency", "contactName","contactEmail", "phoneNr", "website","articleType",
            "articleName", "taxCategory","measureUnit", "quantity", "sellingPrice","discountType","discountValue",
            "delegateName","delegateIdSeries","delegateIdNumber"})
    public void addNewBill(String email, String password,String chooseClient, String typeofEntity, String cnpNif,
                           String fullName,String invoiceDue, String iban, String bankName, String county, String city,
                           String address, String currency, String contactName, String contactEmail, String phoneNr,
                           String website,String articleType,String articleName, String taxCategory,String measureUnit,
                           String quantity,String sellingPrice,String discountType,String discountValue,
                           String delegateName,String delegateIdSeries,String delegateIdNumber) {

        loginPageApp().clickAuthenticationButton();
        loginPageApp().addEmail(email);
        loginPageApp().addPassword(password);
        loginPageApp().clickRememberMeCheckbox();
        loginPageApp().clickLoginButton();
        settingCompany().clickContAppPs();
        incomePage().clickIncomeLink();
        totalIncome().addNewInvoice(chooseClient,typeofEntity, cnpNif, fullName, invoiceDue, iban, bankName, county,
                city, address, currency, contactName, contactEmail, phoneNr, website, articleType, articleName,
                taxCategory, measureUnit, quantity, sellingPrice, discountType, discountValue, delegateName,
                delegateIdSeries, delegateIdNumber);
    }
}
