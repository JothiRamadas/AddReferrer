package pageObjects;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {


public HomePage(WebDriver driver)
{
 PageFactory.initElements(driver, this);
}

   @FindBy(name= "identity")
    WebElement usernameTextFld;

    @FindBy(name="password")
    WebElement passwordTxtFld;

    @FindBy(name="submit")
    WebElement loginClk;

public void enterUserName(String usernameVal)
{
 usernameTextFld.sendKeys(usernameVal);

}

public void enterPassWord(String passWordVal)
{
 passwordTxtFld.sendKeys(passWordVal);
}


public void submit()
{
 loginClk.click();
}


}
