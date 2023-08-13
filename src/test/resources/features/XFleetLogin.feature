Feature: xfleet login functionality

  @xfeet
  Scenario Template: login functionality of the xfleet web application
    Given user is on the main page of "xfleet.login.url"
    When user enters "<UserName>" and "<Password>"
    And user clicks log in button
    Then title should be "Dashboard"

    Examples: valid credentials
      | UserName        | Password    |
      | user1           | UserUser123 |
      | user2           | UserUser123 |
      | user3           | UserUser123 |
      | storemanager51  | UserUser123 |
      | storemanager52  | UserUser123 |
      | storemanager53  | UserUser123 |
      | salesmanager101 | UserUser123 |
      | salesmanager102 | UserUser123 |
      | salesmanager103 | UserUser123 |
