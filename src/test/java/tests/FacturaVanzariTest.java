package tests;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.FacturaVanzari;

import pages.LoginPageContactApp;

public class FacturaVanzariTest extends BasePage {
    public LoginPageContactApp loginPage() {
        return new LoginPageContactApp();
    }

    public FacturaVanzari facturaVanzari() {
        return new FacturaVanzari();
    }


    @Test(description = "adauga facturi vanzari")
    @Parameters({"email", "password", "contAppPs", "configurare", "venituri", "facturiVanzari" ,"alegeClient", "alegeTip", "serieFactura",
            "numarFactura", "tipArticol", "denumireArticol", "cantitate", "pretUnitar", "total", "adaugaArticol", "salveazaSiVezi"})

    public void adaugaFacturiVanzari(String textemail, String textPassword, String contAppPs, String configurare,
                                     String venituri, String facturiVanzari,String alegeClient, String alegeTip,
                                     String serieFactura, String numarFactura, String tipArticol, String denumireArticol,
                                     String cantitate, String pretUnitar, String total, String adaugaArticol,
                                     String salveazaSiVezi) {
        loginPage().clickAuthenticationButton();
        loginPage().addEmail(textemail);
        loginPage().addPassword(textPassword);
        loginPage().clickRememberMeCheckbox();
        loginPage().clickLoginButton();

        facturaVanzari().clickcontAppPs();
        facturaVanzari().clickconfigurare();
        facturaVanzari().clickvenituri();
        facturaVanzari().clickfacturiVanzari();

        facturaVanzari().alegeClient();
        facturaVanzari().alegeTip();
        facturaVanzari().serieFactura();
        facturaVanzari().numarFactura();
        facturaVanzari().tipArticol();
        facturaVanzari().denumireArticol();


        facturaVanzari().cantitate();
        facturaVanzari().pretUnitar();
        facturaVanzari().total();
        facturaVanzari().adaugaArticol();
        facturaVanzari().salveazaSiVezi();
    }


}
