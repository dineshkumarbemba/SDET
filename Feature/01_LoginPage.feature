Feature: Login page features
This feature file is relates to login functionality of adactin hotel application

Background: Initialize the pages
  Given Initialize the page objects

  Scenario: Verify Login page Logo is Displayed.
    Given user has launched the application.
    When verify the homepage application logo is displayed

  Scenario: Verify Forgot password Link is Displayed
    Given user has launched the application.
    When user click forgot password link and verify the text available in the forgot password page.

  Scenario: Verify loginfunctionality with valid username and password.
    Given user has launched the application.
    When user has entered the username and password.
    Then user clicked the login button.
