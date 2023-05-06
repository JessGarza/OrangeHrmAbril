#Proyecto de pruebas y cargado en Github
#27/01/2020
#Jhonatan Medina Blanco
Feature: Hacer log in en la pagina Orange
  @Regresion
    @hu001
  Scenario Outline: scenario description
    Given abrir el navegador
    When the user fill out name <userName> and password <password>
    Then the user validate page Dashboard

    Examples:
      | userName | password |
      | Admin    | admin123 |
      | jhonatan | 545343   |
