package pages.ReceiptsAndPayments;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VariousReceipts extends BaseTest {
    @FindBy(xpath = "//input[@id='input-number']")
    private WebElement fieldNrDoc;

    @FindBy(xpath = "//input[@id='input-total']")
    private WebElement fieldMoney;

    @FindBy(xpath = "//div[@class='col-lg-6']//span[@class='select2-selection__rendered']")
    private WebElement fieldExplanation;
    @FindBy(xpath = "//input[@class='select2-search__field']")
    private WebElement fieldAddExplanation;
    @FindBy(xpath ="//button[contains(text(),'Adaugă încasare')]")
    private WebElement buttonAddReceipt;

    @FindBy(xpath = "//button[contains(@onclick,\"window.closeModal('add-income-transaction')\")][normalize-space()='Închide']")
    private WebElement buttonClose;

    public void addNrDoc(String text){
       addText(text,fieldNrDoc);
    }

    public void addMoney(String text){
        addText(text,fieldMoney);
    }

    public void clickFieldExplanation(){
        click(fieldExplanation);
    }
    public void addFieldExplanation(String text){
       addText(text,fieldAddExplanation);
       click(fieldAddExplanation);
    }

    public void clikButtonAddReceipt(){
        click(buttonAddReceipt);
    }

    public void clickButtonClose(){
        click(buttonClose);
    }
}
