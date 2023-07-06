package pages.ReceiptsAndPayments;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HouseBankJournal extends BaseTest {
    @FindBy(xpath = "//a[normalize-space()='ContApp PS']")
    private WebElement linkContAppPS;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/ul[1]/li[5]/a[1]")
    private WebElement linkReceiptsAndPayments;

    @FindBy(xpath ="//a[@target='_self'][contains(text(),'Jurnal de Casă/Bancă')]")
    private WebElement linkHouseBankJournal;

    @FindBy(xpath = "//button[normalize-space()='Încasare']")
    private WebElement buttonReceipts;

    @FindBy(xpath="//button[@id='onetrust-accept-btn-handler']")
    private WebElement buttonAccept;

    @FindBy(xpath = "//button[normalize-space()='Plată']")
    public WebElement addPaymentBtn;

    public void clickAddPaymentBtn(){
        click(addPaymentBtn);
    }

   public void clickLinkContAppPS(){
       click(linkContAppPS);
    }

    public void clickLinkReceiptsAndPayments(){
        click(linkReceiptsAndPayments);
    }

    public void clickLinkHouseBankJournal(){
        click(linkHouseBankJournal);
    }

    public void clickButtonReceipts(){
        click(buttonReceipts);
    }

    public void clickButtonAccept(){
        click(buttonAccept);
    }

    public void verifEnableButtonAccept(){
       if(buttonAccept.isEnabled())
           clickButtonAccept();
    }

}
