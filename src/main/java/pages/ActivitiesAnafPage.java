package pages;

import base.BaseTest;
import base.PageLinksAndText;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class ActivitiesAnafPage extends BaseTest {


    @FindBy(xpath = "//a[@aria-label='Documentație']//img")
    private WebElement butonDocumentatie;
    @FindBy(xpath = "//section[@id='docsSearch']//input")
    private WebElement campdeCautare;
    @FindBy(xpath = "//button[contains(@aria-label,'Caută')]")
    private WebElement lupadeCautere;
    @FindBy(xpath = "//ul[@class='result']")
    private List<WebElement> listaElementedoc;
    @FindBy(xpath = "//a[contains(text(),'Activități desfășurate')]")
    private WebElement activitatiDesfasurate;
    @FindBy(xpath = "(//span[@class='rating-face']//*[name()='svg'])[1]")
    private WebElement buttonSmileFace;
    @FindBy(xpath = "//div//span[@class= 'articleRatings-question']")
    private WebElement textMessage;

    public void clickButonDocumentatie() {
        click(butonDocumentatie);
    }
    public void clickCampdeCautare()
    {click(campdeCautare);}
    public void clickLupadeCautare() {click(lupadeCautere);
    }
    public void getSearchResult(String search) {
        SwitchToNextTab();
        addText(search, campdeCautare);
        clickLupadeCautare();
        //   click(listofElements(listaElementedoc,search));
        click(activitatiDesfasurate);
        //  Assert.assertEquals("Mulțumim pentru părere","Ți-am răspuns la întrebare");    }

    }
    public void verifMessage() {
        movetoElement();
        click(buttonSmileFace);
        Assert.assertEquals(getText(textMessage), PageLinksAndText.questionMessage.getValue());
    }
}


