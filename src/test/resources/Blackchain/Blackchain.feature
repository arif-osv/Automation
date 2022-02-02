Feature: Black Chain Functionality

  Scenario: If MFA is disabled and then enabled after sometime.
    Given user is on OSV login page
    When user enters username "smrev"
    And user enters password "Osv@1234"
    And user clicks on Login button
    When User close all Popup messages
    Then User click on any existing user profile
    And select the MFA Option disable

  Scenario: If MFA is disabled and then enable and disabled after sometime.
    Given user is on OSV login page
    When user enters username "smrev"
    And user enters password "Osv@1234"
    And user clicks on Login button
    When User close all Popup messages
    Then User click on any existing user profile
    And select the MFA Option enable and disable

  Scenario: User Enable MFA Option
    Given user is on OSV login page
    When user enters username  and PassWord "smadmin""Osv@1234"
    Then User click on create new user
    And select the MFA Option enable

  Scenario: User requests to resend secret key.
    Given user is on OSV login page
    When user enters username  and PassWord "sminit""Osv@1234"
    Then User click on any existing user profile
    And User requests to resend secret key

  Scenario: User requests to reset key.
    Given user is on OSV login page
    When user enters username  and PassWord "smadmin""Osv@1234"
    Then User click on any existing user profile
    And User requests to reset key

  Scenario: Enter wrong secret key for 5 times.
    Given user is on OSV login page
    When user enters username  and PassWord "smexe""Osv@1234"
    Then User click on any existing user profile
    And User requests to reset key
