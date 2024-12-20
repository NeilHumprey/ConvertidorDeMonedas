import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.util.Scanner;

public class ConvertirDivisa {

    ConexionConExchangeRate valorDivisas = new ConexionConExchangeRate();
    String jsonExchange = valorDivisas.response.body();
    JsonObject jsonObject = JsonParser.parseString(jsonExchange).getAsJsonObject(); //  Parsear la cadena JSON a un objeto JsonObject
    JsonObject conversionRates = jsonObject.getAsJsonObject("conversion_rates"); // Obtener el objeto "conversion_rates"

    public void deDolarADivisa(String divisa) {

        double valorDivisa = conversionRates.get(divisa).getAsDouble();

        System.out.println("Ingrese el monto: ");
        Scanner entradaTeclado = new Scanner(System.in);

        double montoIngresado = entradaTeclado.nextDouble();
        double operacion = montoIngresado *valorDivisa;

        System.out.println( montoIngresado + " USD = " + operacion + " " + divisa);

    }

    public void deDivisaADolar(String divisa) {

        double valorDivisa = conversionRates.get(divisa).getAsDouble();

        System.out.println("Ingrese el monto: ");
        Scanner entradaTeclado = new Scanner(System.in);

        double montoIngresado = entradaTeclado.nextDouble();
        double operacion = montoIngresado/valorDivisa;

        System.out.println( montoIngresado + " " + divisa + " = " + operacion + " USD ");

    }

    public void deDivisaADivisa(String divisa1, String divisa2) {

        double valorDivisa1 = conversionRates.get(divisa1).getAsDouble();
        double valorDivisa2 = conversionRates.get(divisa2).getAsDouble();

        System.out.println("Ingrese el monto de la primera divisa para su conversión a " + divisa2);
        Scanner entradaTeclado = new Scanner(System.in);

        double montoIngresado = entradaTeclado.nextDouble();
        double operacion = (montoIngresado/valorDivisa1)*valorDivisa2;

        System.out.println( montoIngresado + " " + divisa1 + " = " + operacion + " " + divisa2);

    }

}
