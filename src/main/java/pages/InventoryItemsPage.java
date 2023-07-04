package pages;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InventoryItemsPage extends BaseTest {
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
    @FindBy(xpath = "//a[normalize-space()='Obiecte de inventar']")
    private WebElement inventoryItems;
    @FindBy(xpath= "//span[@class='d-none d-sm-inline-block']")
    private WebElement addInventoryItems;
    @FindBy(xpath = "//input[@id='input-name']")
    private WebElement itemName;
    @FindBy(xpath = "//input[@id='input-provider']")
    private WebElement itemProvider;
    @FindBy(xpath = "//input[@id='input-measurementUnit']")
    private WebElement itemMeasurementUnit;
    @FindBy(xpath = "//input[@id='input-fiscalCategoryName']")
    private WebElement itemFiscalCategory;
    @FindBy(xpath = "//input[@id='input-quantity']")
    private WebElement itemQuantity;
    @FindBy(xpath = "//input[@id='input-pricePerUnit']")
    private WebElement itemPrice;
    @FindBy(xpath = "//input[@id='input-inventoryNumber']")
    private WebElement itemInventoryNumber;
    @FindBy(xpath = "//input[@id='input-documentNumber']")
    private WebElement itemDocumentNumber;
    @FindBy(xpath = "//i[@class='bi bi-calendar']")
    private WebElement  openItemEntryDate;
    @FindBy(xpath = "//td[@class='day'][normalize-space()='8']")
    private WebElement selectItemEntryDate;
    @FindBy(xpath = "//input[@id='input-total']")
    private WebElement itemTotalPrice;
    @FindBy(xpath = "//button[contains(text(),'Salvează')]")
    private WebElement itemSave;
    @FindBy(xpath = "(//b[@role='presentation'])[2]")
    private WebElement openCompanySelector;
    @FindBy(xpath = "(//li[@role='option'])[2]")
    private WebElement selectCompany;
    @FindBy(xpath = "(//li[@role='option'])[1]")
    private WebElement selectAnotherCompany;

    public void logIn(String email, String password) {
        click(authenticationButton);
        addText(email, emailField);
        addText(password, passwordField);
        click(loginButton);
    }
    public void clickContAppPS() {
        click(contAppPSButton);
    }
    public void clickInventoryItems(){
        click(inventoryItems);
    }

    public void selectCompany(){
        click(openCompanySelector);
        click(selectCompany);

    }
    public void clickAddInventoryItems(){
        clickWithRetries(addInventoryItems);

    }

    public void addInventoryItems(String itemName,String itemProvider, String itemMeasurementUnit, String itemFiscalCategory,
                         String itemQuantity, String itemPrice, String itemInventoryNumber, String itemDocumentNumber,
                         String itemTotalPrice) {

        addText(itemName, this.itemName);
        addText(itemProvider, this.itemProvider);
        addText(itemMeasurementUnit, this.itemMeasurementUnit);
        addText(itemFiscalCategory, this.itemFiscalCategory);
        addText(itemQuantity, this.itemQuantity);
        addText(itemInventoryNumber, this.itemInventoryNumber);
        addText(itemDocumentNumber, this.itemDocumentNumber);
        click(openItemEntryDate);
        click(selectItemEntryDate);
        addText(itemPrice, this.itemPrice);
        addText(itemTotalPrice, this.itemTotalPrice);
        click(itemSave);
    }
    public void switchCompany(){
        click(openCompanySelector);
        click(selectAnotherCompany);
    }

    public void addItemsForSecondCompany(String itemName,String itemProvider, String itemMeasurementUnit, String itemFiscalCategory,
                                  String itemQuantity, String itemPrice, String itemInventoryNumber, String itemDocumentNumber,
                                  String itemTotalPrice) {
        addText(itemName, this.itemName);
        addText(itemProvider, this.itemProvider);
        addText(itemMeasurementUnit, this.itemMeasurementUnit);
        addText(itemFiscalCategory, this.itemFiscalCategory);
        addText(itemQuantity, this.itemQuantity);
        addText(itemInventoryNumber, this.itemInventoryNumber);
        addText(itemDocumentNumber, this.itemDocumentNumber);
        click(openItemEntryDate);
        click(selectItemEntryDate);
        addText(itemPrice, this.itemPrice);
        addText(itemTotalPrice, this.itemTotalPrice);
        click(itemSave);
    }
}
