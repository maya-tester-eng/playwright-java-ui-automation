Feature: Support form

  @support @smoke @TC_001
  Scenario: Submit support request with valid data
    Given user opens the home page
    When user enters support name "Maya"
    And user enters support email "maya@test.com"
    And user enters support message "I need help with my account."
    And user submits the support form
    Then user should see support alert message containing "Your message has been sent."

  @support @negative @TC_002
  Scenario: Verify required field validation
    Given user opens the home page
    When user submits the support form
    Then user should see support alert message "Please fill all fields before submitting."

  @support @regression @TC_003
  Scenario: Verify fields are cleared after successful submission

    Given user opens the home page
    When user enters support name "Maya"
    And user enters support email "maya@test.com"
    And user enters support message "I need help with my account."
    And user submits the support form
    Then support name field should be empty
    And support email field should be empty
    And support message field should be empty