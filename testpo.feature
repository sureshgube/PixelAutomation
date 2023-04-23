Feature: To Test Login functionality


  Scenario: Test the login functionality using Mobile Number
    Given user launching browser
    When user navigates to flipkart website
    Then user enters the mobile number in username field
    And user clicks in generate otp button
    And user navigates to homepage

  Scenario: Test the login functionality using email id
    Given user launching browser
    When user navigates to flipkart website
    Then user enters the mobile number in username field

  Scenario: Test the login fucntionality using username
    Given user launching browser
    When user navigates to flipkart website
    Then user enters the mobile number in username field

  Scenario: Test the login functiionalut using incorrect credendtials
    Given user launching browser
    When user navigates to flipkart website
    Then user enters the mobile number in username field