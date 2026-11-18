package parqueadero.bdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import parqueadero.CalculadoraTarifas;
import parqueadero.Descuentos;

public class TarifasSteps {

    private String tipo;
    private int valor;
    private int resultado;

    @Dado("un vehículo tipo {string}")
    public void unVehiculoTipo(String tipo) {
        this.tipo = tipo;
    }

    @Cuando("permanece {int} minutos")
    public void permaneceMinutos(int minutos) {
        resultado = new CalculadoraTarifas().calcularTarifa(minutos, tipo);
    }

    @Dado("un valor de {int} pesos")
    public void unValorDePesos(int valor) {
        this.valor = valor;
    }

    @Cuando("el cliente es {string}")
    public void elClienteEs(String tipoCliente) {
        resultado = new Descuentos().aplicarDescuento(valor, tipoCliente);
    }

    @Entonces("debe pagar {int} pesos")
    public void debePagarPesos(int esperado) {
        assertEquals(esperado, resultado);
    }
}
