Feature: Search | users could use this steps to search for what he needs


  @SearchProcessOne
  Scenario: SearchProcessOne
    Given user open Home page
    And user enter keyword inside search bar
    And user press on search
    And check the URL
    Then loop over the results and verify each item contain the search keyword


