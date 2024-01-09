Feature: users could register with new accounts

  @RegisterVaildData
  Scenario: guest user could register with valid data successfully
    Given user go to register page
    And user select gender type
    And user enter first name
    And user enter last name
    And user select day
    And user select month
    And user select year
    And user enter email
    And user password
    And User confirm password
    And user clicks on register button
    Then success message is display