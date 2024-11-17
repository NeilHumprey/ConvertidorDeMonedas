import java.io.IOException;
import java.util.*;

public class Principal {
    public static void main(String[] args) {

        int opcion;

        System.out.println("""
                ************************************************
                "Sea bienvenid@ al conversor de moneda :)
                
                1) Dólar ==> Peso argentino
                2) Peso argentino ==> Dólar
                3) Dólar ==> Real brasileño
                4) Real brasileño ==> Dólar
                5) Dólar ==> Peso colombiano
                6) Peso colombiano ==> Dólar
                
                7) PERSONALIZADO (Ingresando las divisas)
                
                8) Salir
                *************************************************
                """);

        //******************************************************************************************

        Scanner opcionTeclado = new Scanner(System.in);

        do {

            opcion = opcionTeclado.nextInt();

            switch (opcion) {

                case 1:

                    System.out.println("1) De dólar a peso argentino");

                    ConvertirDivisa dolarAPesoArg = new ConvertirDivisa();
                    dolarAPesoArg.deDolarADivisa("ARS");

                    break;

                case 2:

                    System.out.println("2) De pesos argentinos a dólares");

                    ConvertirDivisa pesoArgADolar = new ConvertirDivisa();
                    pesoArgADolar.deDivisaADolar("ARS");

                    break;

                case 3:

                    System.out.println("3) De dólar a real brasileño");

                    ConvertirDivisa dolarABrasileño = new ConvertirDivisa();
                    dolarABrasileño.deDolarADivisa("BRL");

                    break;

                case 4:

                    System.out.println("4) De real brasileño a dólares");

                    ConvertirDivisa realBrasileñoADolar = new ConvertirDivisa();
                    realBrasileñoADolar.deDivisaADolar("BRL");

                    break;

                case 5:

                    System.out.println("5) De dólar a peso colombiano");

                    ConvertirDivisa dolarAPesoColombiano = new ConvertirDivisa();
                    dolarAPesoColombiano.deDolarADivisa("COP");

                    break;

                case 6:

                    System.out.println("6) De peso colombiano a dólares");

                    ConvertirDivisa pesoColoombianoADolar = new ConvertirDivisa();
                    pesoColoombianoADolar.deDivisaADolar("COP");

                    break;

                case 7:

                    System.out.println("1) De dólar a peso peruanos");

                    ConvertirDivisa dolarASolesPeruanos = new ConvertirDivisa();
                    dolarASolesPeruanos.deDolarADivisa("PEN");

                    break;

                case 8:

                    System.out.println("""
                            7) Personalizado: Ingrese las divisas
                            
                            Ejemplo: PEN(Perú) ARS(Argentina)
                                     BRL(Brasil) COP(Colombia)
                            """);

                    System.out.println("Primera divisa: ");
                    Scanner entradaTeclado1 = new Scanner(System.in);
                    String entradaDivisa1 = entradaTeclado1.nextLine().toUpperCase();

                    System.out.println("Segunda divisa: ");
                    Scanner entradaTeclado2 = new Scanner(System.in);
                    String entradaDivisa2 = entradaTeclado2.nextLine().toUpperCase();

                    ConvertirDivisa cambioPersonalizado = new ConvertirDivisa();
                    cambioPersonalizado.deDivisaADivisa(entradaDivisa1, entradaDivisa2);

                    break;

                case 10:

                    System.out.println("Saliendo del programa");

                    break;

                default:

                    System.out.println("Opción no válida, intente de nuevo");

            }
        } while (opcion != 10);

    }
}
