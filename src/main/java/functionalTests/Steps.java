package functionalTests;

import core.DSL;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class Steps {

    DSL dsl = new DSL();

    @Given("^I open Chrome and go to \"(.*)\"$")
    public void openChromeAndLaunchApplication(String url)
    {

        dsl.goToURL(url);
    }

    @When("^I click on New User")
    public void clickNewUser(){
        dsl.clickButton("newUser");
    }

    @When("^I write First Name \"(.*)\"$")
    public void writeFirstName(String firstName){
        dsl.write("firstname", firstName);
    }

    @When("^I write Last Name \"(.*)\"$")
    public void writeLastName(String lastName){

        dsl.write("lastname", lastName);
    }

    @When("^I write User Name \"(.*)\"$")
    public void writeUserName(String userName){

        dsl.write("userName", userName);
    }

    @When("^I write Password \"(.*)\"$")
    public void writePassword(String password){

        dsl.write("password", password);
    }

    @When("^I click on Captcha")
    public void clickCaptcha(){

        dsl.clickCaptcha("div.recaptcha-checkbox-border");
    }

    @When("^I click on Register")
    public void clickRegister(){

        dsl.clickButton("register");
    }

    @When("^I click on Login")
    public void clickLogin(){
        dsl.clickButton("login");
    }

    @When("^I click on Back To Login")
    public void clickBackToLogin(){
        dsl.clickButton("gotologin");
    }

    @Then("^I validate alert text is \"(.*)\"$")
    public void validateAlert(String text)
    {
        Assert.assertEquals(text, dsl.obtainTextById("name"));
    }

    @Then("^I validate PopUp text is \"(.*)\"$")
    public void validatePopUpText(String text)
    {
        Assert.assertEquals(text, dsl.obtainTextFromPopUp());
    }


}
