package parqueadero.unitarias;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import parqueadero.Descuentos;

/** Pruebas de aplicarDescuento. */
class DescuentosTest {

    private final Descuentos descuentos = new Descuentos();

    @Test
    @DisplayName("Cliente frecuente tiene 10 % de descuento")
    void clienteFrecuente() {
        assertEquals(2700, descuentos.aplicarDescuento(3000, "frecuente"));
    }
}