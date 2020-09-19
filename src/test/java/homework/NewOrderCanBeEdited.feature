Feature: Check order list.
  Scenario: Validate that name of person who has order can be edited.

    Given User navigates to WebOrders application
    When User provides username "Tester" and password "test"
    Then User validates that application "is" logged in

    Given User navigates to order list
    When User provided his information
    Then User validates that  his edited

