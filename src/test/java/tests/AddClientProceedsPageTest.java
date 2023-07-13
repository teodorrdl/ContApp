package tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.*;

public class AddClientProceedsPageTest extends BasePage {

    String addNewPaymentWindow = "https://ps.contapp.ro/venituri/factura/creaza?preview=false";
    public AddClientProceedsPage addClient(){

        return new AddClientProceedsPage();
    }

    public AddProceedsPage addProceeds(){
        return new AddProceedsPage();
    }



    @Test(description = "Succesfull new proceed added")
    @Parameters({"clientText", "bankHome", "activity", "caen", "nrDocuments", "price", "acquisition", "fiscal", "expText"})
    public void addNewProceed( String clientText, String bankHome, String activity, String caen, String nrDocuments, String price, String acquisition, String fiscal, String expText) {
        LoginPageContactApp loginApp = new LoginPageContactApp();
        loginApp.clickAuthenticationButton();
        loginApp.addEmail("olaru.iuliana1999@gmail.com");
        loginApp.addPassword("ovi17071");
        loginApp.clickLoginButton();
        addClient().closeCoockiesAdd();
        addClient().selectContAppPSButton();
        addClient().selectAddProceedsButton();
        addClient().selectClientField();
        addClient().selectClientList(clientText);
        addProceeds().selectBankHome(bankHome);
        addProceeds().selectActivityPlace(activity);
        addProceeds().selectCaenField();
        addProceeds().selectCaenList(caen);
        addProceeds().addNumberOfDocuments(nrDocuments);
        addProceeds().price(price);
        addProceeds().selectTypeOfAcquisition(acquisition);
        addProceeds().selectExplicationField();
        addProceeds().addExplication(expText);
        addProceeds().selectFiscalField();
        addProceeds().selectFiscalList(fiscal);
        addProceeds().selectSaveButton();
    }

    @Test(description = "Succesfull new clientText added")
    @Parameters({"clientText", "cuiOrCif", "registerNumber","entity", "name", "deadline", "iban", "bankName", "country", "county", "city", "adress", "currency", "conctactPersonName", "email", "phone", "website"})
    public void addNewClient(String clientText, String cuiOrCif, String registerNumber,String entity, String name, String deadline, String iban, String bankName, String country, String county, String city, String adress, String currency, String conctactPersonName, String email, String phone, String website) throws InterruptedException {
        LoginPageContactApp loginApp = new LoginPageContactApp();
        loginApp.clickAuthenticationButton();
        loginApp.addEmail("olaru.iuliana1999@gmail.com");
        loginApp.addPassword("ovi17071");
        loginApp.clickLoginButton();
        addClient().closeCoockiesAdd();
        addClient().selectContAppPSButton();
        addClient().selectAddProceedsButton();
        addClient().selectClientField();
        addClient().selectClientList(clientText);
        addClient().addCuiOrCIF(cuiOrCif);
        addClient().addRegisterNumber(registerNumber);
        addClient().selectEntityField();
        addClient().selectEntityList(entity);
        addClient().addNameField(name);
        addClient().selectDeadlineDroplist(deadline);
        addClient().addIbanField(iban);
        addClient().addBankNameField(bankName);
        addClient().selectCountryField();
        addClient().selectCountryList(country);
        addClient().selectCountyField();
        addClient().selectCountyList(county);
        addClient().addCityField(city);
        addClient().addAdressField(adress);
        addClient().selectCurrencyDroplist(currency);
        addClient().addContactPersonField(conctactPersonName);
        addClient().addContactPersonEmailField(email);
        addClient().addContactPersonPhoneField(phone);
        addClient().addContactPersonWebsiteField(website);
        addClient().selectSaveButton();
    }


    @Test(description = "Add new client just with the minimal information")
    @Parameters({"clientText", "entity", "name", "deadline", "country", "county", "city", "adress"})
    public void addMinimReqNewClient(String clientText, String entity, String name, String deadline, String country, String county, String city, String adress) {
        LoginPageContactApp loginApp = new LoginPageContactApp();
        loginApp.clickAuthenticationButton();
        loginApp.addEmail("olaru.iuliana1999@gmail.com");
        loginApp.addPassword("ovi17071");
        loginApp.clickLoginButton();
        addClient().closeCoockiesAdd();
        addClient().selectContAppPSButton();
        addClient().selectAddProceedsButton();
        addClient().selectClientField();
        addClient().selectClientList(clientText);
        addClient().selectEntityField();
        addClient().selectEntityList(entity);
        addClient().addNameField(name);
        addClient().selectDeadlineDroplist(deadline);
        addClient().selectCountryField();
        addClient().selectCountryList(country);
        addClient().selectCountyField();
        addClient().selectCountyList(county);
        addClient().addCityField(city);
        addClient().addAdressField(adress);
        addClient().selectSaveButton();
    }

    @Test(description = "When clicking to add a new payment of an existing client it redirects you on the payment page")
    @Parameters({"client"})
    public void addNewPayment(String client) {
        LoginPageContactApp loginApp = new LoginPageContactApp();
        loginApp.clickAuthenticationButton();
        loginApp.addEmail("olaru.iuliana1999@gmail.com");
        loginApp.addPassword("ovi17071");
        loginApp.clickLoginButton();
        addClient().closeCoockiesAdd();
        addClient().selectContAppPSButton();
        addClient().selectAddProceedsButton();
        addClient().selectClientField();
        addClient().selectClientList(client);
        addClient().addNewInvoice();
        Assert.assertEquals(driver_local.getCurrentUrl(), addNewPaymentWindow);
    }

    @Test(description = "Error popup for adding a number over the limit if is selected 'Casa principala' in the bank field")
    @Parameters({"client", "bankHome", "price"})
    public void overLimitErrorPopup(String client, String bankHome, String price){
        LoginPageContactApp loginApp = new LoginPageContactApp();
        loginApp.clickAuthenticationButton();
        loginApp.addEmail("olaru.iuliana1999@gmail.com");
        loginApp.addPassword("ovi17071");
        loginApp.clickLoginButton();
        addClient().closeCoockiesAdd();
        addClient().selectContAppPSButton();
        addClient().selectAddProceedsButton();
        addClient().selectClientField();
        addClient().selectClientList(client);
        addProceeds().selectBankHome(bankHome);
        addProceeds().selectImputValue(price);
    }

    @Test(description = "Succesfull new proceed added in other proceeds window")
    @Parameters({"bankHome", "activity", "caen", "documents", "nrDocuments", "price", "acquisition", "expText", "fiscal"})
    public void addOtherProceed(String bankHome, String activity, String caen, String documents,  String nrDocuments, String price, String acquisition, String expText, String fiscal) {
        LoginPageContactApp loginApp = new LoginPageContactApp();
        loginApp.clickAuthenticationButton();
        loginApp.addEmail("olaru.iuliana1999@gmail.com");
        loginApp.addPassword("ovi17071");
        loginApp.clickLoginButton();
        addClient().closeCoockiesAdd();
        addClient().selectContAppPSButton();
        addClient().selectAddProceedsButton();
        addClient().selectOtherProceeds();
        addProceeds().selectBankHome(bankHome);
        addProceeds().selectActivityPlace(activity);
        addProceeds().selectCaenField();
        addProceeds().selectCaenList(caen);
        addProceeds().selectDocumentsField();
        addProceeds().selectDocumentsList(documents);
        addProceeds().addNumberOfDocuments(nrDocuments);
        addProceeds().price(price);
        addProceeds().selectTypeOfAcquisition(acquisition);
        addProceeds().selectExplicationField();
        addProceeds().addExplication(expText);
        addProceeds().selectFiscalField();
        addProceeds().selectFiscalList(fiscal);
        addProceeds().selectSaveButton();
    }






}
