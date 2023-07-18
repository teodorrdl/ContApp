package pages.OrderSubscription;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.Formatter;
import java.util.List;

import static org.apache.commons.lang3.StringUtils.trim;

public class CartPage extends BaseTest {

    @FindBy (xpath = "//i[@class='capp capp-cart']")
    private WebElement buttonCart;

    @FindBy(xpath = "//div[@class='py-2 px-3']//div[@class='col-auto']//button")
    private List<WebElement> listCartProducts;

    @FindBy(xpath="//p[@class='text-inactive small mb-0']")
    private List<WebElement> listPrice;

    @FindBy(xpath="//div[@class='cart-footer']//span[@class='text-info']")
    private WebElement priceText;

    @FindBy(xpath ="//div[@class='cart-product']//button[@class='btn btn-light btn-xs']")
    private WebElement buttonDelProduct;

    public void clickButtonCart(){
        click(buttonCart);
    }

    public void verifyCart(){
        clickButtonCart();
        if(listCartProducts.size()!=0)
            Assert.assertTrue(delCart(),"Produsele din cos au fost sterse!");
    }

    public boolean delCart(){
        WebElement elem = null;
        boolean flag = false;
        int n = listCartProducts.size();
        int i=0;
        while(listCartProducts.size() > 0 ){
            elem = listCartProducts.get(0);
            //click(elem);
            action(elem);
            flag = true;
            i++;
        }
        return flag;
    }

    public void verifyCartProducts(){
        clickButtonCart();
        WebElement elem = null;
        int n = listPrice.size();
        double total=0.00;
        for (int i = 0; i < n; i++) {
            elem = listPrice.get(i);
            String price = trim(elem.getText().split("Lei")[0]);
            String nr = trim(elem.getText().split("x")[1]);
            total += Double.parseDouble(price) * Integer.parseInt(nr);
        }
        Formatter fmt = new Formatter();
        fmt.format("%.2f", total);
        String priceText = this.priceText.getText().split("Lei")[0];
        priceText.replaceAll(" ", "");
        double priceAct = Double.parseDouble(priceText);
        Formatter fmtact = new Formatter();
        fmtact.format("%.2f", priceAct);
        Assert.assertEquals(fmtact.toString(),fmt.toString());
        fmt.close();
        fmtact.close();
    }
}
