package stepDefinition;

import functionLibrary.CommonFunction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.ReferrerPage;

public class ReferrerSteps extends CommonFunction
{
    ReferrerPage referrerPage=new ReferrerPage(driver);
    HomePage homePage=new HomePage(driver);


    @Given("I am on home page")
    public void i_am_on_home_page()
    {
        driver.get("http://demo.dontonno.com/cms-test-v3/auth/login");
        driver.manage().window().maximize();
    }



    @When("Enter username {string}")
    public void enter_username(String string)
    {
        homePage.enterUserName(string);
        wait(20);
    }


    @When("Enter password {string}")
    public void enter_password(String string)
    {
        homePage.enterPassWord(string);
        wait(20);

        
    }
    @When("Click login")
    public void click_login()
    {

        homePage.submit();
        wait(20);
    }

    @When("Click referre")
    public void click_referre()
    {
        wait(80);
     referrerPage.referre();


    }
    @When("Click addreferrer")
    public void click_addreferrer()
    {
        wait(150);
     referrerPage.addreferrer();


    }
    @When("Enter referrername {string}")
    public void enter_referrername(String string)
    {
wait(120);

     referrerPage.referrername(string);
        //wait(80);



    }
    @When("Enter referreremailid {string}")
    public void enter_referreremailid(String string)
    {
        wait(120);
        referrerPage.referreremailid(string);
        //wait(80);

    }
    @When("Enter referrerphone {string}")
    public void enter_referrerphone(String string)
    {
        wait(120);
        referrerPage.referrerphone(string);
        //wait(80);
        //wait(80);
    }

    @When("Click addreferrer1")
    public void click_addreferrer1()
    {
        wait(150);
        referrerPage.addreferrer1();
        //wait(80);
        //wait(20);
    }

   /* @When("Click allreferrer")
    public void click_allreferrer() {

    }*/

    @Then("Admin should be able to see successful message {string}")
    public void admin_should_be_able_to_see_successful_message(String string)
    {
        
    }
    
}
