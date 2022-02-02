Feature: Beneficiary tagging / bucketing SV-3550 and Add account in beneficiary profile SV-3616
Scenario: L1&L2&L3 flow
 Given user is on OSV login page
    When user enters username  and PassWord "smrev""Osv@1234"
    And user click on Beneficiry button
    And user click on addBeneficiry Button
    And user fill all the details and create new beneficiry "Al inma Bank"
    And user self Approve the Beneficiry
   Then user logout application
   When user enters username  and PassWord "smapp""Osv@1234"
   Then user Approve the Beneficiry through dashboard
	 Then user logout application
    When user enters username  and PassWord "smexe1""Osv@1234"
   Then user Approve the Beneficiry through dashboard
	 Then user logout application
Scenario: L2&L3 flow
 Given user is on OSV login page
    When user enters username  and PassWord "smapp1""Osv@1234"
    And user click on Beneficiry button
    And user click on addBeneficiry Button
    And user fill all the details and create new beneficiry "Al inma Bank"
    And user self Approve the Beneficiry
   Then user logout application
   When user enters username  and PassWord "smexe1""Osv@1234"
   Then user reject the Beneficiry through dashboard
	 Then user logout application
	 Scenario: L2&L3 Joint Approval flow
 Given user is on OSV login page
    When user enters username  and PassWord "smrev""Osv@1234"
    And user click on Beneficiry button
    And user click on addBeneficiry Button
    And user fill all the details and create new beneficiry "Al inma Bank"
    And user self Approve the Beneficiry
   Then user logout application
   When user enters username  and PassWord "smapp""Osv@1234"
   Then user Approve the Beneficiry through dashboard
	 Then user logout application
    When user enters username  and PassWord "smexe1""Osv@1234"
   Then user Approve the Beneficiry through dashboard
	 Then user logout application
	 Scenario: L1&L2&L3 flow
 Given user is on OSV login page
    When user enters username  and PassWord "smrev""Osv@1234"
    And user click on Beneficiry button
    And user click on addBeneficiry Button
    And user fill all the details and create new beneficiry "Al inma Bank"
    And user self Approve the Beneficiry
   Then user logout application
   When user enters username  and PassWord "smapp""Osv@1234"
   Then user Approve the Beneficiry through dashboard
	 Then user logout application
    When user enters username  and PassWord "smexe1""Osv@1234"
   Then user Approve the Beneficiry through dashboard
	 Then user logout application
Scenario: L2&L3 flow
 Given user is on OSV login page
    When user enters username  and PassWord "smapp1""Osv@1234"
    And user click on Beneficiry button
    And user click on addBeneficiry Button
    And user fill all the details and create new beneficiry "Al inma Bank"
    And user self Approve the Beneficiry
   Then user logout application
   When user enters username  and PassWord "smexe1""Osv@1234"
   Then user reject the Beneficiry through dashboard
	 Then user logout application
	 Scenario: L2&L3 Joint Approval flow
 Given user is on OSV login page
    When user enters username  and PassWord "smrev""Osv@1234"
    And user click on Beneficiry button
    And user click on addBeneficiry Button
    And user fill all the details and create new beneficiry "Al inma Bank"
    And user self Approve the Beneficiry
   Then user logout application
   When user enters username  and PassWord "smapp""Osv@1234"
   Then user Approve the Beneficiry through dashboard
	 Then user logout application
    When user enters username  and PassWord "smexe1""Osv@1234"
   Then user Approve the Beneficiry through dashboard
	 Then user logout application
	 
	 	 Scenario: Group User Beneficiry Creation flow
 Given user is on OSV login page
    When user enters username  and PassWord "stcexe""Osv@1234"
    And user click on Beneficiry button
    And user click on addBeneficiry Button
    And user fill all the details and create new beneficiry "Al inma Bank"
    And user self Approve the Beneficiry
   Then user logout application
 
	 
  Scenario: 
    user add beneficiry with out tagname and edit profile add beneficiry tag.

    Given user is on OSV login page
    When user enters username  and PassWord "smapp1""Osv@1234"
   Then user reject the Beneficiry through dashboard
    And user click on Beneficiry button
    And user click on addBeneficiry Button
    And user fill all the details and create new beneficiry "Al inma Bank"
    And user self Approve the Beneficiry
    And user open the newly created Beneficiary and verify the details
    And user click on the add tag name and save the new tagname
    And user click on addaccount tab
    And again user create new Beneficiry "Al inma Bank"
    And user self Approve the Beneficiry

  

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
 
  Scenario: user add beneficiry with out tagname and edit profile add beneficiry tag.

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


  Scenario: user add beneficiry with out tagname and edit profile add beneficiry tag.

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

  Scenario:  Edit beneficiry tag blank 
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
      
   