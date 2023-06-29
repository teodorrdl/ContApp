package pages;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AddProceedsPage extends BaseTest {

    @FindBy(xpath = "//div//span[@id='select2-select-transaction-bank-id-income---container']")
    private WebElement bank;

    @FindBy(xpath = "//ul[@class='select2-results__options']")
    private List<WebElement> bankHomeDroplist;

    @FindBy(xpath = "//div//span[@id='select2-select-transaction-location-id-income---container']")
    private WebElement location;

    @FindBy(css = "//ul[@class='select2-results__options']")
    private List<WebElement> activityPlaceDroplist;

    @FindBy(xpath = "//div//span[@id='select2-select-transaction-activity-id-income---container']")
    private WebElement activity;
    @FindBy(xpath = "//ul[@class='select2-results__options']")
    private List<WebElement> caenCodeDroplist;
    @FindBy(xpath = "//div//span[@id='select2-select-receipt-document-selector-id-income---container']")
    private WebElement documents;
    @FindBy(xpath = "//ul[@class='select2-results__options']")
    private List<WebElement> documentsDroplist;

    @FindBy(xpath = "//input[@id='input-number']")
    private WebElement numberOfTheDocument;

    @FindBy(xpath = "//input[@id='transaction-date-income--']")
    private WebElement dateOfCashing;

    @FindBy(xpath = "//input[@id='input-total']")
    private WebElement cashingInRon;
    @FindBy(xpath = "//div//span[@id='select2-select-company-article-types-list-id-income---container']")
    private WebElement article;
    @FindBy(xpath = "//ul[@class='select2-results__options']")
    private List<WebElement> typeOfAcquisitionDroplist;

    @FindBy(xpath = "//select[@id='select-company-articles-list-id-income--']")
    private WebElement explication;
    @FindBy(xpath = "//div//span[@id='select2-select-company-categories-list-id-income---container']")
    private WebElement fiscal;
    @FindBy(xpath = "//ul[@class='select2-results__options']")
    private List<WebElement> fiscalCategoryDroplist;

    @FindBy(xpath = "(//button[contains(text(),'Adaugă încasare')])[1]")
    private WebElement addTheAcquisition;

    @FindBy(xpath = "//div[@class='toast toast-warning']")
    private WebElement imputErrorPopup;


    public void selectBankHome(String bankText){
//        click(bank);
        listofElements(bankHomeDroplist, bankText);
    }

    public void selectActivityPlace(String activityText){
        click(location);
        listofElements(activityPlaceDroplist, activityText);
    }

    public void selectCaenCode(String text){
        click(activity);
        listofElements(caenCodeDroplist, text);
    }

    public void selectDocuments(String text){
        click(documents);
        listofElements(documentsDroplist, text);
    }

    public void selectTypeOfAcquisition(String text){
        click(article);
        listofElements(typeOfAcquisitionDroplist, text);
    }

    public void selectFiscalCategory(String text){
        click(fiscal);
        listofElements(fiscalCategoryDroplist, text);
    }
    public void addNumberOfDocuments(String nrDoc){
        addText(nrDoc, numberOfTheDocument);
    }

    public void price(String priceRon){
        addText(priceRon, cashingInRon);
    }

    public void addExplication(String exp){
        addText(exp, explication);
    }

    public void selectSaveButton(){
        click(addTheAcquisition);
    }

    public void selectImputValue(){
        click(cashingInRon);
    }



}
