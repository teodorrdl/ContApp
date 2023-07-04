package pages;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HouseAndBankJournalPage extends BaseTest {

    @FindBy(xpath = "//a[contains(text(),'Încasări și plăți')]")
    public WebElement receiptsPaymentsBtnLink;

    @FindBy(xpath = "//a[contains(text(),'Jurnal de Casă/Bancă')]")
    public WebElement houseAndBankJournalBtnLink;

    @FindBy(xpath = "//button[normalize-space()='Plată']")
    public WebElement addPaymentBtn;

    @FindBy(xpath = "//button[normalize-space()='Plati furnizori']")
    public WebElement paymentSuppliersBtn;

    @FindBy(xpath = "//button[normalize-space()='Plati diverse']")
    public WebElement diversePaymentsBtn;

    @FindBy(xpath = "//button[contains(text(),'Adaugă plată')]")
    public WebElement savePaymentBtn;

    @FindBy(xpath = "(//button[contains(text(),'Închide')])[3]")
    public WebElement closePaymentBtn;

    @FindBy(xpath = "(//span[contains(@role,'combobox')])[3]")
    public WebElement selectSupplier;

    @FindBy(xpath = "//input[@aria-label='Search']")
    public WebElement searchInput;

    @FindBy(xpath = "//ul[@role='listbox']")
    public WebElement inputResult;

    @FindBy(xpath = "//div[@role='dialog']//li[2]")
    public WebElement searchResult;

    @FindBy(xpath = "(//span[contains(@role,'combobox')])[4]")
    public WebElement selectBankOrHouse;

    @FindBy(xpath = "(//span[contains(@role,'combobox')])[5]")
    public WebElement selectActivityPlace;

    @FindBy(xpath = "(//span[contains(@role,'combobox')])[6]")
    public WebElement selectActivityCode;

    @FindBy(xpath = "//input[@type='number'][@placeholder='Valoare plătită']")
    public WebElement inputPaymentValue;

    @FindBy(xpath = "//tbody//tr//td//div//div//div//div//input[@type='checkbox']")
    public WebElement fullPaymentCheckbox;

    @FindBy(xpath = "//input[@id='input-number']")
    public WebElement inputDocumentNumber;

    public void clickReceiptsPaymentsBtnLink() {
        click(receiptsPaymentsBtnLink);
    }

    public void clickHouseAndBankJournalBtnLink() {
        click(houseAndBankJournalBtnLink);
    }

    public void getSupplier(String supplierName) {
        click(selectSupplier);
        addText(supplierName, searchInput);
        click(inputResult);
    }

    public void getBankOrHouse(String bankOrHouse) {
        click(selectBankOrHouse);
        addText(bankOrHouse, searchInput);
        click(searchResult);
    }

    public void getActivityPlace(String activityPlace) {
        click(selectActivityPlace);
        addText(activityPlace, searchInput);
        click(inputResult);
    }

    public void getActivityName(String activityName) {
        click(selectActivityCode);
        addText(activityName, searchInput);
        click(inputResult);
    }

    public void addPaymentToSupplier(String supplierName, String bankOrHouse, String activityPlace, String activityCode, String paymentValue, String documentNumber) {
        click(addPaymentBtn);
        click(paymentSuppliersBtn);
        getSupplier(supplierName);
        getBankOrHouse(bankOrHouse);
        getActivityPlace(activityPlace);
        getActivityName(activityCode);
        click(fullPaymentCheckbox);
        addText(documentNumber, inputDocumentNumber);
        click(savePaymentBtn);
    }

}
