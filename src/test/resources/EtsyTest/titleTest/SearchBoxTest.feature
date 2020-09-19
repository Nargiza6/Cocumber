@smoketest @regressiontest @ui @TEC-1005
Feature: Validating search box
  Background: Running two steps for all scenarios
    Given User navigate to Etsy application
    When User searches for "carpet"


  @TEC-2008
  Scenario: Validating search box is giving right output
    Given User navigate to Etsy application
    When User searches for "carpet"
    Then User validates the result contains
    |carpet|
    |rug   |
    |area rugs|
#    items.get(0); --> carpet
  # items.get(2);--> rug
  # items.get(3); -->oval rug

  #Map<String,Object>data=datatable.asMap(String.class, Object.class);
  @TEC-2009
  Scenario: Validating search result with selecting price range

    And User select over $1000 option
    Then User validates that all prices are over 1000

