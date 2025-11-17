@Regression @Inventory @practico4 @SwagLabs
  Feature: inventario en la app Swag Labs

  @agregarProdExitoso @eliminarProdExitoso
  Scenario: agregar y eliminar producto del carrito
    Given el usuario esta en la pantalla de login de Swag Labs
    And el usuario ingresa username y password
    And el usuario hace click en el boton Login
    And existe en el inventario el producto Sauce Labs Backpack
    And el usuario agrega "Sauce Labs Backpack" al carrito
    And el usuario visualiza que el contador del carrito muestra el número 1
    And el usuario elimina "Sauce Labs Backpack" del carrito
    Then el usuario visualiza que el contador del carrito esta vacio


