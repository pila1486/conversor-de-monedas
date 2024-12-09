import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversor {

    public Cotizacion convertir(String monedaUno, String monedaDos){
//API Key: a5731e4b4cfc33651640861f

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/a5731e4b4cfc33651640861f/pair/" + monedaUno + "/" + monedaDos);
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(direccion).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            String respuesta = response.body();
            Gson gson = new Gson();
           return gson.fromJson(respuesta, Cotizacion.class);
        } catch (Exception e) {
            throw new RuntimeException("Se ha producido un error. "+e.getMessage());
        }

    };

}
