Feature: login de usuarios
  yo como usuario
  quiero ingresar con mis credenciales al portal
  para validar que el proceso de autenticación funciona

  @e2e
  Scenario: login exitoso
    Given que "Deivis" visita la pagina Swag Labs
    When ingreso con mis credenciales
    Then logro acceder, visualizando el texto "Products"
