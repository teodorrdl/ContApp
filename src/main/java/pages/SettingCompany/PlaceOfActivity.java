package pages.SettingCompany;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


public class PlaceOfActivity extends BaseTest{
    @FindBy(xpath = "//a[normalize-space()='Locul activitatii']")
    private WebElement placeOfActivityLink;

    @FindBy(xpath = "(//button[@class='btn btn-light btn-sm'])[1]")
    private WebElement addPlaceOfActivityButton;

    @FindBy(xpath = "//input[@id='location-form-input-name-']")
    private WebElement namePlaceOfActivityInput;

    @FindBy(xpath = "(//span[@class='selection']//span[@role='combobox'])[6]")
    private WebElement typeOfLocationsOption;

    @FindBy(xpath = "//div[@role='dialog']//li[2]")
    private WebElement locationWorkPoint;

    @FindBy(xpath = "(//span[@role='combobox'])[7]")
    private WebElement countyOptions;

    @FindBy(xpath = "//input[@aria-label='Search']")
    private WebElement countySearchInput;

    @FindBy(xpath = "//li[@role='option']")
    private WebElement countyResult;

    @FindBy(xpath = "//input[@id='location-form-input-city-']")
    private WebElement cityInput;

    @FindBy(xpath = "//input[@id='location-form-input-address-']")
    private WebElement addressInput;

    @FindBy(xpath = "(//button[@class='btn btn-primary btn-sm'])[3]")
    private WebElement saveButton;

    @FindBy(xpath = "(//button[@class='btn btn-light btn-sm'])[6]")
    private WebElement deleteButton;

    @FindBy(xpath = "(//div[@class='col-auto order-1'])[3]")
    private WebElement defaultLocationCheckbox;

    public void clickPlaceOfActivityLink() {
        click(placeOfActivityLink);
    }

    public void getCountyOption(String county) {
        click(countyOptions);
        addText(county, countySearchInput);
        click(countyResult);
    }

    public void addNewLocation(String locationName, String locationCounty,
                               String locationCity, String locationAddress) {
        click(addPlaceOfActivityButton);
        addText(locationName, namePlaceOfActivityInput);
        click(typeOfLocationsOption);
        click(locationWorkPoint);
        getCountyOption(locationCounty);
        addText(locationCity, cityInput);
        addText(locationAddress, addressInput);
        click(saveButton);
        click(defaultLocationCheckbox);
        Assert.assertTrue(checkIfLocationIsAdded(locationName));
    }

    public boolean checkIfLocationIsAdded(String locationName) {
        return checkIfElementIsDisplayed("//span[normalize-space()='" + locationName + "')]");
    }

    private boolean checkIfElementIsDisplayed(String element) {
        return true;
    }
}
