Feature: OSV Payment

  Scenario: L0,L1,L2,L3 flow L0 create payment.
    Given user is on OSV login page
    When user enters username "smrev"
    And user enters password "Osv@1234"
    And user clicks on Login button
    When User close all Popup messages
    And user clicks on Payment Link
    And user should be create Beneficiry payment Alrajhi to Alrajhi Account
    Then user logout application
    Then user approve the payment "smrev"
    When User close all Popup messages
    Then user approve the payment "smapp1"
    When user approve the OTP "smexe"
    When user approve the OTP "smexe1"
    When user approve the OTP "stcexe"

  Scenario: User Createing sarie Payment NCB to Alrajhi Account
    Given user is on OSV login page
    When user enters username "smrev"
    And user enters password "Osv@1234"
    And user clicks on Login button
    When User close all Popup messages
    And user clicks on Payment Link
    And user should be create Beneficiry payment NCB to Alrajhi Account
    Then user logout application

  Scenario: User Createing same account Payment Alrajhi to Alrajhi Account
    Given user is on OSV login page
    When user enters username "smrev"
    And user enters password "Osv@1234"
    And user clicks on Login button
    When User close all Popup messages
    And user clicks on Payment Link
    And user should be create Beneficiry payment Alrajhi to Alrajhi Account
    Then user logout application

  Scenario: User Creating International payment
    Given user is on OSV login page
    When user enters username "stcexe"
    And user enters password "Osv@1234"
    And user clicks on Login button
    When User close all Popup messages
    And user clicks on Payment Link
    And user should be create International Payment
    Then user logout application

  Scenario: User Creating Local IMPS payment ICICI to YesBank Account
    Given user is on OSV login page
    When user enters username "smrev"
    And user enters password "Osv@1234"
    And user clicks on Login button
    When User close all Popup messages
    And user clicks on Payment Link
    And user should be create Beneficiry payment ICICI to YesBank Account
    Then user logout application

  Scenario: User Creating Local RTGS payment HDFC to YesBank Account
    Given user is on OSV login page
    When user enters username "smrev"
    And user enters password "Osv@1234"
    And user clicks on Login button
    When User close all Popup messages
    And user clicks on Payment Link
    And user should be create Beneficiry payment ICICI to YesBank Account
    Then user logout application

  Scenario: OSV Payment
    Given user is on OSV login page
    When user enters username "smrev"
    And user enters password "Osv@1234"
    And user clicks on Login button
    When User close all Popup messages
    And user clicks on Payment Link
    And user should be create Beneficiry payment ICICI to YesBank Account
    Then user logout application

  Scenario: User Creating Local NEFT payment HDFC to YesBank Account
    Given user is on OSV login page
    When user enters username "smrev"
    And user enters password "Osv@1234"
    And user clicks on Login button
    When User close all Popup messages
    And user clicks on Payment Link
    And user should be create Beneficiry payment ICICI to YesBank Account
    Then user logout application

  Scenario: User Creating Local RTGS payment HDFC to YesBank Account
    Given user is on OSV login page
    When user enters username "smrev"
    And user enters password "Osv@1234"
    And user clicks on Login button
    When User close all Popup messages
    And user clicks on Payment Link
    And user should be create Beneficiry payment ICICI to YesBank Account
    Then user logout application

  Scenario: User Creating Local IMPS payment ICICI to YesBank Account
    Given user is on OSV login page
    When user enters username "smrev"
    And user enters password "Osv@1234"
    And user clicks on Login button
    When User close all Popup messages
    And user clicks on Payment Link
    And user should be create Beneficiry payment ICICI to YesBank Account
    Then user logout application

  Scenario: User Creating International payment
    Given user is on OSV login page
    When user enters username "Ep_exe"
    And user enters password "Osv@1234"
    And user clicks on Login button
    When User close all Popup messages
    And user clicks on Payment Link
    And user should be create International Payment
    Then user logout application

  Scenario: User Creating Company payment
    Given user is on OSV login page
    When user enters username "Ep_exe"
    And user enters password "Osv@1234"
    And user clicks on Login button
    When User close all Popup messages
    And user clicks on Payment Link
    And user should be create International Payment
    Then user logout application

  Scenario: User Createing same account Payment Alrajhi to Alrajhi Account
    Given user is on OSV login page
    When user enters username "smrev"
    And user enters password "Osv@1234"
    And user clicks on Login button
    When User close all Popup messages
    And user clicks on Payment Link
    And user should be create Beneficiry payment Alrajhi to Alrajhi Account
    Then user logout application

  Scenario: User Search in Data table filter and apply different Monthly,Weakly,Yearly in Schedule Payment
    Given user is on OSV login page
    When user enters username "smexe1"
    And user enters password "Osv@1234"
    And user clicks on Login button
    And user clicks on Payment Link
    And user click on Schedule payment and click under transfers tab
    Then user Select the amount and scheduled dropdown array button

  Scenario: User Createing sarie Payment NCB to Alrajhi Account
    Given user is on OSV login page
    When user enters username "smrev"
    And user enters password "Osv@1234"
    And user clicks on Login button
    When User close all Popup messages
    And user clicks on Payment Link
    And user should be create Beneficiry payment NCB to Alrajhi Account
    Then user logout application

  Scenario: L0,L1,L2,ML3 flow L1-C.P.L1&L2&L3(Joint) Approved
    Given user is on OSV login page
    When user enters username "smrev"
    And user enters password "Osv@1234"
    And user clicks on Login button
    When User close all Popup messages
    And user clicks on Payment Link
    And user should be create Beneficiry payment Alrajhi to Alrajhi Account
    Then user logout application

  Scenario: L0,L1,L2,ML3 flow L1-C.P.L1&L2&L3(Joint) Approved
    Given user is on OSV login page
    When user enters username "smrev"
    And user enters password "Osv@1234"
    And user clicks on Login button
    When User close all Popup messages
    And user clicks on Payment Link
    And user should be create Beneficiry payment NCB to Alrajhi Account
    Then user logout application

  Scenario: L0,L1,L2,ML3 flow L1-C.P.L1&L2&L3(Joint) Approved
    Given user is on OSV login page
    When user enters username "smrev"
    And user enters password "Osv@1234"
    And user clicks on Login button
    When User close all Popup messages
    And user clicks on Payment Link
    And user should be create Beneficiry payment ICICI to YesBank Account
    Then user logout application

  Scenario: L0,L1,L2,ML3 flow L1-C.P.L1&L2&L3(Joint) Approved
    Given user is on OSV login page
    When user enters username "smrev"
    And user enters password "Osv@1234"
    And user clicks on Login button
    When User close all Popup messages
    And user clicks on Payment Link
    And user should be create Beneficiry payment Alrajhi to Alrajhi Account
    Then user logout application

  Scenario: L0,L1,L2,ML3 flow L1-C.P.L1&L2&L3(Joint) Approved
    Given user is on OSV login page
    When user enters username "smrev"
    And user enters password "Osv@1234"
    And user clicks on Login button
    When User close all Popup messages
    And user clicks on Payment Link
    And user should be create Beneficiry payment Alrajhi to Alrajhi Account
    Then user logout application

  Scenario: User Upload Bulk payment and Approve
    Given user is on OSV login page
    When user enters username "smrev"
    And user enters password "Osv@1234"
    And user clicks on Login button
    When User close all Popup messages
    And user Upload and create the Bulk Payment

  Scenario: L0,L1,L2,ML3 flow L1-C.P.L1&L2&L3(Joint) Approved
    Given user is on OSV login page
    When user enters username "smrev"
    And user enters password "Osv@1234"
    And user clicks on Login button
    When User close all Popup messages
    And user clicks on Payment Link
    And user should be create Beneficiry payment Alrajhi to Alrajhi Account
    Then user logout application
    Then user approve the payment "smrev"
    Then user need more info that payment "smapp1"
    Then user send need more info the payment "smrev"
    Then user approve the payment "smapp1"
    When user approve the OTP "smexe"
    When user approve the OTP "smexe1"
    When user approve the OTP "stcexe"

  Scenario: L2 user create Payment L3 Joint user
    Given user is on OSV login page
    When user enters username "smapp1"
    And user enters password "Osv@1234"
    And user clicks on Login button
    When User close all Popup messages
    And user clicks on Payment Link
    And user should be create Beneficiry payment Alrajhi to Alrajhi Account
    Then user logout application
    Then user approve the payment "smapp1"
    When user approve the OTP "smexe"
    When user approve the OTP "smexe1"
    When user approve the OTP "stcexe"

  Scenario: Group User Create Payment and Approve next levels
    Given user is on OSV login page
    When user enters username "stcexe"
    And user enters password "Osv@1234"
    And user clicks on Login button
    When User close all Popup messages
    And user clicks on Payment Link
    And user should be create Beneficiry payment Alrajhi to Alrajhi Account
    Then user logout application
    When user approve the OTP "stcexe"
    When user approve the OTP "smexe"
    When user approve the OTP "smexe1"

  Scenario: L1,L2,L3->L1 Create Payment All Approve
    Given user is on OSV login page
    When user enters username "smrev"
    And user enters password "Osv@1234"
    And user clicks on Login button
    When User close all Popup messages
    And user clicks on Payment Link
    And user should be create Beneficiry payment Alrajhi to Alrajhi Account
    Then user logout application
    Then user approve the payment "smrev"
    Then user approve the payment "smapp1"
    When user approve the OTP "smexe"
    When user approve the OTP "smexe1"
    When user approve the OTP "stcexe"

  Scenario: L0,L1 and L3->L0 CP
    Given user is on OSV login page
    When user enters username "smrev"
    And user enters password "Osv@1234"
    And user clicks on Login button
    When User close all Popup messages
    And user clicks on Payment Link
    And user should be create Beneficiry payment Alrajhi to Alrajhi Account
    Then user logout application
    Then user approve the payment "smapp1"
    When user approve the OTP "smexe"
    When user approve the OTP "smexe1"
    When user approve the OTP "stcexe"

  Scenario: L0,L1,L2,L3 flow L0 create payment.
    Given user is on OSV login page
    When user enters username "smrev"
    And user enters password "Osv@1234"
    And user clicks on Login button
    When User close all Popup messages
    And user clicks on Payment Link
    And user should be create Beneficiry payment Alrajhi to Alrajhi Account
    Then user logout application
    Then user approve the payment "smrev"
    Then user approve the payment "smapp1"
    When user approve the OTP "smexe"
    When user approve the OTP "smexe1"
    When user approve the OTP "stcexe"

  Scenario: L0,L1,L2,L3 flow L0 create payment.
    Given user is on OSV login page
    When user enters username "smrev"
    And user enters password "Osv@1234"
    And user clicks on Login button
    When User close all Popup messages
    And user clicks on Payment Link
    And user should be create Beneficiry payment Alrajhi to Alrajhi Account
    Then user logout application
    Then user approve the payment "smrev"
    Then user approve the payment "smapp1"
    When user approve the OTP "smexe"
    When user approve the OTP "smexe1"
    When user approve the OTP "stcexe"

  Scenario: Any OSV user Create Payment Through Dash Board Quick links
    Given user is on OSV login page
    When user enters username "smexe"
    And user enters password "Osv@1234"
    And user clicks on Login button
    When User close all Popup messages
    Then user should be click on Quicklink payment link in dashboard
    Then user logout application

  Scenario: User Trying To enter Payment Description more than 100 Charecters
    Given user is on OSV login page
    When user enters username "smexe"
    And user enters password "Osv@1234"
    And user clicks on Login button
    When User close all Popup messages
    Then user should be create payment more than 100 charecters
    Then User close the Paymentpopup
    Then user logout application

  Scenario: Alinma Bank Restract the International Transfer
    Given user is on OSV login page
    When user enters username "smexe"
    And user enters password "Osv@1234"
    And user clicks on Login button
    When User close all Popup messages
    Then user should be create Alinma payment
    Then User See the error messgae
    Then User close the Paymentpopup
    Then user logout application

  Scenario: Select Schedule Payment goto Datatable Select filter Monthly
    Given user is on OSV login page
    When user enters username "smexe1"
    And user enters password "Osv@1234"
    And user clicks on Login button
    And user clicks on Payment Link
    And user clicks on SchedulePayment Link
    And user Datatable filter Select Month
    And User verify only Month Payment Displayed are not
    And User close the Monthly tag

  Scenario: Select Schedule Payment goto Datatable Select filter Beneficiry
    Given user is on OSV login page
    When user enters username "smexe1"
    And user enters password "Osv@1234"
    And user clicks on Login button
    And user clicks on Payment Link
    And user clicks on SchedulePayment Link
    And user Datatable filter Beneficiryname Search
    And User verify only Month Payment Displayed are not
    And User close the Monthly tag

  Scenario: Edit The Existing Schedule Payment
    Given user is on OSV login page
    When user enters username "smexe1"
    And user enters password "Osv@1234"
    And user clicks on Login button
    And user clicks on Payment Link
    And user clicks on SchedulePayment Link
    And user Datatable filter Select Month
    And User verify only Month Payment Displayed are not

  Scenario: Any OSV User Create the Schedule Payment
    Given user is on OSV login page
    When user enters username "smexe1"
    And user enters password "Osv@1234"
    And user clicks on Login button
    And user clicks on Payment Link
    Then user should be create Schedule payment "<TransferType>","<Fromac>","<Toacc>","<Amount>"
    Then user logout application

  Scenario: User Search in Data table filter and apply different Monthly,Weakly,Yearly in Schedule Payment
    Given user is on OSV login page
    When user enters username "smexe1"
    And user enters password "Osv@1234"
    And user clicks on Login button
    And user clicks on Payment Link

  Scenario: User Select Multiple Payments and Approve the Payments(Bulk Approve)
    Given user is on OSV login page
    When user enters username "smexe1"
    And user enters password "Osv@1234"
    And user clicks on Login button
    And user clicks on Payment Button
    And user Select Random Check Boxes
    Then User Approve the BulkPayments

  Scenario: User Select Multiple Payments and Approve the Payments(Bulk Approve)
    Given user is on OSV login page
    When user enters username "smexe1"
    And user enters password "Osv@1234"
    And user clicks on Login button
    And user clicks on Payment Button
    And user Select Random Check Boxes
    Then User Approve the BulkPayments
