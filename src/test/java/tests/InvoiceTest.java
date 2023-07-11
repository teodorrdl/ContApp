package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.ContAppPaymentsPage;
import pages.InvoicePage;

public class InvoiceTest extends BasePage {

    public ContAppPaymentsPage paymentPage() {
        return new ContAppPaymentsPage();
    }

    public InvoicePage invoicePage() {
        return new InvoicePage();
    }


    @Test(description = "InvoiceTest")
    @Parameters({"email", "password", "generalCnp", "generalLastName", "generalFirstName", "generalCity", "generalStreet",
            "generalEmail", "generalPhoneNo", "tvaRate", "cifNumber", "locationName", "locationRegNum", "locationCity",
            "locationStreet", "activityFoundSource", "activityAuthorizationNumber", "currencyName", "ibanBank", "bankName",
            "bankDetails", "seriesName", "seriesNameLeadingZero", "seriesFirstNum", "seriesDecisionNum", "seriesDeclarationHeader",
            "seriesDeclarationFooter", "measureUnitName", "measureUnitSymbol", "representativeFirstName", "representativeLastName",
            "representativeNum", "delegateName", "delegateSerial", "delegateNum"})
    public void invoiceTest(String email, String password, String generalCnp, String generalLastName, String generalFirstName,
                            String generalCity, String generalStreet, String generalEmail, String generalPhoneNo, String tvaRate,
                            String cifNumber, String locationName, String locationRegNum, String locationCity, String locationStreet,
                            String activityFoundSource, String activityAuthorizationNumber, String currencyName, String ibanBank,
                            String bankName, String bankDetails, String seriesName, String seriesNameLeadingZero, String seriesFirstNum,
                            String seriesDecisionNum, String seriesDeclarationHeader, String seriesDeclarationFooter, String measureUnitName,
                            String measureUnitSymbol, String representativeFirstName, String representativeLastName, String representativeNum,
                            String delegateName, String delegateSerial, String delegateNum) {

        paymentPage().clickAutentification();
        paymentPage().addEmail(email);
        paymentPage().addPassword(password);
        paymentPage().clickLoginButton();
        paymentPage().clickContAppPS();
        paymentPage().closeCookieButton();
        invoicePage().enterGeneralSettings();
//        invoicePage().setGeneralSettings(generalCnp, generalLastName,generalFirstName,generalCity,
//                generalStreet, generalEmail, generalPhoneNo);
//        invoicePage().setTvaSettings(tvaRate,cifNumber);
//        invoicePage().setActivityLocation(locationName,locationRegNum,locationCity,locationStreet);
//        invoicePage().setActivity(activityFoundSource, activityAuthorizationNumber);
//        invoicePage().setCurrency(currencyName);
//        invoicePage().setHousesAndBanks(ibanBank,bankName,bankDetails);
//        invoicePage().setSeries(seriesName, seriesNameLeadingZero, seriesFirstNum, seriesDecisionNum,
//                seriesDeclarationHeader, seriesDeclarationFooter);
//        invoicePage().setMeasureUnits(measureUnitName, measureUnitSymbol);
//        invoicePage().setRolesPermissions();
//        invoicePage().setUsers();
//        invoicePage().setRepresentative(representativeFirstName, representativeLastName, representativeNum);
        invoicePage().setPreferences(delegateName, delegateSerial, delegateNum);
        invoicePage().setIntegrations();

    }

}
