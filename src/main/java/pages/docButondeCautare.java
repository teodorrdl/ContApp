package pages;

import base.BaseTest;
import base.PageLinksAndText;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class docButondeCautare extends BaseTest {

    @FindBy(xpath = "//a[@aria-label='Documentație']//img")
    private WebElement butonDocumentatie;
    @FindBy(xpath = "//section[@id='docsSearch']//input")
    private WebElement campdeCautare;
    @FindBy(xpath = "//button[contains(@aria-label,'Caută')]")
    private WebElement lupadeCautere;

    @FindBy(xpath = "//ul[@class='result']")
    private List<WebElement> listaElementedoc;

    @FindBy(xpath = "//a[contains(text(),'Plăți furnizori')]")
    private WebElement linkPlatiFurnizori;

    @FindBy(xpath = "//button[@class='rateAction rateAction--positive']//span[@class='rating-face']//*[name()='svg']")
    private WebElement buttonSmileFace;

    @FindBy(xpath = "//span[@class='articleRatings-feedback-message']")
    private WebElement message;

    @FindBy(xpath = "(//p[@class='help'])[1]")
    private WebElement message2;

    public void clickButonDocumentatie() {
        click(butonDocumentatie);
    }

    public void addCampdeCautare(String text) {
        SwitchToNextTab();
        addText(text, campdeCautare);
    }
    public void butondeCautare() {
        click(lupadeCautere);
    }

    public void clikLinkPlatiDiverse() {
        click(linkPlatiFurnizori);
    }
    public void clickbuttonSmileFace() {
        movetoElement();
        click(buttonSmileFace);
    }

    public void verifMessage() {
        movetoElement();
        click(buttonSmileFace);
        Assert.assertEquals(getText(message), PageLinksAndText.textmessage.getValue());
    }
    public Boolean verifButton() {
        findElement(buttonSmileFace);
        return true;
    }

}






