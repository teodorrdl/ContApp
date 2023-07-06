package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginPageContactApp;
import pages.ReceiptsAndPayments.HouseBankJournal;
import pages.ReceiptsAndPayments.ReceiptsAndPaymentsClients;


public class ReceiptsAndPaymentsClientsTest extends BasePage {

    public LoginPageContactApp loginPageContactApp() {
        return new LoginPageContactApp();
    }

    public HouseBankJournal receiptsAndPayments() {
        return new HouseBankJournal();
    }

    public ReceiptsAndPaymentsClients receiptsAndPaymentsClients() {
        return new ReceiptsAndPaymentsClients();
    }

    @Test(description = "Test incasari clienti section")
    @Parameters({"username", "password", "searchInput", "registrationNumber", "inputIBAN", "inputBankName", "inputContactName", "inputEmail", "inputPhoneNumber", "inputWebsite", "searchBank", "searchTypeBank", "aboutBankType", "whichCurrency", "bankDetailsText", "addPlaceActivity", "addCaenCode", "categoryIncomeTaxable", "inputActivityIncome", "dateFromButton", "dateToButton", "autorizationNumber", "addReceiptDocument", "documentNumber", "addTypeArticol", "addExplicationTypeArticol", "addFiscalCategory", "chosenClient", "receiptsMoney"})
    public void receiptsAndPaymentsClients(String username, String password, String searchInput, String registrationNumber, String inputIBAN, String inputBankName, String inputContactName, String inputEmail, String inputPhoneNumber, String inputWebsite, String searchBank, String searchTypeBank, String aboutBankType, String whichCurrency, String bankDetailsText, String addPlaceActivity, String addCaenCode, String categoryIncomeTaxable, String inputActivityIncome, String dateFromButton, String dateToButton, String autorizationNumber, String addReceiptDocument, String documentNumber, String addTypeArticol, String addExplicationTypeArticol, String addFiscalCategory, String chosenClient, String receiptsMoney) {
        loginPageContactApp().clickAuthenticationButton();
        loginPageContactApp().addEmail(username);
        loginPageContactApp().addPassword(password);
        loginPageContactApp().clickRememberMeCheckbox();
        loginPageContactApp().clickLoginButton();
        receiptsAndPayments().clickLinkContAppPS();
        receiptsAndPayments().verifEnableButtonAccept();
        receiptsAndPayments().clickLinkReceiptsAndPayments();
        receiptsAndPayments().clickLinkHouseBankJournal();
        receiptsAndPayments().clickButtonReceipts();
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
        receiptsAndPaymentsClients().addAutorizationNumber(autorizationNumber);
        receiptsAndPaymentsClients().clickDateFromButton(dateFromButton);
//        receiptsAndPaymentsClients().addDateFromAddIncome();
        receiptsAndPaymentsClients().clickDateToButton(dateToButton);
//        receiptsAndPaymentsClients().addDateToAddIncome();
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
