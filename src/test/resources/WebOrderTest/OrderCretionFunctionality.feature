@regressiontest @TEC-1002
Feature: Order Creation Functionality
  Background: Common steps for all scenarios


#  Scenario: Creating order with valid data

    Given User navigates to WebOrders application
    When User provides username "Tester" and password "test"
    Then User validates that application "is" logged in
    When User click on Order part

    @TEC-2003 @ui
    Scenario: Creating order with valid data
    And User adds new order with data
    |Quantity|Customer name|Street     |City       |  Zip|State|Card Nr|Expire date|
    | 2      |John Doe     |123 Doe St.|Des Palines|60006|IL   |1234567|12/21      |
#    One value of list

    Then User click on Process button and validates "New order has been successfully added." message
    When User click View All Orders part
    Then User created order is added to list with data
      |Quantity|Customer name|Street     |City       |  Zip|State|Card Nr|Expire date|
      | 2      |John Doe     |123 Doe St.|Des Palines|60006|IL   |1234567|12/21      |

@TEC-2012 @ui
  Scenario: Creating multiple order
  Given User navigates to WebOrders application
  When User provides username "Tester" and password "test"
  Then User validates that application "is" logged in
  When User click on Order part
  And  User creates all orders from "TestData" excel file
  Then User click on Process button and validates "New order has been successfully added." message
  When User click View All Orders part
  Then User validates that orders from "TestData" excel file is created
