package pages.SettingCompany;

import base.BaseTest;
import base.PageLinksAndText;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Preferences extends BaseTest {

    @FindBy(xpath = "//a[normalize-space()='Preferințe']")
    private WebElement preferencesLink;

    @FindBy(xpath = "(//input[@type='checkbox'])[2]")
    private WebElement showLogoCheckbox;

    @FindBy(xpath = "(//input[@type='checkbox'])[3]")
    private WebElement showReceiptCheckbox;

    @FindBy(xpath = "(//input[@type='checkbox'])[4]")
    private WebElement bilingualInvoiceCheckbox;

    @FindBy(xpath = "(//input[@type='checkbox'])[5]")
    private WebElement showDelegateCheckbox;

    @FindBy(xpath = "(//input)[9]")
    private WebElement delegateNameInput;

    @FindBy(xpath = "(//input)[10]")
    private WebElement CISeriesInput;

    @FindBy(xpath = "(//input)[11]")
    private WebElement CINumberInput;

    @FindBy(xpath = "(//button[normalize-space()='Salvează'])[1]")
    private WebElement saveBtn;

    @FindBy(xpath = "(//button[normalize-space()='Editează'])")
    private WebElement editBtn;

    @FindBy(xpath = "(//button[normalize-space()='Salvează'])[2]")
    private WebElement customEmailSaveBtn;

    @FindBy(xpath = "//div[normalize-space()='Actualizat cu succes']")
    private WebElement successMessage;

    public void clickPreferencesLink() {
        click(preferencesLink);
        Assert.assertEquals(driver.getCurrentUrl(),(PageLinksAndText.preferencesLink.getValue()));
    }

    public void preferencesInvoice(String delegateName, String CISeries, String CINumber) {
        click(showReceiptCheckbox);
        click(bilingualInvoiceCheckbox);
        addText(delegateName, delegateNameInput);
        scrollDown();
        action(CISeriesInput);
        addText(CISeries, CISeriesInput);
        addText(CINumber, CINumberInput);
        click(saveBtn);
        checkSuccessMessage();
    }

    public void checkCheckbox() {
        Assert.assertTrue(showLogoCheckbox.isSelected());
        Assert.assertTrue(showReceiptCheckbox.isSelected());
        Assert.assertTrue(bilingualInvoiceCheckbox.isSelected());
        Assert.assertTrue(showDelegateCheckbox.isSelected());
    }

    public void customizeTextEmail() {
        click(editBtn);
        click(customEmailSaveBtn);
        checkSuccessMessage();
    }

    public void checkSuccessMessage() {
        findElement(successMessage);
        Assert.assertEquals(successMessage.getText(),(PageLinksAndText.successMessage.getValue()));
    }
}
