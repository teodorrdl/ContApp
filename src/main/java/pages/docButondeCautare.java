package pages;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class docButondeCautare extends BaseTest {
    @FindBy(xpath = "//a[@aria-label='Documentație']//img")
    private WebElement butonDocumentatie;
    @FindBy(xpath = "//section[@id='docsSearch']//input")
    private WebElement campdeCautare;
    @FindBy(xpath = "//button[contains(@aria-label,'Caută')]")//span[contains(text(),'Caută')]
    private WebElement lupadeCautere;

    @FindBy(xpath = "//ul[@class='result']")
    private List<WebElement> listaElementedoc;

    @FindBy(xpath = "//a[contains(text(),'Plăți diverse')]") //a[contains(text(),'Plăți diverse')]//div[@id='serp-dd']//ul[1]//li[1]
    private WebElement linkPlatiDiverse;

    @FindBy(xpath="//button[@data-rating='positive']//span[2]")
    private WebElement buttonSmileFace;

    @FindBy(xpath ="//span[@class='articleRatings-feedback']")
    private WebElement message;


    @FindBy(xpath ="(//p[@class='help'])[1]")
    private WebElement message2;

    public void clickButonDocumentatie(){
          click(butonDocumentatie);
      }
    public void addCampdeCautare(String text)  {
         SwitchToNextTab();
         addText(text, campdeCautare);

    }
    public void butondeCautare() {
       click(lupadeCautere);
    }
    public void clikLinkPlatiDiverse(){
        click(linkPlatiDiverse);
    }


    public void clickbuttonSmileFace(){
        //find(buttonSmileFace);
        //scrollUntilViewElement(buttonSmileFace);
        movetoElement();
        click(buttonSmileFace);
    }

    public void verifMessage(){
        //movetoElement();
        //click(buttonSmileFace);
        Assert.assertEquals(getText(message),"Mulțumim pentru părere");
    }
    public void verifMessage2(){
        movetoElement();
        Assert.assertEquals(getText(message2),"Încă ai nevoie de ajutor? Contactează-ne!");
    }
    public void afisElemente(){

        for (int i=0; i<listaElementedoc.size(); i++){
            System.out.println(listaElementedoc.get(i).getText());
        }

    }

    public Boolean verifButton(){

//      find(buttonSmileFace);


        return true;
    }

}


