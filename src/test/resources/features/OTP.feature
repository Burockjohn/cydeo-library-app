Feature: login functionality with otp code

  @otp
  Scenario: user should be logged in with OTP code sent in the mail box given on the login page
    Given user is on the main page of "otp.login.url"
    When user gets the mail address from the login page and enters it in the email box
    And user clicks send otp code button
    And user enters otp code into corresponding box and click verify btn
    Then user should see "secure" in url
    When user clicks logout button
    Then user should see "/login" in url

