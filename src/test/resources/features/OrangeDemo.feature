Feature: Realizar el proceso de contratación de una persona
  Como Reclutador
  quiero ingresar a la página https://opensource-demo
  para realizar el proceso de contratacion de una persona

  Background:
    Given un reclutador ingresa a la plataforma y se dirige al modulo Recruitment

  @EscenarioContratación
  Scenario: Anadir la contratacion de una persona
    When Se anade un usuario y se realiza el proceso de contratacion
    Then Se valida que los datos de la persona correspondan a los diligenciados en los formularios
