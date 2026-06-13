Feature: Login
  @login @smoke @TC_001
  Scenario: Verify user can login with valid credentials

    Given user opens the home page
    When user enters login email "test@test.com"
    And user enters login password "Password123"
    And user clicks login button
    Then user should see login alert message "Login successful!"

  @login @negative @TC_002
  Scenario: Verify password length validation

    Given user opens the home page
    When user enters login email "test@test.com"
    And user enters login password "123"
    And user clicks login button
    Then user should see login alert message "Password must be at least 6 characters."

  @login @negative @TC_003
  Scenario: Verify empty username/password validation

    Given user opens the home page
    When user clicks login button
    Then user should see login alert message "Please enter your email and password before logging in."


