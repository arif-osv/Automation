Feature: Beneficiary tagging / bucketing SV-3550 and Add account in beneficiary profile SV-3616

  Scenario Outline: 
    user add beneficiry with out tagname and edit profile add beneficiry tag.

    Given user is on OSV login page
    When user enters username  and PassWord "smexe""Osv@1234"
    And user click on Beneficiry button
    And user click on addBeneficiry Button
    And user fill all the details and create new beneficiry "Al inma Bank"
    And user self Approve the Beneficiry
    And user open the newly created Beneficiary and verify the details
    And user click on the add tag name and save the new tagname
    And user click on addaccount tab
    And again user create new Beneficiry "Al inma Bank"
    And user self Approve the Beneficiry

    Examples: 
      | username | Password | BankName     |
      | smexe    | Osv@1234 | Al inma Bank |

  Scenario: 
    user add beneficiry with out tagname and edit profile add beneficiry tag.

    Given user is on OSV login page
    When user enters username  and PassWord "smexe""Osv@1234"
    And user click on Beneficiry button
    And user click on addBeneficiry Button
    And user fill all the details and create new beneficiry with out tagname "Al inma Bank"
    And user self Approve the Beneficiry
    And user open the newly created Beneficiary and verify the details
    And user click on the add tag name and save the new tagname
    And user click on addaccount tab
    And again user create new Beneficiry "Al inma Bank"
    And user self Approve the Beneficiry

  Scenario: Edit beneficiry tag blank and verify Tag Name Required field
    Given user is on OSV login page
    When user enters username  and PassWord "smexe""Osv@1234"
    And user click on Beneficiry button
    And user open the newly created Beneficiary and verify the details
    And user Edit the tag name and try to save the tagname field empty

  Scenario: 
    Given user is on OSV login page
    When user enters username  and PassWord "smexe""Osv@1234"
    And user click on Beneficiry button
    And user click on addBeneficiry Button
    And user fill all the details and create new beneficiry "Al inma Bank"
    And user self Approve the Beneficiry
    And user open the newly created Beneficiary and verify the details
    And user Edit the tag name and save the new tagname
    And user click on addaccount tab
    And again user create new Beneficiry "Al inma Bank"
    And user self Approve the Beneficiry

      
   