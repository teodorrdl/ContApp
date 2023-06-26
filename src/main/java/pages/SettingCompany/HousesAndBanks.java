package pages.SettingCompany;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class HousesAndBanks extends BaseTest {

    @FindBy(xpath = "//a[normalize-space()='Case si Banci']")
    private WebElement housesAndBanksLink;

    @FindBy(xpath = "//button[normalize-space()='Adaugă']")
    private WebElement addButton;

    @FindBy(xpath = "(//span[@role='combobox'])[4]")
    private WebElement bankOption;

    @FindBy(xpath = "(//span[@role='combobox'])[6]")
    private WebElement cashRegisterOption;

    @FindBy(xpath = "//input[@aria-label='Search']")
    private WebElement typeofServiceSearchInput;

    @FindBy(xpath = "//ul[@role='listbox']")
    private WebElement typeofServiceResult;

    @FindBy(xpath = "//input[@id='bank-form-type-input-name--bank-create']")
    private WebElement nameInput;

    @FindBy(xpath = "(//span[@role='combobox'])[5]")
    private WebElement currencyOption;

    @FindBy(xpath = "(//span[@role='combobox'])[7]")
    private WebElement currencyCashRegister;

    @FindBy(xpath = "//input[@id='bank-form-type-input-iban--bank-create']")
    private WebElement ibanInput;

    @FindBy(xpath = "//input[@id='bank-form-details-input-iban--bank-create']")
    private WebElement detailsInput;

    @FindBy(xpath = "(//button[normalize-space()='Salvează'])[3]")
    private WebElement saveButton;

    @FindBy(xpath = "(//button[normalize-space()='Salvează'])[4]")
    private WebElement saveButtonCashRegister;

    @FindBy(xpath = "(//button[normalize-space()='Închide'])[5]")
    private WebElement closeButton;

    @FindBy(xpath = "//tbody")
    private List <WebElement> houseAndBanksTable;

    public void getBank(String typeofService ,String name, String currency, String iban, String details) {
        click(bankOption);
        addText(typeofService, typeofServiceSearchInput);
        click(typeofServiceResult);
        addText(name, nameInput);
        click(currencyOption);
        addText(currency, typeofServiceSearchInput);
        click(typeofServiceResult);
        addText(iban, ibanInput);
        addText(details, detailsInput);
    }

    public void getHouse(String typeofService ,String name, String currency, String details) {
        click(cashRegisterOption);
        addText(typeofService, typeofServiceSearchInput);
        click(typeofServiceResult);
        addText(name, nameInput);
        click(currencyCashRegister);
        addText(currency, typeofServiceSearchInput);
        click(typeofServiceResult);
        addText(details, detailsInput);
    }

    public void addNewBankOrHouse(String typeofService ,String name, String currency, String iban, String details) {
        click(addButton);
        if (typeofService.equals("Banca")) {
            getBank(typeofService, name, currency, iban, details);
        } else if (typeofService.equals("Casa")) {
            getHouse(typeofService, name, currency, details);
            saveButton = saveButtonCashRegister;
        } else {
            Assert.fail("Nu s-a gasit tipul de serviciu");
        }
        click(saveButton);
    }

    public void clickHousesAndBanksLink() {
        click(housesAndBanksLink);
    }

    public void checkBankOrHouseAdded(String typeofService ,String name, String currency, String iban) {
        if (typeofService.equals("Banca")) {
            for (WebElement bank : houseAndBanksTable) {
                if (bank.getText().contains(name) && bank.getText().contains(currency) && bank.getText().contains(iban)) {
                    Assert.assertTrue(true);
                }
            }
        } else {
            for (WebElement house : houseAndBanksTable) {
                if (house.getText().contains(name) && house.getText().contains(currency)) {
                    Assert.assertTrue(true);
                }
            }
        }
    }
}
