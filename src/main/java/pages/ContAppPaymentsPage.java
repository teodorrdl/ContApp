package pages;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContAppPaymentsPage extends BaseTest {
    @FindBy(xpath = "//a[normalize-space()='Autentifica-te']")
    private WebElement authenticationButton;
    @FindBy(xpath = "//input[@id='email']")
    private WebElement emailField;
    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordField;
    @FindBy(xpath = "//button[normalize-space()='Autentificare']")
    private WebElement loginButton;
    @FindBy(xpath = "//a[normalize-space()='ContApp PS']")
    private WebElement contAppPSButton;
    @FindBy(xpath = "//a[contains(text(),'Încasări și plăți')]")
    private WebElement receiptsAndPaymentsButton;
    @FindBy(xpath = "//a[contains(text(),'Plăți')]")
    private WebElement payments;
    @FindBy(xpath = "//a[@class='btn btn-light']")
    private WebElement addNewPayment;
    @FindBy(xpath = "//button[normalize-space()='Plati furnizori']")
    private WebElement suppliersPayment;
    @FindBy(xpath = "//*[@id=\"select2-select-transaction-customer-id-expense-1---container\"]")
    private WebElement supplier;
    @FindBy(xpath = "/html/body/main/div/div/div[2]/div/div[1]/div[1]/div/div/div/div[2]/div[1]/div/div/span[2]/span/span[1]/input")
    private WebElement newSupplier;
    @FindBy(xpath = "//*[@id=\"registration-number\"]")
    private WebElement supplierCUI;
    @FindBy(xpath = "//span[normalize-space()='România']")
    private WebElement selectRomania;
    @FindBy(xpath = "//span[@id='select2-select-create-customer-org-type-select-container']")
    private WebElement supplierTypeSRL;
    @FindBy(xpath = "//input[@aria-label='Search']")
    private WebElement supplierType;
    @FindBy(xpath = "//*[@id=\"input-tradeRegistrationNumber\"]")
    private WebElement supplierRegistrationNumber;
    @FindBy(xpath = "//*[@id=\"input-name\"]")
    private WebElement supplierName;
    @FindBy(xpath = "//*[@id=\"input-iban\"]")
    private WebElement supplierIban;
    @FindBy(xpath = "//*[@id=\"input-bankName\"]")
    private WebElement supplierBankName;
    @FindBy(xpath = "(//b[@role='presentation'])[11]")
    private WebElement supplierCountry;
    @FindBy(xpath = "//span[normalize-space()='Arges']")
    private WebElement supplierCountySelect;
    @FindBy(xpath = "(//b[@role='presentation'])[12]")
    private WebElement supplierCounty;
    @FindBy(xpath = "//*[@id=\"input-city\"]")
    private WebElement supplierCity;
    @FindBy(xpath = "//*[@id=\"input-address\"]")
    private WebElement supplierAddress;
    @FindBy(xpath = "(//b[contains(@role,'presentation')])[13]")
    private WebElement supplierCurrency;
    @FindBy(xpath = "//span[normalize-space()='RSD']")
    private WebElement changeCurrency;
    @FindBy(xpath = "//*[@id=\"input-contactName\"]")
    private WebElement supplierContact;
    @FindBy(xpath = "//*[@id=\"input-email\"]")
    private WebElement supplierEmail;
    @FindBy(xpath = "//*[@id=\"input-phone\"]")
    private WebElement supplierPhone;
    @FindBy(xpath = "//*[@id=\"input-website\"]")
    private WebElement supplierWebsitte;
    @FindBy(xpath = "(//button[@class='btn btn-sm btn-primary'][contains(text(),'Salvează')])[1]")
    private WebElement supplierSaveButton;
    @FindBy(xpath = "(//b[contains(@role,'presentation')])[2]")
    private WebElement openCreatedSupplier;
    @FindBy(xpath = "//span[normalize-space()='Q TEST SA']")
    private WebElement selectCreatedSupplier;
    @FindBy(xpath = "(//b[contains(@role,'presentation')])[3]")
    private WebElement openSelectBank;
    @FindBy(xpath = "(//span[contains(text(),'Bancă principală')])[2]")
    private WebElement selectBank;
    @FindBy(xpath = "(//b[contains(@role,'presentation')])[4]")
    private WebElement openSelectLocation;
    @FindBy(xpath = "(//span[contains(text(),'Sediul profesional')])[2]")
    private WebElement selectLocation;
    @FindBy(xpath = "//span[contains(text(),'Activitate nouă')]")
    private WebElement addCaen;
    @FindBy(xpath = "(//span[contains(@title,'Sediul profesional')][normalize-space()='Sediul profesional'])[2]")
    private WebElement openCaenLocation;
    @FindBy(xpath = "//li[normalize-space()='Activitate desfășurată la terți']")
    private WebElement caenLocation;
    @FindBy(xpath = "//*[@id=\"select2-select-activity-form-select-category--container\"]")
    private WebElement openCaenCategory;
    @FindBy(xpath = "//span[contains(text(),'Cedarea folosinței bunurilor calificată ca venitur')]")
    private WebElement caenCategory;
    @FindBy(xpath = "//input[@id='activity-form-input-documentNumber-']")
    private WebElement caenActivity;
    @FindBy(xpath = "//*[@id=\"activity-form-input-authorizationNumber-\"]")
    private WebElement caenNumberTextBox;
    @FindBy(xpath = "//input[@id='activity-from-start-date-']")
    private WebElement openCaenRegistrationDate;
    @FindBy(xpath = "//input[@id='activity-from-end-date-']")
    private WebElement openCaenSuspendDate;
    @FindBy(xpath = "/html/body/div[10]/div[1]/table/tbody/tr[2]/td[6]")
    private WebElement caenRegistrationDate;
    @FindBy(xpath = "/html/body/div[10]/div[1]/table/tbody/tr[4]/td[6]")
    private WebElement caenSuspendDate;
    @FindBy(xpath = "//*[@id=\"create-activity-expense--\"]/div/div/div[3]/button[1]")
    private WebElement caenSaveButton;
    @FindBy(xpath = "//*[@id=\"select2-select-transaction-activity-id-expense---result-h2ze-2203\"]")
    private WebElement selectCreatedCaen;
    @FindBy(xpath = "//span[@title='Extras Bancar']")
    private WebElement paymentDocument;
    @FindBy(xpath = "//li[normalize-space()='Ordin de plata']")
    private WebElement selectPaymentDocument;
    @FindBy(xpath = "//*[@id=\"input-number\"]")
    private WebElement documentNumber;
    @FindBy(xpath = "//input[@id='transaction-date-expense--']")
    private WebElement documentDate;
    @FindBy(xpath = "//td[normalize-space()='10']")
    private WebElement selectDocumentDate;
    @FindBy(xpath = "//input[@type='number']")
    private WebElement leiPayment;
    @FindBy(xpath = "//span[@title='Bunuri']")
    private WebElement itemType;
    @FindBy(xpath = "//li[normalize-space()='Altele']")
    private WebElement selectItemType;
    @FindBy(xpath = "//span[@id='select2-select-company-categories-list-id-expense---container']")
    private WebElement fiscalCategory;
    @FindBy(xpath = "//li[normalize-space()='Cheltuieli integral nedeductibile']")
    private WebElement fiscalCategoryOption;
    @FindBy(xpath = "//input[@id='checkbox-saveArticle']")
    private WebElement saveItemCheckBox;
    @FindBy(xpath = "//button[contains(text(),'Adaugă plată')]")
    private WebElement addPaymentButton;
    @FindBy(xpath = "//span[@id='select2-select-company-articles-list-id-expense---container']")
    private WebElement explicationDropDown;
    @FindBy(xpath = "//input[@aria-label='Search']")
    private WebElement explicationSearchTextBox;
    @FindBy(xpath = "//span[normalize-space()='PFA']")
    private WebElement selectPFAButton;

    @FindBy(xpath = "//*[@id=\"onetrust-accept-btn-handler\"]")
    private WebElement closeCookieButton;

    @FindBy(xpath = "(//b[contains(@role,'presentation')])[5]")
    private WebElement openCaenActivity;

    @FindBy(xpath = "//*[@id=\"customer-duplicate-modal-confirmation\"]/div/div/div[3]/button[1]")
    private WebElement closeAnotherCompanyWarning;

    public void clickSelectedDocumentDate() {
        click(selectDocumentDate);
    }

    public void selectPaymentDocument() {
        click(selectPaymentDocument);
    }

    public void clickItemType() {
        click(selectItemType);
    }

    public void fiscalCategoryOption() {
        click(fiscalCategoryOption);
    }

    public void clickAutentification() {
        click(authenticationButton);
    }

    public void addEmail(String email) {
        addText(email, emailField);
    }

    public void openCaenRegistrationDate() {
        click(openCaenRegistrationDate);
    }

    public void openCaenSuspendDate() {
        click(openCaenSuspendDate);
    }

    public void openCaenCategory() {
        click(openCaenCategory);
    }

    public void addPassword(String password) {
        addText(password, passwordField);
    }

    public void clickLoginButton() {
        click(loginButton);
    }

    public void clickContAppPS() {
        click(contAppPSButton);
    }

    public void clickReceiptsPayments() {
        click(receiptsAndPaymentsButton);
    }

    public void clickPayments() {
        click(payments);
    }

    public void clickSupplier() {
        click(supplier);
    }

    public void clickAddNewPayment() {
        click(addNewPayment);
    }

    public void selectPaymentType() {
        click(suppliersPayment);
    }

    public void selectSupplier(String NewSupplier) {
        addText(NewSupplier, newSupplier);
    }

    public void addSupplierCUI(String CUI) {
        addText(CUI, supplierCUI);
    }

    public void addSupplierRegistrationNumber(String registrationNumber) {
        addText(registrationNumber, supplierRegistrationNumber);
    }

    public void addSupplierName(String SupplierName) {
        addText(SupplierName, supplierName);
    }

    public void selectSupplierCountry() {
        click(supplierCountry);
    }

    public void selectSupplierCounty() {
        click(supplierCounty);
    }

    public void addSupplierCity(String City) {
        addText(City, supplierCity);
    }

    public void addSupplierAddress(String Address) {
        addText(Address, supplierAddress);
    }

    public void selectSupplierCurrency() {
        click(supplierCurrency);
    }

    public void addSupplierIban(String Iban) {
        addText(Iban, supplierIban);
    }

    public void addSupplierBankName(String BankName) {
        addText(BankName, supplierBankName);
    }

    public void addSupplierContact(String Contact) {
        addText(Contact, supplierContact);
    }

    public void addSupplierEmail(String Email) {
        addText(Email, supplierEmail);
    }

    public void addSupplierPhone(String Phone) {
        addText(Phone, supplierPhone);
    }

    public void addSupplierWebsite(String Website) {
        addText(Website, supplierWebsitte);
    }

    public void saveSupplier() {
        click(supplierSaveButton);
    }

    public void openCreatedSupplier() {
        click(openCreatedSupplier);
    }

    public void selectBank() {
        click(selectBank);
    }

    public void selectLocation() {
        click(selectLocation);
    }

    public void addNewCaen() {
        click(addCaen);
    }

    public void selectCaenLocation() {
        click(caenLocation);
    }

    public void selectCaenCategory() {
        click(caenCategory);
    }

    public void addCaenActivity(String CaenActivity) {
        addText(CaenActivity, caenActivity);
    }

    public void addCaenNumber(String CaenNumber) {
        addText(CaenNumber, caenNumberTextBox);
    }

    public void selectCaenRegistrationDate() {
        click(caenRegistrationDate);
    }

    public void selectCaenSuspendDate() {
        click(caenSuspendDate);
    }

    public void clickCaenSaveButton() {
        click(caenSaveButton);
    }

    public void clickPaymentDocument() {
        click(paymentDocument);
    }

    public void addDocumentNumber(String Document) {
        addText(Document, documentNumber);
    }

    public void selectDocumentDate() {
        click(documentDate);
    }

    public void addLeiPayment(String Lei) {
        addText(Lei, leiPayment);
    }

    public void selectItemType() {
        click(itemType);
    }

    public void clickExplicationDropDown() {
        click(explicationDropDown);
    }

    public void addExplication(String Explication) {
        addText(Explication, explicationSearchTextBox);
    }

    public void selectFiscalCategory() {
        click(fiscalCategory);
    }

    public void checkSaveItem() {
        click(saveItemCheckBox);
    }

    public void addPayment() {
        movetoElement();
        click(addPaymentButton);
    }

    public void clickSRL() {
        click(supplierTypeSRL);
    }

    public void clickPFA() {
        click(selectPFAButton);
    }

    public void selectRomania() {
        click(selectRomania);
    }

    public void closeCookieButton() {
        click(closeCookieButton);
    }

    public void selectCounty() {
        click(supplierCountySelect);
    }

    public void changeCurrency() {
        click(changeCurrency);
    }

    public void selectCreatedSupplier() {
        click(selectCreatedSupplier);
    }

    public void closeAnotherCompanyWarning() {
        click(closeAnotherCompanyWarning);
    }

    public void openSelectBank() {
        click(openSelectBank);
    }

    public void openSelectLocation() {
        click(openSelectLocation);
    }

    public void openCaenActivity() {
        click(openCaenActivity);
    }

    public void openCaenLocation() {
        click(openCaenLocation);
    }


}
