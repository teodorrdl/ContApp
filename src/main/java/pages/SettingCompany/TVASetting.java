package pages.SettingCompany;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TVASetting extends BaseTest {
    @FindBy(xpath = "//a[normalize-space()='Setari TVA']")
    private WebElement settingTVALink;

    @FindBy(xpath = "(//div[@class='col-auto text-end']//button)[1]")
    private WebElement addPeriodTVAButton;

    @FindBy(xpath = "//input[@id='vat-period-started-at-']")
    private WebElement startDateVATPeriod;

    @FindBy(xpath = "//input[@id='vat-period-ended-at-']")
    private WebElement endDateVATPeriod;

    @FindBy(xpath = "(//button[@class='btn btn-primary btn-sm'])[1]")
    private WebElement saveButtonTVA;
    @FindBy(xpath = "//div[@role='dialog']//button[@type='button'][normalize-space()='Închide']")
    private WebElement closeButtonTVA;

    @FindBy(xpath = "//button[normalize-space()='Deschide']")
    private WebElement openButtonTVA;

    @FindBy(xpath = "(//button[@class='btn btn-xs btn-light'])[2]")
    private WebElement deleteButtonTVA;

    @FindBy(xpath = "(//div[@class='col-auto text-end']//button)[2]")
    private WebElement addCIFButton;

    @FindBy(xpath = "//input[@id='input-externalVatNumber']")
    private WebElement cifInput;

    @FindBy(xpath = "//input[@id='external-vat-period-started-at-']")
    private WebElement registrationDateInput;

    @FindBy(xpath = "//input[@id='external-vat-period-ended-at-']")
    private WebElement cancellationDateInput;

    @FindBy(xpath = "(//button[@class='btn btn-primary btn-sm'])[2]")
    private WebElement saveButtonCIF;

    @FindBy(xpath = "(//button[@class='btn btn-light btn-sm'])[4]")
    private WebElement deleteButtonCIF;

    @FindBy(xpath = "(//div[@class='col-auto text-end']//button)[3]")
    private WebElement addVATRateButton;

    @FindBy(xpath = "//input[@id='input-rate']")
    private WebElement vatRateInput;

    @FindBy(xpath = "(//button[@class='btn btn-primary btn-sm'])[4]")
    private WebElement saveButtonVATRate;

    @FindBy(xpath = "(//button[@class='btn btn-light btn-sm'])[8]")
    private WebElement deleteButtonVATRate;

    public void clickTVALink() {
        click(settingTVALink);
    }

    public void addPeriodOfActivity(String startDateVATPeriod, String endDateVATPeriod) {
        click(addPeriodTVAButton);
        addText(startDateVATPeriod, this.startDateVATPeriod);
        addText(endDateVATPeriod, this.endDateVATPeriod);
        click(saveButtonTVA);
    }

    public void addPeriodOfActivityCIF(String cif, String registrationDate, String cancellationDate) {
        click(addCIFButton);
        addText(cif, cifInput);
        addText(registrationDate, registrationDateInput);
        addText(cancellationDate, cancellationDateInput);
        click(saveButtonCIF);

    }

    public void addVATRate(String vatRate) {
        click(addVATRateButton);
        addText(vatRate, vatRateInput);
        click(saveButtonVATRate);
    }
}
