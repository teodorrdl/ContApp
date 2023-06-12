package pages.SettingCompany;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TVASetting extends BaseTest {
    @FindBy(xpath = "//a[normalize-space()='Setari TVA']")
    private WebElement settingTVALink;

    @FindBy(xpath = "//button[@onclick='showModal('vat-period-create')']")
    private WebElement addTVAButton;

}
