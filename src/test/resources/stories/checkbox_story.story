Meta:

Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Scenario: selecting checkboxes
Given The Google Chrome browser
When We go to the site http://www.seleniumeasy.com/test/basic-checkbox-demo.html
Then We click on the checkbox
Then It should be checked Success - Check box is checked
When We click on the Check All button
Then Title should switch to Uncheck All
Then Close the chrome browser