package pages.SettingCompany;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class SeriesPage extends BaseTest {
    @FindBy(xpath = "//a[normalize-space()='Serii']")
    private WebElement seriesLink;

    @FindBy(xpath = "(//button[normalize-space()='Adaugă'])[1]")
    private WebElement addButtonSeries;

    @FindBy(xpath = "(//button[normalize-space()='Adaugă'])[2]")
    private WebElement nrDecisionsButton;

    @FindBy(xpath = "(//span[@role='combobox'])[2]")
    private WebElement selectionYear;

    @FindBy(xpath = "//input[@aria-label='Search']")
    private WebElement searchInput;

    @FindBy(xpath = "//ul[@role='listbox']")
    private WebElement resultInput;

    @FindBy(xpath = "(//span[@role='combobox'])[3]")
    private WebElement typeofSeries;

    @FindBy(xpath = "//input[@id='serie-form-input-name-']")
    private WebElement seriesNameInput;

    @FindBy(xpath = "//input[@id='serie-form-input-leadingZero-']")
    private WebElement nrOfDigitsInput;

    @FindBy(xpath = "//input[@id='serie-form-input-startFrom-']")
    private WebElement firstNrInput;

    @FindBy(xpath = "(//button[normalize-space()='Salvează'])[1]")
    private WebElement saveSeriesButton;


    @FindBy(xpath = "(//input[@type='checkbox'])[3]")
    private WebElement selectSeriesCheckbox;

    @FindBy(xpath = "(//button[normalize-space()='Salvează'])[3]")
    private WebElement saveNrDecisionsButton;

    @FindBy(xpath = "(//tbody)[1]")
    private List <WebElement> seriesTable;


    public void clickSeriesLink() {
        seriesLink.click();
    }

    public void getYear(String year) {
        click(selectionYear);
        addText(year, searchInput);
        click(resultInput);
    }

    public void getTypeOfSeries(String typeOfSeries) {
        click(typeofSeries);
        addText(typeOfSeries, searchInput);
        click(resultInput);
    }

    public void addNewSeries(String year, String typeOfSeries, String seriesName, String seriesNumber, String firstNr) {
        click(addButtonSeries);
        getYear(year);
        getTypeOfSeries(typeOfSeries);
        addText(seriesName, seriesNameInput);
        addText(seriesNumber, nrOfDigitsInput);
        addText(firstNr, firstNrInput);
        click(saveSeriesButton);
    }

    public void addNrDecisions() {
        click(nrDecisionsButton);
        click(selectSeriesCheckbox);
        click(saveNrDecisionsButton);
    }

    public void checkSeriesAdded(String typeOfSeries, String seriesName, String seriesNumber, String firstNr) {
        for (int i = 1; i < seriesTable.size(); i++) {
            WebElement series = seriesTable.get(i);
            Assert.assertTrue(series.getText().contains(typeOfSeries) && series.getText().contains(seriesName)
                    && series.getText().contains(seriesNumber) && series.getText().contains(firstNr));
            break;
        }
    }
}
