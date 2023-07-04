package pages.SettingCompany;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReceiptsAndPaymentsClients extends BaseTest {
    @FindBy(xpath = "//button[normalize-space()='Incasari clienti']")
    private WebElement incasariClienti;
    @FindBy(xpath = "//*[@id='select2-select-transaction-customer-id-income-1---container']")
    private WebElement clientButton;

    @FindBy(xpath = "//input[@aria-label='Search']")
    private WebElement searchInput;
    @FindBy(xpath = "//li[@aria-selected='true']")
    private WebElement elementSelect;

    @FindBy(xpath = "//input[@id='registration-number']")
    private WebElement registrationNumber;
    @FindBy(xpath = "(//button[contains(@type,'button')])[8]")
    private WebElement searchRegistrationNumber;

    @FindBy(xpath = "//input[@id='input-iban']")
    private WebElement inputIBAN;

    @FindBy(xpath = "//input[@id='input-bankName']")
    private WebElement inputBankName;
    @FindBy(xpath = "//input[@id='input-contactName']")
    private WebElement inputContactName;
    @FindBy(xpath = "//input[@id='input-email']")
    private WebElement inputEmail;
    @FindBy(xpath = "//input[@id='input-phone']")
    private WebElement inputPhoneNumber;

    @FindBy(xpath = "//input[@id='input-website']")
    private WebElement inputWebsite;
    @FindBy(xpath = "//button[contains(@class,'btn btn-sm btn-primary')][contains(text(),'Salvează')]")
    private WebElement saveButtonNewClient;
    @FindBy(xpath = "(//div[contains(@class,'col-lg-2')])[1]")
    private WebElement bankButton;
    @FindBy(xpath = "//*[@id='select2-select-bank-form-type-select--create-bank-income---container']")
    private WebElement bankType;
    @FindBy(xpath = "//input[@id='bank-form-type-input-name--create-bank-income--']")
    private WebElement aboutBankType;

    @FindBy(xpath = "//*[@id='select2-select-bank-form-currency-select--create-bank-income---container']")
    private WebElement currency;
    @FindBy(xpath = "//input[@id='bank-form-details-input-iban--create-bank-income--']")
    private WebElement bankDetailsText;
    @FindBy(xpath = "//*[@id='create-bank-income--']/div/div/div[3]/button[1]")
    private WebElement saveBankButton;
    @FindBy(xpath = "//*[@id='add-income-transaction']/div/div/div[2]/div/div[1]/div/div/div/div[2]/div[3]/div/div/span/span[1]/span")
    private WebElement placeActivity;
    @FindBy(xpath = "//*[@id='add-income-transaction']/div/div/div[2]/div/div[1]/div/div/div/div[2]/div[4]/div/div/span/span[1]/span")
    private WebElement caenCode;
    @FindBy(xpath = "//*[@id='select2-select-activity-form-select-category--container']")
    private WebElement categoryIncomeTaxable;
    @FindBy(xpath = "//input[@id='activity-form-input-documentNumber-']")
    private WebElement inputActivityIncome;
    @FindBy(xpath = "//input[@id='activity-form-input-authorizationNumber-']")
    private WebElement autorizationNumber;
    @FindBy(xpath = "(//input[@id='activity-from-start-date-'])[1]")
    private WebElement dateFromButton;
    @FindBy(xpath = "//td[@class='day'][normalize-space()='6']")
    private WebElement dateFromAddIncome;
    @FindBy(xpath = "(//input[@id='activity-from-end-date-'])[1]")
    private WebElement toDateButton;
    @FindBy(xpath = "//td[@class='day'][normalize-space()='28']")
    private WebElement dateToAddIncome;
    @FindBy(xpath = "//*[@id='create-activity-income--']/div/div/div[3]/button[1]")
    private WebElement saveButtonPlaceActivity;
    @FindBy(xpath = "//*[@id='add-income-transaction']/div/div/div[2]/div/div[3]/div/div/div/div[1]/div[1]/div/div/span/span[1]/span")
    private WebElement receiptDocument;
    @FindBy(xpath = "//input[@id='input-number']")
    private WebElement documentNumber;
    @FindBy(xpath = "(//input[@id='transaction-date-income--'])[1]")
    private WebElement dateDocumentNumber;
    @FindBy(xpath = "//td[@class='day'][normalize-space()='2']")
    private WebElement dayDocumentNumber;
    @FindBy(xpath = "(//input[@id='input-total'])[1]")
    private WebElement receiptsMoney;
    @FindBy(xpath = "(//span[@id='select2-select-company-article-types-list-id-income---container'])[1]")
    private WebElement typeArticol;
    @FindBy(xpath = "//*[@id='add-income-transaction']/div/div/div[2]/div/div[3]/div/div/div/div[2]/div[2]/div/div/span/span[1]/span")
    private WebElement explicationTypeArticol;

    @FindBy(xpath = "//*[@id='add-income-transaction']/div/div/div[2]/div/div[3]/div/div/div/div[2]/div[3]/div/div/span/span[1]/span")
    private WebElement fiscalCategory;
    @FindBy(xpath = "/html/body/main/div/div/div[3]/div/div[1]/div/div/div[2]/div/div[1]/div/div/div/div[2]/div[1]/div/div/span[2]/span/span[2]/ul/li[2]")
    private WebElement chosenClient;
    @FindBy(xpath = "(//button[contains(text(),'Adaugă încasare')])[1]")
    private WebElement addCollect;

    public void clickIncasariClienti() {
        click(incasariClienti);
    }

    public void clickClientButton() {
        click(clientButton);
    }

    public void addSearchInput(String searchInput) {
        addText(searchInput, this.searchInput);
    }

    public void clickElementSelect() {
        click(elementSelect);
    }

    public void addRegistrationNumber(String registrationNumber) {
        addText(registrationNumber, this.registrationNumber);
    }

    public void clickSearchRegistrationNumber() {
        click(searchRegistrationNumber);
    }

    public void addInputIBAN(String inputIBAN) {
        addText(inputIBAN, this.inputIBAN);
    }

    public void addInputBankName(String inputBankName) {
        addText(inputBankName, this.inputBankName);
    }

    public void addInputContactName(String inputContactName) {
        addText(inputContactName, this.inputContactName);
    }

    public void addInputEmail(String inputEmail) {
        addText(inputEmail, this.inputEmail);
    }

    public void addInputPhoneNumber(String inputPhoneNumber) {
        addText(inputPhoneNumber, this.inputPhoneNumber);
    }

    public void addInputWebsite(String inputWebsite) {
        addText(inputWebsite, this.inputWebsite);
    }

    public void clickSaveButtonNewClient() {
        click(saveButtonNewClient);
    }

    public void clickBankButton() {
        click(bankButton);
    }

    public void searchBank(String searchInput) {
        addText(searchInput, this.searchInput);
    }

    public void clickBankType() {
        click(bankType);
    }

    public void searchTypeBank(String searchInput) {
        addText(searchInput, this.searchInput);
    }

    public void addAboutBankType(String aboutBankType) {
        addText(aboutBankType, this.aboutBankType);
    }

    public void clickCurrency() {
        click(currency);
    }

    public void whichCurrency(String searchInput) {
        addText(searchInput, this.searchInput);
    }

    public void addBankDetailsText(String bankDetailsText) {
        addText(bankDetailsText, this.bankDetailsText);
    }

    public void clickSaveBankButton() {
        click(saveBankButton);
    }

    public void clickPlaceActivity() {
        click(placeActivity);
    }

    public void addPlaceActivity(String searchInput) {
        addText(searchInput, this.searchInput);
    }

    public void clickCaenCode() {
        click(caenCode);
    }

    public void addCaenCODE(String searchInput) {
        addText(searchInput, this.searchInput);
    }

    public void clickCategoryIncomeTaxable() {
        click(categoryIncomeTaxable);
    }

    public void addCategoryIncomeTaxable(String searchInput) {
        addText(searchInput, this.searchInput);
    }

    public void addInputActivityIncome(String inputActivityIncome) {
        addText(inputActivityIncome, this.inputActivityIncome);
    }

    public void addAutorizationNumber(String autorizationNumber) {
        addText(autorizationNumber, this.autorizationNumber);
    }

    public void clickDateFromButton() {
        toBeClickable(dateFromButton);
        click(dateFromButton);
    }

    public void addDateFromAddIncome() {
        toBeClickable(dateFromAddIncome);
        click(dateFromAddIncome);
    }

    public void clickDateToButton() {
        toBeClickable(toDateButton);
        click(toDateButton);
    }

    public void addDateToAddIncome() {
        toBeClickable(dateToAddIncome);
        click(dateToAddIncome);
    }

    public void clickSaveButtonPlaceActivity() {
        click(saveButtonPlaceActivity);
    }

    public void clickReceiptDocument() {
        click(receiptDocument);
    }

    public void addReceiptDocument(String searchInput) {
        addText(searchInput, this.searchInput);
    }

    public void addDocumentNumber(String documentNumber) {
        addText(documentNumber, this.documentNumber);
    }

    public void clickDateDocumentNumber() {
        click(dateDocumentNumber);
    }

    public void clickDayDocumentNumber() {
        click(dayDocumentNumber);
    }

    public void addReceiptsMoney(String receiptsMoney) {
        addText(receiptsMoney, this.receiptsMoney);
    }

    public void clickTypeArticol() {
        click(typeArticol);
    }

    public void addTypeArticol(String searchInput) {
        addText(searchInput, this.searchInput);
    }

    public void clickExplicationTypeArticol() {
        click(explicationTypeArticol);
    }

    public void addExplicationTypeArticol(String searchInput) {
        addText(searchInput, this.searchInput);
    }

    public void clickFiscalCategory() {
        click(fiscalCategory);
    }

    public void addFiscalCategory(String searchInput) {
        addText(searchInput, this.searchInput);
    }

    public void clickAddCollect() {
        click(addCollect);
    }

    public void clickChosenClient() {
        click(chosenClient);
    }


}
