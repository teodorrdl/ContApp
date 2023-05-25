package pages;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestContext;
import org.testng.Reporter;
import org.testng.annotations.*;


public class BasePage {

    public static WebDriver driver_local; //--> rulare in mod normal pe local
    String url = "https://semicolon-task-manager-skillbrains-grxarv6yb-cezarmocanu.vercel.app/login";
    public static ExtentTest logger;
    public static ExtentReports report;
    

    /*pentru Webdriver Local - rularea pe acelasi pc
     */
    @BeforeMethod(alwaysRun=true)
    public void setup(ITestContext context) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver_local = new ChromeDriver(options);
        driver_local.manage().window().maximize();
        driver_local.get(url);
        context.setAttribute("WebDriver", driver_local);
    }


    @AfterMethod(alwaysRun=true)
    public void tearDown() {
        driver_local.quit();
    }

    public void reportLog(String message){
        Reporter.log(message);
    }

}
