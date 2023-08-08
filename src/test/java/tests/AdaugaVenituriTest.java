package tests;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.AdaugaVenituri;
import pages.BasePage;
import pages.LoginPageContactApp;


public class AdaugaVenituriTest extends BasePage {


    public LoginPageContactApp loginPage() {
        return new LoginPageContactApp();
    }

    public AdaugaVenituri page() {
        return new AdaugaVenituri();
    }


    @Test(description = "adauga venituri")
    @Parameters({"email","addEmail" ,"password","closeCookieButton","contAppPs", "configurare", "venituri",
            "articoleVenituri","adaugaArticolNou",
            "denumireArticol", "valuta", "pretVanzare", "tipArticol", "categorieFiscala", "unitateDeMasura",
            "salveaza"})

    public void AdaugaVenituri(String textemail, String textPassword,String closeCookieButton ,String ContAppPs, String configurare, String venituri,
                               String articoleVenituri,String addEmail,
                               String adaugaArticolNou, String denumireArticol, String valuta, String pretVanzare, String tipArticol,
                               String categorieFiscala, String unitateDeMasura, String salveaza) {


        loginPage().clickAuthenticationButton();

        loginPage().clickCloseCookie();
        loginPage().addEmail(textemail);
        loginPage().addPassword(textPassword);

        loginPage().clickRememberMeCheckbox();
        loginPage().clickLoginButton();

        page().clickContAppPs();
        page().clickVenituri();
        page().clickArticoleVenituri();
        page().clickAdaugaArticolNou();
        page().addDenumireArticol();
        page().clickValuta();
        page().clickPretVanzare();
        page().clickTipArticol();
        page().clickCategorieFiscala();
        page().clickUnitateDeMasura();
        page().clickSalveaza();


    }

}
