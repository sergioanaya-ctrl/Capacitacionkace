Feature: Este escenario es para iniciar sesion de kace

  @Test

  Scenario: Validar que podamos iniciar sesion en kace
    Given Ingresamos a la url de kace
    When Ingresamos usuario
    And Damos clic en el boton next
    And ingresamos contrasena
    And Damos clic en el boton continuar
    Then Validamos que estemos dentro que kace