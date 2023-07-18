package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.ContAppAssetsPage;
import pages.InventoryItemsPage;

public class InventoryItemTest extends BasePage {
    public InventoryItemsPage inventoryItems() {
        return new InventoryItemsPage();
    }

    public ContAppAssetsPage assetsPage() {
        return new ContAppAssetsPage();
    }

    @Test(description = "Add New Inventory Item")
    @Parameters({"email", "password", "itemName", "itemProvider", "itemMeasurementUnit", "itemFiscalCategory", "itemQuantity",
            "itemPrice", "itemInventoryNumber", "itemDocumentNumber",
            "itemTotalPrice"})
    public void addNewInventoryItem(String email, String password, String itemName, String itemProvider, String itemMeasurementUnit,
                                    String itemFiscalCategory, String itemQuantity, String itemPrice, String itemInventoryNumber,
                                    String itemDocumentNumber, String itemTotalPrice) {

        inventoryItems().logIn(email, password);
        inventoryItems().clickContAppPS();
        assetsPage().clickButtonActive();
        inventoryItems().clickInventoryItems();
        inventoryItems().selectCompany();
        inventoryItems().clickAddInventoryItems();
        inventoryItems().addInventoryItems(itemName, itemProvider, itemMeasurementUnit, itemFiscalCategory, itemQuantity,
                itemPrice, itemInventoryNumber, itemDocumentNumber, itemTotalPrice);
        inventoryItems().switchCompany();
        inventoryItems().clickAddInventoryItems();
        inventoryItems().addItemsForSecondCompany(itemName, itemProvider, itemMeasurementUnit, itemFiscalCategory, itemQuantity,
                itemPrice, itemInventoryNumber, itemDocumentNumber, itemTotalPrice);

    }
}