package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.LoginPage;

public class LoginStepDefs {


   // @login @TC_001
   LoginPage loginPage = new LoginPage();

    @When("user enters login email {string}")
    public void user_enters_login_email(String email) {
        loginPage.enterLoginEmail(email);
    }

    @When("user enters login password {string}")
    public void user_enters_login_password(String password) {
        loginPage.enterLoginPassword(password);
    }

    @When("user clicks login button")
    public void user_clicks_login_button() {
        loginPage.clickLoginButton();
    }

    @Then("user should see login alert message {string}")
    public void user_should_see_login_alert_message(String expectedMessage) {
        String actualMessage = loginPage.getAlertMessage();
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    // @login @TC_002



    // @login @TC_003

}
