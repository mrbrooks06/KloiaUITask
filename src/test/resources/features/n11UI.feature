Feature: n11 Task

  Scenario: Login with FB
    Given user closes popups pages
    When  user clicks Giris Yap Button
    And   user clicks fb ile giris yap Button
    And   user enters valid credentials to input boxes
    Then  user verified login successfully

  @wip
  Scenario: Favorite functionality test
    When user closes popups pages
    And user clicks Giris Yap Button
    And user clicks fb ile giris yap Button
    And user enters valid credentials to input boxes
    And user hover "Kozmetik & Kişisel Bakım" clicks "Parfüm & Deodorant"
    And user search for "Lacoste" in  Brand Filter
    And user click 7 th product
    And user add product to Favorites
    And user clicks "Favorilerim / Listelerim" from hesabım tab
    And user clicks Favorilerim Link
    Then user verifies correct product added to favorite


  Scenario:Footer test
    When user checks footer Links
    And  user clicks "Markalar" link from Footer
    Then user verifies links are same



