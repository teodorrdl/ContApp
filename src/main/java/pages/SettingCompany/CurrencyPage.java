package pages.SettingCompany;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class CurrencyPage extends BaseTest {
    @FindBy(xpath = "//a[contains(text(),'Valută')]")
    private WebElement currencyLink;

    @FindBy(xpath = "//button[normalize-space() ='Adaugă']")
    private WebElement addCurrencyButton;

    @FindBy(xpath = "//input[@id='input-name']")
    private WebElement currencyNameInput;

    @FindBy(xpath = "(//span[@role='combobox'])[2]")
    private WebElement currencyNameOption;

    @FindBy(xpath = "//input[@aria-label='Search']")
    private WebElement currencyNameSearchInput;

    @FindBy(xpath = "//ul[@role='listbox']")
    private WebElement currencyNameResult;

    @FindBy(xpath = "//button[contains(text(),'Salvează')]")
    private WebElement saveButton;

    @FindBy(xpath = "(//button[normalize-space()='Închide'])[2]")
    private WebElement closeButton;

    @FindBy(xpath = "(//input[contains(@type,'checkbox')])[2]")
    private WebElement checkboxDefault;

    @FindBy(xpath = "(//tbody)[1]//tr")
    private List<WebElement> currencyTable;

    public void clickCurrencyLink() {
        click(currencyLink);
    }

    public void getCurrencySymbol(String currencySymbol) {
        click(currencyNameOption);
        addText(currencySymbol, currencyNameSearchInput);
        click(currencyNameResult);
    }
    public void addNewCurrency(String currencyName, String currencySymbol) {
        click(addCurrencyButton);
        addText(currencyName, currencyNameInput);
        getCurrencySymbol(currencySymbol);
        click(saveButton);
    }

    public void checkCurrencyAdded(String currencyName, String currencySymbol) {
        for (int i = 2; i < currencyTable.size(); i++) {
            Assert.assertTrue(currencyTable.get(i).getText().contains(currencyName)
                    && currencyTable.get(i).getText().contains(currencySymbol));
            break;
        }
//        for (WebElement currency : currencyTable) {
//            if (currency.getText().contains(currencyName) && currency.getText().contains(currencySymbol)) {
//                break;
//            }
//        }
//        Assert.assertTrue(currencyTable.get(2).getText().contains(currencyName)
//        && currencyTable.get(2).getText().contains(currencySymbol));
    }

}
