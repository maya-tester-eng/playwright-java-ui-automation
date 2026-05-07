package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.HomePage;

public class HomePageStepDefs {

    HomePage homePage = new HomePage();

    @Given("user opens the home page")
    public void user_opens_the_home_page() {
        homePage.openPage();
    }

    @Then("page title should be {string}")
    public void page_title_should_be(String expectedTitle) {
        String actualTitle = homePage.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }
}