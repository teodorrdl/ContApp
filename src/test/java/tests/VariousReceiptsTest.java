package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.ContAppPaymentsPage;
import pages.VariousReceipts;

public class VariousReceiptsTest extends BasePage {

    public ContAppPaymentsPage paymentPage() {
        return new ContAppPaymentsPage();
    }

    public VariousReceipts variousReceipts() {
        return new VariousReceipts();
    }

    @Test(description = "Test Various Receipts")
    @Parameters({"email", "password", "docNum", "totalIncome", "explication"})
    public void variousIncomeTest(String email, String password, String docNum, String totalIncome,
                                  String explication) {

        paymentPage().closeCookieButton();
        paymentPage().clickAutentification();
        paymentPage().addEmail(email);
        paymentPage().addPassword(password);
        paymentPage().clickLoginButton();
        paymentPage().clickContAppPS();
        paymentPage().clickReceiptsPayments();
        variousReceipts().addIncome();
        variousReceipts().addVariousIncome();
        variousReceipts().selectHousesAndBanks();
        variousReceipts().setActivityLocation();
        variousReceipts().selectCaenCode();
        variousReceipts().selectIncomeDoc();
        variousReceipts().addDocNum(docNum);
        variousReceipts().selectDate();
        variousReceipts().addTotalAmount(totalIncome);
        variousReceipts().selectItemType();
        variousReceipts().addExplication(explication);
        variousReceipts().selectFiscalCategory();
        variousReceipts().checkSaveItem();
        variousReceipts().saveVariousIncome();

    }
}
