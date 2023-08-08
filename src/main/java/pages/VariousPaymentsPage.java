package pages;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static base.PageLinksAndText.toastMessage;

public class VariousPaymentsPage extends BaseTest {
    @FindBy(xpath = "//button[normalize-space()='Plati diverse']")
    private WebElement variousPayments;
    @FindBy(xpath = "//span[@title='Bancă principală']")
    private WebElement openHouseAndBanks;
    @FindBy(xpath = "//span[contains(text(),'Casă principală')]")
    private WebElement selectHouseAndBanks;
    @FindBy(xpath = "//span[@aria-labelledby='select2-select-transaction-location-id-expense---container']")
    private WebElement openActivityPlace;
    @FindBy(xpath = "(//span[contains(text(),'Sediul profesional')])[2]")
    private WebElement selectActivityPlace;
    @FindBy(xpath = "//span[@id='select2-select-transaction-activity-id-expense---container']")
    private WebElement openActivityCaen;
    @FindBy(xpath = "//span[contains(text(),'Sediul profesional | 105178297')]")
    private WebElement selectActivityCaen;
    @FindBy(xpath = "//a[contains(text(),'Plăți')]")
    private WebElement payments;
    @FindBy(xpath = "//a[@class='btn btn-light']")
    private WebElement addPayment;
    @FindBy(xpath = "//span[@id='select2-select-receipt-document-selector-id-expense---container']")
    private WebElement openPaymentDoc;
    @FindBy(xpath = "//span[normalize-space()='Bon fiscal']")
    private WebElement selectPaymentDoc;
    @FindBy(xpath = "//input[@id='input-number']")
    private WebElement docNum;
    @FindBy(xpath = "//i[@class='bi bi-calendar']")
    private WebElement openDate;
    @FindBy(xpath = "//td[@class='day'][normalize-space()='2']")
    private WebElement selectDate;
    @FindBy(xpath = "//input[@id='input-total']")
    private WebElement totalExpense;
    @FindBy(xpath = "//span[@id='select2-select-company-article-types-list-id-expense---container']")
    private WebElement openArticleType;
    @FindBy(xpath = "//span[normalize-space()='Bunuri']")
    private WebElement selectArticleType;
    @FindBy(xpath = "//span[@id='select2-select-company-articles-list-id-expense---container']")
    private WebElement openExplication;
    @FindBy(xpath = "//span[normalize-space()='214']")
    private WebElement selectExplication;
    @FindBy(xpath = "//span[@id='select2-select-company-categories-list-id-expense---container']")
    private WebElement openFiscalCategory;
    @FindBy(xpath = "//span[contains(text(),'Plăți din transferuri și restituiri de aporturi')]")
    private WebElement selectFiscalCategory;
    @FindBy(xpath = "//button[contains(text(),'Adaugă plată')]")
    private WebElement savePayment;
    @FindBy(xpath = "//*[@id=\"toast-container\"]/div/div[2]")
    private WebElement toastContainer;

    public void assertToastMessage() {
        Assert.assertEquals( toastMessage.getValue(),toastContainer.getText());
    }

    public void addVariousPayment(){
        click(payments);
        click(addPayment);
        click(variousPayments);
    }
    public void setHouseAndBanks(){
        click(openHouseAndBanks);
        click(selectHouseAndBanks);
    }
    public void setActivityPlace(){
        click(openActivityPlace);
        click(selectActivityPlace);
    }
    public void setActivityCaen(){
        click(openActivityCaen);
        click(selectActivityCaen);
    }
    public void setPaymentDoc(){
        click(openPaymentDoc);
        click(selectPaymentDoc);
    }
    public void addDocNum(String docNum){
        addText(docNum,this.docNum);
    }
    public void setDate(){
        click(openDate);
        click(selectDate);
    }
    public void setTotalExpenses(String totalExpense){
        addText(totalExpense,this.totalExpense);
    }
    public void setArticleType(){
        click(openArticleType);
        click(selectArticleType);
    }
    public void addExplication(){
        click(openExplication);
       click(selectExplication);
    }
    public void setFiscalCategory(){
    click(openFiscalCategory);
    click(selectFiscalCategory);
    }
    public void savePayment() {
    click(savePayment);
    }
}
