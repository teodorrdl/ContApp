package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.BasePage;
import ReceiptsAndPayments.ReceiptsAndPayments;

public class ReceiptsAndPaymentsiTest extends BasePage {
    public ReceiptsAndPayments receiptsAndPayments() {
        return new ReceiptsAndPayments();
    }

    @Test(description = "Test the Incasari si Plati section")
    @Parameters({"username", "password"})
    public void receiptsAndPayments(String username, String password) {
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
    }

}
