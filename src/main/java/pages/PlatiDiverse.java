package pages;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.concurrent.Callable;

public class PlatiDiverse extends BaseTest {
    @FindBy(xpath = "//a[normalize-space()='Autentifica-te']")
    private WebElement authenticationButton;

    @FindBy(xpath = "//a[normalize-space()='Creeaza un cont!']")
    private WebElement createAccountButton;

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

    public void addText(WebElement emailField, String email) { }
    public void addPassword(String password) {
        addText(passwordField, password);
    }

    public void clickRememberMeCheckbox() {
        click(rememberMeCheckbox);
    }
    public void click(WebElement rememberMeCheckbox) { }
    public void clickLoginButton() {
        click(loginButton);
    }

    public void clickAuthenticationButton() {
        click(authenticationButton);
        Assert.assertEquals(driver_local.getCurrentUrl(), "https://account.contapp.ro/login");}

    public void clickCreateAccountButton() {
        click(createAccountButton);
        Assert.assertEquals(driver_local.getCurrentUrl(), "https://account.contapp.ro/register",
                "The url page  is not the expected one.");}

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


}
