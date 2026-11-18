package parqueadero;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Reportes {

    private final CalculadoraTarifas calculadora = new CalculadoraTarifas();

    public Map<String, Integer> resumen(List<Registro> registros) {
        Map<String, Integer> resumen = new HashMap<>();
        resumen.put("carro", 0);
        resumen.put("moto", 0);
        resumen.put("total_recaudado", 0);
        for (Registro registro : registros) {
            int valor = calculadora.calcularTarifa(registro.minutos(), registro.tipo());
            resumen.put(registro.tipo(), resumen.get(registro.tipo()) + 1);
            resumen.put("total_recaudado", resumen.get("total_recaudado") + valor);
        }
        return resumen;
    }
}
