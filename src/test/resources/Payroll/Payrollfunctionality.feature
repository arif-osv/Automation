Feature: Payroll Functionality

  Scenario: verify the Approval Status and Comments in header once record is selected for approval
    Given user is on OSV login page
    When user enters username  and PassWord "Ep_exe""Osv@1234"
    And user see on the Payroll button in header links
    Then user click on wps uploadsheet
    And user enter all the data
    Then user continue the upload sheet
    Then user continue upload button

  Scenario: OTP Spamming
    Given user is on OSV login page
    When user enters username  and PassWord "Ep_exe""Osv@1234"
    And user see on the Payroll button in header links
    Then user click on wps uploadsheet
    And user enter all the data
    Then user continue the upload sheet
    Then user continue upload button
    Then user logout application
    When Executor approve the payment "Ep_exe"

  Scenario: Verify the details in Payroll review screen.
    Given user is on OSV login page
    When user enters username  and PassWord "smapp1""Osv@1234"
    And user see on the Payroll button in header links
    Then user click on wps uploadsheet
    And user enter all the data
    Then user continue the upload sheet
    Then user verify the Payroll file name displayed on header
    Then user verify the From account number displayed on header
    Then user verify the PNumber of employees displayed on header
    Then user verify the payment date displayed on header

  Scenario: Verify the details in Payroll review screen click on more details
    Given user is on OSV login page
    When user enters username  and PassWord "smahttp://marketplace.eclipse.org/marketplace-client-intro?mpc_install=2427135pp1""Osv@1234"
    And user see on the Payroll button in header links
    Then user click on wps uploadsheet
    And user enter all the data
    Then user continue the upload sheet
    Then user verify the Payroll file name displayed on header
    Then user verify the From account number displayed on header
    Then user verify the PNumber of employees displayed on header
    Then user verify the payment date displayed on header

  Scenario: After entering all the above details verify the 'cancel' and 'continue' buttons.
    Given user is on OSV login page
    When user enters username  and PassWord "smapp1""Osv@1234"
    And user see on the Payroll button in header links
    Then user click on wps uploadsheet
    And user enter all the data
    When user click on cancel all the data entered in all fields should be cleared and able to enter new data
    When click on Continue Payroll review screen should be displayed with Upload option

  Scenario: verify In Upload Payroll screen verify the debit account field.
    Given user is on OSV login page
    When user enters username  and PassWord "smapp1""Osv@1234"
    And user see on the Payroll button in header links
    Then user click on wps payroll
    Then user enter corporate number above and below 15digits

  Scenario: verify the enable & disable role of Payroll& Payroll cards from role management for users
    Given user is on OSV login page
    When user enters username  and PassWord "smapp1""Osv@1234"
    Then click on roll management
    Then user enable payroll button
    Then user logout application
    And user see on the Payroll button in header links

  Scenario: After Enabling the role verify the 'Payroll' tab should be displayed on header next to payments
    Given user is on OSV login page
    When user enters username  and PassWord "smapp1""Osv@1234"
    And user see on the Payroll button in header links

  Scenario: select 'WPS payroll' tab and verify the 'Upload new payroll' screen should be displayed.
    Given user is on OSV login page
    When user enters username  and PassWord "smapp1""Osv@1234"
    And user see on the Payroll button in header links
    Then user click on wps payroll

  Scenario: L1&L3 flow
    Given user is on OSV login page
    When user enters username  and PassWord "Ep_rev""Osv@1234"
    Then User click on Payroll link and upload payroll sheet
    Then user logout application
    When payroll user need more info that payment "Ep_exe"
    When Executor approve the payment "Ep_exe"

  Scenario: L1&L3 reject flow
    Given user is on OSV login page
    When user enters username  and PassWord "Ep_rev""Osv@1234"
    Then User click on Payroll link and upload payroll sheet
    Then user logout application
    When Executor approve the payment "Ep_exe"

  Scenario: L1&L3 flow
    Given user is on OSV login page
    When user enters username  and PassWord "Ep_rev""Osv@1234"
    Then User click on Payroll link and upload payroll sheet
    Then user logout application
    When Executor approve the payment "Ep_exe"

  Scenario: Approval upload the Paroll sheet approval and executor need more info
    Given user is on OSV login page
    When user enters username  and PassWord "smapp1""Osv@1234"
    Then User click on Payroll link and upload payroll sheet
    Then user logout application
    When payroll user need more info that payment "smexe"
    Then Executor approve the payment "smexe"
    Then Executor approve the payment "smexe1"
    Then Executor approve the payment "stcexe"

  Scenario: Reviewer upload the Paroll sheet approval and joint executors approve the payroll
    Given user is on OSV login page
    When user enters username  and PassWord "smrev""Osv@1234"
    Then User click on Payroll link and upload payroll sheet
    Then user logout application
    Then next user approve the payment "smapp1"
    Then Executor approve the payment "smexe"
    Then Executor approve the payment "smexe1"
    When payroll user reject that payment "stcexe"

  Scenario: Approval upload the Paroll sheet approval and executor need more info
    Given user is on OSV login page
    When user enters username  and PassWord "smapp1""Osv@1234"
    Then User click on Payroll link and upload payroll sheet
    Then user logout application
    When payroll user need more info that payment "smexe"
    Then Executor approve the payment "smexe"
    Then Executor approve the payment "smexe1"
    Then Executor approve the payment "stcexe"

  Scenario: Executor upload the Paroll sheet and approve multiple Executors
    Given user is on OSV login page
    When user enters username  and PassWord "smrev""Osv@1234"
    Then User click on Payroll link and upload payroll sheet
    Then user logout application
    Then next user approve the payment "smapp1"
    Then Executor approve the payment "smexe"
    Then Executor approve the payment "smexe1"
    Then Executor approve the payment "stcexe"

  Scenario: Group Executor upload the Paroll sheet and approve multiple Executors
    Given user is on OSV login page
    When user enters username  and PassWord "smrev""Osv@1234"
    Then User click on Payroll link and upload payroll sheet
    Then user logout application
    Then next user approve the payment "smapp1"
    Then Executor approve the payment "smexe"
    Then Executor approve the payment "smexe1"
    Then Executor approve the payment "stcexe"

  Scenario: Any Osv user Upload the Paroll sheet
    Given user is on OSV login page
    When user enters username  and PassWord "smrev""Osv@1234"
    Then User click on Payroll link and upload payroll sheet
    Then user logout application
    Then next user approve the payment "smapp1"
    Then Executor approve the payment "smexe"
    Then Executor approve the payment "smexe1"
    Then Executor approve the payment "stcexe"

  Scenario: Any Osv user Upload the Paroll sheet next level user reject the payroll
    Given user is on OSV login page
    When user enters username  and PassWord "smrev""Osv@1234"
    Then User click on Payroll link and upload payroll sheet
    Then user logout application
    Then next user approve the payment "smapp1"
    Then Executor approve the payment "smexe"
    Then Executor approve the payment "smexe1"
    Then Executor approve the payment "stcexe"

  Scenario: verify the Approval Status and Comments in header once record is selected for approval
    Given user is on OSV login page
    When user enters username  and PassWord "Ep_exe""Osv@1234"
    And user see on the Payroll button in header links
    Then user click on wps uploadsheet
    And user enter all the data
    Then user continue the upload sheet
    Then user continue upload button

  Scenario: OTP Spamming
    Given user is on OSV login page
    When user enters username  and PassWord "Ep_exe""Osv@1234"
    And user see on the Payroll button in header links
    Then user click on wps uploadsheet
    And user enter all the data
    Then user continue the upload sheet
    Then user continue upload button
    Then user logout application
    When Executor approve the payment "Ep_exe"

  Scenario: Verify the details in Payroll review screen.
    Given user is on OSV login page
    When user enters username  and PassWord "smapp1""Osv@1234"
    And user see on the Payroll button in header links
    Then user click on wps uploadsheet
    And user enter all the data
    Then user continue the upload sheet
    Then user verify the Payroll file name displayed on header
    Then user verify the From account number displayed on header
    Then user verify the PNumber of employees displayed on header
    Then user verify the payment date displayed on header

  Scenario: Verify the details in Payroll review screen click on more details
    Given user is on OSV login page
    When user enters username  and PassWord "smapp1""Osv@1234"
    And user see on the Payroll button in header links
    Then user click on wps uploadsheet
    And user enter all the data
    Then user continue the upload sheet
    Then user verify the Payroll file name displayed on header
    Then user verify the From account number displayed on header
    Then user verify the PNumber of employees displayed on header
    Then user verify the payment date displayed on header

  Scenario: After entering all the above details verify the 'cancel' and 'continue' buttons.
    Given user is on OSV login page
    When user enters username  and PassWord "smapp1""Osv@1234"
    And user see on the Payroll button in header links
    Then user click on wps uploadsheet
    And user enter all the data
    When user click on cancel all the data entered in all fields should be cleared and able to enter new data
    When click on Continue Payroll review screen should be displayed with Upload option

  Scenario: verify In Upload Payroll screen verify the debit account field.
    Given user is on OSV login page
    When user enters username  and PassWord "smapp1""Osv@1234"
    And user see on the Payroll button in header links
    Then user click on wps payroll
    Then user enter corporate number above and below 15digits

  Scenario: verify the enable & disable role of Payroll& Payroll cards from role management for users
    Given user is on OSV login page
    When user enters username  and PassWord "smapp1""Osv@1234"
    Then click on roll management
    Then user enable payroll button
    Then user logout application
    And user see on the Payroll button in header links

  Scenario: After Enabling the role verify the 'Payroll' tab should be displayed on header next to payments
    Given user is on OSV login page
    When user enters username  and PassWord "smapp1""Osv@1234"
    And user see on the Payroll button in header links

  Scenario: select 'WPS payroll' tab and verify the 'Upload new payroll' screen should be displayed.
    Given user is on OSV login page
    When user enters username  and PassWord "smapp1""Osv@1234"
    And user see on the Payroll button in header links
    Then user click on wps payroll

  Scenario: L1&L3 flow
    Given user is on OSV login page
    When user enters username  and PassWord "Ep_rev""Osv@1234"
    Then User click on Payroll link and upload payroll sheet
    Then user logout application
    When payroll user need more info that payment "Ep_exe"
    When Executor approve the payment "Ep_exe"

  Scenario: L1&L3 reject flow
    Given user is on OSV login page
    When user enters username  and PassWord "Ep_rev""Osv@1234"
    Then User click on Payroll link and upload payroll sheet
    Then user logout application
    When Executor approve the payment "Ep_exe"

  Scenario: L1&L3 flow
    Given user is on OSV login page
    When user enters username  and PassWord "Ep_rev""Osv@1234"
    Then User click on Payroll link and upload payroll sheet
    Then user logout application
    When Executor approve the payment "Ep_exe"

  Scenario: Approval upload the Paroll sheet approval and executor need more info
    Given user is on OSV login page
    When user enters username  and PassWord "smapp1""Osv@1234"
    Then User click on Payroll link and upload payroll sheet
    Then user logout application
    When payroll user need more info that payment "smexe"
    Then Executor approve the payment "smexe"
    Then Executor approve the payment "smexe1"
    Then Executor approve the payment "stcexe"

  Scenario: Reviewer upload the Paroll sheet approval and joint executors approve the payroll
    Given user is on OSV login page
    When user enters username  and PassWord "smrev""Osv@1234"
    Then User click on Payroll link and upload payroll sheet
    Then user logout application
    Then next user approve the payment "smapp1"
    Then Executor approve the payment "smexe"
    Then Executor approve the payment "smexe1"
    When payroll user reject that payment "stcexe"

  Scenario: Approval upload the Paroll sheet approval and executor need more info
    Given user is on OSV login page
    When user enters username  and PassWord "smapp1""Osv@1234"
    Then User click on Payroll link and upload payroll sheet
    Then user logout application
    When payroll user need more info that payment "smexe"
    Then Executor approve the payment "smexe"
    Then Executor approve the payment "smexe1"
    Then Executor approve the payment "stcexe"

  Scenario: Executor upload the Paroll sheet and approve multiple Executors
    Given user is on OSV login page
    When user enters username  and PassWord "smrev""Osv@1234"
    Then User click on Payroll link and upload payroll sheet
    Then user logout application
    Then next user approve the payment "smapp1"
    Then Executor approve the payment "smexe"
    Then Executor approve the payment "smexe1"
    Then Executor approve the payment "stcexe"

  Scenario: Group Executor upload the Paroll sheet and approve multiple Executors
    Given user is on OSV login page
    When user enters username  and PassWord "smrev""Osv@1234"
    Then User click on Payroll link and upload payroll sheet
    Then user logout application
    Then next user approve the payment "smapp1"
    Then Executor approve the payment "smexe"
    Then Executor approve the payment "smexe1"
    Then Executor approve the payment "stcexe"

  Scenario: Any Osv user Upload the Paroll sheet
    Given user is on OSV login page
    When user enters username  and PassWord "smrev""Osv@1234"
    Then User click on Payroll link and upload payroll sheet
    Then user logout application
    Then next user approve the payment "smapp1"
    Then Executor approve the payment "smexe"
    Then Executor approve the payment "smexe1"
    Then Executor approve the payment "stcexe"

  Scenario: Any Osv user Upload the Paroll sheet next level user reject the payroll
    Given user is on OSV login page
    When user enters username  and PassWord "smrev""Osv@1234"
    Then User click on Payroll link and upload payroll sheet
    Then user logout application
    Then next user approve the payment "smapp1"
    Then Executor approve the payment "smexe"
    Then Executor approve the payment "smexe1"
    Then Executor approve the payment "stcexe"
