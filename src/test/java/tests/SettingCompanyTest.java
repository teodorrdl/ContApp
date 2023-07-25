package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginPageContactApp;
import pages.SettingCompany.*;

public class SettingCompanyTest extends BasePage {

    public SettingCompany settingCompany() {
        return new SettingCompany();
    }

    public LoginPageContactApp loginPageContactApp() {
        return new LoginPageContactApp();
    }

    public GeneralSetting generalSetting() {
        return new GeneralSetting();
    }

    public TVASetting tvaSetting() {
        return new TVASetting();
    }

    public PlaceOfActivity placeOfActivity() {
        return new PlaceOfActivity();
    }

    public ActivityPage activityPage() {
        return new ActivityPage();
    }

    public CurrencyPage currencyPage() {
        return new CurrencyPage();
    }

    public HousesAndBanks housesAndBanks() {
        return new HousesAndBanks();
    }

    public SeriesPage seriesPage() {
        return new SeriesPage();
    }

    public UnitMeasurePage unitMeasurePage() {
        return new UnitMeasurePage();
    }

    public RolesAndPermissionsPage rolesAndPermissionsPage() {
        return new RolesAndPermissionsPage();
    }

    public UsersPage usersPage() {
        return new UsersPage();
    }

    public RepresentativesPage representativesPage() {
        return new RepresentativesPage();
    }

    public Preferences preferences() {
        return new Preferences();
    }

    public Integrations integrations() {
        return new Integrations();
    }

    @Test(description = "check the company settings if direct to the correct url with valid login credentials " +
            "and with the company already created", priority = 2)
    @Parameters({"username", "password"})
    public void verifySettingCompany(String username, String password) {
        loginPageContactApp().clickAuthenticationButton();
        loginPageContactApp().addEmail(username);
        loginPageContactApp().addPassword(password);
        loginPageContactApp().clickRememberMeCheckbox();
        loginPageContactApp().clickLoginButton();
        settingCompany().clickContAppPs();
        settingCompany().clickDropdownButtonSetting();
        settingCompany().clickSettingCompany();
    }

    @Test(description = "modified the company at the value organization type with 'persoana fizica' from 'Alta' value ", priority = 1)
    @Parameters({"username", "password", "entityType", "cnp", "firstName", "lastName", "country", "county", "city",
            "address", "email", "phone"})
    public void modifyCompanyOrganisationType(String username, String password, String entityType, String cnp,
                                              String firstName, String lastName, String country, String county,
                                              String city, String address, String email, String phone) {
        loginPageContactApp().clickAuthenticationButton();
        loginPageContactApp().addEmail(username);
        loginPageContactApp().addPassword(password);
        loginPageContactApp().clickRememberMeCheckbox();
        loginPageContactApp().clickLoginButton();
        settingCompany().clickContAppPs();
        settingCompany().clickDropdownButtonSetting();
        settingCompany().clickSettingCompany();
        generalSetting().modifiedCompany(entityType, cnp, firstName, lastName, country, county, city, address, email, phone);
    }

    @Test(description = "Add the period of activity with the TVA  ", priority = 3)
    @Parameters({"username", "password", "startDateVATPeriod", "endDateVATPeriod"})
    public void addPeriodOfActivityTVA(String username, String password, String startDateVATPeriod, String endDateVATPeriod) {
        loginPageContactApp().clickAuthenticationButton();
        loginPageContactApp().addEmail(username);
        loginPageContactApp().addPassword(password);
        loginPageContactApp().clickRememberMeCheckbox();
        loginPageContactApp().clickLoginButton();
        settingCompany().clickContAppPs();
        settingCompany().clickDropdownButtonSetting();
        settingCompany().clickSettingCompany();
        tvaSetting().clickTVALink();
        tvaSetting().addPeriodOfActivity(startDateVATPeriod, endDateVATPeriod);
    }

    @Test(description = "Add period of activity with CIF Intra-Community Transactions", priority = 4)
    @Parameters({"username", "password", "CIF", "registrationDate", "cancellationDate"})
    public void addPeriodOfActivityCIF(String username, String password, String CIF, String registrationDate, String cancellationDate) {
        loginPageContactApp().clickAuthenticationButton();
        loginPageContactApp().addEmail(username);
        loginPageContactApp().addPassword(password);
        loginPageContactApp().clickRememberMeCheckbox();
        loginPageContactApp().clickLoginButton();
        settingCompany().clickContAppPs();
        settingCompany().clickDropdownButtonSetting();
        settingCompany().clickSettingCompany();
        tvaSetting().clickTVALink();
        tvaSetting().addPeriodOfActivityCIF(CIF, registrationDate, cancellationDate);
    }

    @Test(description = "Addition of VAT rates with 24%", priority = 5)
    @Parameters({"username", "password", "VATRate"})
    public void addVATRate(String username, String password, String VATRate) {
        loginPageContactApp().clickAuthenticationButton();
        loginPageContactApp().addEmail(username);
        loginPageContactApp().addPassword(password);
        loginPageContactApp().clickRememberMeCheckbox();
        loginPageContactApp().clickLoginButton();
        settingCompany().clickContAppPs();
        settingCompany().clickDropdownButtonSetting();
        settingCompany().clickSettingCompany();
        tvaSetting().clickTVALink();
        tvaSetting().addVATRate(VATRate);
    }

    @Test(description = "Add new location", priority = 6)
    @Parameters({"username", "password", "locationName", "locationCounty", "locationCity", "locationAddress"})
    public void addNewLocation(String username, String password, String locationName, String locationCounty, String locationCity, String locationAddress) {
        loginPageContactApp().clickAuthenticationButton();
        loginPageContactApp().addEmail(username);
        loginPageContactApp().addPassword(password);
        loginPageContactApp().clickRememberMeCheckbox();
        loginPageContactApp().clickLoginButton();
        settingCompany().clickContAppPs();
        settingCompany().clickDropdownButtonSetting();
        settingCompany().clickSettingCompany();
        placeOfActivity().clickPlaceOfActivityLink();
        placeOfActivity().addNewLocation(locationName, locationCounty, locationCity, locationAddress);
    }

    @Test(description = "Add authorized activities", priority = 7)
    @Parameters({"username", "password", "activityName", "incomeCategory",
            "sourceOfIncome", "authorizationNr", "registrationDate", "endedDate"})
    public void addAuthorizedActivities(String username, String password, String activityName, String incomeCategory,
                                        String sourceOfIncome, String authorizationNr, String registrationDate, String endedDate) {
        loginPageContactApp().clickAuthenticationButton();
        loginPageContactApp().addEmail(username);
        loginPageContactApp().addPassword(password);
        loginPageContactApp().clickRememberMeCheckbox();
        loginPageContactApp().clickLoginButton();
        settingCompany().clickContAppPs();
        settingCompany().clickDropdownButtonSetting();
        settingCompany().clickSettingCompany();
        activityPage().clickActivityLink();
        activityPage().addAuthorizedActivities(activityName, incomeCategory, sourceOfIncome, authorizationNr, registrationDate, endedDate);
    }

    @Test(description = "Deletes the authorized activity already created ", priority = 8)
    @Parameters({"username", "password"})
    public void checkDeleteAuthorizedActivity(String username, String password) {
        loginPageContactApp().clickAuthenticationButton();
        loginPageContactApp().addEmail(username);
        loginPageContactApp().addPassword(password);
        loginPageContactApp().clickRememberMeCheckbox();
        loginPageContactApp().clickLoginButton();
        settingCompany().clickContAppPs();
        settingCompany().clickDropdownButtonSetting();
        settingCompany().clickSettingCompany();
        activityPage().clickActivityLink();
        activityPage().deleteAuthorizedActivity();
    }

    @Test(description = "Add new currency", priority = 9)
    @Parameters({"username", "password", "currencyName", "currencySymbol"})
    public void addNewCurrency(String username, String password, String currencyName, String currencySymbol) {
        loginPageContactApp().clickAuthenticationButton();
        loginPageContactApp().addEmail(username);
        loginPageContactApp().addPassword(password);
        loginPageContactApp().clickRememberMeCheckbox();
        loginPageContactApp().clickLoginButton();
        settingCompany().clickContAppPs();
        settingCompany().clickDropdownButtonSetting();
        settingCompany().clickSettingCompany();
        currencyPage().clickCurrencyLink();
        currencyPage().addNewCurrency(currencyName, currencySymbol);
        currencyPage().checkCurrencyAdded(currencyName, currencySymbol);
    }

    @Test(description = "Add Bank", priority = 10)
    @Parameters({"username", "password", "typeofService", "bankName", "currency", "bankIBAN", "bankDetails"})
    public void addBank(String username, String password, String typeofService, String bankName, String currency, String bankIBAN, String bankDetails) {
        loginPageContactApp().clickAuthenticationButton();
        loginPageContactApp().addEmail(username);
        loginPageContactApp().addPassword(password);
        loginPageContactApp().clickRememberMeCheckbox();
        loginPageContactApp().clickLoginButton();
        settingCompany().clickContAppPs();
        settingCompany().clickDropdownButtonSetting();
        settingCompany().clickSettingCompany();
        housesAndBanks().clickHousesAndBanksLink();
        housesAndBanks().addNewBankOrHouse(typeofService, bankName, currency, bankIBAN, bankDetails);
        housesAndBanks().checkBankOrHouseAdded(typeofService, bankName, currency, bankIBAN);
    }

    @Test(description = "Add House", priority = 11)
    @Parameters({"username", "password", "typeofService", "name", "currency", "cashRegisterIBAN", "cashRegisterDetails"})
    public void addCashRegister(String username, String password, String typeofService, String name, String currency, String cashRegisterIBAN, String cashRegisterDetails) {
        loginPageContactApp().clickAuthenticationButton();
        loginPageContactApp().addEmail(username);
        loginPageContactApp().addPassword(password);
        loginPageContactApp().clickRememberMeCheckbox();
        loginPageContactApp().clickLoginButton();
        settingCompany().clickContAppPs();
        settingCompany().clickDropdownButtonSetting();
        settingCompany().clickSettingCompany();
        housesAndBanks().clickHousesAndBanksLink();
        housesAndBanks().addNewBankOrHouse(typeofService, name, currency, cashRegisterIBAN, cashRegisterDetails);
        housesAndBanks().checkBankOrHouseAdded(typeofService, name, currency, cashRegisterIBAN);
    }

    @Test(description = "Add new series and add new decisions numbers", priority = 12)
    @Parameters({"username", "password", "year", "seriesType", "seriesName", "seriesNumber" ,"firstNr"})
    public void addNewSeries(String username, String password, String year, String seriesType, String seriesName,
                             String seriesNumber, String firstNr){
        loginPageContactApp().clickCloseCookie();
        loginPageContactApp().clickAuthenticationButton();
        loginPageContactApp().addEmail(username);
        loginPageContactApp().addPassword(password);
        loginPageContactApp().clickRememberMeCheckbox();
        loginPageContactApp().clickLoginButton();
        settingCompany().clickContAppPs();
        settingCompany().clickDropdownButtonSetting();
        settingCompany().clickSettingCompany();
        seriesPage().clickSeriesLink();
        seriesPage().addNewSeries(year,seriesType,seriesName,seriesNumber,firstNr);
        seriesPage().checkSeriesAdded(seriesType,seriesName,seriesNumber,firstNr);
        seriesPage().addNrDecisions();
    }

    @Test(description = "Add new measure unit", priority = 13)
    @Parameters({"username", "password", "measureUnitName", "measureUnitSymbol", "blCode"})
    public void addNewMeasureUnit(String username, String password, String measureUnitName, String measureUnitSymbol, String blCode){
        loginPageContactApp().clickCloseCookie();
        loginPageContactApp().clickAuthenticationButton();
        loginPageContactApp().addEmail(username);
        loginPageContactApp().addPassword(password);
        loginPageContactApp().clickRememberMeCheckbox();
        loginPageContactApp().clickLoginButton();
        settingCompany().clickContAppPs();
        settingCompany().clickDropdownButtonSetting();
        settingCompany().clickSettingCompany();
        unitMeasurePage().clickUnitMeasureLink();
        unitMeasurePage().addUnitMeasure(measureUnitName,measureUnitSymbol,blCode);
        unitMeasurePage().checkUnitMeasure(measureUnitName,measureUnitSymbol,blCode);
    }

    @Test(description = "Check if the permission can be changed for each role", priority = 14)
    @Parameters({"username", "password"})
    public void checkPermissionForRoles(String username, String password){
        loginPageContactApp().clickCloseCookie();
        loginPageContactApp().clickAuthenticationButton();
        loginPageContactApp().addEmail(username);
        loginPageContactApp().addPassword(password);
        loginPageContactApp().clickRememberMeCheckbox();
        loginPageContactApp().clickLoginButton();
        settingCompany().clickContAppPs();
        settingCompany().clickDropdownButtonSetting();
        settingCompany().clickSettingCompany();
        rolesAndPermissionsPage().clickRolesAndPermissionsLink();
        rolesAndPermissionsPage().clickOpenAdminRole();
        rolesAndPermissionsPage().clickOpenAccountantRole();
        rolesAndPermissionsPage().clickOpenVisitorRole();
    }

    @Test(description = "Invite new user", priority = 15)
    @Parameters({"username", "password", "email", "role"})
    public void inviteNewUser(String username, String password, String email, String role){
        loginPageContactApp().clickCloseCookie();
        loginPageContactApp().clickAuthenticationButton();
        loginPageContactApp().addEmail(username);
        loginPageContactApp().addPassword(password);
        loginPageContactApp().clickLoginButton();
        settingCompany().clickContAppPs();
        settingCompany().clickDropdownButtonSetting();
        settingCompany().clickSettingCompany();
        usersPage().clickUsersLink();
        usersPage().inviteUser(email, role);
        usersPage().isUserInvited(email);
    }

    @Test(description = "Add new representative", priority = 16)
    @Parameters({"username", "password", "lastName", "firstName", "identifier", "percentage"})
    public void addNewRepresentative(String username, String password, String lastName, String firstName, String identifier, String percentage){
        loginPageContactApp().clickCloseCookie();
        loginPageContactApp().clickAuthenticationButton();
        loginPageContactApp().addEmail(username);
        loginPageContactApp().addPassword(password);
        loginPageContactApp().clickLoginButton();
        settingCompany().clickContAppPs();
        settingCompany().clickDropdownButtonSetting();
        settingCompany().clickSettingCompany();
        representativesPage().clickRepresentativesLink();
        representativesPage().addNewRepresentative(lastName, firstName, identifier, percentage);
        representativesPage().checkIfRepresentativeIsAdded(lastName, firstName, identifier, percentage);
    }

    @Test(description = "Check if the preferences invoice is saved", priority = 17)
    @Parameters({"username", "password", "delegateName", "CISeries", "CINumber"})
    public void checkPreferencesInvoiceIsSaved(String username, String password, String delegateName, String CISeries, String CINumber){
        loginPageContactApp().clickCloseCookie();
        loginPageContactApp().clickAuthenticationButton();
        loginPageContactApp().addEmail(username);
        loginPageContactApp().addPassword(password);
        loginPageContactApp().clickLoginButton();
        settingCompany().clickContAppPs();
        settingCompany().clickDropdownButtonSetting();
        settingCompany().clickSettingCompany();
        preferences().clickPreferencesLink();
        preferences().preferencesInvoice(delegateName, CISeries, CINumber);
        preferences().checkCheckbox();
        preferences().customizeTextEmail();
    }

    @Test(description = "Check if generate invoice is working with certificate SPV", priority = 18)
    @Parameters({"username", "password"})
    public void checkGenerateInvoiceWithCertificateSPV(String username, String password){
        loginPageContactApp().clickCloseCookie();
        loginPageContactApp().clickAuthenticationButton();
        loginPageContactApp().addEmail(username);
        loginPageContactApp().addPassword(password);
        loginPageContactApp().clickLoginButton();
        settingCompany().clickContAppPs();
        settingCompany().clickDropdownButtonSetting();
        settingCompany().clickSettingCompany();
        integrations().clickIntegrationsLink();
        integrations().clickWithCertificateDigitalSPV();
    }

    @Test(description = "Check if generate invoice is working without certificate SPV", priority = 19)
    @Parameters({"username", "password"})
    public void checkGenerateInvoiceWithoutCertificateSPV(String username, String password){
        loginPageContactApp().clickCloseCookie();
        loginPageContactApp().clickAuthenticationButton();
        loginPageContactApp().addEmail(username);
        loginPageContactApp().addPassword(password);
        loginPageContactApp().clickLoginButton();
        settingCompany().clickContAppPs();
        settingCompany().clickDropdownButtonSetting();
        settingCompany().clickSettingCompany();
        integrations().clickIntegrationsLink();
        integrations().clickWithoutCertificateDigitalSPV();
    }
}
