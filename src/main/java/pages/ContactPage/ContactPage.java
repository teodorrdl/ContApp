package pages.ContactPage;

import base.BaseTest;
import base.PageLinksAndText;
import net.bytebuddy.implementation.bytecode.Throw;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.io.IOException;

public class ContactPage extends BaseTest {
    @FindBy(xpath = "//a[@aria-label='Documentație']//img")
    private WebElement butonDocumentatie;

    @FindBy(xpath="//li[@id='contact']//a[@class='contactUs'][normalize-space()='Contact']")
    private WebElement butonContact;
    @FindBy(xpath="//iframe[@title='Help Scout Beacon - Live Chat, Contact Form, and Knowledge Base']")
    private WebElement iframeLocator;

    @FindBy(xpath="//div[@data-cy='Heading'][normalize-space()='E-mail']")
    private WebElement buttonEmailChoice;
    @FindBy(xpath="//input[@id='Input1']")
    private WebElement fieldInputName;
    @FindBy(xpath="//input[@id='Input2']")
    private WebElement fieldInputEmail;
    @FindBy(xpath="//textarea[@id='Input3']")
    private WebElement fieldInputMessage;

    @FindBy(xpath="//button[@aria-label='Emoji Picker']")
    private WebElement buttonEmojiPicker;

    @FindBy(xpath ="//span[@value='Heart']")
    private WebElement valueEmojiHeart;

    @FindBy(xpath="//span[@value='Slightly Smiling Face']")
    private WebElement valueEmojiSmilingFace;

    @FindBy(xpath = "//span[@class='c-Truncate__content']")
    private WebElement buttonSendMessage;

    @FindBy(xpath="//button[@aria-label='Attach a file']")
    private WebElement buttonUploadFile;


    @FindBy(xpath="//div[@class='Headingstyles__HeadingUI-sc-1nt5of-0 dJzAnd c-Heading is-h3']")
    private WebElement finalMessage;
    public void clickButonDocumentatie() {
        click(butonDocumentatie);
    }

    public void clickButtonContact(){
        SwitchToNextTab();
        click(butonContact);
    }
    public void verifyEnableFrame() {
        try {
            waitPage().until(ExpectedConditions.visibilityOf(iframeLocator));
            driver.switchTo().frame(iframeLocator);
        } catch (Exception e) {
            throw new NoSuchFrameException("No frame available!");
        }
    }


    public void inputName(String name){
        addText(name,fieldInputName);
    }
    public void inputEmail(String email){
        addText(email,fieldInputEmail);
    }
    public void inputMessage(String myText) throws IOException {
        try {
            waitPage().until(ExpectedConditions.visibilityOf(fieldInputMessage));
            click(fieldInputMessage);
            addText(myText.replace("\\u000a", Keys.chord(Keys.SHIFT, Keys.ENTER)),fieldInputMessage);
            click(buttonEmojiPicker);
            click(valueEmojiHeart);
            click(buttonEmojiPicker);
            click(valueEmojiSmilingFace);
            addText(PageLinksAndText.filePath.getValue(), buttonUploadFile);
        }
        catch(Exception e) {
            throw new IOException();
        }
    }

    public void clickButtonSendMassage(){
        click(buttonSendMessage);
    }

    public void clickEmailChoice() throws IOException {
        try {
            waitPage().until(ExpectedConditions.visibilityOf(iframeLocator));
            driver.switchTo().frame(iframeLocator);
            click(buttonEmailChoice);
        } catch (Exception e) {
            throw new IOException();
        }
    }
    public void clickEmailChoice2() throws IOException {
        try {
            click(buttonEmailChoice);
        } catch (Exception e) {
            throw new IOException();
        }
    }
    public void verifyFinalMessage(){
        waitPage().until(ExpectedConditions.visibilityOf(finalMessage));
        Assert.assertEquals(getText(finalMessage),PageLinksAndText.finalMessageContact.getValue());
    }

}
