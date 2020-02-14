Meta:

Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Scenario: single input
Given The Google Chrome browser
When We go to the site http://www.seleniumeasy.com/test/basic-first-form-demo.html
Then We click on the Textbox
Then We enter the text TEST
Then We click submit button
Then We should see TEST as a result
Then Close the chrome browser