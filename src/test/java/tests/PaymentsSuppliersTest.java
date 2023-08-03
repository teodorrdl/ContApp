package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginPageContactApp;
import pages.Payments.PaymentsSuppliers;
import pages.ReceiptsAndPayments.HouseBankJournal;

public class PaymentsSuppliersTest extends BasePage {
    public LoginPageContactApp loginPageContactApp() {
        return new LoginPageContactApp();
    }

    public HouseBankJournal receiptsAndPayments() {
        return new HouseBankJournal();
    }
    public PaymentsSuppliers paymentsSuppliers() {
        return new PaymentsSuppliers();
    }


    @Test(description = "Test Plati Furnizori")
    @Parameters({"username", "password", "registrationNumber", "inputIban", "inputBankName", "inputContactName", "inputEmail", "inputWebsite", "inputPhoneNumber", "bankType", "nameBank", "currency", "detailsBank", "ibanDetails", "professionalHeadquarters", "caenCode", "activityPlace", "incomeCategory", "income", "authorizationNumber", "activityDateFrom", "activityDateEnd", "paymentDocument", "inputNumberDocument", "datePaymentDocument", "typeArticol", "explanation", "fiscalCategory","selectSupplier","moneyPaymentt"})
    public void paymentsSuppliersTest(String username, String password, String registrationNumber, String inputIban, String inputBankName, String inputContactName, String inputEmail, String inputWebsite, String inputPhoneNumber, String bankType, String nameBank, String currency, String detailsBank, String ibanDetails, String professionalHeadquarters, String caenCode, String activityPlace, String incomeCategory, String income, String authorizationNumber, String activityDateFrom, String activityDateEnd, String paymentDocument, String inputNumberDocument, String datePaymentDocument, String typeArticol, String explanation, String fiscalCategory,String selectSupplier,String moneyPaymentt) {
        loginPageContactApp().clickAcceptCookie();
        loginPageContactApp().clickAuthenticationButton();
        loginPageContactApp().addEmail(username);
        loginPageContactApp().addPassword(password);
        loginPageContactApp().clickRememberMeCheckbox();
        loginPageContactApp().clickLoginButton();
        receiptsAndPayments().clickLinkContAppPS();
        receiptsAndPayments().clickLinkReceiptsAndPayments();
        paymentsSuppliers().clickPaymentsButton();
        paymentsSuppliers().clickAddPaymentsButton();
        paymentsSuppliers().clickPaymentsSuppliersButton();
        paymentsSuppliers().addNewSupplier();
        paymentsSuppliers().addCuiRegistrationNumber(registrationNumber);
        paymentsSuppliers().addInputIban(inputIban);
        paymentsSuppliers().addInputBankName(inputBankName);
        paymentsSuppliers().addInputContactName(inputContactName);
        paymentsSuppliers().addInputEmail(inputEmail);
        paymentsSuppliers().addInputPhoneNumber(inputPhoneNumber);
        paymentsSuppliers().addInputWebsite(inputWebsite);
        paymentsSuppliers().clickSaveButton();
        paymentsSuppliers().selectNewBank();
        paymentsSuppliers().addNewBank(bankType);
        paymentsSuppliers().addNameBank(nameBank);
        paymentsSuppliers().selectCurrency(currency);
        paymentsSuppliers().addDetailsIbanBank(ibanDetails);
        paymentsSuppliers().addDetailsBank(detailsBank);
        paymentsSuppliers().clickSaveBankDetails();
        paymentsSuppliers().addProfessionalHeadquarters(professionalHeadquarters);
        paymentsSuppliers().addCaenCode(caenCode);
        paymentsSuppliers().selectActivityPlace(activityPlace);
        paymentsSuppliers().selectIncomeCategory(incomeCategory);
        paymentsSuppliers().addIncome(income);
        paymentsSuppliers().addAuthorizationNumber(authorizationNumber);
        paymentsSuppliers().addFromDate(activityDateFrom);
        paymentsSuppliers().addEndDate(activityDateEnd);
        paymentsSuppliers().clickSaveActivityButton();
        paymentsSuppliers().selectPaymentDocument(paymentDocument);
        paymentsSuppliers().addInputNumberDocument(inputNumberDocument);
        paymentsSuppliers().addDatePaymentDocument(datePaymentDocument);
        paymentsSuppliers().whichTypeOfArticol(typeArticol);
        paymentsSuppliers().addExplanation(explanation);
        paymentsSuppliers().addFiscalCategory(fiscalCategory);
        paymentsSuppliers().selectSupplier(selectSupplier);
        paymentsSuppliers().addMoneyPayment(moneyPaymentt);
        paymentsSuppliers().clickAddPayment(0,50);



    }
}
