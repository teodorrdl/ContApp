package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.ContAppPaymentsPage;
import pages.HouseAndBankJournal;
import pages.SupplierPaymentPage;

public class SupplierPaymentTest extends BasePage {
    public ContAppPaymentsPage paymentPage() {
        return new ContAppPaymentsPage();
    }
    public SupplierPaymentPage supplierPage(){return new SupplierPaymentPage();}
    public HouseAndBankJournal journal() {
        return new HouseAndBankJournal();
    }
    @Test(description = "Supplier payment test")
    @Parameters({"email", "password", "CUI", "RegistrationNumber", "SupplierName", "City", "Address", "IBAN",
            "BankName", "Contact", "SupplierEmail", "SupplierWebsite", "SupplierPhone", "docNum",
            "totalIncome", "explication"})
    public void supplierPaymentTest(String email, String password, String CUI, String RegistrationNumber, String SupplierName,
                                    String City, String Address, String IBAN, String BankName, String Contact, String SupplierEmail,
                                    String SupplierPhone, String SupplierWebsite, String docNum, String totalIncome,
                                    String explication){

        paymentPage().closeCookieButton();
        paymentPage().clickAutentification();
        paymentPage().addEmail(email);
        paymentPage().addPassword(password);
        paymentPage().clickLoginButton();
        paymentPage().clickContAppPS();
        paymentPage().clickReceiptsPayments();
        supplierPage().addNewPayment();
        supplierPage().addNewSupplier();
        supplierPage().addSupplierCUI(CUI);
        paymentPage().addSupplierRegistrationNumber(RegistrationNumber);
        paymentPage().clickSRL();
        paymentPage().clickPFA();
        paymentPage().addSupplierName(SupplierName);
        supplierPage().selectCountry();
        supplierPage().selectSupplierCounty();
        paymentPage().addSupplierCity(City);
        paymentPage().addSupplierAddress(Address);
        supplierPage().setSupplierCurrency();
        paymentPage().changeCurrency();
        supplierPage().addSupplierIban(IBAN);
        supplierPage().addSupplierBankName(BankName);
        supplierPage().addSupplierContact(Contact);
        supplierPage().addSupplierEmail(SupplierEmail);
        supplierPage().addSupplierPhone(SupplierPhone);
        supplierPage().addSupplierWebsite(SupplierWebsite);
        paymentPage().saveSupplier();
        paymentPage().closeAnotherCompanyWarning();
        journal().selectCreatedClient();
        journal().setSelectHouseAndBanks();
        supplierPage().setActivityLocation();
        supplierPage().selectCaen();
        journal().setIncomeDoc();
        supplierPage().addDocNumAndDate(docNum);
        journal().addTotalIncome(totalIncome);
        supplierPage().setItemType();
        supplierPage().addExplication(explication);
        supplierPage().setFiscalCategory();
        supplierPage().saveArticle();
        supplierPage().changeFromBank();
        supplierPage().deletePayment();

    }
}
