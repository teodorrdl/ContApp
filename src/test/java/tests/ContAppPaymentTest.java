package tests;

import pages.BasePage;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.ContAppPaymentsPage;

public class ContAppPaymentTest extends BasePage {

    public ContAppPaymentsPage paymentPage() {
        return new ContAppPaymentsPage();
    }

    @Test(description = "Add New Payment")
    @Parameters({"email", "password", "CUI", "RegistrationNumber", "SupplierName", "City", "Address", "IBAN",
            "BankName", "Contact", "SupplierEmail", "SupplierWebsite", "SupplierPhone", "CaenNumber",
            "CaenActivity", "DocumentNumber", "Lei", "Explication", "NewSupplier"})
    public void addNewPayment(String email, String password, String CUI, String RegistrationNumber, String SupplierName, String City,
                              String Address, String IBAN, String BankName, String Contact, String SupplierEmail, String SupplierPhone,
                              String SupplierWebsite, String NewSupplier, String CaenNumber, String CaenActivity, String DocumentNumber,
                              String Lei, String Explication) {
        paymentPage().clickAutentification();
        paymentPage().addEmail(email);
        paymentPage().addPassword(password);
        paymentPage().clickLoginButton();
        paymentPage().clickContAppPS();
        paymentPage().clickReceiptsPayments();
        paymentPage().clickPayments();
        paymentPage().clickAddNewPayment();
        paymentPage().selectPaymentType();
        paymentPage().clickSupplier();
        paymentPage().selectSupplier(NewSupplier + "\n");
        paymentPage().addSupplierCUI(CUI);
        paymentPage().addSupplierRegistrationNumber(RegistrationNumber);
        paymentPage().clickSRL();
        paymentPage().clickPFA();
        paymentPage().addSupplierName(SupplierName);
        paymentPage().selectSupplierCountry();
        paymentPage().selectRomania();
        paymentPage().selectSupplierCounty();
        paymentPage().selectCounty();
        paymentPage().addSupplierCity(City);
        paymentPage().addSupplierAddress(Address);
        paymentPage().selectSupplierCurrency();
        paymentPage().changeCurrency();
        paymentPage().addSupplierIban(IBAN);
        paymentPage().addSupplierBankName(BankName);
        paymentPage().addSupplierContact(Contact);
        paymentPage().closeCookieButton();
        paymentPage().addSupplierEmail(SupplierEmail);
        paymentPage().addSupplierPhone(SupplierPhone);
        paymentPage().addSupplierWebsite(SupplierWebsite);
        paymentPage().saveSupplier();
        paymentPage().closeAnotherCompanyWarning();
        paymentPage().openCreatedSupplier();
        paymentPage().selectCreatedSupplier();
        paymentPage().openSelectBank();
        paymentPage().selectBank();
        paymentPage().openSelectLocation();
        paymentPage().selectLocation();
        paymentPage().openCaenActivity();
        paymentPage().addNewCaen();
        paymentPage().openCaenLocation();
        paymentPage().selectCaenLocation();
        paymentPage().openCaenCategory();
        paymentPage().selectCaenCategory();
        paymentPage().addCaenActivity(CaenActivity);
        paymentPage().addCaenNumber(CaenNumber);
        paymentPage().openCaenRegistrationDate();
        paymentPage().selectCaenRegistrationDate();
        paymentPage().openCaenSuspendDate();
        paymentPage().selectCaenSuspendDate();
        paymentPage().clickCaenSaveButton();
        paymentPage().clickPaymentDocument();
        paymentPage().selectPaymentDocument();
        paymentPage().addDocumentNumber(DocumentNumber);
        paymentPage().selectDocumentDate();
        paymentPage().clickSelectedDocumentDate();
        paymentPage().addLeiPayment(Lei);
        paymentPage().selectItemType();
        paymentPage().clickItemType();
        paymentPage().clickExplicationDropDown();
        paymentPage().addExplication(Explication);
        paymentPage().selectFiscalCategory();
        paymentPage().fiscalCategoryOption();
        paymentPage().addPayment();

    }

}
