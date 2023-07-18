package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.AddClientsPage.AddClientsPages;
import pages.BasePage;
import pages.LoginPageContactApp;

public class AddClientsTest extends BasePage {

    public AddClientsPages addNewClient(){
        return new AddClientsPages();
    }

    @Test(description = "Succesfully new client added")
    @Parameters ({"cuiOrCif", "registerNumber", "entity", "name", "deadline", "iban", "bankName", "country", "county", "city", "adress", "currency", "conctactPersonName", "email", "phone", "website"})
    public void addClient(String cuiOrCif, String registerNumber, String entity, String name, String deadline, String iban, String bankName, String country, String county, String city, String adress, String currency, String conctactPersonName, String email, String phone, String website){
        LoginPageContactApp loginApp = new LoginPageContactApp();
        loginApp.clickAuthenticationButton();
        loginApp.addEmail("olaru.iuliana1999@gmail.com");
        loginApp.addPassword("ovi17071");
        loginApp.clickLoginButton();
        addNewClient().closeCoockiesAdd();
        addNewClient().selectContAppPSButton();
        addNewClient().selectIncome();
        addNewClient().selectClients();
        addNewClient().selectAddClientBtn();
        addNewClient().addCuiOrCIF(cuiOrCif);
        addNewClient().addRegisterNumber(registerNumber);
        addNewClient().selectEntityField();
        addNewClient().selectEntityList(entity);
        addNewClient().addNameField(name);
        addNewClient().selectDeadlineDroplist(deadline);
        addNewClient().addIbanField(iban);
        addNewClient().addBankNameField(bankName);
        addNewClient().selectCountryField();
        addNewClient().selectCountryList(country);
        addNewClient().selectCountyField();
        addNewClient().selectCountyList(county);
        addNewClient().addCityField(city);
        addNewClient().addAdressField(adress);
        addNewClient().selectCurrencyDroplist(currency);
        addNewClient().addContactPersonField(conctactPersonName);
        addNewClient().addContactPersonEmailField(email);
        addNewClient().addContactPersonPhoneField(phone);
        addNewClient().addContactPersonWebsiteField(website);
        addNewClient().selectSaveButton();
    }

    @Test(description = "When adding an already existing client, a notification is displayed")
    @Parameters ({"cuiOrCif", "registerNumber", "entity", "name", "deadline", "iban", "bankName", "country", "county", "city", "adress", "currency", "conctactPersonName", "email", "phone", "website"})
    public void existingClientNotification(String cuiOrCif, String registerNumber, String entity, String name, String deadline, String iban, String bankName, String country, String county, String city, String adress, String currency, String conctactPersonName, String email, String phone, String website){
        LoginPageContactApp loginApp = new LoginPageContactApp();
        loginApp.clickAuthenticationButton();
        loginApp.addEmail("olaru.iuliana1999@gmail.com");
        loginApp.addPassword("ovi17071");
        loginApp.clickLoginButton();
        addNewClient().closeCoockiesAdd();
        addNewClient().selectContAppPSButton();
        addNewClient().selectIncome();
        addNewClient().selectClients();
        addNewClient().selectAddClientBtn();
        addNewClient().addCuiOrCIF(cuiOrCif);
        addNewClient().addRegisterNumber(registerNumber);
        addNewClient().selectEntityField();
        addNewClient().selectEntityList(entity);
        addNewClient().addNameField(name);
        addNewClient().selectDeadlineDroplist(deadline);
        addNewClient().addIbanField(iban);
        addNewClient().addBankNameField(bankName);
        addNewClient().selectCountryField();
        addNewClient().selectCountryList(country);
        addNewClient().selectCountyField();
        addNewClient().selectCountyList(county);
        addNewClient().addCityField(city);
        addNewClient().addAdressField(adress);
        addNewClient().selectCurrencyDroplist(currency);
        addNewClient().addContactPersonField(conctactPersonName);
        addNewClient().addContactPersonEmailField(email);
        addNewClient().addContactPersonPhoneField(phone);
        addNewClient().addContactPersonWebsiteField(website);
        addNewClient().selectSaveButton();
        addNewClient().findNotification();
    }

    @Test(description = "When adding an already existing client, a notification is displayed")
    @Parameters ({"cuiOrCif", "registerNumber", "entity", "name", "deadline", "iban", "bankName", "country", "county", "city", "adress", "currency", "conctactPersonName", "email", "phone", "website"})
    public void verifiedSavedClient(String cuiOrCif, String registerNumber, String entity, String name, String deadline, String iban, String bankName, String country, String county, String city, String adress, String currency, String conctactPersonName, String email, String phone, String website){
        LoginPageContactApp loginApp = new LoginPageContactApp();
        addNewClient().acceptAlert();
        loginApp.clickAuthenticationButton();
        addNewClient().acceptAlert();
        loginApp.addEmail("olaru.iuliana1999@gmail.com");
        loginApp.addPassword("ovi17071");
        loginApp.clickLoginButton();
        addNewClient().closeCoockiesAdd();
        addNewClient().selectContAppPSButton();
        addNewClient().selectIncome();
        addNewClient().selectClients();
        addNewClient().selectAddClientBtn();
        addNewClient().addCuiOrCIF(cuiOrCif);
        addNewClient().addRegisterNumber(registerNumber);
        addNewClient().selectEntityField();
        addNewClient().selectEntityList(entity);
        addNewClient().addNameField(name);
        addNewClient().selectDeadlineDroplist(deadline);
        addNewClient().addIbanField(iban);
        addNewClient().addBankNameField(bankName);
        addNewClient().selectCountryField();
        addNewClient().selectCountryList(country);
        addNewClient().selectCountyField();
        addNewClient().selectCountyList(county);
        addNewClient().addCityField(city);
        addNewClient().addAdressField(adress);
        addNewClient().selectCurrencyDroplist(currency);
        addNewClient().addContactPersonField(conctactPersonName);
        addNewClient().addContactPersonEmailField(email);
        addNewClient().addContactPersonPhoneField(phone);
        addNewClient().addContactPersonWebsiteField(website);
        addNewClient().selectSaveButton();
        addNewClient().findNotification();
        addNewClient().findClientsTable();
    }




































}
