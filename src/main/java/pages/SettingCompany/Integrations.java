package pages.SettingCompany;

import base.BaseTest;
import base.PageLinksAndText;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Integrations extends BaseTest {

    @FindBy(xpath = "//a[normalize-space()='Integrări']")
    private WebElement integrationsLink;

    @FindBy(xpath = "//p[normalize-space()='AM ACCESS IN S.P.V. CU CERTIFICAT DIGITAL']")
    private WebElement certificateDigitalSPV;

    @FindBy(xpath = "//p[normalize-space()='NU AM ACCESS IN S.P.V. CU CERTIFICAT DIGITAL']")
    private WebElement withoutCertificateDigitalSPV;

    @FindBy(xpath = "(//div[@class='alert alert-info mb-0'])[1]")
    private WebElement digitalSPVMessage;

    @FindBy(xpath = "//button[normalize-space()='Autorizare token']")
    private WebElement authorizationTokenBtn;

    @FindBy(xpath = "//div[@class='border rounded cursor-on-hover shadow-on-hover position-relative']")
    private WebElement configAccessSPV;

    @FindBy(xpath = "(//div[@class='border rounded cursor-on-hover shadow-on-hover'])[2]")
    private WebElement gainAccessThroughAccountant;

    @FindBy(xpath = "//button[contains(text(),'Copiază link')]")
    private WebElement copyLink;

    @FindBy(xpath = "//a[contains(text(),'Accesează link')]")
    private WebElement accessLink;

    @FindBy(xpath = "//a[normalize-space()='Trimite pe e-mail']")
    private WebElement sentEmailLink;

    public void clickWithCertificateDigitalSPV() {
        click(certificateDigitalSPV);
        Assert.assertEquals(digitalSPVMessage.getText(), PageLinksAndText.insertOrActivateTokenMessage.getValue());
        click(authorizationTokenBtn);
        Assert.assertEquals(driver.getCurrentUrl(), PageLinksAndText.accountLink.getValue());
    }

    public void clickWithoutCertificateDigitalSPV() {
        click(withoutCertificateDigitalSPV);
        getConfigAccessSPV();
        getAccessThroughAccountant();
    }

    public void getAccessThroughAccountant() {
        click(gainAccessThroughAccountant);
        Assert.assertTrue(clickAble(copyLink).isDisplayed());
        Assert.assertTrue(accessLink.isDisplayed());
        Assert.assertTrue(sentEmailLink.isDisplayed());
        javascriptExecutor(0,250);
        click(accessLink);
        SwitchToNextTab();
        Assert.assertEquals(driver.getCurrentUrl(), PageLinksAndText.authorizationInvoiceLink.getValue());
        driver.close();
    }

    public void getConfigAccessSPV() {
        click(configAccessSPV);
        SwitchToNextTab();
        Assert.assertEquals(driver.getCurrentUrl(), PageLinksAndText.supportSPVLink.getValue());
        driver.close();
        switchToWindow(driver);
    }

    public void clickIntegrationsLink() {
        click(integrationsLink);
        Assert.assertEquals(driver.getCurrentUrl(), PageLinksAndText.integrationsLink.getValue());
    }
}
