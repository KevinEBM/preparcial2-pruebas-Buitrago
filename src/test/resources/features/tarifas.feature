# language: es
Característica: Cobro del parqueadero

  Esquema del escenario: Cobro por tiempo
    Dado un vehículo tipo "<tipo>"
    Cuando permanece <minutos> minutos
    Entonces debe pagar <valor> pesos

    Ejemplos:
      | tipo  | minutos | valor |
      | carro | 15      | 0     |
      | carro | 61      | 6000  |
      | carro | 1440    | 25000 |

  Escenario: Descuento a cliente frecuente
    Dado un valor de 3000 pesos
    Cuando el cliente es "frecuente"
    Entonces debe pagar 2700 pesos
