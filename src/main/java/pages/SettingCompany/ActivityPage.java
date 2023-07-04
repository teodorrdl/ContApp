package pages.SettingCompany;


import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class ActivityPage extends BaseTest {
    @FindBy(xpath = "//a[normalize-space()='Activitati']")
    private WebElement activityLink;

    @FindBy(xpath = "(//button[@class='btn btn-light btn-sm'])[1]")
    private WebElement addActivityButton;

    @FindBy(xpath = "(//span[@id='select2-select-activity-form-select-location--container'])[1]")
    private WebElement activityNameOptions;

    @FindBy(xpath = "//input[@aria-label='Search']")
    private WebElement activitySearchInput;

    @FindBy(xpath = "//ul[@class='select2-results__options']")
    private WebElement activityResult;

    @FindBy(xpath = "(//span[@class='select2-selection select2-selection--single'])[3]")
    private WebElement incomeCategoryOption;

    @FindBy(xpath = "//input[@aria-label='Search']")
    private WebElement incomeCategorySearchInput;

    @FindBy(xpath = "//ul[@role='listbox']")
    private WebElement incomeCategoryResult;

    @FindBy(xpath = "//input[@id='activity-form-input-documentNumber-']")
    private WebElement sourceOfIncomeInput;

    @FindBy(xpath = "(//span[@role='combobox'])[4]")
    private WebElement sourceOfIncomeOption;

    @FindBy(xpath = "(//ul[@id='select2-select-activity-form-select-activity--results'])[1]")
    private WebElement sourceOfIncomeResult;

    @FindBy(xpath = "//input[@id='activity-form-input-authorizationNumber-']")
    private WebElement authorizationNumberInput;

    @FindBy(xpath = "//input[@id='activity-from-start-date-']")
    private WebElement startDateInput;

    @FindBy(xpath = "//input[@id='activity-from-end-date-']")
    private WebElement endDateInput;

    @FindBy(xpath = "(//button[contains(text(),'Salvează')])[2]")
    private WebElement saveButton;

    @FindBy(xpath = "/(//button[normalize-space()='Închide'])[1]")
    private WebElement closeButton;

    @FindBy(xpath = "//tbody//tr")
    private List<WebElement> activityList;

    @FindBy(xpath = "(//button[@class='btn btn-xs btn-light'][normalize-space()='Deschide'])[1]")
    private WebElement openActivityButton;

    @FindBy(xpath = "(//button[@class='btn btn-xs btn-light'][normalize-space()='Șterge'])[1]")
    private WebElement deleteActivityButton;

    @FindBy(xpath = "(//button[@class='btn btn-sm btn-danger'])[1]")
    private WebElement deleteButtonDanger;

    public void clickActivityLink() {
        click(activityLink);
    }

    public void getActivityNameOption(String activityName) {
        click(activityNameOptions);
        addText(activityName, activitySearchInput);
        click(activityResult);
    }

    public void getIncomeCategoryOption(String incomeCategory) {
        click(incomeCategoryOption);
        addText(incomeCategory, incomeCategorySearchInput);
        click(incomeCategoryResult);
    }

    public void getSourceOfIncomeOption(String sourceOfIncome) {
        click(sourceOfIncomeOption);
        addText(sourceOfIncome, incomeCategorySearchInput);
        click(sourceOfIncomeResult);
    }

    public void checkActivity(String activityName, String incomeCategory, String sourceOfIncome,
                              String authorizationNr, String registrationDate, String endedDate) {
        for (int i = 1; i < activityList.size(); i++) {
            WebElement activity = activityList.get(i);
            Assert.assertTrue(activity.getText().contains(activityName) && activity.getText().contains(incomeCategory)
                    && activity.getText().contains(sourceOfIncome) && activity.getText().contains(authorizationNr)
                    && activity.getText().contains(registrationDate) && activity.getText().contains(endedDate));
            break;
        }
    }

    public void addAuthorizedActivities(String activityName, String incomeCategory, String sourceOfIncome,
                                        String authorizationNr, String registrationDate, String endedDate) {
        click(addActivityButton);
        getActivityNameOption(activityName);
        getIncomeCategoryOption(incomeCategory);
        getSourceOfIncomeOption(sourceOfIncome);
        addText(authorizationNr, authorizationNumberInput);
        addText(registrationDate, startDateInput);
        addText(endedDate, endDateInput);
        click(saveButton);
        checkActivity(activityName, incomeCategory, sourceOfIncome, authorizationNr, registrationDate, endedDate);
    }

    public void deleteAuthorizedActivity() {
        click(deleteActivityButton);
        click(deleteButtonDanger);
    }
}

