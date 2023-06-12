package pages.SettingCompany;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class GeneralSetting extends BaseTest {
    @FindBy(xpath = "//input[@placeholder='Caută după CUI/CIF']")
    private WebElement searchInput;

    @FindBy(xpath = "//i[@class='bi bi-search']")
    private WebElement searchButton;

    @FindBy(xpath = "///span[contains(text(),'Adaugă')]")
    private WebElement addCompanyButton;

    @FindBy(xpath = "//input[@id='nr_reg_com']")
    @CacheLookup private WebElement nrRegComInput;

    @FindBy(xpath = "(//span[@role='textbox'])[2]")
    @CacheLookup private WebElement entityTypeOption;

    @FindBy(xpath = "//span[@title='---']")
    private WebElement entityOptionDefault;

    @FindBy(xpath = "//span[contains(@title,'Alta')]")
    private WebElement entityTypeOptionOther;

    @FindBy(xpath = "//span[contains(@title,'Asociere de P.F.')]")
    private WebElement entityTypeOptionAPF;

    @FindBy(xpath = "//span[normalize-space()='II']")
    private WebElement entityTypeOptionII;

    @FindBy(xpath = "//span[contains(text(),'Persoană fizică')]")
    private WebElement entityTypeOptionPF;

    @FindBy(xpath = "//span[contains(text(),'PFA')]")
    private WebElement entityTypeOptionPFA;

    @FindBy(xpath = "//span[normalize-space()='PFI']")
    private WebElement entityTypeOptionPFI;

    @FindBy (xpath = "//span[contains(text(),'Profesie Liberală')]")
    private WebElement  entityTypeOptionPL;

    @FindBy(xpath = "//span[normalize-space()='SA']")
    private WebElement entityTypeOptionSA;

    @FindBy(xpath = "//span[normalize-space()='SRL']")
    private WebElement entityTypeOptionSRL;

}
