Feature: LeafTaps Login Functionality

Scenario Outline: Login with positive credentials
#Given Open the Chrome browser
#And Load the application url
Given Enter the username as <username>
And Enter the password as <password>
When Click on the login button
Then Homepage should be displayed
#When Click on CRMSFA link
#Then MyHomepage should be displayed

Examples:
|username|password|
|'Demosalesmanager'|'crmsfa'|
#|'DemoCSR'|'crmsfa'|

#Scenario: Login with negative credentials
#Given Open the Chrome browser
#And Load the application url
#And Enter the username as 'DemoCSR'
#And Enter the password as 'crmsfa'
#When Click on the login button
#Then Homepage should be displayed

