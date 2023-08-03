package pages.SettingCompany;

import base.BaseTest;
import base.PageLinksAndText;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class RepresentativesPage extends BaseTest {

    @FindBy(xpath = "//a[normalize-space()='Reprezentanți']")
    private WebElement representativesLink;

    @FindBy(xpath = "//button[normalize-space()='Adaugă']")
    private WebElement addBtn;

    @FindBy(xpath = "//input[@id='representative-form-input-firstName-']")
    private WebElement firstNameInput;

    @FindBy(xpath = "//input[@id='representative-form-input-lastName-']")
    private WebElement lastNameInput;

    @FindBy(xpath = "//input[@id='representative-form-input-identifier-']")
    private WebElement identifierInput;

    @FindBy(xpath = "//input[@id='input-isAssociate']")
    private WebElement associateCheckbox;

    @FindBy(xpath = "//input[@id='input-isFiscal']")
    private WebElement representativeFiscalCheckbox;

    @FindBy(xpath = "//input[@id='input-isLegal']")
    private WebElement representativeLegalCheckbox;

    @FindBy(xpath = "//input[@id='representative-form-input-associationPercentage-']")
    private WebElement associationPercentageInput;

    @FindBy(xpath = "//button[contains(text(),'Salvează')]")
    private WebElement saveBtn;

    @FindBy(xpath = "(//button[contains(text(),'Închide')])[1]")
    private WebElement closeBtn;

    @FindBy(xpath = "//tbody")
    private List<WebElement> representativesTable;

    public void clickRepresentativesLink() {
        click(representativesLink);
        Assert.assertEquals(driver.getCurrentUrl(),(PageLinksAndText.representativesLink.getValue()));
    }

    public void addNewRepresentative(String lastName, String firstName, String identifier, String associationPercentage) {
        click(addBtn);
        addText(lastName, lastNameInput);
        addText(firstName, firstNameInput);
        addText(identifier, identifierInput);
        clickCheckbox(associateCheckbox, associationPercentage);
        click(saveBtn);
    }

    public void clickCheckbox(WebElement element, String percentage) {
        click(element);
        if (element.equals(associateCheckbox)) {
            addText(percentage, associationPercentageInput);
        }
    }

    public void checkIfRepresentativeIsAdded(String lastName, String firstName, String identifier, String percentage) {
        for (int i = 1; i < representativesTable.size();) {
            Assert.assertTrue(representativesTable.get(i).getText().contains(lastName)
                    && representativesTable.get(i).getText().contains(firstName)
                    && representativesTable.get(i).getText().contains(identifier)
                    && representativesTable.get(i).getText().contains(percentage));
                break;
            }
    }
}
