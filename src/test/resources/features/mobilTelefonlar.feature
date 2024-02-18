Feature: MobilTelefonlar
  Background:
    Given User is in "irshad.az" website
    When Clicks on Kataloq button
    And Hovers mouse over "Telefon və aksesuarlar" buttons
    And Clicks on the Mobil telefonlar button


   Scenario Outline: Check Qiymət aralığı section in the Mobil Telefonlar Ve Aksesuarlar page
     Given Puts the value from "<from>" to "<to>" the price
     Then Items in the page should be ordered according from "<from>" to "<to>"
     Examples:
       | from | to   |
       | 0    | 100  |
       | 100  | 500  |
       | 500  | 1000 |
       | 1000 | 1500 |
       | 1500 | 2000 |
       | 2000 | 2500 |
       | 2500 | 5000 |

  Scenario Outline: Check Brend checkbox in the Telefon Ve Aksesuarlar page
    When Choose "<Brend>" in the Brend checkbox
    Then Items in the "Telefon Ve Aksesuarlar" page should be ordered according to the "<Brend>" checkbox
    Examples:
      | Brend   |
      | Apple   |
      | Samsung |
      | Xiaomi  |
@MovcuddurCheckBox
    Scenario Outline: Check Mövcuddur checkbox in the Telefon Ve Aksesuarlar page
      When Choose "<Mövcuddur>" in the Mövcuddur checkbox
      Then Items should be ordered according to the "<Mövcuddur>" checkbox
      Examples:
        | Mövcuddur     |
        | Yalnız Onlayn |

  @taksit
  Scenario Outline: Check credit offers in Telefon Ve Aksesuarlar page
    When Clicks on the "<Ayliq>" button in the item's description
    Then The monthly payment for the item should be displayed according to taksit "<Ayliq>".
    Examples:
      | Ayliq |
      | 6     |


  @discount
  Scenario: Endirimde olan mehsullar in Telefon Ve Aksesuarlar page
    When Click to discount checkbox
    Then Only discounted items are visible

@basket
  Scenario: Adding item to basket successfully in Telefon Ve Aksesuarlar page
    When User clicks add to card btn for random item
    And Clicks to basket button
    Then selected item should be shown in basket

  @deleteItem
  Scenario: Delete item to basket successfully in Telefon Ve Aksesuarlar page
    When User clicks add to card btn for random item
    And Clicks to basket button
    And Click the Delete button
    And Clicks to basket button
    Then Product has been removed from the page



  @favorit
  Scenario: Adding item to favorit successfully in Telefon Ve Aksesuarlar page
    When User clicks favorit btn for random item
    And Clicks to favorit button
    Then selected item should be shown in favorit



  @deleteFavorit
  Scenario: Delete item to favorit successfully in Telefon Ve Aksesuarlar page
    When User clicks favorit btn for random item
    And Clicks to favorit button
    And Click the favorite button to delete
    And Clicks to favorit button
    Then Product has been removed from the page



