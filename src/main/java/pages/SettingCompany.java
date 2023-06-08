package pages;

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

    @FindBy(xpath = "//input[@placeholder='Caută după CUI/CIF']")
    private WebElement searchInput;

    @FindBy(xpath = "//i[@class='bi bi-search']")
    private WebElement searchButton;

    @FindBy(xpath = "///span[contains(text(),'Adaugă')]")
    private WebElement addCompanyButton;

    @FindBy(xpath = "//input[@id='nr_reg_com']")
    @CacheLookup private WebElement nrRegComInput;

    @FindBy(xpath = "(//span[@role=\"textbox\"])[2]")
    @CacheLookup private WebElement entityTypeOption;

    @FindBy(xpath = "//span[@title='---']")
    private WebElement entityTypeValue;

    @FindBy(xpath = "//span[contains(@title,'Alta')]")
    private WebElement entityTypeValueOther;

    @FindBy(xpath = "//span[contains(@title,'Asociere de P.F.')]")
    private WebElement entityTypeValueAssociate;

    @FindBy(xpath = "//span[normalize-space()='II']")
    private WebElement entityTypeValueII;

    @FindBy(xpath = "//span[contains(text(),'Persoană fizică')]")
    private WebElement entityTypeValuePF;

    @FindBy(xpath = "//span[contains(text(),'PFA')]")
    private WebElement entityTypeValuePFA;

    @FindBy(xpath = "//span[normalize-space()='PFI']")
    private WebElement entityTypeValuePFI;

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
