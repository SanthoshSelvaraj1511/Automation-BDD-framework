Feature: Login

  @test
  Scenario Outline: Login to the application
    Given I Launch the "<URL>"
    And I enter the "<Email>" and "<Password>"
    When I click on login button
    Then I should see the result
    Examples:
      | Email                | Password  | URL                            |
      | tamil.qa@yopmail.com | Hello@123 | https://qa.connect.payzli.com/ |

  @test
  Scenario: Logout from the application
    Given I am on leads screen
    When I click logout button
    Then I should see the result