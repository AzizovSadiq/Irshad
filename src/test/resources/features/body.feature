Feature: Body

  Scenario Outline: Check Ayliq odenish button in the homepage
    Given User is in "irshad.az" website
    When Clicks on Ayliq Odenish button
    And Clicks on "<Aylıq Odənish Yolu>" button
    Then Should be navigated to the "<Aylıq Odənish Yolu>" page
    Examples:
      | Aylıq Odənish Yolu |
      | Million            |
      | E-pul              |
      | Hesab.az           |


  Scenario: Chatbox yoxlanilmasi
    Given User is in "irshad.az" website
    Then Chatbox achildimi

  @chat
  Scenario: Chatbox baxlanmasi
    Given User is in "irshad.az" website
    When Chatbox bagla
    Then Chatbox baglidir

  @update
  Scenario: Checking the irshad button
    Given User is in "irshad.az" website
    When  User click Kampaniyalar button
    And User click irshad button
    Then Website is being updated

  @slider
  Scenario: Slider yoxla
    Given User is in "irshad.az" website
    Then Slider movcuddurmu