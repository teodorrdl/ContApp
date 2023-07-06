package tests;


import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginPageContactApp;
import pages.PlatiDiverse;

public class PlatiDiverseTest extends BasePage {


    public LoginPageContactApp loginPage() {
        return new LoginPageContactApp();}

    public PlatiDiverse page() {
        return new PlatiDiverse();}

    @Test(description = "adauga plata")
    @Parameters({"email", "password", "contAppPs", "configurare", "incasariSiPlati", "jurnalDeCasa", "adaugaPlata", "adaugaPlatiDiverse",
            "bancaPrincipala", "loculActivitatii", "document", "numarDocument", "dataDocument", "platitInLei", "tipArticol", "explicatie",
            "categorieFiscala", "adaugaPlataNoua", "inchide"})

    public void AdaugaPlatiDiverse(String textemail, String textPassword, String ContAppPs, String configurare, String incasariSiPlati,
                                   String jurnalDeCasa, String adaugaPlata, String adaugaPlatiDiverse, String bancaPrincipala,
                                   String loculActivitatii, String document, String numarDocument, String dataDocument, String platitInLei,
                                   String tipArticol, String explicatie, String categorieFiscala, String adaugaPlataNoua, String inchide) {


        loginPage().clickAuthenticationButton();
        loginPage().addEmail(textemail);
        loginPage().addPassword(textPassword);
        loginPage().clickRememberMeCheckbox();
        loginPage().clickLoginButton();

        page().clickContAppPs();
        page().clickIncasariSiPlati();
        page().clickJurnalDeCasa();
        page().clickAdaugaPlata();
        page().clickAdaugaPlatiDiverse();
        page().clickaddBancaPrincipala();
        page().clickaddLoculActivitatii();
        page().clickaddDocument();
        page().clickaddNumarDocument();
        page().clickaddDataDocument();
        page().clickplatitInLei();
        page().clickaddTipArticol();
        page().clickaddExplicatie();
        page().clickaddCategorieFiscala();
        page().clickadaugaPlataNoua();
        page().clickinchide();

    }


    @Test(description = "adauga furnizor")
    @Parameters({"email", "password", "contAppPs", "configurare", "incasariSiPlati", "jurnalDeCasa", "adaugaPlata", "adaugaPlatiFurnizori",
            "furnizor", "adaugaFurnizor", "cautaCif", "numarDeLaRegistrulComertului", "tipEntitate", "nume", "tara", "judet",
            "localitate","adresa" ,"iban", "numeBanca","persoanaDeContact","emailPersoanaDeContact","telefon","salveaza","inchideFereastra"})

    public void AdaugaFurnizor(String textemail, String textPassword, String ContAppPs, String configurare, String incasariSiPlati,
                               String jurnalDeCasa, String adaugaPlata, String adaugaPlatiFurnizori, String furnizor,
                               String adaugaFurnizor , String cautaCif , String numarDeLaRegistrulComertului , String tipEntitate, String nume,
                               String tara, String judet, String localitate, String adresa,String IBAN,String numeBanca, String persoanaDeContact,
                               String  emailPersoanaDeContact,String telefon,String  salveaza,String inchideFereastra) {
        loginPage().clickAuthenticationButton();
        loginPage().addEmail(textemail);
        loginPage().addPassword(textPassword);
        loginPage().clickRememberMeCheckbox();
        loginPage().clickLoginButton();

        page().clickContAppPs();
        page().clickIncasariSiPlati();
        page().clickJurnalDeCasa();
        page().clickPlatiFurnizori();
        page().clickfurnizor();
        page().clickAdaugaFurnizor();
        page().clickCautaCif();
        page().clickNumarDeLaRegistruComertului();
        page().clickTipEntitate();
        page().clickaddNume();
        page().clickaddTara();
        page().clickaddJudet();
        page().clickaddLocalitate();
        page().clickaddAdresa();
        page().clickaddIban();
        page().clickaddNumeBanca();
        page().clickaddPersoanaDeContact();
        page().clickaddEmailPersoanaDeContact();
        page().clickaddTelefon();
        page().clickSalveaza();
        page().clickInchideFerestra();
    }


}