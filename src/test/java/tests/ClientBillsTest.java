package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginPageContactApp;
import pages.ReceiptsAndPayments.HouseBankJournal;
import pages.SettingCompany.ClientBills;

public class ClientBillsTest extends BasePage {

    public LoginPageContactApp loginPageContactApp() {
        return new LoginPageContactApp();
    }

    public ClientBills clientBills() {
        return new ClientBills();
    }

    public HouseBankJournal houseBankJournal() {
        return new HouseBankJournal();
    }

    @Test(description = "Test the Client Bills field")
    @Parameters({"username", "password", "chooseClient", "inputRegistrationNumber", "inputIBAN", "inputBankName", "inputContactName", "inputEmail", "inputPhoneNumber", "inputWebsite", "newCurrency", "writeNewCurrency", "currencyChoosen", "initialDate", "dueDate", "typeOfBill", "series", "yearSeries", "typeOfSeries", "nameSeries", "numberOfDigits", "firstNumberOfSeries", "numberInput", "articleType", "articleName", "fiscalCategory", "measureUnit", "quantity", "priceWithoutTVA", "rateTVA", "ncCode", "cpvCode", "typeOfDiscount", "valueOfDiscount"})
    public void clientBillsTest(String username, String password, String chooseClient, String inputRegistrationNumber, String inputIBAN, String inputBankName, String inputContactName, String inputEmail, String inputPhoneNumber, String inputWebsite, String newCurrency, String writeNewCurrency, String currencyChoosen, String initialDate, String dueDate, String typeOfBill, String series, String yearSeries, String typeOfSeries, String nameSeries, String numberOfDigits, String firstNumberOfSeries, String numberInput, String articleType, String articleName, String fiscalCategory, String measureUnit, String quantity, String priceWithoutTVA, String rateTVA, String ncCode, String cpvCode, String typeOfDiscount, String valueOfDiscount) {
        loginPageContactApp().clickAcceptCookie();
        loginPageContactApp().clickAuthenticationButton();
        loginPageContactApp().addEmail(username);
        loginPageContactApp().addPassword(password);
        loginPageContactApp().clickRememberMeCheckbox();
        loginPageContactApp().clickLoginButton();
        houseBankJournal().clickLinkContAppPS();
        clientBills().clickClientBillsButton();
        clientBills().clickChooseClient(chooseClient);
        clientBills().searchFirm(inputRegistrationNumber);
        clientBills().addInputIBAN(inputIBAN);
        clientBills().addInputBankName(inputBankName);
        clientBills().addInputContactName(inputContactName);
        clientBills().addInputEmail(inputEmail);
        clientBills().addInputPhoneNumber(inputPhoneNumber);
        clientBills().addInputWebsite(inputWebsite);
        clientBills().clickSaveButtonNewClient();
        clientBills().chooseCurrency(newCurrency);
        clientBills().choosenCurrency(writeNewCurrency, currencyChoosen);
        clientBills().addDate(initialDate, dueDate);
        clientBills().chooseTypeOfBill(typeOfBill);
        clientBills().chooseNewSeries(series);
        clientBills().addYearSeries(yearSeries);
        clientBills().chooseTypeOfSeries(typeOfSeries);
        clientBills().addNameSeries(nameSeries);
        clientBills().addNumberOfDigitsSeries(numberOfDigits);
        clientBills().addFirstNumberOfDigits(firstNumberOfSeries);
        clientBills().clickSaveButtonAddSeries();
        clientBills().addNumberInput(numberInput);
        clientBills().addArticleType(articleType);
        clientBills().addArticleName(articleName);
        clientBills().addFiscalCategory(fiscalCategory);
        clientBills().addMeasureUnit(measureUnit);
        clientBills().addQuantity(quantity);
        clientBills().addPriceWithoutTVA(priceWithoutTVA);
        clientBills().addRateTVA(rateTVA);
        clientBills().addTaxRiskProduct();
        clientBills().addNcCode(ncCode);
        clientBills().addCpvCode(cpvCode);
        clientBills().clickAddDiscount();
        clientBills().addTypeOfDiscount(typeOfDiscount);
        clientBills().addValueOfDiscount(valueOfDiscount);
        clientBills().clickAddArticle();
    }
}
