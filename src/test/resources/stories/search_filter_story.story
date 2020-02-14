Meta:

Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Scenario: search filter
Given The Google Chrome browser
When We go to the site http://www.seleniumeasy.com/test/table-search-filter-demo.html
Then We set 1 id input value
Then We check if row with 1 id cell shows
Then We set jQuery library task input value
Then We check if row with jQuery library task cell shows
Then We close Chrome Browser