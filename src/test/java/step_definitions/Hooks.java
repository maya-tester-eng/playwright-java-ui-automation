package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.DriverFactory;

public class Hooks {

    @Before
    public void setupScenario() {
        DriverFactory.getPage();
    }

    @After
    public void tearDownScenario() {
        DriverFactory.closeBrowser();
    }
}