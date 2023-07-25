@regression
Feature: Visa Confirmation test
  As a user I want to check Who  need a UK visa

  Background: I am on homepage
    And       I click on Start button

  @smoke
  Scenario Outline : verify  an Australian coming to Uk for Tourism
    When    I select a Nationality "<nationality>"
    And  I click on continue button
    And  I select  "<reason>"
    And  I click on  next continue button
    Then I should be able to see message "<result>"
    Examples:
      | nationality | reason                                 | result                                     |
      | Australia   | Tourism or visiting family and friends | You will not need a visa to come to the UK |

  @sanity
  Scenario Outline: verify  a Chilean coming to the UK for work and plans on staying for longer than six months
    When I select a Nationality "<nationality>"
    And  I click on continue button
    And  I select  "<reason>"
    And  I click on  next continue button
    And  I select duration "<duration>"
    And  I click on next step  button
    And  I select planning to work for "Health and care professional"
    Then I should be able to see result ms"<expectedMessage>"
    Examples:
      | nationality | reason                           | duration             | expectedMessage                            |
      | Chile       | Work, academic visit or business | longer than 6 months | You need a visa to work in health and care |

  @regression
  Scenario Outline: verify a Columbian coming to the UK to join a partner for a long stay
    When  I select a Nationality "<nationality>"
    And  I click on continue button
    And  I select  "<reason>"
    And  I click on  next continue button
    Then  I should see the message "<expectedMsg>"
    Examples:
      | nationality | reason                                 | expectedMsg         |
      | Colombia    | Join partner or family for a long stay | You may need a visa |