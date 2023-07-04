package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.BasePage;
import ReceiptsAndPayments.ReceiptsAndPaymentsClients;
import ReceiptsAndPayments.ReceiptsAndPayments;

public class ReceiptsAndPaymentsClientsTest extends BasePage {

    public ReceiptsAndPayments receiptsAndPayments() {
        return new ReceiptsAndPayments();
    }

    public ReceiptsAndPaymentsClients receiptsAndPaymentsClients() {
        return new ReceiptsAndPaymentsClients();
    }

    @Test(description = "Test incasari clienti section")
    @Parameters({"username", "password", "searchInput", "registrationNumber", "inputIBAN", "inputBankName", "inputContactName", "inputEmail", "inputPhoneNumber", "inputWebsite", "searchBank", "searchTypeBank", "aboutBankType", "whichCurrency", "bankDetailsText", "addPlaceActivity", "addCaenCode", "categoryIncomeTaxable", "inputActivityIncome", "autorizationNumber", "addReceiptDocument", "documentNumber", "addTypeArticol", "addExplicationTypeArticol", "addFiscalCategory","chosenClient","receiptsMoney"})
    public void receiptsAndPaymentsClients(String username, String password, String searchInput, String registrationNumber, String inputIBAN, String inputBankName, String inputContactName, String inputEmail, String inputPhoneNumber, String inputWebsite, String searchBank, String searchTypeBank, String aboutBankType, String whichCurrency, String bankDetailsText, String addPlaceActivity, String addCaenCode, String categoryIncomeTaxable, String inputActivityIncome, String autorizationNumber, String addReceiptDocument, String documentNumber, String addTypeArticol, String addExplicationTypeArticol, String addFiscalCategory,String chosenClient, String receiptsMoney) {
        receiptsAndPayments().clickAuthenticationButton();
        receiptsAndPayments().addEmail(username);
        receiptsAndPayments().addPassword(password);
        receiptsAndPayments().clickLoginButton();
        receiptsAndPayments().clickSingleStatementButton();
        receiptsAndPayments().clickAcceptCookie();
        receiptsAndPayments().clickContAppPS();
        receiptsAndPayments().clickIncasariSiPlatiButton();
        receiptsAndPayments().clickJurnalDeCasaBancaButton();
        receiptsAndPayments().clickIncasareButton();
        receiptsAndPaymentsClients().clickIncasariClienti();
        receiptsAndPaymentsClients().clickClientButton();
        receiptsAndPaymentsClients().addSearchInput(searchInput);
        receiptsAndPaymentsClients().clickElementSelect();
        receiptsAndPaymentsClients().addRegistrationNumber(registrationNumber);
        receiptsAndPaymentsClients().clickSearchRegistrationNumber();
        receiptsAndPaymentsClients().addInputBankName(inputBankName);
        receiptsAndPaymentsClients().addInputContactName(inputContactName);
        receiptsAndPaymentsClients().addInputEmail(inputEmail);
        receiptsAndPaymentsClients().addInputPhoneNumber(inputPhoneNumber);
        receiptsAndPaymentsClients().addInputWebsite(inputWebsite);
        receiptsAndPaymentsClients().addInputIBAN(inputIBAN);
        receiptsAndPaymentsClients().clickSaveButtonNewClient();
        receiptsAndPaymentsClients().clickBankButton();
        receiptsAndPaymentsClients().searchBank(searchBank);
        receiptsAndPaymentsClients().clickElementSelect();
        receiptsAndPaymentsClients().clickBankType();
        receiptsAndPaymentsClients().searchTypeBank(searchTypeBank);
        receiptsAndPaymentsClients().clickElementSelect();
        receiptsAndPaymentsClients().addAboutBankType(aboutBankType);
        receiptsAndPaymentsClients().clickCurrency();
        receiptsAndPaymentsClients().whichCurrency(whichCurrency);
        receiptsAndPaymentsClients().clickElementSelect();
        receiptsAndPaymentsClients().addBankDetailsText(bankDetailsText);
        receiptsAndPaymentsClients().clickSaveBankButton();
        receiptsAndPaymentsClients().clickPlaceActivity();
        receiptsAndPaymentsClients().addPlaceActivity(addPlaceActivity);
        receiptsAndPaymentsClients().clickElementSelect();
        receiptsAndPaymentsClients().clickCaenCode();
        receiptsAndPaymentsClients().addCaenCODE(addCaenCode);
        receiptsAndPaymentsClients().clickElementSelect();
        receiptsAndPaymentsClients().clickCategoryIncomeTaxable();
        receiptsAndPaymentsClients().addCategoryIncomeTaxable(categoryIncomeTaxable);
        receiptsAndPaymentsClients().clickElementSelect();
        receiptsAndPaymentsClients().addInputActivityIncome(inputActivityIncome);
        receiptsAndPaymentsClients().clickDateFromButton();
        receiptsAndPaymentsClients().addDateFromAddIncome();
        receiptsAndPaymentsClients().clickDateToButton();
        receiptsAndPaymentsClients().addDateToAddIncome();
        receiptsAndPaymentsClients().addAutorizationNumber(autorizationNumber);
        receiptsAndPaymentsClients().clickSaveButtonPlaceActivity();
        receiptsAndPaymentsClients().clickReceiptDocument();
        receiptsAndPaymentsClients().addReceiptDocument(addReceiptDocument);
        receiptsAndPaymentsClients().clickElementSelect();
        receiptsAndPaymentsClients().addDocumentNumber(documentNumber);
        receiptsAndPaymentsClients().clickDateDocumentNumber();
        receiptsAndPaymentsClients().clickDayDocumentNumber();
        receiptsAndPaymentsClients().clickTypeArticol();
        receiptsAndPaymentsClients().addTypeArticol(addTypeArticol);
        receiptsAndPaymentsClients().clickElementSelect();
        receiptsAndPaymentsClients().clickExplicationTypeArticol();
        receiptsAndPaymentsClients().addExplicationTypeArticol(addExplicationTypeArticol);
        receiptsAndPaymentsClients().clickElementSelect();
        receiptsAndPaymentsClients().clickFiscalCategory();
        receiptsAndPaymentsClients().addFiscalCategory(addFiscalCategory);
        receiptsAndPaymentsClients().clickElementSelect();
        receiptsAndPaymentsClients().clickClientButton();
        receiptsAndPaymentsClients().addSearchInput(chosenClient);
        receiptsAndPaymentsClients().clickChosenClient();
        receiptsAndPaymentsClients().addReceiptsMoney(receiptsMoney);
        receiptsAndPaymentsClients().clickAddCollect();
    }

}