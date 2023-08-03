package pages;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SupplierPaymentPage extends BaseTest {
    @FindBy(xpath = "//button[@onclick=\"showModal('add-expense-transaction')\"]")
    private WebElement addExpense;

    @FindBy(xpath = "//*[@id=\"registration-number\"]")
    private WebElement supplierCUI;
    @FindBy(xpath = "//a[contains(text(),'Jurnal de Casă/Bancă')]")
    private WebElement houseAndBankJournal;

    @FindBy(xpath = "//span[@id='select2-select-transaction-customer-id-expense-1---container']")
    private WebElement openSupplier;
    @FindBy(xpath = "//span[normalize-space()='Furnizor nou']")
    private WebElement selectNewSupplier;
    @FindBy(xpath = "//li[contains(@role,'option')]//span[contains(text(),'România')]")
    private WebElement selectCountry;
    @FindBy(xpath = "//span[@title='România']")
    private WebElement openCountry;
    @FindBy(xpath = "//span[normalize-space()='Alba']")
    private WebElement selectSupplierCounty;
    @FindBy(xpath = "//span[@id='select2-select-create-customer-county-select-container']")
    private WebElement openSupplierCounty;
    @FindBy(xpath = "//span[@id='select2-select-create-customer-currency-select-container']")
    private WebElement supplierCurrency;
    @FindBy(xpath = "//div[@class='col-lg-2']//input[@id='input-number']")
    private WebElement documentNum;
    @FindBy(xpath = "//label[@for='transaction-date-expense--']//i[@class='bi bi-calendar']")
    private WebElement openDocDate;
    @FindBy(xpath = "//th[@class='prev']")
    private WebElement prevDate;
    @FindBy(xpath = "//td[@class='old day'][normalize-space()='29']")
    private WebElement selectDocDate;
    @FindBy(xpath = "//span[@id='select2-select-company-article-types-list-id-expense---container']")
    private WebElement openItemType;
    @FindBy(xpath = "//span[normalize-space()='Aporturi']")
    private WebElement selectItemType;
    @FindBy(xpath = "//span[@id='select2-select-company-articles-list-id-expense---container']")
    private WebElement openExplication;
    @FindBy(xpath = "//input[@aria-label='Search']")
    private WebElement typeExplication;
    @FindBy(xpath = "//span[@id='select2-select-company-categories-list-id-expense---container']")
    private WebElement openFiscalCategory;
    @FindBy(xpath = "//span[normalize-space()='Cheltuieli de protocol']")
    private WebElement selectFiscalCategory;
    @FindBy(xpath = "//button[contains(text(),'Adaugă plată')]")
    private WebElement saveArticle;
    @FindBy(xpath = "//*[@id=\"input-contactName\"]")
    private WebElement supplierContact;
    @FindBy(xpath = "//*[@id=\"input-email\"]")
    private WebElement supplierEmail;
    @FindBy(xpath = "//*[@id=\"input-phone\"]")
    private WebElement supplierPhone;
    @FindBy(xpath = "//*[@id=\"input-website\"]")
    private WebElement supplierWebsite;
    @FindBy(xpath = "//*[@id=\"input-iban\"]")
    private WebElement supplierIban;
    @FindBy(xpath = "//*[@id=\"input-bankName\"]")
    private WebElement supplierBankName;
    @FindBy(xpath = "(//div[@class='card-body']//span[contains(@role,'presentation')])[4]")
    private WebElement openActivityLocation;
    @FindBy(xpath = "//span[normalize-space()='Sediul profesional']")
    private WebElement selectActivityLocation;
    @FindBy(xpath = "(//div[@class='card-body']//span[contains(@role,'presentation')])[5]")
    private WebElement openCaenCode;
    @FindBy(xpath = "(//span[contains(text(),'Sediul profesional | 105178297')])[2]")
    private WebElement selectCaen;
    @FindBy(xpath ="//div[@class='col-md-4 mb-lg-0 mb-3']//b[@role='presentation']")
    private WebElement openDropdown;
    @FindBy(xpath ="//span[contains(text(),'Casă principală')]")
    private WebElement selectFromDropDown;
    @FindBy(xpath="(//td[@class='text-end']/div/div/button)[1]")
    private WebElement openOptions;
    @FindBy(xpath ="//ul[@class='dropdown-menu show']//i[@class='bi bi-trash3']")
    private WebElement clickDelete;

    public void deletePayment(){
        click(openOptions);
        click(clickDelete);
    }
    public void changeFromBank(){
        click(openDropdown);
        click(selectFromDropDown);
    }
    public void selectCaen(){
        click(openCaenCode);
        click(selectCaen);
    }
    public void setActivityLocation(){
        click(openActivityLocation);
        click(selectActivityLocation);
    }
    public void addSupplierBankName(String BankName) {
        addText(BankName, supplierBankName);
    }
    public void addSupplierIban(String Iban) {
        addText(Iban, supplierIban);
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
        addText(Website, supplierWebsite);
    }

    public void saveArticle() {
        click(saveArticle);
    }

    public void setFiscalCategory() {
        click(openFiscalCategory);
        click(selectFiscalCategory);
    }

    public void addExplication(String explication) {
        click(openExplication);
        addText(explication, typeExplication);
    }

    public void setItemType() {
        click(openItemType);
        click(selectItemType);
    }

    public void addDocNumAndDate(String documentNum) {
        addText(documentNum, this.documentNum);
        click(openDocDate);
        click(prevDate);
        click(selectDocDate);
    }

    public void setSupplierCurrency() {
        click(supplierCurrency);
    }

    public void selectSupplierCounty() {
        click(openSupplierCounty);
        click(selectSupplierCounty);
    }

    public void selectCountry() {
        click(openCountry);
        click(selectCountry);
    }

    public void addNewPayment() {
        click(houseAndBankJournal);
        click(addExpense);
    }

    public void addNewSupplier() {
        click(openSupplier);
        click(selectNewSupplier);
    }

    public void addSupplierCUI(String CUI) {
        addText(CUI, supplierCUI);
    }

}
