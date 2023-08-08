package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.ContAppPaymentsPage;
import pages.VariousPaymentsPage;

import static base.PageLinksAndText.toastMessage;

public class VariousPaymentTest extends BasePage {
    public ContAppPaymentsPage paymentPage() {
        return new ContAppPaymentsPage();
    }

    public VariousPaymentsPage variousPayments() {
        return new VariousPaymentsPage();
    }


    @Test(description = "Test Various Payments Page")
    @Parameters({"email", "password", "docNum","totalExpense"})
    public void variousPaymentsTest(String email, String password, String docNum, String totalExpense) {
        paymentPage().closeCookieButton();
        paymentPage().clickAutentification();
        paymentPage().addEmail(email);
        paymentPage().addPassword(password);
        paymentPage().clickLoginButton();
        paymentPage().clickContAppPS();
        paymentPage().clickReceiptsPayments();
        variousPayments().addVariousPayment();
        variousPayments().setHouseAndBanks();
        variousPayments().setActivityPlace();
        variousPayments().setActivityCaen();
        variousPayments().setPaymentDoc();
        variousPayments().addDocNum(docNum);
        variousPayments().setDate();
        variousPayments().setTotalExpenses(totalExpense);
        variousPayments().setArticleType();
        variousPayments().addExplication();
        variousPayments().setFiscalCategory();
        variousPayments().savePayment();
        variousPayments().savePayment();
        variousPayments().assertToastMessage();

    }
}
