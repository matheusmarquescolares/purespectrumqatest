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
    public void clickNewUser()
    {
        dsl.clickButton("newUser");
    }

    @When("^I write First Name \"(.*)\"$")
    public void writeFirstName(String firstName)
    {
        dsl.write("firstname", firstName);
    }

    @When("^I write Last Name \"(.*)\"$")
    public void writeLastName(String lastName)
    {
        dsl.write("lastname", lastName);
    }

    @When("^I write User Name \"(.*)\"$")
    public void writeUserName(String userName)
    {
        dsl.write("userName", userName);
    }

    @When("^I write Password \"(.*)\"$")
    public void writePassword(String password)
    {
        dsl.write("password", password);
    }

    @When("^I click on Captcha")
    public void clickCaptcha()
    {
        dsl.clickButtonByCss("div.recaptcha-checkbox-border");
    }

    @When("^I click on Register")
    public void clickRegister()
    {
        dsl.clickButton("register");
    }

    @When("^I click on Login")
    public void clickLogin()
    {
        dsl.clickButton("login");
    }

    @When("^I click on Logout")
    public void clickLogout()
    {
        dsl.clickButtonByText("Logout");
    }

    @When("^I click on Delete Account")
    public void clickDeleteAccount()
    {
        dsl.clickButtonByText("Delete Account");
    }

    @When("^I Delete All Books")
    public void clickDeleteAllBooks()
    {
        dsl.clickButtonByText("Delete All Books");
    }

    @When("^I click on Add To Your Collection")
    public void clickAddToYourCollection()
    {
        dsl.clickButtonByText("Add To Your Collection");
    }

    @When("^I click on Back To Login")
    public void clickBackToLogin()
    {
        dsl.clickButton("gotologin");
    }

    @When("^I click on Go To Book Store")
    public void clickGoToBookStore()
    {
        dsl.clickButton("gotoStore");
    }

    @When("^I click on Git Pocket Book")
    public void clickGitPocketBook()
    {
        dsl.clickButton("see-book-Git Pocket Guide");
    }

    @When("^I click on Learning Javascript Book")
    public void clickLearningJavascriptBook()
    {
        dsl.clickButton("see-book-Learning JavaScript Design Patterns");
    }

    @When("^I click on You Don't Know JS Book")
    public void clickYouDontKnowJSBook()
    {
        dsl.clickButton("see-book-You Don't Know JS");
    }

    @When("^I click on Remove book")
    public void clickRemoveBook()
    {
        dsl.clickButton("delete-record-undefined");
    }

    @When("^I click on Ok to confirm")
    public void clickOkRemoveBook()
    {
        dsl.clickOkPopUp();
    }

    @Then("^I validate alert text is \"(.*)\"$")
    public void validateAlert(String text)
    {
        Assert.assertEquals(text, dsl.obtainTextById("name"));
    }

    @Then("^I validate id field has changed \"(.*)\"$")
    public void validateElement(String text)
    {
        Assert.assertNotEquals(text, dsl.obtainTextById("name"));
    }

    @Then("^I validate PopUp text is \"(.*)\"$")
    public void validatePopUpText(String text)
    {
        Assert.assertEquals(text, dsl.obtainTextFromPopUp());
    }


}
