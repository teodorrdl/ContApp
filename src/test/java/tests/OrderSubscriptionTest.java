package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginPageContactApp;
import pages.OrderSubscription.CartPage;
import pages.OrderSubscription.OrderSubscriptionFlow;
import pages.ReceiptsAndPayments.HouseBankJournal;

import java.util.NavigableMap;

public class OrderSubscriptionTest extends BasePage {

    public LoginPageContactApp loginPageContactApp() {
        return new LoginPageContactApp();
    }
    public OrderSubscriptionFlow newOrderSubscription(){
        return new OrderSubscriptionFlow();
    }
    public CartPage cartPage(){
        return new CartPage();
    }
    @Test(description = "Happy Test! Add Order Subscription ", priority = 1)

    @Parameters({"email","password","orderName","companyName"})
    public void testOrderSubscription(String email, String password, String orderName, String companyName) {
        newOrderSubscription().verifEnableButtonTrustClose();
        loginPageContactApp().clickAuthenticationButton();
        loginPageContactApp().addEmail(email);
        loginPageContactApp().addPassword(password);
        loginPageContactApp().clickRememberMeCheckbox();
        loginPageContactApp().clickLoginButton();
        newOrderSubscription().clickLinkOrderSubscription();
        cartPage().verifyCart();
        newOrderSubscription().clickOrder(orderName);
        newOrderSubscription().clickButtonOrder();
        newOrderSubscription().clickButtonToCart();
        newOrderSubscription().addTextField(companyName);
        newOrderSubscription().clickButtonBilling();
        newOrderSubscription().clickButtonOrder();
        newOrderSubscription().clickRadioButtonBT();
        newOrderSubscription().clickButtonAcceptTnc();
        newOrderSubscription().clickButtonPlaceOrder();
        newOrderSubscription().verifyOrder();
    }
}
