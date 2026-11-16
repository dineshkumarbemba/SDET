Feature: Home page features 
This feature file is relates to HomePage functionality of adactin hotel application

Background: Initialize the pages
  Given Initialize the page objects
  And Initialize the page objects for Homepage
    
Scenario:Verify HomePage header is Displayed.

Given user has launched the application.
When user has entered the username and password.
Then user clicked the login button.
When user has verify the home page header is displayed.

Scenario: select location from location dropdown in Homepage 

Given user has launched the application.
When user has entered the username and password.
Then user clicked the login button.
When user has verify the home page header is displayed.
And select location from dropdown in homepage.

Scenario:Select noof ROoms from dropdown in homepage.

Given user has launched the application.
When user has entered the username and password.
Then user clicked the login button.
When user has verify the home page header is displayed.
And select location from dropdown in homepage.
And select noofrooms dropdown in homepage.

Scenario:Select room type from dropdown in homepage.

Given user has launched the application.
When user has entered the username and password.
Then user clicked the login button.
When user has verify the home page header is displayed.
And select location from dropdown in homepage.
And select noofrooms dropdown in homepage.
And select roomtype from dropdown in homepage.

Scenario: Click search button from homepage after give all the details.

Given user has launched the application.
When user has entered the username and password.
Then user clicked the login button.
When user has verify the home page header is displayed.
And select location from dropdown in homepage.
And select noofrooms dropdown in homepage.
And select roomtype from dropdown in homepage.
And user click the searchButton.




