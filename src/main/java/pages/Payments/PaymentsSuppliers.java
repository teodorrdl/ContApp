package pages.Payments;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentsSuppliers extends BaseTest {
    @FindBy(xpath = "//a[contains(text(),'Plăți')]")
    private WebElement paymentsButton;
    @FindBy(xpath = "//span[@class='d-none d-sm-inline-block']")
    private WebElement addPaymentsButton;
    @FindBy(xpath = "//button[normalize-space()='Plati furnizori']")
    private WebElement paymentsSuppliersButton;
    @FindBy(xpath = "(//span[contains(@role,'combobox')])[2]")
    private WebElement suppliers;
    @FindBy(xpath = "//span[normalize-space()='Furnizor nou']")
    private WebElement newSupplier;
    @FindBy(xpath = "//input[@id='registration-number']")
    private WebElement registrationNumber;
    @FindBy(xpath = "//button[@class='btn btn-icon btn-icon-input']")
    private WebElement searchRegistrationNumber;
    @FindBy(xpath = "//input[@id='input-iban']")
    private WebElement inputIban;
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
    @FindBy(xpath = "//button[@class='btn btn-sm btn-primary'][contains(text(),'Salvează')]")
    private WebElement saveButton;
    @FindBy(xpath = "//*[@id=\"select2-select-transaction-bank-id-expense---container\"]")
    private WebElement newBank;
    @FindBy(xpath = "//span[contains(text(),'Bancă/Casă nouă')]")
    private WebElement clickNewBank;
    @FindBy(xpath = "//span[@id='select2-select-bank-form-type-select--create-bank-expense---container']")
    private WebElement typeOfBank;
    @FindBy(xpath = "//input[@aria-label='Search']")
    private WebElement searchInput;
    @FindBy(xpath = "//li[@aria-selected='true']")
    private WebElement choosenInput;
    @FindBy(xpath = "//span[contains(text(),'Bancă')]//i[@class='null']")
    private WebElement chooseBank;
    @FindBy(xpath = "//input[@id='bank-form-type-input-name--create-bank-expense--']")
    private WebElement nameBank;
    @FindBy(xpath = "//span[@id='select2-select-bank-form-currency-select--create-bank-expense---container']")
    private WebElement currency;

    @FindBy(xpath = "//input[@id='bank-form-type-input-iban--create-bank-expense--']")
    private WebElement ibanDetails;
    @FindBy(xpath = "//input[@id='bank-form-details-input-iban--create-bank-expense--']")
    private WebElement detailsBank;
    @FindBy(xpath = "//*[@id=\"create-bank-expense--\"]/div/div/div[3]/button[1]")
    private WebElement saveBankDetails;

    @FindBy(xpath = "/html/body/main/div/div/div[2]/div/div[1]/div[1]/div/div/div/div[2]/div[3]/div/div/span[1]/span[1]/span/span[1]")
    private WebElement professionalHeadquarters;
    @FindBy(xpath = "/html/body/main/div/div/div[2]/div/div[1]/div[1]/div/div/div/div[2]/div[4]/div/div/span/span[1]/span")
    private WebElement caenCode;
    @FindBy(xpath = "/html/body/main/div/div/div[2]/div/div[4]/div/div/div/div/div[2]/div/div[1]/div/div/span/span[1]/span")
    private WebElement activityPlace;
    @FindBy(xpath = "/html/body/main/div/div/div[2]/div/div[4]/div/div/div/div/div[2]/div/div[2]/div/div/span/span[1]/span")
    private WebElement incomeCategory;
    @FindBy(xpath = "//input[@id='activity-form-input-documentNumber-']")
    private WebElement income;
    @FindBy(xpath = "//input[@id='activity-form-input-authorizationNumber-']")
    private WebElement authorizationNumber;
    @FindBy(xpath = "//input[@id='activity-from-start-date-']")
    private WebElement activityDateFrom;
    @FindBy(xpath = "//input[@id='activity-from-end-date-']")
    private WebElement activityDateEnd;
    @FindBy(xpath = "//*[@id=\"create-activity-expense--\"]/div/div/div[3]/button[1]")
    private WebElement saveActivityButton;
    @FindBy(xpath = "//span[@id='select2-select-receipt-document-selector-id-expense---container']")
    private WebElement paymentDocument;
    @FindBy(xpath = "//input[@id='input-number']")
    private WebElement inputNumberDocument;
    @FindBy(xpath = "//input[@id='transaction-date-expense--']")
    private WebElement datePaymentDocument;
    @FindBy(xpath = "//input[@id='input-total']")
    private WebElement moneyPayment;
    @FindBy(xpath = "/html/body/main/div/div/div[2]/div/div[1]/div[3]/div/div/div/div[2]/div[1]/div/div/span/span[1]/span")
    private WebElement typeArticol;
    @FindBy(xpath = "/html/body/main/div/div/div[2]/div/div[1]/div[3]/div/div/div/div[2]/div[2]/div/div/span/span[1]/span")
    private WebElement explanation;
    @FindBy(xpath = "/html/body/main/div/div/div[2]/div/div[1]/div[3]/div/div/div/div[2]/div[3]/div/div/span/span[1]/span")
    private WebElement fiscalCategory;
    @FindBy(xpath = "//input[@id='checkbox-saveArticle']")
    private WebElement saveArticole;
    @FindBy(xpath = "//button[contains(text(),'Adaugă plată')]")
    private WebElement addPayment;
    @FindBy(xpath = "/html/body/main/div/div/div[2]/div/div[1]/div[1]/div/div/div/div[2]/div[1]/div/div/span[2]/span/span[2]/ul/li[2]")
    private WebElement chooseSupplier;

    public void clickPaymentsButton() {
        click(paymentsButton);
    }

    public void clickAddPaymentsButton() {
        click(addPaymentsButton);
    }

    public void clickPaymentsSuppliersButton() {
        click(paymentsSuppliersButton);
    }

    public void addNewSupplier() {
        click(suppliers);
        click(newSupplier);
    }

    public void addCuiRegistrationNumber(String registrationNumber) {
        addText(registrationNumber, this.registrationNumber);
        click(searchRegistrationNumber);
    }

    public void addInputIban(String inputIban) {
        addText(inputIban, this.inputIban);
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

    public void clickSaveButton() {
        click(saveButton);
    }

    public void selectNewBank() {
        click(newBank);
        click(clickNewBank);
    }

    public void addNewBank(String searchInput) {
        click(typeOfBank);
        addText(searchInput, this.searchInput);
        click(choosenInput);
    }

    public void addNameBank(String nameBank) {
        addText(nameBank, this.nameBank);
    }

    public void selectCurrency(String searchInput) {
        click(currency);
        addText(searchInput, this.searchInput);
        click(choosenInput);
    }

    public void addDetailsIbanBank(String ibanDetails) {
        addText(ibanDetails, this.ibanDetails);
    }


    public void addDetailsBank(String detailsBank) {
        addText(detailsBank, this.detailsBank);
    }

    public void clickSaveBankDetails() {
        click(saveBankDetails);
    }

    public void addProfessionalHeadquarters(String searchInput) {
        click(professionalHeadquarters);
        addText(searchInput, this.searchInput);
        click(choosenInput);
    }

    public void addCaenCode(String searchInput) {
        click(caenCode);
        addText(searchInput, this.searchInput);
        click(choosenInput);
    }

    public void selectActivityPlace(String searchInput) {
        click(activityPlace);
        addText(searchInput, this.searchInput);
        click(choosenInput);
    }

    public void selectIncomeCategory(String searchInput) {
        click(incomeCategory);
        addText(searchInput, this.searchInput);
        click(choosenInput);
    }

    public void addIncome(String income) {
        addText(income, this.income);
    }

    public void addAuthorizationNumber(String authorizationNumber) {
        addText(authorizationNumber, this.authorizationNumber);
        waitPage();
    }

    public void addFromDate(String activityDateFrom) {
        addText(activityDateFrom, this.activityDateFrom);
    }

    public void addEndDate(String activityDateEnd) {
        addText(activityDateEnd, this.activityDateEnd);
    }

    public void clickSaveActivityButton() {
        click(saveActivityButton);
    }

    public void selectPaymentDocument(String searchInput) {
        click(paymentDocument);
        addText(searchInput, this.searchInput);
        click(choosenInput);
    }

    public void addInputNumberDocument(String inputNumberDocument) {
        addText(inputNumberDocument, this.inputNumberDocument);
    }

    public void addDatePaymentDocument(String datePaymentDocument) {
        addText(datePaymentDocument, this.datePaymentDocument);
    }

    public void addMoneyPayment(String moneyPayment) {
        addText(moneyPayment, this.moneyPayment);
    }

    public void whichTypeOfArticol(String searchInput) {
        click(typeArticol);
        addText(searchInput, this.searchInput);
        click(choosenInput);
    }

    public void addExplanation(String searchInput) {
        click(explanation);
        addText(searchInput, this.searchInput);
        click(choosenInput);
    }

    public void addFiscalCategory(String searchInput) {
        click(fiscalCategory);
        addText(searchInput, this.searchInput);
        click(choosenInput);
    }

//    public void clickSaveArticol() {
//        click(saveArticole);
//    }

    public void clickAddPayment(int x,int y) {
        javascriptExecutor(x,y);
        click(addPayment);
    }
    public void selectSupplier(String searchInput){
        click(suppliers);
        addText(searchInput, this.searchInput);
        click(chooseSupplier);
    }

}
