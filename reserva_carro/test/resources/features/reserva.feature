Feature: Reserva de Carro

  Scenario: Reserva dentro da área de cobertura
    Given que a cidade informada é "Belo Horizonte" e o endereço é "Rua A"
    When eu realizo a reserva
    Then a mensagem retornada deve ser "Motorista a caminho"

  Scenario: Reserva fora da área de cobertura
    Given que a cidade informada é "São Paulo" e o endereço é "Rua B"
    When eu realizo a reserva
    Then a mensagem retornada deve ser "Área fora de cobertura"

