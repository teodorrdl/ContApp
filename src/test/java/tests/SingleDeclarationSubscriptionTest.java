package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginPageContactApp;
import pages.OrderSubscription.SingleDeclarationSubscription;

public class SingleDeclarationSubscriptionTest extends BasePage {
    public LoginPageContactApp loginPageContactApp() {
        return new LoginPageContactApp();
    }

    public SingleDeclarationSubscription singleDeclarationSubscription() {
        return new SingleDeclarationSubscription();
    }

    @Test(description = "Test the single declaration subcription")
    @Parameters({"username", "password", "searchInput", "inputFirstName", "inputLastName", "inputPhoneNumber"})
    public void singleDeclarationSubscriptionTest(String username, String password, String searchInput, String inputFirstName, String inputLastName, String inputPhoneNumber) {
        loginPageContactApp().clickAcceptCookie();
        loginPageContactApp().clickAuthenticationButton();
        loginPageContactApp().addEmail(username);
        loginPageContactApp().addPassword(password);
        loginPageContactApp().clickRememberMeCheckbox();
        loginPageContactApp().clickLoginButton();
        singleDeclarationSubscription().clickCommandSubscription();
        singleDeclarationSubscription().clickServices();
        singleDeclarationSubscription().clickSingleDeclarationServices();
        singleDeclarationSubscription().clickCommandServices();
        singleDeclarationSubscription().clickShoppingCart();
        singleDeclarationSubscription().clickBillingDetails();
        singleDeclarationSubscription().clickInvoicePerCompany();
        singleDeclarationSubscription().searchCompany(searchInput);
        singleDeclarationSubscription().addFirstName(inputFirstName);
        singleDeclarationSubscription().addLastName(inputLastName);
        singleDeclarationSubscription().addPhoneNumber(inputPhoneNumber);
        singleDeclarationSubscription().clickForPayment();
        singleDeclarationSubscription().makingPayment();


    }
}
