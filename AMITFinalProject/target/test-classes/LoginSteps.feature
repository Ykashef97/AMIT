Feature: Login | users could use login functionality to use their accounts


  @LoginWithVaildData
  Scenario: user could login with valid email and password
    Given user go to login page
    And user login with valid email
    And user login with valid password
    And user press on login button
    Then user login to the system successfully


  @LoginWithInVaildEmail
  Scenario: user could login with invalid email and password
  Given user go to login page
  And user login with invalid email
  And user login with valid password
  And user press on login button
  Then user could not login to the system




