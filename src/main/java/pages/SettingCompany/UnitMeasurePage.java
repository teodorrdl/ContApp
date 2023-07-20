package pages.SettingCompany;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class UnitMeasurePage extends BaseTest {

    @FindBy(xpath = "//a[normalize-space()='U.M.']")
    private WebElement unitMeasureLink;

    @FindBy(xpath = "//button[normalize-space()='Adaugă']")
    private WebElement addUnitMeasureButton;

    @FindBy(xpath = "(//input[@id='name-input'])[8]")
    private WebElement unitMeasureNameInput;

    @FindBy(xpath = "(//input[@id='symbol-input'])[8]")
    private WebElement unitMeasureSymbolInput;

    @FindBy(xpath = "(//span[@role='combobox'])[9]")
    private WebElement unitMeasureBlCode;

    @FindBy(xpath = "//input[@aria-label='Search']")
    private WebElement searchInput;

    @FindBy(xpath = "//ul[@role='listbox']")
    private WebElement resultInput;

    @FindBy(xpath = "(//button[normalize-space()='Salvează'])[8]")
    private WebElement saveUnitMeasureButton;

    @FindBy(xpath = "//tbody")
    private List<WebElement> unitMeasureTable;

    public void clickUnitMeasureLink() {
        click(unitMeasureLink);
    }

    public void addUnitMeasure(String unitMeasureName, String unitMeasureSymbol, String blCode) {
        click(addUnitMeasureButton);
        addText(unitMeasureName, unitMeasureNameInput);
        addText(unitMeasureSymbol, unitMeasureSymbolInput);
        getBlCode(blCode);
        click(saveUnitMeasureButton);
    }

    private void getBlCode(String blCode) {
        click(unitMeasureBlCode);
        addText(blCode, searchInput);
        click(resultInput);
    }

    public void checkUnitMeasure(String unitMeasureName, String unitMeasureSymbol, String blCode) {
        for (int i = 1; i < unitMeasureTable.size(); i++) {
            Assert.assertTrue(unitMeasureTable.get(i).getText().contains(unitMeasureName)
                    && unitMeasureTable.get(i).getText().contains(unitMeasureSymbol)
                    && unitMeasureTable.get(i).getText().contains(blCode));
            break;
        }
    }
}
