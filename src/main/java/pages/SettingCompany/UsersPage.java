package pages.SettingCompany;

import base.BaseTest;
import base.PageLinksAndText;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class UsersPage extends BaseTest {

    @FindBy(xpath = "//a[normalize-space()='Utilizatori']")
    private WebElement usersLink;

    @FindBy(xpath = "//button[normalize-space()='Invită utilizator']")
    private WebElement inviteUserBtn;

    @FindBy(xpath = "//input[@id='input-email']")
    private WebElement emailInput;

    @FindBy(xpath = "(//span[@role='combobox'])[3]")
    private WebElement roleDropdown;

    @FindBy(xpath = "//input[@aria-label='Search']")
    private WebElement searchRoleInput;

    @FindBy(xpath = "//ul[@role='listbox']")
    private WebElement roleResultList;

    @FindBy(xpath = "//button[normalize-space()='Invită']")
    private WebElement inviteBtn;

    @FindBy(xpath = "(//tbody)[2]//tr")
    private List<WebElement> invitedUsersList;

    public void clickUsersLink() {
        click(usersLink);
        Assert.assertEquals(driver.getCurrentUrl(),(PageLinksAndText.usersLink.getValue()));
    }

    public void inviteUser(String email, String role) {
        click(inviteUserBtn);
        addText(email, emailInput);
        getRole(role);
        click(inviteBtn);
    }

    public void getRole(String role) {
        click(roleDropdown);
        addText(role, searchRoleInput);
        click(roleResultList);
    }

    public void isUserInvited(String email) {
        for (int i = 1; i < invitedUsersList.size();i++) {
            Assert.assertTrue(invitedUsersList.get(i).getText().contains(email));
        }
    }
}
