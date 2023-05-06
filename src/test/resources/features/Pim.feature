Feature: pim functionality

  @Regresion
    @hu002
  Scenario Outline: add a new employee

    Given abrir el navegador
    And the user fill out name <userName> and password <password>
    And the user access to add employee
    When the user fill out first name <firstName> middlename <middlename> and lastname <lastname>

    Examples:
      | userName | password | firstName | middlename | lastname |
      | Admin    | admin123 | Jhonatan  | tatan      | medina   |


