package base;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;
import utils.Utils;

import java.util.ArrayList;
import java.util.List;

public class BaseTest extends BasePage {

    protected WebDriver driver;
    Actions action;

    public BaseTest() {
        //driver pentru Webdriver ul local
        driver = BasePage.driver_local;
        PageFactory.initElements(driver, this);
        action = new Actions(driver);
    }

    public void SwitchToNextTab() {
        ArrayList<String> tab = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tab.get(1));
    }

    protected WebDriverWait waitPage() {
        return new WebDriverWait(driver, 10);
    }

    protected WebElement clickAble(WebElement locator) {
        waitPage().until(ExpectedConditions.elementToBeClickable(locator));
        return locator;
    }

    protected void addText(String inputText, WebElement locator) {
        clear(locator);
        locator.sendKeys(inputText);
    }

    protected void clear(WebElement locator) {
        click(locator);
        if (getOperationSystem().contains("Windows")) {
            locator.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        } else if (getOperationSystem().contains("Mac OS X")) {
            locator.sendKeys(Keys.chord(Keys.COMMAND, "a"));
        }
    }

    protected void click(WebElement locator) {
        clickAble(locator).click();
    }

    protected void movetoElement() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }

    protected String getPageTitle() {
        return driver.getTitle();
    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }

    protected void visit(String url) {
        driver.get(url);
    }

    /**
     * returns the text from the provided DOM locator using Selenium's getText method
     *
     * @param locator "webelement page from web app"
     * @return String representing the inner HTML of the DOM element (MW: To check it is actually inner-text
     */
    protected String getText(WebElement locator) {
        return locator.getText();
    }

    /**
     * searches for the provided text in the current page Url
     *
     * @param searchString partial text to locate within the page url
     * @throws IllegalStateException ""
     */
    protected void valCorrectPage(String searchString) {
        if (!getPageTitle().contains(searchString)) {
            throw new IllegalStateException("This is not " + searchString + " .The actual Url is: " + getUrl());
        }
    }


    protected WebElement listofElements(List<WebElement> list, String text) {
        WebElement elem = null;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getText().equalsIgnoreCase(text)) {
                elem = list.get(i);
                break;
            }
        }
        return elem;
    }

    protected WebElement listofButtons(List<WebElement> list) {
        WebElement elem = null;
        elem = list.get(Utils.randomNumber(list.size() - 1));
        return elem;
    }


    protected void uploadDoc(WebElement element, String path) {
        element.sendKeys(path);
    }

    private String getOperationSystem() {
        String operateSystem = System.getProperty("os.name");
        return operateSystem;
    }

    protected void javascriptExecutor(int x, int y) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(" + x + "," + y + ")");

    }

    protected void action(WebElement locator) {
        action.moveToElement(locator).click().perform();
    }

    public void clickWithRetries(WebElement element) {
        int retryCount = 0;
        boolean actionSuccessful = false;

        while (retryCount < 5 && !actionSuccessful) {
            try {
                action(element);
                actionSuccessful = true;
            } catch (StaleElementReferenceException e) {
                retryCount++;
            }
        }
    }
    public void scrollDown() {
        action.keyDown(Keys.CONTROL).sendKeys(Keys.END).keyUp(Keys.CONTROL).perform();
    }
    public void scrollUp() {
        action.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).keyUp(Keys.CONTROL).perform();
    }
}
