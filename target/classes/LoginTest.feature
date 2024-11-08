
@Smoke @Regression
Feature: Login function test
  
Background:
Given Open the browser
    And Go to the application URL
    
  @Positive @TC_1
  Scenario: As a user, Login should pass with valid credential
    
    When Put the valid user
    And Put the valid password
    And Click login button
    Then Check the login function should pass logout button should visible
   

 @Negative @TC_2
  Scenario: As a user, Login should fail with invalid credential
    
    When Put the invalid user
    And Put the invalid password
    And Click login button
    Then Check the login function should fail 

    