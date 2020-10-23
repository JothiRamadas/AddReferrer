package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReferrerPage {


    public ReferrerPage(WebDriver driver)
    {

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[1]/div[4]/div[1]/ul/li[8]/a")
////*[@id="app"]/div[1]/div[2]/div[1]/div[4]/div[1]/ul/li[8]/a
    WebElement referrerClk;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[1]/div[4]/div[1]/ul/li[8]/ul/li[2]/a")
    WebElement addreferrerClk;
    // //*[@id="app"]/div[1]/div[2]/div[1]/div[4]/div[1]/ul/li[8]/ul/li[2]/a

    @FindBy(id="name")
    WebElement refnameTxt;

    @FindBy(name = "email")
    WebElement refemailTxt;

    @FindBy(name = "mobile")
    WebElement refpassTxt;

    @FindBy(name = "submit")
    WebElement refaddreferreClk;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[1]/div[4]/div[1]/ul/li[8]/ul/li[1]/a")
    WebElement allreferrerClk;

    public void referre()
    {
        referrerClk.click();
    }

    public void addreferrer()
    {
        addreferrerClk.click();
    }

    public void referrername(String refnameVal)
    {
        refnameTxt.sendKeys(refnameVal);
    }

    public void referreremailid(String refemailVal)
    {

        refemailTxt.sendKeys(refemailVal);
    }

    public void referrerphone(String passwordVal)
    {
        refpassTxt.sendKeys(passwordVal);
    }

    public void addreferrer1()
    {
        refaddreferreClk.click();
    }
}

