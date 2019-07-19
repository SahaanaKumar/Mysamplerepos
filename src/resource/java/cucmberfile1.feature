Feature: Login function file
@Login
  Scenario: Login functionality
    Given User must be registered
    When User must enter the cedentials and confirm login
    Then User must be in the homepage
@Register
Scenario: User Registration
Given User must not be logged in
When User enters all mandatory fields
Then Registration done successfully
@Login @Search
Scenario: Search
Given User must be logged in
When Search for a product
Then Product details must be displayedti the user

