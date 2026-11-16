Feature:Select hotel page features
This feature file is relates to select hotel page functionality of adactin hotel application
Background: Initialize the pages
  Given Initialize the page objects
  And Initialize the page objects for Homepage
  And Initialize the page objects for SelectHotelPage
Scenario:Select Hotel from select hotel Page.

Given user has launched the application.
When user has entered the username and password.
Then user clicked the login button.
When user has verify the home page header is displayed.
And select location from dropdown in homepage.
And select noofrooms dropdown in homepage.
And select roomtype from dropdown in homepage.
And user click the searchButton.
Then verify the selecthotel header is displayed.
Then click selecthotel Radiobutton from select hotel page.
And click continueButton.


