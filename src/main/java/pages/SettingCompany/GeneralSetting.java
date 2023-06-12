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

    @FindBy(xpath = "//label[normalize-space()='Numele firmei']")
    private WebElement companyNameLabel;

    @FindBy (xpath = "//div[@class='input-group with-text']")
    private WebElement registrationDate;

    @FindBy(xpath = "//span[contains(@role,'combobox')]")
    private WebElement countryOption;

    @FindBy(xpath = "//span[contains(@role,'combobox')]")
    private WebElement countyOption;

    @FindBy(xpath = "//input[@id='input-city']")
    private WebElement cityInput;

    @FindBy(xpath = "//label[contains(text(),'Adresă')]")
    private WebElement addressInput;

    @FindBy(xpath = "//label[normalize-space()='Persoana de contact']")
    private WebElement contactPersonInput;

    @FindBy(xpath = "//label[normalize-space()='Website']")
    private WebElement websiteInput;

    @FindBy(xpath = "//label[normalize-space()='Email']")
    private WebElement emailInput;

    @FindBy(xpath = "//label[normalize-space()='Telefon']")
    private WebElement phoneInput;

    // alert messages
    @FindBy(xpath = "//label[contains(text(),'CUI/CIF trebuie să fie un șir de caractere.')]")
    private WebElement cuiAlertMessage;

    @FindBy(xpath = "//label[normalize-space()='Campul 'Tip entitate' este obligatoriu.']")
    private WebElement entityTypeAlertMessage;

    @FindBy(xpath = "//label[normalize-space()='Campul 'Numele firmei' este obligatoriu.']")
    private WebElement companyNameAlertMessage;

    @FindBy(xpath = "//label[contains(text(),'Campul \"Județ\" este obligatoriu.')]")
    private WebElement countyAlertMessage;

    @FindBy(xpath = "//label[normalize-space()='Campul \"Localitate\" este obligatoriu.']")
    private WebElement cityAlertMessage;

    @FindBy(xpath = "//label[contains(text(),'Campul \"Adresă\" este obligatoriu.')]")
    private WebElement addressAlertMessage;

}
