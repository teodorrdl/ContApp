package tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginPageContactApp;
import pages.SettingCompany.GeneralSetting;
import pages.SettingCompany.SettingCompany;

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
}
