Feature: Footer
  Background:
    Given User is in "irshad.az" website

  Scenario Outline: Checking clickability buttons in the Şirkət menu item in the footer
    Given  Clicks on "<Şirkət menu item>" button in the "Şirkət menu item"
    Then Should be navigated to "<Şirkət menu item>" page
    Examples:
      | Şirkət menu item               |
      | Haqqımızda                     |
      | Mağazalar                      |
      | Vakansiyalar                   |
      | Kampaniyalar                   |
      | Şərtlərimiz                    |
      | Çatdırılma qaydaları           |
      | Bonuslardan istifadə qaydaları |


  Scenario Outline: Checking clickability buttons in the Müştəri üçün menu item in the footer
    Given  Clicks on "<Müştəri üçün menu item>" button in the "Müştəri üçün"
    Then Should be navigated to "<Şirkət menu item>" page
    Examples:
      | Müştəri üçün menu item |
      | ŞadKart                |
      | Sual-Cavab             |
      | Hissə-hissə ödəniş     |
      | Məxfilik siyasəti      |
      | Korporativ satışlar    |
      | İstifadə qaydaları     |
      | Bloq                   |
      | Şikayət və təkliflər   |


@social
  Scenario Outline: Checking social media buttons
    Given Clicks on "<Social Media>" button on the section "Bizi izleyin"
    Then User in on "<Social Media>" page
    Examples:
      | Social Media |
      | Facebook     |
      | Instagram    |
      | Youtube      |
      | Whatsapp     |
      | Telegram     |
      | Tiktok       |
      | Linkedin     |
      | Twitter      |












