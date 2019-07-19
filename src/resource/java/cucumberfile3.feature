Feature: Login function file
Scenario Outline: Login functionality
Given User must be registred
When User must give <username> and <password>
Then User must be in homepage
Examples:
|username||password|
|abc123||abc123|
|xyz12||xyz12|
