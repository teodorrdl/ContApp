package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginPageContactApp;
import pages.Payments.PaymentsVarious;
import pages.ReceiptsAndPayments.HouseBankJournal;

public class PaymentsVariousTest extends BasePage {
    public LoginPageContactApp loginPageContactApp() {
        return new LoginPageContactApp();
    }

    public HouseBankJournal receiptsAndPayments() {
        return new HouseBankJournal();
    }

    public PaymentsVarious paymentsVarious() {
        return new PaymentsVarious();
    }

    @Test(description = "Test Plati Diverse")
    @Parameters({"username", "password", "newBank", "typeOfBank", "nameBank", "currency", "detailsBank", "professionalHeadquarters", "caenCode", "activityPlace", "incomeCategory", "income", "authorizationNumber", "activityDateFrom", "activityDateEnd", "paymentDocument", "inputNumberDocument", "datePaymentDocument", "moneyPayment", "typeArticol", "explanation", "fiscalCategory"})
    public void paymentsVariousTest(String username, String password, String newBank, String typeOfBank, String nameBank, String currency, String detailsBank, String professionalHeadquarters, String caenCode, String activityPlace, String incomeCategory, String income, String authorizationNumber, String activityDateFrom, String activityDateEnd, String paymentDocument, String inputNumberDocument, String datePaymentDocument, String moneyPayment, String typeArticol, String explanation, String fiscalCategory) {
        loginPageContactApp().clickAcceptCookie();
        loginPageContactApp().clickAuthenticationButton();
        loginPageContactApp().addEmail(username);
        loginPageContactApp().addPassword(password);
        loginPageContactApp().clickRememberMeCheckbox();
        loginPageContactApp().clickLoginButton();
        receiptsAndPayments().clickLinkContAppPS();
        receiptsAndPayments().clickLinkReceiptsAndPayments();
        paymentsVarious().clickPaymentsButton();
        paymentsVarious().clickAddPaymentsButton();
        paymentsVarious().clickPaymentsVariousButton();
        paymentsVarious().clickNewBank(newBank);
        paymentsVarious().addTypeOfBank(typeOfBank);
        paymentsVarious().addNameBank(nameBank);
        paymentsVarious().selectCurrency(currency);
        paymentsVarious().addDetailsBank(detailsBank);
        paymentsVarious().clickSaveBankDetails();
        paymentsVarious().addProfessionalHeadquarters(professionalHeadquarters);
        paymentsVarious().addCaenCode(caenCode);
        paymentsVarious().selectActivityPlace(activityPlace);
        paymentsVarious().selectIncomeCategory(incomeCategory);
        paymentsVarious().addIncome(income);
        paymentsVarious().addAuthorizationNumber(authorizationNumber);
        paymentsVarious().addFromDate(activityDateFrom);
        paymentsVarious().addEndDate(activityDateEnd);
        paymentsVarious().clickSaveActivityButton();
        paymentsVarious().selectPaymentDocument(paymentDocument);
        paymentsVarious().addInputNumberDocument(inputNumberDocument);
        paymentsVarious().addDatePaymentDocument(datePaymentDocument);
        paymentsVarious().addMoneyPayment(moneyPayment);
        paymentsVarious().whichTypeOfArticol(typeArticol);
        paymentsVarious().addExplanation(explanation);
        paymentsVarious().addFiscalCategory(fiscalCategory);
        paymentsVarious().clickAddPayment();
    }

}
