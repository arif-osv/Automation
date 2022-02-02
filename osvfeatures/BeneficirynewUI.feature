Feature:  Beneficiry Profile Testing

 Scenario: Executor create a beneficiry and Approve the Beneficiry
     Given user is on OSV login page
   When user enters username  and PassWord "smexe""Osv@1234"
   When User close all Popup messages
   And user click on Beneficiry button
   Then Click on view more tab under Beneficiry tags
   And user click on addBeneficiry Button
   And verify beneficiry with beneficiry name and IBAN number
   Then click on the verify beneficiry
   And user fill all the details and create new beneficiry "Al inma Bank"
   And user self Approve the Beneficiry

 

Scenario: Data Table Search with Name and Tags
 Given user is on OSV login page
   When user enters username  and PassWord "smexe""Osv@1234"
   When User close all Popup messages
   And user click on Beneficiry button
  Then user click and Data table search Account Number
  
  Scenario: Data Table Search with Account Number
 Given user is on OSV login page
   When user enters username  and PassWord "smexe""Osv@1234"
   When User close all Popup messages
   And user click on Beneficiry button
  Then click and Data table search name box
 

Scenario: Enter valid benef no. and name and create beneficiry 

  Given user is on OSV login page
   When user enters username  and PassWord "smexe""Osv@1234"
   When User close all Popup messages
   And user click on Beneficiry button
   Then Click on view more tab under Beneficiry tags
   And user click on addBeneficiry Button
   And verify beneficiry with beneficiry name and IBAN number
   Then click on the verify beneficiry
   And user fill all the details and create new beneficiry "Al inma Bank"
   And user self Approve the Beneficiry
  


Scenario: Edit Category and Save 

    Given user is on OSV login page
    When user enters username  and PassWord "smexe""Osv@1234"
    And user click on Beneficiry button
    And user open the newly created Beneficiary and verify the details
    And user Edit the Categery name and try to save the Category field empty


 Scenario: Edit beneficiry tag blank and verify Tag Name Required field
    Given user is on OSV login page
    When user enters username  and PassWord "smexe""Osv@1234"
    And user click on Beneficiry button
    And user open the newly created Beneficiary and verify the details
    And user Edit the Categery name and try to save the Category field empty

 Scenario: 
    user add beneficiry with out tagname and edit profile add beneficiry tag.

    Given user is on OSV login page
    When user enters username  and PassWord "smexe""Osv@1234"
    When User close all Popup messages
     And user click on Beneficiry button
    Then Click on view more tab under Beneficiry tags
    And user click on addBeneficiry Button
    And verify beneficiry with beneficiry name and IBAN number
    Then click on the verify beneficiry
    And user fill all the details and create new beneficiry "Al inma Bank"
   And user self Approve the Beneficiry
    And user open the newly created Beneficiary and verify the details
    And user click on the add tag name and save the new tagname
    And user click on addaccount tab
    And again user create new Beneficiry "Al inma Bank"
    And user self Approve the Beneficiry

Scenario:user add beneficiry with out tagname and edit profile add beneficiry tag.
     Given user is on OSV login page
     When user enters username  and PassWord "smexe""Osv@1234"
     When User close all Popup messages
   
    And user click on Beneficiry button
    Then Click on view more tab under Beneficiry tags
    And user click on addBeneficiry Button
    And verify beneficiry with beneficiry name and IBAN number
    Then click on the verify beneficiry
    
    
    And user fill all the details and create new beneficiry "Al inma Bank"
    And user self Approve the Beneficiry
    Then Click on view more tab under Beneficiry tags
    And user open the newly created Beneficiary and verify the details
