@test
Feature: Formulario de Registro

  Yo como PO
  Quiero un formulario de Registro
  Para que mis clientes puedan darse se alta en la pagina

  @Scenario:
  Scenario: Deberia registrarse cuando envia los datos requeridos
    Given el usuario esta  en la seccion Login
    When introduce un correo no registrado
    |correnr        |
    |774a@gmail.com |


    And el usuario envia los datos obligatorios requeridos del formulario
      | nombre   | apellido  |   contrasena      |   direccion1      |  ciudad   |estado   |codigopostal   |usa            |telefono1   |
      | manuel   | leon      |   ballesta#251996 |   calle 6b 13a 27 |  monteria |Florida  | 33001         |United States  |3104197185  |
    Then el usuario deberia poder ver la seccion MY ACCOUNT


