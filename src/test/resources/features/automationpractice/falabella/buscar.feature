@test
Feature: Agregar Articulo al Carrito de Compras

  Yo como PO
  Quiero un carrito de compras
  Para que mis clientes puedan agregar articulos y puedan comprarlos

  @Scenario:
  Scenario: Deberia agregar un elemento al carrito de compras
    Given el usuario esta  en la seccion Home
    And el usuario introduce un nombre de articulo
    |nombreArticuloF   |
    |Consola Xbox      |
    When aparecen los resultados segun criterio  de busqueda
    Then el usuario deberia poder agregar el articulo al carrito de compras