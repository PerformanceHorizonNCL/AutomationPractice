@SignUp_global
Feature: New Account

  @SingUp_tcl
  Scenario: Creating an account in http://automationpractice.com/index.php
    Given user is on home page and clicks on Sign in button
    Then user sees create account page
    And user creates a new account and clicks on Create an account button
