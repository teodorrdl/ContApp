package ReceiptsAndPayments;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReceiptsAndPayments extends BaseTest {
    @FindBy(xpath = "//a[normalize-space()='Autentifica-te']")
    private WebElement authenticationButton;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement emailField;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//button[normalize-space()='Autentificare']")
    private WebElement loginButton;

    @FindBy(xpath = "//a[contains(text(),'Declarația Unică')]")
    private WebElement singleStatementButton;
    @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
    private WebElement acceptCookieButton;

    @FindBy(xpath = "//a[normalize-space()='ContApp PS']")
    private WebElement contAppPSButton;
    @FindBy(xpath = "//a[normalize-space()='Încasări și plăți']")
    private WebElement incasariSiPlatiButton;
    @FindBy(xpath = "//a[normalize-space()='Jurnal de Casă/Bancă']")
    private WebElement jurnalDeCasaBancaButton;
    @FindBy(xpath = "//button[normalize-space()='Încasare']")
    private WebElement incasareButton;

    public void clickAuthenticationButton() {
        click(authenticationButton);
    }

    public void addEmail(String email) {
        addText(email, emailField);
    }

    public void addPassword(String password) {
        addText(password, passwordField);
    }

    public void clickLoginButton() {
        click(loginButton);
    }

    public void clickSingleStatementButton() {
        click(singleStatementButton);
    }

    public void clickAcceptCookie() {
        click(acceptCookieButton);
    }

    public void clickContAppPS() {
        click(contAppPSButton);
    }

    public void clickIncasariSiPlatiButton() {
        click(incasariSiPlatiButton);
    }

    public void clickJurnalDeCasaBancaButton() {
        click(jurnalDeCasaBancaButton);
    }

    public void clickIncasareButton() {
        click(incasareButton);
    }


}
