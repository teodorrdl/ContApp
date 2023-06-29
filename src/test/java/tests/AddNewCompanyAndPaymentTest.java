package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.AddNewCompanyAndPayment.AddNewActivity;
import pages.AddNewCompanyAndPayment.AddNewCompany;
import pages.AddNewCompanyAndPayment.AddNewPayment;
import pages.AddNewCompanyAndPayment.AddNewSupplier;
import pages.BasePage;
import pages.LoginPageContactApp;

public class AddNewCompanyAndPaymentTest extends BasePage {

    public LoginPageContactApp loginPageContactApp() {
        return new LoginPageContactApp();
    }
    public AddNewCompany addNewCompany() {
        return new AddNewCompany();
    }
    public AddNewPayment addNewPayment() {  return new AddNewPayment(); }
    public AddNewSupplier addNewSupplier() {
        return new AddNewSupplier();
    }
    public AddNewActivity addNewActivity() {
        return new AddNewActivity();
    }
    @Test(description = "Happy Test! Add new company", priority = 1)

    @Parameters({"email","password","textCUI","textNrRegCom","textEntityType","textCompanyName", "textData","textCounty","textCity","textAdress","textContactPerson","textWebSite","textEmail","textPhone"})
    public void testNewCompany(String email, String password, String textCUI, String textNrRegCom, String textEntityType, String textCompanyName, String textData, String textCounty, String textCity, String textAdress, String textContactPerson, String textWebSite, String textEmail, String textPhone) {
        loginPageContactApp().clickAuthenticationButton();
        loginPageContactApp().addEmail(email);
        loginPageContactApp().addPassword(password);
        loginPageContactApp().clickRememberMeCheckbox();
        loginPageContactApp().clickLoginButton();
        addNewCompany().clickLinkContAppPS();
        addNewCompany().clickIconSettings();
        addNewCompany().clickLinkNewCompany();
        addNewCompany().addCUI(textCUI);
        addNewCompany().addNrRegCom(textNrRegCom);
        addNewCompany().addCompanyName(textCompanyName);
        addNewCompany().clickFieldEntityType(textEntityType);
        addNewCompany().addDataCalendar(textData);
        addNewCompany().clickFieldCounty(textCounty);
        addNewCompany().addCity(textCity);
        addNewCompany().addAdress(textAdress);
        addNewCompany().addContactPerson(textContactPerson);
        addNewCompany().addWebSite(textWebSite);
        addNewCompany().addEmail(textEmail);
        addNewCompany().addPhone(textPhone);
        addNewCompany().clickButtonSave();
    }

    @Test(description = "Happy Test! Add new payment", priority = 2)

    @Parameters({"email","password","textCUI","textNrRegCom","textEntityType","textSupplierName","textCounty","textCity",
            "textAdress","textIban","textBank","textContactPerson","textEmail","textPhone","textWebSite","textAuthNbr",
            "textRegistrationDate","textInputNbr","textInputTotal","textExplanation"})
    public void testNewPayment(String email, String password, String textCUI,  String textNrRegCom, String textEntityType,
                               String textSupplierName, String textCounty, String textCity,String textAdress, String textIban,
                               String textBank, String textContactPerson, String textEmail,String textPhone, String textWebSite,
                               String textAuthNbr, String textRegistrationDate, String textInputNbr, String textInputTotal,
                               String textExplanation) {
        loginPageContactApp().clickAuthenticationButton();
        loginPageContactApp().addEmail(email);
        loginPageContactApp().addPassword(password);
        loginPageContactApp().clickRememberMeCheckbox();
        loginPageContactApp().clickLoginButton();
        addNewPayment().clickLinkContAppPS();
        addNewPayment().clickLinkIncomePay();
        addNewPayment().clickLinkPay();
        addNewPayment().clickButtonAddPay();
        addNewPayment().clickButtonSupplierPay();

        if(!addNewPayment().checkSupplier(textSupplierName)) {
            addNewPayment().clickFieldSupplier();
            addNewPayment().clickButtonAddSupplier();
            addNewSupplier().addCUI(textCUI);
            addNewSupplier().addNrRegCom(textNrRegCom);
            addNewSupplier().clickFieldSupllierType(textEntityType);
            addNewSupplier().addSupplierName(textSupplierName);
            addNewSupplier().addFieldCounty(textCounty);
            addNewSupplier().addCity(textCity);
            addNewSupplier().addAdress(textAdress);
            addNewSupplier().addIban(textIban);
            addNewSupplier().addBank(textBank);
            addNewSupplier().addContactPerson(textContactPerson);
            addNewSupplier().addEmail(textEmail);
            addNewSupplier().addPhone(textPhone);
            addNewSupplier().addWebSite(textWebSite);
            addNewSupplier().clickButtonAccept();
            addNewSupplier().clickButtonSave();

        }
        if(addNewActivity().getTextFieldCodCaen()==null) {
            addNewActivity().clickFieldActivityPlace();
            addNewActivity().clickButtonNewActivity();
            addNewActivity().clickFieldActivityPlace();
            addNewActivity().clickFieldCategoryIncome();
            addNewActivity().clickValueCategoryIncome();
            addNewActivity().clickFieldSourceIncome();
            addNewActivity().clickValueSourceIncome();
            addNewActivity().addAuthorisationNbr(textAuthNbr);
            addNewActivity().addRegistrationDate(textRegistrationDate);
            addNewActivity().clickButtonSave();
            addNewActivity().clickButtonClose();
        }
        addNewSupplier().clickButtonAccept();
        addNewPayment().addFieldInputNbr(textInputNbr);
        addNewPayment().addFieldInputTotal(textInputTotal);

        addNewPayment().scroll();
        addNewPayment().addExplanation(textExplanation);
        addNewPayment().scroll();
        addNewPayment().clickSavePay();
    }

}
