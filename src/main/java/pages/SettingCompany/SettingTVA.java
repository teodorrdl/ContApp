package pages.SettingCompany;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SettingTVA extends BaseTest {
    @FindBy(xpath = "//a[normalize-space()='Setari TVA']")
    private WebElement settingTVALink;

}
