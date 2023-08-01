package pages.OrderSubscription;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SingleDeclarationSubscription extends BaseTest {
    @FindBy(xpath = "//a[contains(text(),'Comandă Abonament')]")
    private WebElement commandSubscription;

    @FindBy(xpath = "(//button[@class='btn btn-light bg-white mb-3'])[4]")
    private WebElement services;
    @FindBy(xpath = "//div[@class='product-title']//a[@alt='Declarația Unică. Serviciul de Completare. Verificare. Rectificare. Pentru toate tipurile de venituri.']")
    private WebElement singleDeclarationServices;
    @FindBy(xpath = "//button[@class='btn btn-primary w-100']")
    private WebElement commandServices;
    @FindBy(xpath = "//div[@class='justify-content-start modal-footer']//a[@class='btn btn-primary btn-sm']")
    private WebElement shoppingCart;
    @FindBy(xpath = "//button[normalize-space()='Spre detalii facturare']")
    private WebElement billingDetails;

    @FindBy(xpath = "//input[@id='input-isCompany']")
    private WebElement invoicePerCompany;
    @FindBy(xpath = "//input[@id='input-registrationNumber']")
    private WebElement searchInputCompany;
    @FindBy(xpath = "(//button[@type='button'])[2]")
    private WebElement searchCompanyButton;
    @FindBy(xpath = "//span[@id='select2-select-company-select-for-autocomplete-container']")
    private WebElement clickSearchFirm;
    @FindBy(xpath = "//input[@type='search']")
    private WebElement searchInput;
    @FindBy(xpath = "//li[@aria-selected='true']")
    private WebElement choosenInput;
    @FindBy(xpath = "//input[@id='input-firstName']")
    private WebElement inputFirstName;
    @FindBy(xpath = "//input[@id='input-lastName']")
    private WebElement inputLastName;
    @FindBy(xpath = "//input[@id='input-phone']")
    private WebElement inputPhoneNumber;
    @FindBy(xpath = "//div[@class='col-md-6']//button[@class='btn btn-primary w-100']")
    private WebElement forPayment;
    @FindBy(xpath = "//div[@class='col-auto order-1']//input")
    private WebElement termsAndConditions;
    @FindBy(xpath = "//button[normalize-space()='Plasează comanda']")
    private WebElement placeOrder;

    public void clickCommandSubscription() {
        click(commandSubscription);
    }

    public void clickServices() {
        click(services);
    }

    public void clickSingleDeclarationServices() {
        clickWithRetries(singleDeclarationServices);

    }

    public void clickCommandServices() {
        click(commandServices);
    }

    public void clickShoppingCart() {
        click(shoppingCart);
    }

    public void clickBillingDetails() {
        click(billingDetails);
    }

    public void clickInvoicePerCompany() {
        click(invoicePerCompany);
        click(invoicePerCompany);
    }

    public void searchCompany(String searchInput) {
        click(clickSearchFirm);
        addText(searchInput, this.searchInput);
        click(choosenInput);
    }

    public void addFirstName(String inputFirstName) {
        scrollDown();
        addText(inputFirstName, this.inputFirstName);
    }

    public void addLastName(String inputLastName) {
        addText(inputLastName, this.inputLastName);
    }

    public void addPhoneNumber(String inputPhoneNumber) {
        addText(inputPhoneNumber, this.inputPhoneNumber);
    }

    public void clickForPayment() {
        click(forPayment);
    }

    public void makingPayment() {
        waitPage().until(ExpectedConditions.elementToBeClickable(termsAndConditions));
        movetoElement();
        click(termsAndConditions);
        click(placeOrder);
    }

}
