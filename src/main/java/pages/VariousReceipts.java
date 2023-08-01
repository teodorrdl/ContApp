package pages;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VariousReceipts extends BaseTest {
    @FindBy(xpath="//a[contains(text(),'Jurnal de Casă/Bancă')]")
    private WebElement houseAndBankJournal;
    @FindBy(css ="button[onclick=\"showModal('add-income-transaction')\"]")
    private WebElement addIncome;
    @FindBy(xpath = "//button[normalize-space()='Incasari diverse']")
    private WebElement variousReceipts;
    @FindBy(xpath = "//span[@id='select2-select-transaction-bank-id-income---container']")
    private WebElement openHousesAndBanks;
    @FindBy(xpath = "//span[contains(text(),'Casă principală')]")
    private WebElement selectHousesAndBanks;
    @FindBy(xpath = "//span[@id='select2-select-transaction-location-id-income---container']")
    private WebElement openActivityLocation;
    @FindBy(xpath = "//span[contains(text(),'Activitate desfășurată la terți')]")
    private WebElement selectActivityLocation;
    @FindBy(xpath = "//div[@class='col-lg-4']//span[@role='combobox']")
    private WebElement openCaenCode;
    @FindBy(xpath = "(//span[contains(text(),'Activitate desfășurată la terți | 551711')])[1]")
    private WebElement selectCaenCode;
    @FindBy(xpath = "//span[@id='select2-select-receipt-document-selector-id-income---container']")
    private WebElement openIncomeDoc;
    @FindBy(xpath = "//span[contains(text(),'Alte încasări')]")
    private WebElement selectIncomeDoc;
    @FindBy(xpath = "//input[@id='input-number']")
    private WebElement docNum;
    @FindBy(xpath = "//label[@for='transaction-date-income--']//i[@class='bi bi-calendar']")
    private WebElement openDate;
    @FindBy(xpath = "(//td[@class='day'])[14]")
    private WebElement selectDate;
    @FindBy(xpath = "//input[@id='input-total']")
    private WebElement totalIncome;
    @FindBy(xpath = "//span[@id='select2-select-company-article-types-list-id-income---container']")
    private WebElement openItemType;
    @FindBy(xpath = "//span[normalize-space()='Aporturi']")
    private WebElement selectItemType;
    @FindBy(xpath = "//span[@id='select2-select-company-articles-list-id-income---container']")
    private WebElement addExplication;
    @FindBy(xpath = "//input[@aria-label='Search']")
    private WebElement explication;
    @FindBy(xpath = "//span[@id='select2-select-company-categories-list-id-income---container']")
    private WebElement openFiscalCategory;
    @FindBy(xpath = "//span[contains(text(),'Încasări din transferuri și aporturi')]")
    private WebElement selectFiscalCategory;
    @FindBy(xpath = "//input[@id='checkbox-saveArticle']")
    private WebElement saveArticleCheckBox;
    @FindBy(xpath = "//button[contains(text(),'Adaugă încasare')]")
    private WebElement saveVariousIncome;

    public void addVariousIncome() {
        click(variousReceipts);
    }

    public void selectHousesAndBanks() {
        click(openHousesAndBanks);
        click(selectHousesAndBanks);
    }

    public void setActivityLocation() {
        click(openActivityLocation);
        click(selectActivityLocation);
    }

    public void selectCaenCode() {
        click(openCaenCode);
        click(selectCaenCode);
    }

    public void selectIncomeDoc() {
        click(openIncomeDoc);
        click(selectIncomeDoc);
    }

    public void addDocNum(String docNum) {
        addText(docNum, this.docNum);
    }

    public void selectDate() {
        click(openDate);
        click(selectDate);
    }

    public void addTotalAmount(String totalIncome) {
        addText(totalIncome, this.totalIncome);
    }

    public void selectItemType() {
        click(openItemType);
        click(selectItemType);
    }

    public void addExplication(String explication) {
        click(addExplication);
        addText(explication, this.explication);

    }

    public void selectFiscalCategory() {
        click(openFiscalCategory);
        click(selectFiscalCategory);
    }

    public void checkSaveItem() {
        click(saveArticleCheckBox);
    }

    public void saveVariousIncome() {
        click(saveVariousIncome);
    }
    public void addIncome(){
        click(houseAndBankJournal);
        click(addIncome);
    }
}
