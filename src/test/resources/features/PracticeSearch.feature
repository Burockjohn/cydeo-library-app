Feature: practicing search functionality

  @burakcan
  Scenario: search functionality verification
    Given user is on the main page of "expandtesting.url"
    When user enters "dynamic" into search box
    Then user should see 7 as a number of elements
    When user refresh the page
    And user enters "drop" into search box
    Then user should see 3 as a number of elements

