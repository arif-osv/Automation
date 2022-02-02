Feature: One Single view Bulk Payments

Scenario: Reveiewer Create Bulk payment Approver,Executor Approve Payment Through Overview Page.
Given user is on OSV login page
When user enters username  and PassWord "smrev""Osv@1234"
    When User close all Popup messages
    And click on payments link and click on Bulk Transfer
    And click on upload payments
    Then user Select the Debit Account
    Then user upload payment sheet
    Then select payment due date
    And  enter the description in English language
    Then click on clear the data
    Then user Select the Debit Account after clear
    Then user upload payment sheet
    Then select payment due date
    And  enter the description in Arabic language
    Then click on upload the data
    And click on accept and upload
    And user verify upload successful message
    Then user logout application
    When user enters username  and PassWord "smrev""Osv@1234"
    When User close all Popup messages
    Then click on overview page 
    And click on bulk button under upcoming payments
    And click on approve button
   	And enter comments on approve popup and approve
    Then user logout application  
    When user enters username  and PassWord "smapp1""Osv@1234"
    When User close all Popup messages
    And click on bulk button under upcoming payments
    And click on approve button
   	And enter comments on approve popup and approve
    Then user logout application  
    
    
Scenario:Apply different filters for Bulk payment History tab    
     
   
   
Scenario: Executer create Bulk Payment and Approve 
Given user is on OSV login page
    When user enters username "smexe"
    And user enters password "Osv@1234"
    And user clicks on Login button
    When User close all Popup messages
    And user Upload and create the Bulk Payment
    Then user logout application
    