@login @Regression @practico4 @SwagLabs
Feature: login en la app Swag Labs

  Background:
    Given el usuario esta en la pantalla de login de Swag Labs

@loginExitoso
  Scenario: login exitoso
    When el usuario ingresa username con standard_user y password con secret_sauce
    And el usuario hace click en el boton Login
    Then el usuario es redirigido al home

@loginFallido
  Scenario Outline: login fallido por <motivo>
   When el usuario ingresa username con <username> y password con <password>
   And el usuario hace click en el boton Login
   Then el usuario ve el mensaje de "<mensaje>"

  Examples:
    | motivo                         | username                | password              | mensaje                                                                    |
    | usuario incorrecto             | locked_out_user         | secret_sauce          | Epic sadface: Sorry, this user has been locked out.                        |
    | usuario vacio                  |                         | secret_sauce          | Epic sadface: Username is required                                         |
    | password incorrecto            | standard_user           | 1111111               | Epic sadface: Username and password do not match any user in this service  |
    | password y usuario incorrectos | usuarioInc              | 1111111               | Epic sadface: Username and password do not match any user in this service  |