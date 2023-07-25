package pages.Payments;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentsVarious extends BaseTest {
    @FindBy(xpath = "//a[contains(text(),'Plăți')]")
    private WebElement paymentsButton;
    @FindBy(xpath = "//span[@class='d-none d-sm-inline-block']")
    private WebElement addPaymentsButton;
    @FindBy(xpath = "//button[normalize-space()='Plati diverse']")
    private WebElement paymentsVariousButton;
    @FindBy(xpath = "//span[@id='select2-select-transaction-bank-id-expense---container']")
    private WebElement newBankButton;
    @FindBy(xpath = "//span[@id='select2-select-bank-form-currency-select--create-bank-expense---container']")
    private WebElement currency;
    @FindBy(xpath = "//input[@aria-label='Search']")
    private WebElement searchInput;
    @FindBy(xpath = "//li[@aria-selected='true']")
    private WebElement choosenInput;
    @FindBy(xpath = "//span[@id='select2-select-bank-form-type-select--create-bank-expense---container']")
    private WebElement typeOfBank;
    @FindBy(xpath = "//input[@id='bank-form-type-input-name--create-bank-expense--']")
    private WebElement nameBank;
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

    @FindBy(xpath = "//button[contains(text(),'Adaugă plată')]")
    private WebElement addPayment;



    public void clickPaymentsButton() {
        click(paymentsButton);
    }

    public void clickAddPaymentsButton() {
        click(addPaymentsButton);
    }

    public void clickPaymentsVariousButton() {
        click(paymentsVariousButton);
    }

    public void clickNewBank(String searchInput) {
        click(newBankButton);
        addText(searchInput, this.searchInput);
        click(choosenInput);

    }

    public void addTypeOfBank(String searchInput) {
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

    public void clickAddPayment() {
        click(addPayment);
    }

}
