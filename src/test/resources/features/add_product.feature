Feature: add a new product
  The user log in and add a

  Scenario:add a product
    Given The user logs in
      | email                   | password   |
      | nelsondramosr@gmail.com | Lamisma93. |
    When The user add a new product to list
      | title   | descriptions                  | body                                        | tags    |
      | Samsung | Empresa Koreana multinacional | Características de la empresa: CEO, Reveneu | Empresa |
    Then The user could see a product added in the list