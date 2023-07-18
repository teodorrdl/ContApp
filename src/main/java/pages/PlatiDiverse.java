package pages;

import base.BaseTest;
import base.PageLinksAndText;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.concurrent.TimeUnit;
public class PlatiDiverse extends BaseTest {
    @FindBy(xpath = "//a[normalize-space()='Autentifica-te']")
    private WebElement authenticationButtonLink;

    @FindBy(xpath = "//a[normalize-space()='Creeaza un cont!']")
    private WebElement createAccountButtonLink;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement emailField;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordField;

    @FindBy(id = "remember-me")
    private WebElement rememberMeCheckbox;

    @FindBy(xpath = "//button[normalize-space()='Autentificare']")
    private WebElement loginButton;
    @FindBy(xpath = "//a[normalize-space()='ContApp PS']")
    private WebElement contAppPs;
    @FindBy(xpath = "//h3[@class='header-title']")
    private WebElement configurare;
    @FindBy(xpath = "//a[@class='btn btn-link btn-toggle align-items-center collapsed active']")
    private WebElement incasariSiPlati;
    @FindBy(xpath = "//a[@target='_self'][contains(text(),'Jurnal de Casă/Bancă')]")
    private WebElement jurnalDeCasa;
    @FindBy(xpath = "//button[@onclick=\"showModal('add-expense-transaction')\"]")
    private WebElement adaugaPlata;
    @FindBy(id = "add-expense-transaction-label")
    private WebElement adaugaPlatiDiverse;

    @FindBy(xpath = "add-expense-transaction-label")
    private WebElement bancaPrincipala;
    @FindBy(xpath = "//input[@aria-label='Search']")
    private WebElement loculActivitatii;
    @FindBy(xpath = "//*[@id=\"add-expense-transaction\"]/div/div/div[2]/div/div[3]/div/div/div/div[1]/div[1]/div/label")
    private WebElement document;
    @FindBy(xpath = "//*[@id=\"add-expense-transaction\"]/div/div/div[2]/div/div[3]/div/div/div/div[1]/div[1]/div/div")
    private WebElement numarDocument;
    @FindBy(xpath = "//*[@id=\"add-expense-transaction\"]/div/div/div[2]/div/div[3]/div/div/div/div[1]/div[3]")
    private WebElement dataDocument;
    @FindBy(xpath = "//*[@id=\"add-expense-transaction\"]/div/div/div[2]/div/div[3]/div/div/div/div[1]/div[4]")
    private WebElement platitInLei;
    @FindBy(xpath = "//*[@id=\"add-expense-transaction\"]/div/div/div[2]/div/div[3]/div/div/div/div[2]/div[1]")
    private WebElement tipArticol;
    @FindBy(xpath = "//*[@id=\"add-expense-transaction\"]/div/div/div[2]/div/div[3]/div/div/div/div[2]/div[2]")
    private WebElement explicatie;
    @FindBy(xpath = "//*[@id=\"add-expense-transaction\"]/div/div/div[2]/div/div[3]/div/div/div/div[2]/div[3]/div")
    private WebElement categorieFiscala;
    @FindBy(xpath = "//*[@id=\"add-expense-transaction\"]/div/div/div[3]/div")
    private WebElement adaugaPlataNoua;
    @FindBy(xpath = "//*[@id=\"add-expense-transaction\"]/div/div/div[3]/button")
    private WebElement inchide;
    @FindBy(xpath = "//*[@id=\"add-expense-transaction\"]/div/div/div[2]/div/div[1]/div/div/div/div[1]/button[1]")
    private WebElement platiFurnizori;
    @FindBy(xpath = "#add-expense-transaction > div > div > div.modal-body > div > div:nth-child(1) > div > div > div > div.row > div:nth-child(1)")
    private WebElement furnizor;
    @FindBy(xpath = "#add-customer-for-transactions-expense-1--label")
    private WebElement adaugaFurnizor ;
    @FindBy(xpath = "//*[@id=\"add-customer-for-transactions-expense-1-\"]/div/div/div[2]/div/div/div[2]/div[1]/div/div/div/div[1]/div[1]")
    private WebElement cautaCif ;
    @FindBy(xpath = "//*[@id=\"add-customer-for-transactions-expense-1-\"]/div/div/div[2]/div/div/div[2]/div[1]/div/div/div/div[1]/div[2]")
    private WebElement numarDeLaRegitruComertului;
    @FindBy(xpath = "//*[@id=\"add-customer-for-transactions-expense-1-\"]/div/div/div[2]/div/div/div[2]/div[1]/div/div/div/div[1]/div[3]")
    private WebElement tipEntitate;
    @FindBy(xpath = "//*[@id=\"add-customer-for-transactions-expense-1-\"]/div/div/div[2]/div/div/div[2]/div[1]/div/div/div/div[2]/div")
    private WebElement nume;
    @FindBy(xpath = "//*[@id=\"add-customer-for-transactions-expense-1-\"]/div/div/div[2]/div/div/div[3]/div[1]/div/div/div/div[1]/div[1]")
    private WebElement tara;

    @FindBy(xpath = "//*[@id=\"add-customer-for-transactions-expense-1-\"]/div/div/div[2]/div/div/div[3]/div[1]/div/div/div/div[1]/div[2]")
    private WebElement judet;
    @FindBy(xpath = "//*[@id=\"add-customer-for-transactions-expense-1-\"]/div/div/div[2]/div/div/div[3]/div[1]/div/div/div/div[2]/div")
    private WebElement localitate ;
    @FindBy(xpath = "//*[@id=\"add-customer-for-transactions-expense-1-\"]/div/div/div[2]/div/div/div[3]/div[1]/div/div/div/div[3]/div")
    private WebElement  adresa;
    @FindBy(xpath = "//*[@id=\"add-customer-for-transactions-expense-1-\"]/div/div/div[2]/div/div/div[2]/div[2]/div/div/div/div[1]")
    private WebElement iban;
    @FindBy(xpath = "//*[@id=\"add-customer-for-transactions-expense-1-\"]/div/div/div[2]/div/div/div[2]/div[2]/div/div/div/div[2]")
    private WebElement numeBanca;
    @FindBy(xpath = "//*[@id=\"add-customer-for-transactions-expense-1-\"]/div/div/div[2]/div/div/div[3]/div[2]/div/div/div/div[1]")
    private WebElement persoanaDeContact ;
    @FindBy(xpath = "//*[@id=\"add-customer-for-transactions-expense-1-\"]/div/div/div[2]/div/div/div[3]/div[2]/div/div/div/div[2]")
    private WebElement emailPersoanaDeContact;
    @FindBy(xpath = "//*[@id=\"add-customer-for-transactions-expense-1-\"]/div/div/div[2]/div/div/div[3]/div[2]/div/div/div/div[3]")
    private WebElement telefon;
    @FindBy(xpath = "//*[@id=\"add-customer-for-transactions-expense-1-\"]/div/div")
    private WebElement salveaza;
    @FindBy(xpath = "#add-customer-for-transactions-expense-1- > div > div > div.justify-content-start.modal-footer > button.btn.btn-light.btn-sm")
    private WebElement inchideFereastra;
    public void addText(WebElement emailField, String email) { }
    public void addPassword(String password) {
        addText(passwordField, password);
    }

    public void clickRememberMeCheckbox() {
        click(rememberMeCheckbox);
    }

    public void clickLoginButton() {
        click(loginButton);
    }


    private void clickCreateAccountButtonLink(String s){clickCreateAccountButtonLink(PageLinksAndText.clickCreateAccountButtonLink.getValue()); }


    private void clickAuthenticationButtonLink(String s) { clickAuthenticationButtonLink(PageLinksAndText.clickAuthenticationButtonLink.getValue());
    }

    public void clickContAppPs() {
        click(contAppPs);
    }
    public void clickIncasariSiPlati() {click(incasariSiPlati);}
    public void clickJurnalDeCasa() {click(jurnalDeCasa);}
    public void clickAdaugaPlata() {click(adaugaPlata);}
    public void clickAdaugaPlatiDiverse() {click(adaugaPlatiDiverse);}
    public void clickaddBancaPrincipala() {click(bancaPrincipala);}
    public void clickaddLoculActivitatii() {click(loculActivitatii);}
    public void clickaddDocument() {click(document);}
    public void clickaddNumarDocument() {click(numarDocument);}
    public void clickaddDataDocument() {click(dataDocument);}
    public void clickplatitInLei() {click(platitInLei);}
    public void clickaddTipArticol() {click(tipArticol);}
    public void clickaddExplicatie() {click(explicatie);}
    public void clickaddCategorieFiscala() {click(categorieFiscala);}
    public void clickadaugaPlataNoua() {click(adaugaPlataNoua);}
    public void clickinchide() {click(inchide);}

    public void clickPlatiFurnizori(){click(platiFurnizori);}
    public void clickfurnizor(){click(furnizor);}
    public void clickAdaugaFurnizor(){click(adaugaFurnizor);}
    public void clickCautaCif(){click(cautaCif);}
    public void clickNumarDeLaRegistruComertului(){click(numarDeLaRegitruComertului);}
    public void clickTipEntitate(){click(tipEntitate);}
    public void clickaddNume(){click(nume);}
    public void clickaddTara(){click(tara);}
    public void clickaddJudet(){click(judet);}
    public void clickaddLocalitate(){click(localitate);}
    public void clickaddAdresa(){click(adresa);}
    public void clickaddIban(){click(iban);}
    public void clickaddNumeBanca(){click(numeBanca);}
    public void clickaddPersoanaDeContact(){click(persoanaDeContact);}
    public void clickaddEmailPersoanaDeContact(){click(emailPersoanaDeContact);}
    public void clickaddTelefon(){click(telefon);}
    public void clickSalveaza(){click(salveaza);}
    public void clickInchideFerestra(){click(inchideFereastra);}
}
