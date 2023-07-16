package pages.Income;

import base.BaseTest;
import base.PageLinksAndText;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class IncomePage extends BaseTest {

    @FindBy(xpath = "//a[normalize-space()='Venituri']")
    private WebElement incomeLink;

    @FindBy(xpath = "//a[normalize-space()='Facturi vanzari']")
    private WebElement salesInvoicesLink;

    @FindBy(xpath = "//a[normalize-space()='e-facturi']")
    private WebElement eInvoicesLink;

    @FindBy(xpath = "//a[normalize-space()='Articole venituri']")
    private WebElement incomeArticlesLink;

    @FindBy(xpath = "//a[contains(text(),'Clienți')]")
    private WebElement clientsLink;

    public void clickIncomeLink(){
        click(incomeLink);
        Assert.assertEquals(driver.getCurrentUrl(), PageLinksAndText.incomePageLink.getValue());
    }

    public void clickSalesInvoicesLink(){
        click(salesInvoicesLink);
        Assert.assertEquals(driver.getCurrentUrl(), PageLinksAndText.salesInvoicesLink.getValue());
    }

    public void clickEInvoicesLink(){
        click(eInvoicesLink);
        Assert.assertEquals(driver.getCurrentUrl(), PageLinksAndText.eInvoicesLink.getValue());
    }

    public void clickIncomeArticlesLink(){
        click(incomeArticlesLink);
        Assert.assertEquals(driver.getCurrentUrl(), PageLinksAndText.incomeArticlesLink.getValue());
    }

    public void clickClientsLink(){
        click(clientsLink);
        Assert.assertEquals(driver.getCurrentUrl(), PageLinksAndText.clientsLink.getValue());
    }

}
