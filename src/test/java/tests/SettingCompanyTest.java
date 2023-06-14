package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginPageContactApp;
import pages.SettingCompany.GeneralSetting;
import pages.SettingCompany.SettingCompany;
import pages.SettingCompany.TVASetting;

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

    @Test(description = "check the company settings if direct to the correct url with valid login credentials " +
            "and with the company already created",priority = 2)
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
    public void modifyCompanyOrganisationType( String username, String password, String entityType, String cnp,
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
    @Parameters({"username", "password", "CIF", "registrationDate","cancellationDate"})
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
}
