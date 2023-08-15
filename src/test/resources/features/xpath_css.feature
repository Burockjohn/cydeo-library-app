Feature: verify result text by using css and xpath selector

  @xpath_css
  Scenario: Verification CPU load by using given selector
    Given user is on the main page of "xpath.css.tester.url"
    When user enters a valid "css" locator into the box to locate CPU load
    Then user should see "1 match" text and "Chrome CPU: 7.6%"
    When user switches to xpath from css
    When user enters a valid "xpath" locator into the box to locate CPU load
    Then user should see "1 match" text and "Chrome CPU: 7.6%"

