Feature: Login | users could use login functionality to use their accounts


  @SelectCurrency
  Scenario: user could select currency from home page
    Given user open Home page
    And user select currency from home page
    Then selection process is successfully
