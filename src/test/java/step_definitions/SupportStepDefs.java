package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.SupportPage;

public class SupportStepDefs {

    SupportPage supportPage = new SupportPage();

    // @support @smoke @TC_001
    // Scenario: Submit support request with valid data

    @When("user enters support name {string}")
    public void user_enters_support_name(String name) {
        supportPage.enterName(name);
    }

    @When("user enters support email {string}")
    public void user_enters_support_email(String email) {
        supportPage.enterEmail(email);
    }

    @When("user enters support message {string}")
    public void user_enters_support_message(String message) {
        supportPage.enterMessage(message);
    }

    @When("user submits the support form")
    public void user_submits_the_support_form() {
        supportPage.submitSupportForm();
    }

    @Then("user should see support alert message containing {string}")
    public void user_should_see_support_alert_message_containing(String expectedText) {
        String actualMessage = supportPage.getAlertMessage();
        Assert.assertTrue(actualMessage.contains(expectedText));
    }

    // @support @negative @TC_002
    // Scenario: Verify required field validation


    @Then("user should see support alert message {string}")
    public void user_should_see_support_alert_message(String expectedMessage) {
        String actualMessage = supportPage.getAlertMessage();
        Assert.assertEquals(actualMessage,expectedMessage);
    }


}
