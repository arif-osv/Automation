Feature: DashBoard through all Navigations

Scenario: User create Beneficiry through DashBoard
Given user is on OSV login page


  Scenario: User check company and Foryou buttons enabled or not
    Given user is on OSV login page
    When user enters username "smrev"
    And user enters password "Osv@1234"
    And user clicks on Login button
