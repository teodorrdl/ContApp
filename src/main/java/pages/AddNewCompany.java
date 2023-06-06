package pages;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddNewCompany extends BaseTest {
    @FindBy(xpath = "//a[normalize-space()='ContApp PS']")
    private WebElement contAppPs;

}
