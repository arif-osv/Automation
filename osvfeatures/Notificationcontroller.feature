Feature: Notification Controller

  Scenario: User check with payment notification
    Given user is on OSV login page
    And user gets the title of the page
    When user enters username "stcexe"
    And user enters password "Osv@1234"
    And user clicks on Login button
