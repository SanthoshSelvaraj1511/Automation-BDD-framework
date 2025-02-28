Feature: signup

  @test
  Scenario: User can navigate to sign up page
    Given I am on login page
    When I click sign up button
    Then I should see the result


  @test
  Scenario: User click on Lets Go button
    Given I am on sign up screen
    When I click on lets Go button
    Then I navigate to tell us about your business page