Feature: body mass index calculation

  @bmi
  Scenario: BMI based on profile features
    Given user is on the main page of "bmi.url"
    When user enters HisHer profile specifications
      | gender | Male |
      | age    | 45   |
      | height | 165  |
      | weight | 85   |
    And user clicks Calculate button
    Then user should be shown as a "Obese Class I"
    When user enters HisHer profile specifications
      | gender | Male |
      | age    | 45   |
      | height | 165  |
      | weight | 80   |
    And user clicks Calculate button
    Then user should be shown as a "Overweight"

    #When user enters his/her "Male" as a "gender"
    #And user enters his/her "45" as a "age"
    #And user enters his/her "165" as a "height"
    #And user enters his/her "weight"
    #And user clicks Calculate button