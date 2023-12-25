#Author
#Date
#Description

@SmokeScenario
Feature: feature to test login functionality

@SmokeTest
  Scenario: Check login is successful with valid credential
  
    Given User is on login page
    When User enters username and Password
    And Clicks login button
    Then User is navigated to the homepage

  
