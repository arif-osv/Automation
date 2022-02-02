Feature: Add/Edit/Delete Bank Accounts

Scenario: User Edit any Existing Bank Account Details
 Given user is on OSV login page
    When user enters username "smrev"
    And user enters password "Osv@1234"
    And user clicks on Login button
    When User close all Popup messages
    Then user click Edit bank Account and save
    
Scenario: User Edit any Existing Bank Account Details
 Given user is on OSV login page
    When user enters username "smrev"
    And user enters password "Osv@1234"
    And user clicks on Login button
    When User close all Popup messages
    Then user click on yourbank Accounts tab
    
  Scenario: User Navigate to Bank website
 Given user is on OSV login page
    When user enters username "smrev"
    And user enters password "Osv@1234"
    And user clicks on Login button
    When User close all Popup messages
    Then user Navigate to bank Website
 