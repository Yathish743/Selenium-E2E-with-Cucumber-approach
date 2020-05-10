Feature: Login to Application

Scenario Outline: Positive test validating login
Given Initialize the browser with chrome
Given Navigate to "http://qaclickacademy.com" Site
Given Click on Login link in Home page to land on secure Sign in Page
When user enters <Username> and <Password> and Logs in
Then Verify that user is successfully logged in
And close browsers

Examples:
|Username          |Password    |
|Username@gmail.com|Password    |
|Name@Cts.com      |Pass@123    |