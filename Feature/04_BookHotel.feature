Feature: Book hotel page features
This feature file is relates to book hotel page functionality of adactin hotel application
Background: Initialize the pages
  Given Initialize the page objects
  And Initialize the page objects for Homepage
  And Initialize the page objects for SelectHotelPage
  And Initialize the page objects for BookHotelPage
Scenario: Book Hotel from Book hotel Page.

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
When user enter the firstname in bookhotel page.
When user enter the lastname in bookhotel page.
And user enter address in bookhotel page.
And user enter creditcard no in book hotel page.
And user enter credit card type from dropdown.
And user enter credit card expmonth from dropdown .
And user enter credit card expyear from dropdown.
And user enter cvv no.
And user click booknow button in bookhotel page.