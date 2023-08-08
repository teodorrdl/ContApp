package pages.SettingCompany;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClientBills extends BaseTest {
    @FindBy(xpath = "(//a[@class='quick-actions-link'])[1]")
    private WebElement clientBillsButton;
    @FindBy(xpath = "(//span[@aria-expanded='false'])[2]")
    private WebElement chooseClient;
    @FindBy(xpath = "//input[@type='search']")
    private WebElement searchInput;
    @FindBy(xpath = "//li[@aria-selected='true']")
    private WebElement choosenInput;
    @FindBy(xpath = "//input[@id='registration-number']")
    private WebElement inputRegistrationNumber;
    @FindBy(xpath = "(//button[@type='button'])[11]")
    private WebElement clickSearchFirm;
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
    @FindBy(xpath = "//span[@id='select2-select-select-currency-container']")
    private WebElement currency;
    @FindBy(xpath = "(//input[@id='input-name'])[1]")
    private WebElement writeNewCurrency;
    @FindBy(xpath = "//span[@id='select2-select-currency-form-modal-currency-create-container']")
    private WebElement newCurrency;
    @FindBy(xpath = "(//button[@class='btn btn-primary btn-sm'])[1]")
    private WebElement saveButtonCurrency;
    @FindBy(xpath = "//input[@id='datepicker-date']")
    private WebElement initialDate;
    @FindBy(xpath = "//input[@id='datepicker-dueDate']")
    private WebElement dueDate;
    @FindBy(xpath = "//span[@id='select2-select-select-invoiceType-container']")
    private WebElement typeOfBill;
    @FindBy(xpath = "//span[@id='select2-select-select-seriesId-container']")
    private WebElement series;
    @FindBy(xpath = "//span[@id='select2-select-serie-form-select-year--container']")
    private WebElement yearSeries;
    @FindBy(xpath = "//span[@id='select2-select-serie-form-select-type--container']")
    private WebElement typeOfSeries;
    @FindBy(xpath = "//input[@id='serie-form-input-name-']")
    private WebElement nameSeries;
    @FindBy(xpath = "//input[@id='serie-form-input-leadingZero-']")
    private WebElement numberOfDigits;
    @FindBy(xpath = "//input[@id='serie-form-input-startFrom-']")
    private WebElement firstNumberOfSeries;
    @FindBy(xpath = "(//button[@class='btn btn-primary btn-sm'])[2]")
    private WebElement saveButtonAddSeries;
    @FindBy(xpath = "//input[@id='input-number']")
    private WebElement numberInput;
    @FindBy(xpath = "//span[@id='select2-select-select-articleFormDataarticle_type_id-container']")
    private WebElement articleType;
    @FindBy(xpath = "(//span[@aria-expanded='false'])[11]")
    private WebElement articleName;
    @FindBy(xpath = "//span[@id='select2-select-select-articleFormDatacategory_id-container']")
    private WebElement fiscalCategory;
    @FindBy(xpath = "//span[@id='select2-select-select-articleFormDatameasurement_unit_translation_key-container']")
    private WebElement measureUnit;
    @FindBy(xpath = "//input[@id='input-articleFormData.quantity']")
    private WebElement quantity;
    @FindBy(xpath = "//input[@id='input-articleFormData.selling_price']")
    private WebElement priceWithoutTVA;
    @FindBy(xpath = "//span[@id='select2-select-select-articleFormDatavat_rate-container']")
    private WebElement rateTVA;
    @FindBy(xpath = "//input[@id='input-articleFormData.risk_product']")
    private WebElement taxRiskProduct;
    @FindBy(xpath = "//span[@id='select2-select-select-articleFormDataeu_cn_code-container']")
    private WebElement ncCode;
    @FindBy(xpath = "//span[@id='select2-select-select-articleFormDataeu_cpv_code-container']")
    private WebElement cpvCode;
    @FindBy(xpath = "//button[@class='btn btn-sm btn-light w-100']")
    private WebElement addDiscount;
    @FindBy(xpath = "//span[@id='select2-select-select-articleFormDatadiscounttype-container']")
    private WebElement typeOfDiscount;
    @FindBy(xpath = "//input[@id='input-articleFormData.discount.absolute_value']")
    private WebElement valueOfDiscount;
    @FindBy(xpath = "//button[@class='btn btn-sm btn-primary w-100']")
    private WebElement addArticle;

    public void clickClientBillsButton() {
        click(clientBillsButton);
    }

    public void clickChooseClient(String searchInput) {
        click(chooseClient);
        addText(searchInput, this.searchInput);
        click(choosenInput);
    }

    public void searchFirm(String inputRegistrationNumber) {
        addText(inputRegistrationNumber, this.inputRegistrationNumber);
        click(clickSearchFirm);
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

    public void chooseCurrency(String searchInput) {
        click(currency);
        addText(searchInput, this.searchInput);
        click(choosenInput);

    }

    public void choosenCurrency(String writeNewCurrency, String searchInput) {
        addText(writeNewCurrency, this.writeNewCurrency);
        click(newCurrency);
        addText(searchInput, this.searchInput);
        click(choosenInput);
        click(saveButtonCurrency);
    }

    public void addDate(String initialDate, String dueDate) {
        addText(initialDate, this.initialDate);
        addText(dueDate, this.dueDate);
    }

    public void chooseTypeOfBill(String searchInput) {
        click(typeOfBill);
        addText(searchInput, this.searchInput);
        click(choosenInput);
    }

    public void chooseNewSeries(String searchInput) {
        click(series);
        addText(searchInput, this.searchInput);
        click(choosenInput);
    }

    public void addYearSeries(String searchInput) {
        click(yearSeries);
        addText(searchInput, this.searchInput);
        click(choosenInput);
    }

    public void chooseTypeOfSeries(String searchInput) {
        click(typeOfSeries);
        addText(searchInput, this.searchInput);
        click(choosenInput);

    }

    public void addNameSeries(String nameSeries) {
        addText(nameSeries, this.nameSeries);
    }

    public void addNumberOfDigitsSeries(String numberOfDigits) {
        addText(numberOfDigits, this.numberOfDigits);
    }

    public void addFirstNumberOfDigits(String firstNumberOfSeries) {
        addText(firstNumberOfSeries, this.firstNumberOfSeries);
    }

    public void clickSaveButtonAddSeries() {
        click(saveButtonAddSeries);
    }

    public void addNumberInput(String numberInput) {
        addText(numberInput, this.numberInput);
    }

    public void addArticleType(String searchInput) {
        click(articleType);
        addText(searchInput, this.searchInput);
        click(choosenInput);
    }

    public void addArticleName(String searchInput) {
        click(articleName);
        addText(searchInput, this.searchInput);
        click(choosenInput);
    }

    public void addFiscalCategory(String searchInput) {
        click(fiscalCategory);
        addText(searchInput, this.searchInput);
        click(choosenInput);
    }

    public void addMeasureUnit(String searchInput) {
        click(measureUnit);
        addText(searchInput, this.searchInput);
        click(choosenInput);
    }

    public void addQuantity(String quantity) {
        addText(quantity, this.quantity);
    }

    public void addPriceWithoutTVA(String priceWithoutTVA) {
        addText(priceWithoutTVA, this.priceWithoutTVA);
    }

    public void addRateTVA(String searchInput) {
        click(rateTVA);
        addText(searchInput, this.searchInput);
        click(choosenInput);
    }


    public void addTaxRiskProduct() {
        scrollDown();
        click(taxRiskProduct);
    }

    public void addNcCode(String searchInput) {
        click(ncCode);
        addText(searchInput, this.searchInput);
        click(choosenInput);
    }

    public void addCpvCode(String searchInput) {
        click(cpvCode);
        addText(searchInput, this.searchInput);
        click(choosenInput);
    }

    public void clickAddDiscount() {
        click(addDiscount);
    }

    public void addTypeOfDiscount(String searchInput) {
        click(typeOfDiscount);
        addText(searchInput, this.searchInput);
        click(choosenInput);
    }

    public void addValueOfDiscount(String valueOfDiscount) {
        addText(valueOfDiscount, this.valueOfDiscount);
    }

    public void clickAddArticle() {
        click(addArticle);
    }
}
