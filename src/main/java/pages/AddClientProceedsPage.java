package pages;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class AddClientProceedsPage extends BaseTest {

    @FindBy(xpath = "//div[@class='otFlat bottom ot-wo-title vertical-align-content']")
    private WebElement cookiesAdd;
    @FindBy(xpath = "//button[@class='onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon']")
    private WebElement closeCoockiesAddButton;
    @FindBy(xpath = "//a[normalize-space()='ContApp PS']")
    private WebElement contAppPSButton;

    @FindBy(xpath = "//a[@href='https://ps.contapp.ro/incasare/creaza']")
    private WebElement addProceedsButton;

    @FindBy(xpath = "//div//span[@id='select2-select-transaction-customer-id-income-1---container']")
    private WebElement client;

    @FindBy(xpath = "//ul[@id='select2-select-transaction-customer-id-income-1---results']//li")
    private List<WebElement> clientDroplist;

    @FindBy(xpath = "//div//input[@id='registration-number']")
    private WebElement cuiOrCifField;

    @FindBy(xpath = "//input[@id='input-tradeRegistrationNumber']")
    private WebElement registerNumberField;

    @FindBy(xpath = "//div//span[@id='select2-select-create-customer-org-type-select-container']")
    private WebElement entity;

    @FindBy(xpath = "//ul[@class='select2-results__options']//li")
    private List<WebElement> entityDroplist;

    @FindBy(xpath = "//input[@id='input-name']")
    private WebElement nameField;

    @FindBy(xpath = "//div//span[@id='select2-select-create-customer-lifespan-select-container']")
    private WebElement deadline;

    @FindBy(xpath = "//ul[@class='select2-results__options']//li")
    private List<WebElement> deadlineDroplist;

    @FindBy(xpath = "//input[@id='input-iban']")
    private WebElement ibanField;

    @FindBy(xpath = "//input[@id='input-bankName']")
    private WebElement bankNameField;

    @FindBy(xpath = "//div//span[@id='select2-select-create-customer-country-select-container']")
    private WebElement country;

    @FindBy(xpath = "//ul[@class='select2-results__options']//li")
    private List<WebElement> countryDroplist;
    @FindBy(xpath = "//div//span[@id='select2-select-create-customer-county-select-container']")
    private WebElement county;

    @FindBy(xpath = "//ul[@class='select2-results__options']//li")
    private List<WebElement> countyDroplist;

    @FindBy(xpath = "//input[@id='input-city']")
    private WebElement cityField;

    @FindBy(xpath = "//input[@id='input-address']")
    private WebElement adressField;

    @FindBy(xpath = "//div//span[@id='select2-select-create-customer-currency-select-container']")
    private WebElement currency;
    @FindBy(xpath = "//ul[@class='select2-results__options']//li")
    private List<WebElement> currencyDroplist;

    @FindBy(xpath = "//input[@id='input-contactName']")
    private WebElement contactPersonField;

    @FindBy(xpath = "//input[@id='input-email']")
    private WebElement contactPersonEmailField;

    @FindBy(xpath = "//input[@id='input-phone']")
    private WebElement contactPersonPhoneField;

    @FindBy(xpath = "//input[@id='input-website']")
    private WebElement contactPersonWebsiteField;

    @FindBy(xpath = "//button[contains(@class,'btn btn-sm btn-primary')][contains(text(),'Salvează')]")
    private WebElement saveButton;

    @FindBy(xpath = "(//button[contains(@type,'button')][normalize-space()='Închide'])[2]")
    private WebElement cancelButton;

    @FindBy(xpath = "//button[normalize-space()='Incasari clienti']")
    private WebElement clientProceeds;

    @FindBy(xpath = "//button[normalize-space()='Incasari diverse']")
    private WebElement otherProceeds;
    @FindBy(xpath = "//div[@class='toast toast-success']")
    private WebElement confirmationPopup;

    @FindBy(xpath = "//div[@class='col-12 text-center'][1]")
    private WebElement text1;

    @FindBy(xpath = "//div[@class='col-12 text-center']//a")
    private WebElement addInvoice;




    public void closeCoockiesAdd() {
        findElement(cookiesAdd);
        click(closeCoockiesAddButton);
    }

    public void selectContAppPSButton() {
        click(contAppPSButton);
    }

    public void selectAddProceedsButton() {
        click(addProceedsButton);
    }


    public void selectClientField(){
        click(client);
    }
    public void selectClientList(String clientText) {
        click(listofElements(clientDroplist, clientText));
    }


    public void addCuiOrCIF(String cuiOrCif) {
        addText(cuiOrCif, cuiOrCifField);
    }

    public void addRegisterNumber(String registerNumber) {
        addText(registerNumber, registerNumberField);
    }

    public void selectEntityField() {
        click(entity);
    }

    public void selectEntityList(String text){
        click(listofElements(entityDroplist, text));
    }

    public void addNameField(String name) {
        addText(name, nameField);
    }

    public void selectDeadlineDroplist(String text) {
        click(deadline);
        click(listofElements(deadlineDroplist, text));
    }

    public void addIbanField(String iban) {
        addText(iban, ibanField);
    }

    public void addBankNameField(String bankName) {
        addText(bankName, bankNameField);
    }

    public void selectCountryField(){
        click(country);
    }
    public void selectCountryList(String text) {
        click(listofElements(countryDroplist, text));
    }

    public void selectCountyField(){
        click(county);
    }
    public void selectCountyList(String text) {
        click(listofElements(countyDroplist, text));
    }

    public void addCityField(String city) {
        addText(city, cityField);
    }

    public void addAdressField(String adress) {
        addText(adress, adressField);
    }

    public void selectCurrencyDroplist(String text) {
        click(currency);
        click(listofElements(currencyDroplist, text));
    }

    public void addContactPersonField(String personContactName) {
        addText(personContactName, contactPersonField);
    }

    public void addContactPersonEmailField(String email) {
        addText(email, contactPersonEmailField);
    }

    public void addContactPersonPhoneField(String phone) {
        addText(phone, contactPersonPhoneField);
    }

    public void addContactPersonWebsiteField(String website) {
        addText(website, contactPersonWebsiteField);
    }

    public void selectSaveButton() {
        click(saveButton);
    }

    public void selectCancelButton() {
        click(cancelButton);
    }

    public void selectClientProceeds() {
        click(clientProceeds);
    }

    public void selectOtherProceeds() {
        click(otherProceeds);
    }

    public void addNewInvoice() {
        click(addInvoice);
    }


}
