package pages;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPageContactApp extends BaseTest {

    @FindBy(xpath = "//a[normalize-space()='Autentifica-te']")
    private WebElement authenticationButton;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement emailField;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordField;

    @FindBy(id = "remember-me")
    private WebElement rememberMeCheckbox;

    @FindBy(xpath = "//button[normalize-space()='Autentificare']")
    private WebElement loginButton;

    @FindBy(xpath = "//label[@for='email']")
    private WebElement emailAlertMessage;

    @FindBy(xpath = "//label[@for='password']")
    private WebElement passwordAlertMessage;

    @FindBy(xpath = "//a[normalize-space()='Ai uitat parola?']")
    public WebElement forgotPasswordLink;

    public String [] expectedAlertMessages = {"Datele de autentificare introduse nu se potrivesc cu baza de date.",
            "Campul \"E-mail\" este obligatoriu.",
            "Campul \"Parola\" este obligatoriu."
    };

    public void addEmail(String email) {
        addText(email, emailField);
    }

    public void addPassword(String password) {
        addText(password, passwordField);
    }

    public void clickRememberMeCheckbox() {
        click(rememberMeCheckbox);
    }
    public void clickLoginButton() {
        click(loginButton);
    }

    public void clickAuthenticationButton() {
        click(authenticationButton);
        Assert.assertEquals(driver.getCurrentUrl(), "https://account.contapp.ro/login");
    }



    public void verifyAlertMessages() {
        if (emailAlertMessage.getText().equals(expectedAlertMessages[1]) && passwordAlertMessage.getText().equals(expectedAlertMessages[2])) {
            System.out.println(emailAlertMessage.getText());
            System.out.println(passwordAlertMessage.getText());
        } else if (emailAlertMessage.getText().equals(expectedAlertMessages[1])) {
            System.out.println(emailAlertMessage.getText());
        } else if (passwordAlertMessage.getText().equals(expectedAlertMessages[2])) {
            System.out.println(passwordAlertMessage.getText());
        } else {
            System.out.println("The alert messages are not the expected ones.");
        }
    }
}