Feature: Header
  Background:
    Given User is in "irshad.az" website

  Scenario Outline: Checking  by clicking the buttons in the header.
    When  Clicks on "<header>" button in the "header"
    Then Should be navigated to "<header>" page
    Examples:
      | header       |
      | Kampaniyalar |
      | Mağazalar    |
      | Korporativ   |
      | Samsung      |
      | Apple        |
      | Outlet       |


  Scenario: Availability of language in options
    When Hovers mouse over "language" button
    Then Should language options

  @rusLanguage
  Scenario Outline: Language change check
    When Hovers mouse over "language" button
    And Click "<language>" language button
    Then Website was translated into "<expectedtext>"
    Examples:
      | language | expectedtext   |
      | Russian  | Личный кабинет |



  Scenario: Checking clickability of User profile button in the header.
    When Clicks on User profile button
    Then User should be navigated to the sighning page