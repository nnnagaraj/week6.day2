Feature: LeafTaps Create Lead Functionality

#Background:
#Given Open the Chrome browser
#And Load the application url

Scenario: Create Lead with mandatory information
#Given Open the Chrome browser
#And Load the application url
Given Enter the username as 'DemoCSR'
And Enter the password as 'crmsfa'
When Click on the login button
Then Homepage should be displayed
When Click on CRMSFA link
Then MyHomepage should be displayed

