@smoke @login
Feature: Users should be able to login

  @driver @Vy-123
  Scenario: Login as a driver
    Given the user is on the login page
    When the users enters the login information
    Then the user should be able to login

    @sales_manager @Vy-123
  Scenario: Login as a sales manager
    Given the user is on the login page
    When the users enters the sales manager information
    Then the user should be able to login

    @store_manager
  Scenario: Login as a store manager
    Given the user is on the login page
    When the users enters the store manager information
    Then the user should be able to login
