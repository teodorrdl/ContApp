package pages;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InvoicePage extends BaseTest {

    @FindBy(xpath = "//button[@class='btn btn-icon dropdown-toggle']")
    private WebElement settingsButton;
    @FindBy(xpath = "//a[normalize-space()='Setari firma']")
    private WebElement companySettings;
    @FindBy(xpath = "(//*[@class=\"form-control \"])[1]")
    private WebElement generalCnp;
    @FindBy(xpath = "(//*[@class=\"form-control \"])[2]")
    private WebElement generalLastName;
    @FindBy(xpath = "(//*[@class=\"form-control \"])[3]")
    private WebElement generalFirstName;
    @FindBy(xpath = "(//b[contains(@role,'presentation')])[3]")
    private WebElement openGeneralCountry;
    @FindBy(xpath = "//span[normalize-space()='Zimbabwe']")
    private WebElement selectGeneralCountry;
    @FindBy(xpath = "(//b[@role='presentation'])[4]")
    private WebElement openGeneralCounty;
    @FindBy(xpath = "//span[normalize-space()='Harare Province']")
    private WebElement selectGeneralCounty;
    @FindBy(xpath = "(//*[@class=\"form-control \"])[4]")
    private WebElement generalCity;
    @FindBy(xpath = "(//*[@class=\"form-control \"])[5]")
    private WebElement generalStreet;
    @FindBy(xpath = "(//*[@class=\"form-control \"])[6]")
    private WebElement generalEmail;
    @FindBy(xpath = "(//*[@class=\"form-control \"])[7]")
    private WebElement generalPhoneNo;
    @FindBy(xpath = "//button[contains(@class,'btn btn-primary')]")
    private WebElement saveButton;
    @FindBy(xpath = "//a[normalize-space()='Setari TVA']")
    private WebElement tvaSettings;
    @FindBy(xpath = "//button[@onclick=\"showModal('vat-create')\"]")
    private WebElement addTva;
    @FindBy(xpath = "//*[@id=\"input-rate\"]")
    private WebElement tvaRate;
    @FindBy(xpath = "(//i[contains(@class,'bi bi-plus-lg align-middle')])[1]")
    private WebElement activityPeriodsTva;
    @FindBy(xpath = "//div[@id='vat-period-create']//label[contains(@for,'vat-period-started-at-')]//i[contains(@class,'bi bi-calendar')]")
    private WebElement openRegistrationDateTva;
    @FindBy(xpath = "//td[normalize-space()='1']")
    private WebElement selectRegistrationDateTva;
    @FindBy(xpath = "//div[@id='vat-period-create']//label[contains(@for,'vat-period-ended-at-')]//i[contains(@class,'bi bi-calendar')]")
    private WebElement openCancellationDateTva;
    @FindBy(xpath = "//td[normalize-space()='22']")
    private WebElement selectCancellationDateTva;
    @FindBy(xpath = "//div[@id='vat-period-create']//button[contains(@class,'btn btn-primary')]")
    private WebElement saveTva;
    @FindBy(xpath = "/html/body/main/div/div/div[3]/div[1]/div/div[2]/div/div[1]/div/div[1]/div/div[2]/button")
    private WebElement cifPeriodCreate;
    @FindBy(xpath = "//div[@id='external-vat-period-create']//input[@id='input-externalVatNumber']")
    private WebElement cifNumber;
    @FindBy(xpath = "//label[@for='external-vat-period-started-at-']//i")
    private WebElement openRegistrationDateCif;
    @FindBy(xpath = "//label[@for='external-vat-period-ended-at-']//i")
    private WebElement openCancellationDateCif;
    @FindBy(xpath = "//td[normalize-space()='7']")
    private WebElement selectRegistrationDateCif;
    @FindBy(xpath = "//td[normalize-space()='31']")
    private WebElement selectCancellationDateCif;
    @FindBy(xpath = "//a[normalize-space()='Locul activitatii']")
    private WebElement activityLocation;
    @FindBy(xpath = "//tbody//tr//td//div//div//div//div//input[@type='checkbox']")
    private WebElement implicitLocation;
    @FindBy(xpath = "//button[@onclick=\"showModal('location-create')\"]")
    private WebElement addNewLocation;
    @FindBy(xpath = "//input[@id='location-form-input-name-']")
    private WebElement locationName;
    @FindBy(xpath = "//*[@id=\"location-create\"]/div/div/div[2]/div/div[2]/div/div/span/span[1]/span/span[2]")
    private WebElement openLocationType;
    @FindBy(xpath = "//li[@role='option']//span[contains(text(),'Punct de lucru')]")
    private WebElement selectLocationType;
    @FindBy(xpath = "//input[@id='location-form-input-registrationNumber-']")
    private WebElement locationRegNum;
    @FindBy(xpath = "//*[@id=\"location-create\"]/div/div/div[2]/div/div[4]/div/div/span/span[1]/span/span[2]")
    private WebElement openLocationCounty;
    @FindBy(xpath = "//li[@role='option']//span[contains(text(),'Manicaland')]")
    private WebElement selectLocationCounty;
    @FindBy(xpath = "//input[@id='location-form-input-city-']")
    private WebElement locationCity;
    @FindBy(xpath = "//input[@id='location-form-input-address-']")
    private WebElement locationStreet;
    @FindBy(xpath = "//a[normalize-space()='Activitati']")
    private WebElement companyActivity;
    @FindBy(xpath = "//button[@onclick=\"showModal('activity-create')\"]")
    private WebElement activityCreate;
    @FindBy(xpath = "(//b[@role='presentation'])[2]")
    private WebElement openActivityLocation;
    @FindBy(xpath = "//li[@role='option']//span[contains(text(),'Sediul profesional')]")
    private WebElement selectActivityLocation;
    @FindBy(xpath = "(//b[@role='presentation'])[3]")
    private WebElement openActivityType;
    @FindBy(xpath = "//li[@role='option']//span[contains(text(),'Activități agricole - sistem real')]")
    private WebElement selectActivityType;
    @FindBy(xpath = "//input[@id='activity-form-input-documentNumber-']")
    private WebElement activityFoundSource;
    @FindBy(xpath = "//input[@id='activity-form-input-authorizationNumber-']")
    private WebElement activityAuthorizationNumber;
    @FindBy(xpath = "(//i[@class='bi bi-calendar'])[1]")
    private WebElement openActivityDate;
    @FindBy(xpath = "//td[normalize-space()='7']")
    private WebElement selectActivityDate;
    @FindBy(xpath = "(//i[@class='bi bi-calendar'])[2]")
    private WebElement openActivityCancellationDate;
    @FindBy(xpath = "//td[normalize-space()='20']")
    private WebElement selectActivityCancellationDate;
    @FindBy(xpath = "//a[contains(text(),'Valută')]")
    private WebElement currency;
    @FindBy(xpath = "//div//button[contains(normalize-space(),'Adaugă')]")
    private WebElement createCurrency;
    @FindBy(xpath = "//input[@id='input-name']")
    private WebElement currencyName;
    @FindBy(xpath = "//div[@class='select-wrapper']//b[@role='presentation']")
    private WebElement openCurrencyType;
    @FindBy(xpath = "//li[@role='option']//span[contains(text(),'BGN')]")
    private WebElement selectCurrencyType;
    @FindBy(xpath = "//a[normalize-space()='Case si Banci']")
    private WebElement housesAndBanks;
    @FindBy(xpath = "//button[@onclick=\"window.closeModal('vat-create')\"][normalize-space()='Închide']")
    private WebElement closeTva;
    @FindBy(xpath = "//button[contains(@onclick,\"window.closeModal('vat-period-create')\")][normalize-space()='Închide']")
    private WebElement closeTvaPeriod;
    @FindBy(xpath = "//button[contains(@onclick,\"window.closeModal('external-vat-period-create')\")][normalize-space()='Închide']")
    private WebElement closeCifPeriod;
    @FindBy(xpath = "//*[@id=\"location-create\"]/div/div/div[3]/button[1]")
    private WebElement saveLocation;
    @FindBy(xpath = "//*[@id=\"activity-create\"]/div/div/div[3]/button[1]")
    private WebElement saveActivity;
    @FindBy(xpath = "//button[contains(text(),'Salvează')]")
    private WebElement saveCurrency;
    @FindBy(xpath = "//button[@onclick=\"showModal('bank-create')\"]")
    private WebElement bankCreate;
    @FindBy(xpath = "//*[@id=\"bank-create\"]/div/div/div[2]/div/div[1]/div/div/span/span[1]/span/span[2]")
    private WebElement openBankType;
    @FindBy(xpath = "//li[@role='option']//span[contains(text(),'Bancă')]")
    private WebElement selectBankType;
    @FindBy(xpath = "//*[@id=\"bank-form-type-input-iban--bank-create\"]")
    private WebElement ibanBank;
    @FindBy(xpath = "//*[@id=\"bank-form-type-input-name--bank-create\"]")
    private WebElement bankName;
    @FindBy(xpath = "//*[@id=\"bank-create\"]/div/div/div[2]/div/div[3]/div/div/span/span[1]/span/span[2]")
    private WebElement openBankCurrency;
    @FindBy(xpath = "//li[@role='option']//span[contains(text(),'RON')]")
    private WebElement selectBankCurrency;
    @FindBy(xpath = "//input[@id='bank-form-details-input-iban--bank-create']")
    private WebElement bankDetails;
    @FindBy(xpath = "//button[@onclick=\"window.closeModal('bank-create')\"][normalize-space()='Închide']")
    private WebElement saveBank;
    @FindBy(xpath = "//a[normalize-space()='Serii']")
    private WebElement series;
    @FindBy(xpath = "//button[@onclick=\"showModal('serie-create')\"]")
    private WebElement addSeries;
    @FindBy(xpath = "//*[@id=\"serie-create\"]/div/div/div[2]/div/div[1]/div/div/span/span[1]/span/span[2]")
    private WebElement openSeriesYear;
    @FindBy(xpath = "//li[@role='option']//span[normalize-space()='2019']")
    private WebElement selectSeriesYear;
    @FindBy(xpath = "//*[@id=\"serie-create\"]/div/div/div[2]/div/div[2]/div/div/span/span[1]/span/span[2]")
    private WebElement openSeriesType;
    @FindBy(xpath = "//li[@role='option']//span[normalize-space()='Factura']")
    private WebElement selectSeriesType;
    @FindBy(xpath = "//input[@id='serie-form-input-name-']")
    private WebElement seriesName;
    @FindBy(xpath = "//input[@id='serie-form-input-leadingZero-']")
    private WebElement seriesNameLeadingZero;
    @FindBy(xpath = "//input[@id='serie-form-input-startFrom-']")
    private WebElement seriesFirstNum;
    @FindBy(xpath = "//button[@onclick=\"window.closeModal('serie-create')\"][normalize-space()='Închide']")
    private WebElement seriesSave;
    @FindBy(xpath = "//button[@onclick=\"showModal('numbering-decision-create')\"]")
    private WebElement addSeriesDecision;
    @FindBy(xpath = "//input[@id='numbering-decision-input-number-']")
    private WebElement seriesDecisionNum;
    @FindBy(xpath = "//input[@id='numbering-decision-form-date-']")
    private WebElement openSeriesDecisionDate;
    @FindBy(xpath = "//td[normalize-space()='7']")
    private WebElement selectSeriesDecisionDate;
    @FindBy(xpath = "//textarea[@id='numbering-decision-textarea-header-']")
    private WebElement seriesDeclarationHeader;
    @FindBy(xpath = "//textarea[@id='numbering-decision-textarea-footer-']")
    private WebElement seriesDeclarationFooter;
    @FindBy(xpath = "//*[@id=\"numbering-decision-create\"]/div/div/div[3]/button[1]")
    private WebElement saveSeriesDeclaration;
    @FindBy(xpath = "//*[@id=\"numbering-decision-create\"]/div/div/div[2]/div[3]/div/div/div/div/div/div/div/table/tbody/tr/td[5]/div[1]/div/div/div[2]")
    private WebElement seriesDeclarationCheckbox;
    @FindBy(xpath = "//a[normalize-space()='U.M.']")
    private WebElement measureUnits;
    @FindBy(xpath = "//button[@onclick=\"showModal('measurement-unit-create')\"]")
    private WebElement createMeasureUnits;
    @FindBy(xpath = "//div[@id='measurement-unit-create']//div//div//div//div//div//div//div//input[@id='name-input']")
    private WebElement measureUnitName;
    @FindBy(xpath = "//div[@id='measurement-unit-create']//div//div//div//div//div//div//div//input[@id='symbol-input']")
    private WebElement measureUnitSymbol;
    @FindBy(xpath = "//div[@role='dialog']//span[@role='presentation']")
    private WebElement openMeasureUnitCode;
    @FindBy(xpath = "//li[@role='option']//span[normalize-space()='11 - tinuta']")
    private WebElement selectMeasureUnitCode;
    @FindBy(xpath = "//button[@onclick=\"window.closeModal('measurement-unit-create')\"][normalize-space()='Închide']")
    private WebElement saveMeasureUnit;
    @FindBy(xpath = "//a[normalize-space()='Roluri & Permisiuni']")
    private WebElement rolesPermissions;
    @FindBy(xpath = "//tbody/tr[2]/td[2]/div[1]/button[1]")
    private WebElement accountantPermissions;
    @FindBy(xpath = "//*[@id=\"input-selectedPermissions\"]")
    private WebElement editAccountantPermissions;
    @FindBy(xpath = "//*[@id=\"company-role-edit-11606\"]/div/div/div[3]/button[1]")
    private WebElement saveEditedPermissions;
    @FindBy(xpath = "//a[normalize-space()='Utilizatori']")
    private WebElement users;
    @FindBy(xpath = "//button[normalize-space()='Deschide']")
    private WebElement openUser;
    @FindBy(xpath = "//button[contains(text(),'Salvează')]")
    private WebElement saveUser;
    @FindBy(xpath = "//a[contains(text(),'Reprezentanți')]")
    private WebElement representative;
    @FindBy(xpath = "//button[@onclick=\"showModal('representative-create')\"]")
    private WebElement createRepresentative;
    @FindBy(xpath = "//input[@id='representative-form-input-firstName-']")
    private WebElement representativeFirstName;
    @FindBy(xpath = "//input[@id='representative-form-input-lastName-']")
    private WebElement representativeLastName;
    @FindBy(xpath = "//input[@id='representative-form-input-identifier-']")
    private WebElement representativeNum;
    @FindBy(xpath = "//*[@id=\"input-isFiscal\"]")
    private WebElement representativeCheckbox;
    @FindBy(xpath = "//button[@onclick=\"window.closeModal('representative-create')\"][normalize-space()='Închide']")
    private WebElement closeRepresentative;
    @FindBy(xpath = "//a[contains(text(),'Preferințe')]")
    private WebElement preference;
    @FindBy(xpath = "//*[@id=\"radio-preference-0\"]")
    private WebElement preferenceLogo;
    @FindBy(xpath = "//input[@id='radio-preference-1']")
    private WebElement preferenceReceipt;
    @FindBy(xpath = "//input[@id='radio-preference-2']")
    private WebElement preferenceBilingual;
    @FindBy(xpath = "//input[@id='radio-preference-3']")
    private WebElement preferenceDelegate;
    @FindBy(xpath = "//input[@id='input-preferences.4.value']")
    private WebElement delegateName;
    @FindBy(xpath = "//input[@id='input-preferences.5.value']")
    private WebElement delegateSerial;
    @FindBy(xpath = "//input[@id='input-preferences.6.value']")
    private WebElement delegateNum;
    @FindBy(xpath = "//div[contains(@class,'card-footer')]//button")
    private WebElement saveDelegate;
    @FindBy(xpath = "//a[contains(text(),'Integrări')]")
    private WebElement integrations;
    @FindBy(xpath = "/html/body/main/div/div/div[3]/div/div/div/div/div[2]/div/div[1]/div[2]/div")
    private WebElement integrationsSpv;
    @FindBy(xpath = "/html/body/main/div/div/div[3]/div/div/div/div/div[2]/div/div[2]/div[3]/div")
    private WebElement integrationsGetAccess;
    @FindBy(xpath = "//span[@class='footer-copyright']")
    private WebElement copyright;

    public void enterGeneralSettings() {
        click(settingsButton);
        click(companySettings);
    }

    public void setGeneralSettings(String generalCnp, String generalLastName, String generalFirstName, String generalCity,
                                   String generalStreet, String generalEmail, String generalPhoneNo) {
        addText(generalCnp, this.generalCnp);
        addText(generalLastName, this.generalLastName);
        addText(generalFirstName, this.generalFirstName);
        click(openGeneralCountry);
        click(selectGeneralCountry);
        action(openGeneralCounty);
        click(selectGeneralCounty);
        addText(generalCity, this.generalCity);
        addText(generalStreet, this.generalStreet);
        addText(generalEmail, this.generalEmail);
        addText(generalPhoneNo, this.generalPhoneNo);
        action(saveButton);

    }

    public void setTvaSettings(String tvaRate, String cifNumber) {
        click(tvaSettings);
        click(addTva);
        addText(tvaRate, this.tvaRate);
        click(closeTva);
        click(activityPeriodsTva);
        click(openRegistrationDateTva);
        click(selectRegistrationDateTva);
        click(openCancellationDateTva);
        click(selectCancellationDateTva);
        click(closeTvaPeriod);
        click(cifPeriodCreate);
        addText(cifNumber, this.cifNumber);
        click(openRegistrationDateCif);
        click(selectRegistrationDateCif);
        click(openCancellationDateCif);
        click(selectCancellationDateCif);
        click(closeCifPeriod);
    }

    public void setActivityLocation(String locationName, String locationRegNum, String locationCity, String locationStreet) {
        click(activityLocation);
        click(addNewLocation);
        action(implicitLocation);
        addText(locationName, this.locationName);
        click(openLocationType);
        click(selectLocationType);
        addText(locationRegNum, this.locationRegNum);
        click(openLocationCounty);
        click(selectLocationCounty);
        addText(locationCity, this.locationCity);
        addText(locationStreet, this.locationStreet);
        click(saveLocation);
    }

    public void setActivity(String activityFoundSource, String activityAuthorizationNumber) {
        click(companyActivity);
        click(activityCreate);
        click(openActivityLocation);
        click(selectActivityLocation);
        click(openActivityType);
        click(selectActivityType);
        click(openActivityDate);
        click(selectActivityDate);
        click(openActivityCancellationDate);
        click(selectActivityCancellationDate);
        addText(activityFoundSource, this.activityFoundSource);
        addText(activityAuthorizationNumber, this.activityAuthorizationNumber);
        click(saveActivity);
    }

    public void setCurrency(String currencyName) {
        click(currency);
        clickWithRetries(createCurrency);
        addText(currencyName, this.currencyName);
        click(openCurrencyType);
        click(selectCurrencyType);
        click(saveCurrency);
    }

    public void setHousesAndBanks(String bankName, String bankDetails, String ibanBank) {
        click(housesAndBanks);
        click(bankCreate);
        click(openBankType);
        click(selectBankType);
        addText(ibanBank, this.ibanBank);
        addText(bankName, this.bankName);
        click(openBankCurrency);
        click(selectBankCurrency);
        addText(bankDetails, this.bankDetails);
        click(saveBank);
    }

    public void setSeries(String seriesName, String seriesNameLeadingZero, String seriesFirstNum, String seriesDecisionNum,
                          String seriesDeclarationHeader, String seriesDeclarationFooter) {
        click(series);
        click(addSeries);
        click(openSeriesYear);
        click(selectSeriesYear);
        click(openSeriesType);
        click(selectSeriesType);
        addText(seriesName, this.seriesName);
        addText(seriesNameLeadingZero, this.seriesNameLeadingZero);
        addText(seriesFirstNum, this.seriesFirstNum);
        click(seriesSave);
        click(addSeriesDecision);
        addText(seriesDecisionNum, this.seriesDecisionNum);
        click(openSeriesDecisionDate);
        click(selectSeriesDecisionDate);
        addText(seriesDeclarationHeader, this.seriesDeclarationHeader);
        click(seriesDeclarationCheckbox);
        addText(seriesDeclarationFooter, this.seriesDeclarationFooter);
        click(saveSeriesDeclaration);
    }

    public void setMeasureUnits(String measureUnitName, String measureUnitSymbol) {
        click(measureUnits);
        click(createMeasureUnits);
        addText(measureUnitName, this.measureUnitName);
        addText(measureUnitSymbol, this.measureUnitSymbol);
        click(openMeasureUnitCode);
        click(selectMeasureUnitCode);
        click(saveMeasureUnit);
    }

    public void setRolesPermissions() {
        click(rolesPermissions);
        click(accountantPermissions);
        click(editAccountantPermissions);
        click(saveEditedPermissions);
    }

    public void setUsers() {
        click(users);
        click(openUser);
        click(saveUser);
    }

    public void setRepresentative(String representativeFirstName, String representativeLastName, String representativeNum) {
        click(representative);
        click(createRepresentative);
        addText(representativeFirstName, this.representativeFirstName);
        addText(representativeLastName, this.representativeLastName);
        addText(representativeNum, this.representativeNum);
        click(representativeCheckbox);
        click(closeRepresentative);
    }

    public void setPreferences(String delegateName, String delegateSerial, String delegateNum) {
        click(preference);
        click(preferenceLogo);
        click(preferenceReceipt);
        click(preferenceLogo);
        click(preferenceReceipt);
        click(preferenceBilingual);
        click(preferenceDelegate);
        scrollDown();
        addTextToDisabledTextBox(delegateName, this.delegateName);
        addTextToDisabledTextBox(delegateSerial, this.delegateSerial);
        addTextToDisabledTextBox(delegateNum, this.delegateNum);
        scrollDown();
        click(saveDelegate);
        scrollUp();
    }


    public void setIntegrations() {
        scrollUp();
        click(integrations);
        click(integrationsSpv);
        click(integrationsGetAccess);
    }


}
