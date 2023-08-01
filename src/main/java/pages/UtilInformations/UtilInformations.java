package pages.UtilInformations;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;

import static org.apache.commons.lang3.StringUtils.trim;

public class UtilInformations extends BaseTest {

    @FindBy(xpath="//a[normalize-space()='Informații utile']")
    private WebElement linkUtilInfo;

    @FindBy(xpath="//a[normalize-space()='Impozite si contributii']")
    private WebElement linkTax;

    @FindBy(xpath="//a[normalize-space()='Istoric valutar']")
    private WebElement linkCurrencyHistory;

    @FindBy(xpath="//span[@title='Curs valutar BNR']")
    private WebElement buttonCurrencyRate;

    @FindBy(xpath="//input[@class='select2-search__field']")
    private WebElement fieldCurrency;

    @FindBy(xpath="//li[@aria-selected='true']")
    private WebElement fieldCurrencyValue;

    //tr[@class='align-middle ']
    @FindBy(xpath="//tbody//tr//td//span")
    private List<WebElement> tableCurrencyValues;

    public void clickLinkUtilInfo(){
        click(linkUtilInfo);
    }
    public void clickLinkTax(){
        click(linkTax);
    }
    public void clickLinkCurrencyHistory(){
        click(linkCurrencyHistory);
    }

    public void clickButtonCurrencyRate(){
        click(buttonCurrencyRate);
    }
    public void searchCurrency(String text){
       addText(text,fieldCurrency);
       click(fieldCurrencyValue);
    }

    public boolean readCurrencyValues(String text){
       addText(text,fieldCurrency);
       click(fieldCurrencyValue);
       waitPage().until(ExpectedConditions.visibilityOf(tableCurrencyValues.get(0).findElement(By.xpath("//span[contains(text(), " + text+ ")]"))));
       List<Double> myNum = new ArrayList<>();

        for (int i = 2; i < tableCurrencyValues.size(); i+=2) {
            if(!tableCurrencyValues.get(i).getText().equals("-"))
                myNum.add(Double.parseDouble(tableCurrencyValues.get(i).getText()));
        }
        double min = myNum.get(0);
        for (int i = 0; i < myNum.size()-1; i++){
            if(min > myNum.get(i+1) )
                min=myNum.get(i+1);
        }
        return min!=0?true:false;
    }
}
