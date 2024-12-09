import java.text.DecimalFormat;

public record Cotizacion(String result, String base_code, String target_code, double conversion_rate  ) {
    @Override
    public String toString() {
        return "La cotización de 1"+base_code+ " al día de hoy es: " + conversion_rate + target_code;
    }
}
