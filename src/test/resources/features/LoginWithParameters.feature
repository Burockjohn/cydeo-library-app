@smoke
Feature: Login with parameters

  Background: I am on the login page
    Given user is on the login page

  @librarianParam1
  Scenario: Login as librarian 8
    When I enter username "librarian8@library"
    And I enter password "libraryUser"
    And user clicks sign in button
    And there should be 230 users
    Then user should see the dashboard

  @StudentParam
  Scenario: Login as student 8
    When I enter username "student8@library"
    And I enter password "libraryUser"
    And user clicks sign in button
    Then user should see the books

    @librarianParam2
  Scenario: Login as librarian same line
    When I login using "librarian1@library" and "libraryUser"
    Then user should see the dashboard


