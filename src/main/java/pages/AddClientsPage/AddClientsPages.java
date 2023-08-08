package pages.AddClientsPage;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class AddClientsPages extends BaseTest {
    @FindBy(xpath = "//div[@class='otFlat bottom ot-wo-title vertical-align-content']")
    private WebElement cookiesAdd;
    @FindBy(xpath = "//button[@class='onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon']")
    private WebElement closeCoockiesAddButton;

    @FindBy(xpath = "//div[@class='ot-sdk-row']")
    private WebElement alert;

    @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
    private WebElement acceptAlert;

    @FindBy(xpath = "//a[normalize-space()='ContApp PS']")
    private WebElement contAppPSButton;
    @FindBy(xpath = "//a[normalize-space()='Venituri']")
    private WebElement incomeBtn;

    @FindBy(xpath = "//a[normalize-space()='Clienți']")
    private WebElement clientBtn;

    @FindBy(xpath = "//a[@class='btn btn-light']")
    private WebElement addCientBtn;

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

    @FindBy(xpath = "//tbody//tr//td//span")
    private List<WebElement> clientTable;

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

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    private WebElement saveBtn;

    @FindBy(xpath = "//a[@class='btn btn-light']")
    private WebElement cancelBtn;

    @FindBy(xpath = "//div[@class='modal-dialog modal-dialog-centered']")
    private WebElement notification;

    @FindBy(xpath = "//div[@class='justify-content-start modal-footer']//button[2]")
    private WebElement notificationCancelBtn;



    @FindBy(xpath = "//div[@class='toast toast-success']")
    private WebElement successPopup;




    public void closeCoockiesAdd() {
        if(cookiesAdd.isDisplayed());
        click(closeCoockiesAddButton);
    }
    public void selectContAppPSButton() {
        click(contAppPSButton);
    }
    public void selectIncome(){
        click(incomeBtn);
    }

    public void selectClients(){
        click(clientBtn);
    }

    public void selectAddClientBtn(){
        click(addCientBtn);
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

    public void selectSaveButton(){
        movetoElement();
        click(saveBtn);
    }

    public void selectCancelButton(){
        click(cancelBtn);
    }

    public void findNotification(){
        findElement(notification);
        if (notification.isDisplayed()){
            click(notification);
            click(notificationCancelBtn);
        } else {
            System.out.println("This is a unique client");
        }
    }



    public void acceptAlert(){
        click(alert);
        if(alert.isDisplayed()) {
            click(acceptAlert);
        }
    }

    public void succesClientAddedPopup(){
        click(successPopup);
        Assert.assertTrue(successPopup.isDisplayed());
    }


    public void selectClientTable(String text){
        Assert.assertEquals(listofElements(clientTable, text).getText(), text);
    }




}