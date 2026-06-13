package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.LoginPage;

public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();

    // @login @TC_001
    // Scenario: Verify user can login with valid credentials

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
    // Scenario: Verify password length validation

    // @login @TC_003
    // Scenario: Verify empty username/password validation

    //THE PERFECT EXAMPLE OF CODE REUSABILITY
    // three scenario, with the same steps to verify but different input
    // since steps are repeating, ONLY one step_defs code we need )))))

}
