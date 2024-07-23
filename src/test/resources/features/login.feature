Feature: login
  As user login succes

  Scenario Outline: Login success

    Given the user enter the page
    When the user clicks the button
    And the user clicks the text register
    And the user enters the data <row>
    And the user clicks the button register
    And the user clicks the button menu
    And the user clicks the option posts
    And the user click the option list category <row>


    Examples:
      | row |
      | 1   |
      | 2   |
      | 3   |
      | 4   |
      | 5   |
      | 6   |
      | 7   |
      | 8   |


