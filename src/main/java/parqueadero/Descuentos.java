package parqueadero;

public class Descuentos {

    public int aplicarDescuento(int valor, String tipoCliente) {
        if (tipoCliente.equals("convenio")) {
            return valor * 80 / 100;
        }
        if (tipoCliente.equals("ninguno")) {
            return valor;
        }
        return valor * 90 / 100;
    }
}