Feature: testing alert functions

  @alert
  Scenario: verify that user will be able to see true text contents when he/she interacts with the alert buttons
    Given user is on the main page of "alert.page.url"

    When user clicks "JS Alert" button
    And user switches to popup
    And user "accepts" the alert
    Then user should see the text contains "OK"

    When user clicks "Js Confirm" button
    And user switches to popup
    And user "accepts" the alert
    Then user should see the text contains "Ok"

    When user clicks "Js Confirm" button
    And user switches to popup
    And user "dismiss" the alert
    Then user should see the text contains "Cancel"

    When user clicks "Js Prompt" button
    And user switches to popup
    And user enters own name "Burak"
    And user "accepts" the alert
    Then user check if its own name "Burak" is displayed

    When user clicks "Js Prompt" button
    And user switches to popup
    And user enters own name "Burak"
    And user "dismiss" the alert
    Then user check if its own name "Burak" is displayed

