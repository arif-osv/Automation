Feature: Overview Page

  Scenario: Group User verify all companys Balanace showing in Overview Tab
    Given user is on OSV login page
    And user gets the title of the page
    When user enters username "<Username>"
    And user enters password "Osv@1234"
    And user clicks on Login button
     | Username   | Password|
     | stcexe     | Osv@1234|
     | stcexe     | Osv@1234|
     | stcexe     | Osv@1234|
     | stcexe     | Osv@1234|
    
    And user click on OverView Button
    Then User Verify All the Companies are dispalying or not
    Then user verify current Balance
    Then user click on livebalance button
    Then user can see all companys balance
  
  Scenario: Any User after click on see All Transaction tab in Overview then navigate to Transaction Tab
    Given user is on OSV login page
    And user gets the title of the page
    When user enters username "stcexe"
    And user enters password "Osv@1234"
    And user clicks on Login button
    And user click on OverView Button
    When user click on see All Transaction Button
    Then user navigate to Transaction Tab

  Scenario: Any User click on transaction tab and verify debit and credit checkboxes working or not.
    Given user is on OSV login page
    And user gets the title of the page
    When user enters username "stcexe"
    And user enters password "Osv@1234"
    And user clicks on Login button
    And user click on OverView Button
    When user click on see All Transaction Button
    Then user navigate to Transaction Tab
    And user verify debit checkbox functionality
