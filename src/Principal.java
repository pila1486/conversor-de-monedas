import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Conversor convertir = new Conversor();
        try{
        String mensajePrincipal = """
                 *************************************************
                 Sea bienvenido/a al conversor de monedas.
                
                 indique el número que corresponda a la conversión que desea realizar:
                 1- Dólar => Peso argentino
                 2- Peso argentino => Dólar
                 3- Dolar => Real brasilero
                 4- Real brasilero => Dólar
                 5- Dólar => Peso colombiano
                 6- Peso colombiano => Dólar
                 7- Salir
                *******************************************************
                """;
        Scanner lectura = new Scanner(System.in);
        System.out.println(mensajePrincipal);
        String moneda = lectura.nextLine();
        while (!moneda.equals("7")) {
            switch (moneda){
                case "1":
                    System.out.println(convertir.convertir("USD", "ARS"));
                    System.out.println(mensajePrincipal);
                    moneda = lectura.nextLine();
                    break;
                case "2":
                    System.out.println(convertir.convertir("ARS", "USD"));
                    System.out.println(mensajePrincipal);
                    moneda = lectura.nextLine();
                    break;
                case "3":
                    System.out.println(convertir.convertir("USD", "BRL"));
                    System.out.println(mensajePrincipal);
                    moneda = lectura.nextLine();
                    break;
                case "4":
                    System.out.println(convertir.convertir("BRL", "USD"));
                    System.out.println(mensajePrincipal);
                    moneda = lectura.nextLine();
                    break;
                case "5":
                    System.out.println(convertir.convertir("USD", "COP"));
                    System.out.println(mensajePrincipal);
                    moneda = lectura.nextLine();
                    break;
                case "6":
                    System.out.println(convertir.convertir("COP", "USD"));
                    System.out.println(mensajePrincipal);
                    moneda = lectura.nextLine();
                    break;
                default:
                    System.out.println("la opción ingresada no es correcta. Ingrese una opción válida.");
                    moneda = lectura.nextLine();
                    break;
            }
//
        };
        System.out.println("la aplicación ha finalizado");
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
            System.out.println("Fianlizadno la aplicación.");
        }

    }
}
