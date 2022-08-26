Feature: Flipkart login functionality

Background:
Given User is on Flipkart login page

@sanity
Scenario: Valid login functionality
When user enters Email/Mobile Number
And user enters password
And user clicks on Login then
Then User navigates to flipkart home page