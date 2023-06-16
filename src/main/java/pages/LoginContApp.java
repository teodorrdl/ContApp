package pages;


import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginContApp extends BaseTest {
    @FindBy(xpath = "//input[@id='email']")
    private WebElement emailAddress;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement emailPassword;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement buttonLogin;

    @FindBy(xpath = "//a[normalize-space()='CreateAccount!']")
    private WebElement createAccount;



    public void addUserName(String username) {
        addText(username, emailAddress);
    }

    public void addUserPassword(String userpassword) {
        addText(userpassword, emailPassword);
    }

    public void clickLoginButton() {
        click(buttonLogin);
    }

    public void clickCreateAccount(){
        click(createAccount);
    }
    public void createAccount(String firstName,
                              String lastName,
                              String email,
                              String password) {


        addText(email, this.emailAddress);
        addText(password, this.emailPassword);
        click(createAccount);
    }
}
