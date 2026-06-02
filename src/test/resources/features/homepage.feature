Feature: Home page
  @homepage @smoke @TC_001
  Scenario: Verify page title

    Given user opens the home page
    Then page title should be "BrightHelp Customer Support Center"