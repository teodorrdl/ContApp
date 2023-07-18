package pages;

import base.BaseTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class FiscalityBlog extends BaseTest {
    @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
    private WebElement acceptCookieButton;
    @FindBy(xpath = "(//a[normalize-space()='Blog fiscal'])[1]")
    private WebElement fiscalityBlogButton;
    @FindBy(xpath = "//img[@alt='Contabilitate PFA. Reguli privind documentele și registrele contabile']")
    private WebElement pfaContability;
    @FindBy(xpath = "//a[@title='Impozitarea veniturilor din chirii în sistem real. Avantaje și dezavantaje.'][normalize-space()='Citeste mai mult...']")
    private WebElement readMore;
    @FindBy(xpath = "(//a[normalize-space()='2'])[1]")
    private WebElement secondPage;
    @FindBy(xpath = "//img[@alt='Norme de venit agricole 2023']")
    private WebElement agricolNorme;
    @FindBy(xpath = "//a[normalize-space()='Norme de venit 2023']")
    private WebElement normeDeVenit;
    @FindBy(xpath = "//a[normalize-space()='ContApp preia ștafeta de la Ghid PFA']")
    private WebElement ghidPFA;
    @FindBy(xpath = "//a[normalize-space()='Next »']")
    private WebElement nextPage;
    @FindBy(xpath = "//a[normalize-space()='Operațiuni intracomunitare pentru PFA, II și Profesii Liberale']")
    private WebElement pfaOperation;
    @FindBy(xpath = "(//input[@id='form-field-email_subscribe'])[1]")
    private WebElement nameSubscribeSection;
    @FindBy(xpath = "/html/body/div[1]/main/div[2]/div/div[2]/div/div/div/section/div/div[2]/div/div[4]/div/form/div/div[2]/input")
    private WebElement emailSubscribeSection;
    @FindBy(xpath = "//input[@class='elementor-field elementor-size-md  elementor-acceptance-field']")
    private WebElement termsAndConditions;
    @FindBy(xpath = "//span[@class='elementor-button-text'][contains(text(),'Abonează-te')]")
    private WebElement subscribeButton;
    @FindBy(xpath = "//a[normalize-space()='« Prev']")
    private WebElement prevPage;

    public void clickAcceptCookieButton() {
        click(acceptCookieButton);
    }

    public void clickFiscalityBlogButton() {
        click(fiscalityBlogButton);
    }

    public void clickPfaContability() {
        click(pfaContability);
        clickPreviousPage();

    }

    public void clickReadMore() {
        clickWithRetries(readMore);
    }

    public void clickSecondPage() {
        scrollDown();
        click(secondPage);

    }

    public void clickNormeAgricole() {
        click(agricolNorme);
        clickPreviousPage();
    }

    public void clickNormeDeVenit(int x, int y) {
        javascriptExecutor(x, y);
        clickWithRetries(normeDeVenit);
        scrollDown();
        clickPreviousPage();

    }

    public void clickGhidPFA(int x, int y) {
        javascriptExecutor(x, y);
        clickWithRetries(ghidPFA);
        scrollDown();
        clickPreviousPage();

    }

    public void clickNextPage() {
        scrollDown();
        clickWithRetries(nextPage);
    }

    public void clickPfaOperation() {
        clickWithRetries(pfaOperation);
        clickPreviousPage();
    }

    public void clickPrevPage() {
        scrollDown();
        clickWithRetries(prevPage);
    }
    public void clickNormeAgricolePrevPage() {
        click(agricolNorme);
    }

    public void addNameSubscribeSection(String nameSubscribeSection) {
        scrollDown();
        addText(nameSubscribeSection, this.nameSubscribeSection);
    }

    public void addEmailSubscribeSection(String emailSubscribeSection) {
        addText(emailSubscribeSection, this.emailSubscribeSection);
    }

    public void clickTermsAndConditios() {
        click(termsAndConditions);
    }

    public void clickSubscribeSection() {
        click(subscribeButton);
    }

}
