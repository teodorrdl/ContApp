package pages.Income;

import base.BaseTest;
import base.PageLinksAndText;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pages.SettingCompany.ActivityPage;

import java.util.List;

public class TotalIncome extends BaseTest {

    @FindBy(xpath = "//a[contains(text(),'Adaugă factură')]")
    private WebElement addInvoiceButton;

    @FindBy(xpath = "(//span[@role='combobox'])[2]")
    private WebElement choseClientOption;

    @FindBy(xpath = "//a[contains(text(),'Adaugă client')]")
    private WebElement addClientButton;


    @FindBy(xpath = "(//span[@role='combobox'])[13]")
    private WebElement typeofEntityClientOption;

    @FindBy(xpath = "//input[contains(@aria-label,'Search')]")
    private WebElement searchInput;

    @FindBy(xpath = "//ul[@role='listbox']")
    private WebElement searchResult;

    @FindBy(xpath = "//input[@id='cnp-nif']")
    private WebElement cnpNifInput;

    @FindBy(xpath = "//input[@id='input-name']")
    private WebElement fullNameInput;

    @FindBy(xpath = "(//span[contains(@role,'combobox')])[14]")
    private WebElement invoiceDue;

    @FindBy(xpath = "//input[@id='input-iban']")
    private WebElement ibanInput;

    @FindBy(xpath = "//input[@id='input-bankName']")
    private WebElement bankNameInput;

    @FindBy(xpath = "(//span[contains(@role,'combobox')])[16]")
    private WebElement countyOption;

    @FindBy(xpath = "//input[@id='input-city']")
    private WebElement cityInput;

    @FindBy(xpath = "//input[@id='input-address']")
    private WebElement addressInput;

    @FindBy(xpath = "(//span[@role='combobox'])[17]")
    private WebElement currencyOption;

    @FindBy(xpath = "//input[@id='input-contactName']")
    private WebElement contactNameInput;

    @FindBy(xpath = "//input[@id='input-email']")
    private WebElement emailInput;

    @FindBy(xpath = "//input[@id='input-phone']")
    private WebElement phoneNrInput;

    @FindBy(xpath = "//input[@id='input-website']")
    private WebElement websiteInput;

    @FindBy(xpath = "(//button[@class='btn btn-sm btn-primary'])[1]")
    private WebElement saveButtonClient;

    @FindBy(xpath = "//a[contains(text(),'Anulează')]")
    private WebElement cancelButtonClient;

    @FindBy(xpath = "//tbody//tr")
    private List<WebElement> list;

    @FindBy(xpath = "//a[contains(text(),'Adaugă articol')]")
    private WebElement addArticleButton;

    @FindBy(xpath = "(//span[@role='combobox'])[9]")
    private WebElement articleTypeOption;

    @FindBy(xpath = "(//span[@role='combobox'])[10]")
    private WebElement articleNameOption;

    @FindBy(xpath = "(//span[@role='combobox'])[11]")
    private WebElement taxCategory;

    @FindBy(xpath = "(//span[@role='combobox'])[12]")
    private WebElement measureUnit;

    @FindBy(xpath = "//input[@id='input-articleFormData.quantity']")
    private WebElement quantityInput;

    @FindBy(xpath = "//input[@id='input-articleFormData.selling_price']")
    private WebElement sellingPriceInput;

    @FindBy(xpath = "//input[@id='input-riskProduct']")
    private WebElement riskProductInputCheckbox;

    @FindBy(xpath = "(//span[@role='combobox'])[13]")
    private WebElement codeNC;

    @FindBy(xpath = "(//span[@role='combobox'])[14]")
    private WebElement codeCPV;

    @FindBy(xpath = "//input[@id='save-article-to-database-select']")
    private WebElement saveArticleToDatabaseCheckbox;

    @FindBy(xpath = "(//button[normalize-space()='Adaugă discount'])[1]")
    private WebElement addDiscountButton;

    @FindBy(xpath = "(//span[@role='combobox'])[13]")
    private WebElement discountTypeOption;

    @FindBy(xpath = "//input[@id='input-articleFormData.discount.absolute_value']")
    private WebElement valueDiscountInput;

    @FindBy(xpath = "//button[normalize-space()='Adaugă articol']")
    private WebElement addNewArticleButton;

    @FindBy(xpath = "//input[@id='input-delegateName']")
    private WebElement delegateNameInput;

    @FindBy(xpath = "//input[@id='input-delegateIdSeries']")
    private WebElement delegateIdSeriesInput;

    @FindBy(xpath = "//input[@id='input-delegateIdNumber']")
    private WebElement delegateIdNumberInput;

    @FindBy(xpath = "(//button[contains(text(),'Salvează')])[5]")
    private WebElement saveButtonInvoice;

    @FindBy(xpath = "(//button[contains(text(),'Închide')])[5]")
    private WebElement closeModalInvoiceButton;

    @FindBy(xpath = "(//button[@aria-label='Închideți'])[1]")
    private WebElement closeCookieButton;

    public void getTypesOfEntity(String typeofEntity) {
        click(typeofEntityClientOption);
        addText(typeofEntity, searchInput);
        click(searchResult);
    }

    public void getInvoiceDueDate(String invoiceDue) {
        click(this.invoiceDue);
        addText(invoiceDue, searchInput);
        click(searchResult);
    }

    public void getCounty(String county) {
        click(countyOption);
        addText(county, searchInput);
        click(searchResult);
    }

    public void getCurrency(String currency) {
        click(currencyOption);
        addText(currency, searchInput);
        click(searchResult);
    }

    public void getClient(String chooseClient) {
        click(choseClientOption);
        addText(chooseClient, searchInput);
        click(searchResult);
    }

    public void addNewInvoice(String chooseClient,String typeofEntity, String cnpNif, String fullName, String invoiceDue,
                              String iban, String bankName, String county, String city, String address, String currency,
                              String contactName, String email, String phoneNr, String website,String articleType,
                              String articleName, String taxCategory,String measureUnit,String quantity,
                              String sellingPrice,String discountType,String discountValue,String delegateName,
                              String delegateIdSeries,String delegateIdNumber) {
        click(addInvoiceButton);
        getClient(chooseClient);
        addCustomer(typeofEntity, cnpNif, fullName, invoiceDue, iban, bankName, county, city, address, currency,
                contactName, email, phoneNr, website);
        addArticle(articleType,articleName,taxCategory,measureUnit,quantity,sellingPrice,discountType,discountValue);
        addDelegate(delegateName,delegateIdSeries,delegateIdNumber);
        scrollDown();
        clickWithRetries(saveButtonInvoice);
    }

    public void addCustomer(String typeofEntity, String cnpNif, String fullName, String invoiceDue, String iban,
                            String bankName, String county, String city, String address, String currency,
                            String contactName, String email, String phoneNr, String website) {
        getTypesOfEntity(typeofEntity);
        addText(cnpNif, cnpNifInput);
        addText(fullName, fullNameInput);
        getInvoiceDueDate(invoiceDue);
        addText(iban, ibanInput);
        addText(bankName, bankNameInput);
        getCounty(county);
        addText(city, cityInput);
        addText(address, addressInput);
        getCurrency(currency);
        addText(contactName, contactNameInput);
        addText(email, emailInput);
        addText(phoneNr, phoneNrInput);
        addText(website, websiteInput);
        closeCookies(closeCookieButton);
        click(saveButtonClient);
    }

    public void addArticle(String articleType, String articleName, String taxCategory, String measureUnit, String quantity,
                           String sellingPrice,String discountType, String discountValue) {
        getArticleType(articleType);
        getArticleName(articleName);
        getTaxCategory(taxCategory);
        getMeasureUnit(measureUnit);
        addText(quantity, quantityInput);
        addText(sellingPrice, sellingPriceInput);
        click(saveArticleToDatabaseCheckbox);
        click(addDiscountButton);
        getDiscountType(discountType);
        scrollDown();
        addText(discountValue, valueDiscountInput);
        click(addNewArticleButton);
    }

    private void getArticleName(String articleName) {
        click(articleNameOption);
        addText(articleName, searchInput);
        click(searchResult);
    }

    public void addDelegate(String delegateName, String delegateIdSeries, String delegateIdNumber) {
        clickWithRetries(delegateNameInput);
        addText(delegateName, delegateNameInput);
        addText(delegateIdSeries, delegateIdSeriesInput);
        addText(delegateIdNumber, delegateIdNumberInput);
    }

    private void getDiscountType(String discountType) {
        click(discountTypeOption);
        addText(discountType, searchInput);
        click(searchResult);
    }

    private void getMeasureUnit(String measureUnit) {
        click(this.measureUnit);
        addText(measureUnit, searchInput);
        click(searchResult);
    }

    private void getTaxCategory(String taxCategory) {
        click(this.taxCategory);
        addText(taxCategory, searchInput);
        click(searchResult);
    }

    private void getArticleType(String articleType) {
        click(articleTypeOption);
        addText(articleType, searchInput);
        click(searchResult);
    }

    public void closeCookies(WebElement element) {
        try {
            click(element);
        } catch (Exception e) {
            System.out.println("No cookies");
        }
    }
}
