package pages.SettingCompany;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SettingCompany extends BaseTest {

    @FindBy(xpath = "//a[normalize-space()='ContApp PS']")
    private WebElement contAppPs;

    @FindBy(xpath = "//button[@data-bs-toggle='dropdown']")
    private WebElement dropdownButtonSetting;

    @FindBy(xpath = "//a[normalize-space()='Setari firma']")
    private WebElement settingCompany;

    public void clickContAppPs(){
        click(contAppPs);
    }

    public void clickDropdownButtonSetting(){
        click(dropdownButtonSetting);
    }

    public void clickSettingCompany(){
        click(settingCompany);
        Assert.assertEquals(driver.getCurrentUrl(), "https://ps.contapp.ro/setari/general");
    }

}
