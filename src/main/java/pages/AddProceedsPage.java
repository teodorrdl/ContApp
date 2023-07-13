package pages;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class AddProceedsPage extends BaseTest {

    @FindBy(xpath = "//div//span[@id='select2-select-transaction-bank-id-income---container']")
    private WebElement bank;

    @FindBy(xpath = "//ul[@class='select2-results__options']//li")
    private List<WebElement> bankHomeDroplist;

    @FindBy(xpath = "//div//span[@id='select2-select-transaction-location-id-income---container']")
    private WebElement location;

    @FindBy(xpath = "//ul[@class='select2-results__options']//li")
    private List<WebElement> activityPlaceDroplist;

    @FindBy(xpath = "//span[@id='select2-select-transaction-activity-id-income---container']")
    private WebElement caenField;
    @FindBy(xpath = "//ul[@id='select2-select-transaction-activity-id-income---results']//li")
    private List<WebElement> caenList;
    @FindBy(xpath = "//div//span[@id='select2-select-receipt-document-selector-id-income---container']")
    private WebElement documents;
    @FindBy(xpath = "//ul[@class='select2-results__options']//li")
    private List<WebElement> documentsDroplist;

    @FindBy(xpath = "//input[@id='input-number']")
    private WebElement numberOfTheDocument;

    @FindBy(xpath = "//input[@id='transaction-date-income--']")
    private WebElement dateOfCashing;

    @FindBy(xpath = "//input[@id='input-total']")
    private WebElement cashInput;
    @FindBy(xpath = "//div//span[@id='select2-select-company-article-types-list-id-income---container']")
    private WebElement article;
    @FindBy(xpath = "//ul[@class='select2-results__options']//li")
    private List<WebElement> typeOfAcquisitionDroplist;

    @FindBy(xpath = "//div//span[@id='select2-select-company-articles-list-id-income---container']")
    private WebElement explication;

    @FindBy(xpath = "//input[@class='select2-search__field']")
    private WebElement explicationInput;
    @FindBy(xpath = "//div//span[@id='select2-select-company-categories-list-id-income---container']")
    private WebElement fiscal;
    @FindBy(xpath = "//ul[@class='select2-results__options']//li")
    private List<WebElement> fiscalCategoryDroplist;

    @FindBy(xpath = "(//button[contains(text(),'Adaugă încasare')])")
    private WebElement addTheAcquisition;

    @FindBy(xpath = "//div[@class='toast toast-warning']")
    private WebElement imputErrorPopup;


    public void selectBankHome(String bankText){
        click(bank);
        click(listofElements(bankHomeDroplist, bankText));
    }

    public void selectActivityPlace(String activityText){
        click(location);
        click(listofElements(activityPlaceDroplist, activityText));
    }

    public void selectCaenField(){
        click(caenField);
    }
    public void selectCaenList(String text){
        click(listofElements(caenList, text));
    }

    public void selectDocumentsField(){
        click(documents);
    }

    public void selectDocumentsList(String text){
        click(listofElements(documentsDroplist, text));
    }

    public void selectTypeOfAcquisition(String text){
        click(article);
        click(listofElements(typeOfAcquisitionDroplist, text));
    }

    public void selectFiscalField(){
        click(fiscal);
    }
    public void selectFiscalList(String text){
        click(listofElements(fiscalCategoryDroplist, text));
    }
    public void addNumberOfDocuments(String nrDoc){
        addText(nrDoc, numberOfTheDocument);
    }

    public void price(String priceRon){
        addText(priceRon, cashInput);
    }

    public void selectExplicationField(){
        click(explication);
    }

    public void addExplication(String exp){
        addText(exp, explicationInput);
    }

    public void selectSaveButton(){
        click(addTheAcquisition);
    }

    public void selectImputValue(String cash){
        click(cashInput);
        addText(cash, cashInput);
        click(explication);
        click(imputErrorPopup);
        Assert.assertTrue(imputErrorPopup.isDisplayed());
    }








}
