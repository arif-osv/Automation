Feature: Beneficiary Details on payment details-SV-4956
Scenario: Create one payment user can verify beneficiry details persist in detail tab.and disab
    Given user is on OSV login page
    When user enters username "smrev"
    And user enters password "Osv@1234"
    And user clicks on Login button
    When User close all Popup messages
    And user clicks on Payment Link
    And user should be create Beneficiry payment ICICI to YesBank Account
    And user open newly created payment details and verify beneficiry tab displaying 
    Then click on beneficiry tab
    And verify the Beneficiry name displaying or not
    And verify the all bank accounts text displaying or not
    And verift the payment history displaying or not
    And see all payments in profile link displaying or not
    Then click on see all payments in profile
    And count number of beneficiries exists in the account 
    And verify the enable button displayed or not and disable the second account
    And verify write reason popup displayed or not
    Then enter reason in text box
    Then click on Disable Account
    Then user logout application   
    When user enters username "smrev"
    And user enters password "Osv@1234"
    And user clicks on Login button
    When User close all Popup messages
    And user clicks on Payment Link
    And click on transfers
    And click on history 
    And Open on FirstPayment
   Then click on beneficiry tab
    Then click on see all payments in profile
    And click on the disabled tab
    And click on enable the account
    Then user logout application  
  Scenario: Create one payment user can verify beneficiry details persist in detail tab.and disab
    Given user is on OSV login page
    When user enters username "smrev"
    And user enters password "Osv@1234"
    And user clicks on Login button
    When User close all Popup messages
    And user clicks on Payment Link
    And user should be create Beneficiry payment ICICI to YesBank Account
    And user open newly created payment details and verify beneficiry tab displaying 
    Then click on beneficiry tab
    And verify the Beneficiry name displaying or not
    And verify the all bank accounts text displaying or not
    And verift the payment history displaying or not
    And see all payments in profile link displaying or not
    Then click on see all payments in profile
    And count number of beneficiries exists in the account 
    And verify the enable button displayed or not and disable the second account
    And verify write reason popup displayed or not
    Then enter reason in text box
    Then click on Disable Account
    Then user logout application   
    When user enters username "smrev"
    And user enters password "Osv@1234"
    And user clicks on Login button
    When User close all Popup messages
    And user clicks on Payment Link
    And click on transfers
    And click on history 
    And Open on FirstPayment
   Then click on beneficiry tab
    Then click on see all payments in profile
    And click on the disabled tab
    And click on enable the account
    Then user logout application  
       
       
    
   