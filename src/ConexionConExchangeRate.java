import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConexionConExchangeRate {

    URI direccion = URI.create("https://v6.exchangerate-api.com/v6/6413ddac26b015956b534a64/latest/USD?6413ddac26b015956b534a64=");

    HttpClient client = HttpClient.newHttpClient();

    HttpRequest request = HttpRequest.newBuilder()
            .uri(direccion)
            .build();

    HttpResponse<String> response;

    {
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Ocurrio un error inesperado");
        }
    }
}
