@smoke
Feature: Files for Task 6

  As a user, I should be able to login with different users using their correct emails and passwords.
  when I login, I should be able to see username in the account username section.

  Scenario Outline: Verify user information <email>
    Given user is on the login page
    When I login using "<email>" and "<password>"
    Then account holder name should be "<name>"

    @students @bc3
    Examples:
      | email             | password | name            |
      | student27@library | libraryUser | Test Student 27 |
      | student28@library | libraryUser | Test Student 28 |
      | student29@library | libraryUser | Test Student 29 |
      | student30@library | libraryUser | Test Student 30 |
      | student31@library | libraryUser | Test Student 31 |
      | student32@library | libraryUser | Test Student 32 |
      | student33@library | libraryUser | Test Student 33 |
      | student34@library | libraryUser | Test Student 34 |
      | student35@library | libraryUser | Test Student 35 |
      | student36@library | libraryUser | Test Student 36 |
      | student37@library | libraryUser | Test Student 37 |
      | student38@library | libraryUser | Test Student 38 |
      | student39@library | libraryUser | Test Student 39 |
      | student40@library | libraryUser | Test Student 40 |

    @librarians @bc3
    Examples:
      | email               | password | name              |
      | librarian13@library | libraryUser | Test Librarian 13 |
      | librarian14@library | libraryUser | Test Librarian 14 |
      | librarian15@library | libraryUser | Test Librarian 15 |
      | librarian16@library | libraryUser | Test Librarian 16 |
      | librarian17@library | libraryUser | Test Librarian 17 |
      | librarian18@library | libraryUser | Test Librarian 18 |
      | librarian19@library | libraryUser | Test Librarian 19 |
      | librarian20@library | libraryUser | Test Librarian 20 |
      | librarian21@library | libraryUser | Test Librarian 21 |
      | librarian22@library | libraryUser | Test Librarian 22 |