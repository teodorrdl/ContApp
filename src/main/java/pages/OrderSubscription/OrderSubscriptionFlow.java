package pages.OrderSubscription;

import base.BaseTest;
import base.PageLinksAndText;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class OrderSubscriptionFlow extends BaseTest {
    @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
    private WebElement buttonTrustClose;
    @FindBy(xpath = "//a[contains(text(),'Comandă Abonament')]")
    private WebElement linkOrderSubscription;

    @FindBy(xpath = "//div[@class='product-list-container']")
    private List<WebElement> productListContainer;

    @FindBy(xpath = "//span[@class='select2-selection__rendered']")
    private WebElement fieldText;
    @FindBy(xpath = "//input[@class='select2-search__field']")
    private WebElement fieldInputText;

    @FindBy(xpath = "//span[@class='select2-results']//ul[1]//li[2]")
    private WebElement fieldSelectedText;

    @FindBy(xpath = "//button[@class='btn btn-primary w-100 mt-2']")
    private WebElement buttonToBelling;

    @FindBy(xpath = "//button[@class='btn btn-primary w-100']")
    private WebElement buttonOrder;

    @FindBy(xpath = "//button[normalize-space()='Vezi toate...']")
    private WebElement buttonAllOrder;

    @FindBy(xpath = "//div[@class='justify-content-start modal-footer']//a[@class='btn btn-primary btn-sm']")
    private WebElement buttonToCart;

    @FindBy(xpath = "//input[@id='payment-bt_op']")
    private WebElement radioButtonBT;

    @FindBy(xpath = "//input[@id='input-tnc']")
    private WebElement buttonAcceptTnc;

    @FindBy(xpath = "//button[@class='w-100 btn btn-primary']")
    private WebElement buttonPlaceOrder;

    @FindBy(xpath = "//div[@class='card-body']//h4")
    private WebElement textThanks;
    @FindBy(xpath = "//div[@class='card-body']//p//a")
    private WebElement textOrderNbr;

    public void clickLinkOrderSubscription() {
        click(linkOrderSubscription);
    }

    public void clickButtonOrder() {
        click(buttonOrder);

    }

    public void clickOrder(String text) {
        Actions act = new Actions(driver_local);
        WebElement elem = null;
        for (int i = 0; i < productListContainer.size(); i++) {
            if (productListContainer.get(i).getText().contains(text)) {
                elem = productListContainer.get(i);
                break;
            }
        }
        act.doubleClick(elem).perform();
    }


    public void clickButtonTrustClose() {
        click(buttonTrustClose);
    }

    public void verifEnableButtonTrustClose() {
        driver_local.switchTo().defaultContent();
        clickButtonTrustClose();
    }

    public void clickButtonToCart() {
        click(buttonToCart);
    }

    public void addTextField(String text) {
        click(fieldText);
        addText(text, fieldInputText);
        click(fieldSelectedText);
    }

    public void clickButtonBilling() {
        click(buttonToBelling);
    }

    public void clickRadioButtonBT() {
        click(radioButtonBT);
    }

    public void clickButtonAcceptTnc() {
        click(buttonAcceptTnc);
    }

    public void clickButtonPlaceOrder() {
        click(buttonPlaceOrder);
    }

    public void verifyOrder() {
        Assert.assertEquals(findElement(textThanks).getText(), PageLinksAndText.messageThanksCart.getValue());
    }
}
