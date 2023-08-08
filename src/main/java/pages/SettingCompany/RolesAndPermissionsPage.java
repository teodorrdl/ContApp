package pages.SettingCompany;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class RolesAndPermissionsPage extends BaseTest {

    @FindBy(xpath = "//a[normalize-space()='Roluri & Permisiuni']")
    private WebElement rolesAndPermissionsLink;

    @FindBy(xpath = "(//button[normalize-space()='Deschide'])[1]")
    private WebElement openAdminRoleBtn;

    @FindBy(xpath = "(//button[normalize-space()='Salvează'])[1]")
    private WebElement saveAdminRoleBtn;

    @FindBy(xpath = "(//button[normalize-space()='Deschide'])[2]")
    private WebElement openAccountantRoleBtn;

    @FindBy(xpath = "(//input[@type='checkbox'])[5]")
    private WebElement selectViewAccountingCheckboxes;

    @FindBy(xpath = "(//input[@type='checkbox'])[6]")
    private WebElement selectUploadAccountingCheckboxes;

    @FindBy(xpath = "(//input[@type='checkbox'])[7]")
    private WebElement selectDeleteAccountingCheckboxes;

    @FindBy(xpath = "(//button[normalize-space()='Salvează'])[2]")
    private WebElement saveAccountantRoleBtn;

    @FindBy(xpath = "(//button[normalize-space()='Deschide'])[3]")
    private WebElement openVisitorRoleBtn;

    @FindBy(xpath = "(//input[@type='checkbox'])[8]")
    private WebElement selectViewVisitorCheckboxes;

    @FindBy(xpath = "(//input[@type='checkbox'])[9]")
    private WebElement selectUploadVisitorCheckboxes;

    @FindBy(xpath = "(//input[@type='checkbox'])[10]")
    private WebElement selectDeleteVisitorCheckboxes;

    @FindBy(xpath = "(//button[normalize-space()='Salvează'])[3]")
    private WebElement saveVisitorRoleBtn;

    public void clickRolesAndPermissionsLink() {
        click(rolesAndPermissionsLink);
    }

    public void selectPermissions(WebElement ...elements) {
        for (WebElement el : elements) {
            if (!el.isSelected()) {
                action(el);
            } else {
                action(el);
            }
        }
    }

    public void clickOpenAdminRole() {
        click(openAdminRoleBtn);
        click(saveAdminRoleBtn);
    }

    public void clickOpenAccountantRole() {
        click(openAccountantRoleBtn);
        selectPermissions(selectViewAccountingCheckboxes, selectUploadAccountingCheckboxes, selectDeleteAccountingCheckboxes);
        click(saveAccountantRoleBtn);
    }

    public void clickOpenVisitorRole() {
        click(openVisitorRoleBtn);
        selectPermissions(selectViewVisitorCheckboxes, selectUploadVisitorCheckboxes, selectDeleteVisitorCheckboxes);
        click(saveVisitorRoleBtn);
    }

}
