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
    @FindBy(xpath = "/html/body/div[1]/main/div[2]/div/div[2]/article/div/div/div[3]/div[1]/a")
    private WebElement readMore;
    @FindBy(xpath = "/html/body/div[1]/main/div[2]/nav/ul/li[8]/a")
    private WebElement secondPage;

    public void clickAcceptCookieButton() {
        click(acceptCookieButton);
    }

    public void clickFiscalityBlogButton() {
        click(fiscalityBlogButton);
    }

    public void clickPfaContability(int x, int y) {
        click(pfaContability);
        waitPage();
        javascriptExecutor(x, y);
        clickPreviousPage();

    }

    public void clickReadMore() {
        click(readMore);
    }

    public void clickSecondPage() {
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.HOME).perform();
        click(secondPage);

    }


}
