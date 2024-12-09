import java.util.Scanner;

public class CurrencyConverter {

    // Metodo para convertir divisas
    public static double convert(double amount, double rate) {
        return amount * rate;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double amount;
        double convertedAmount;
        double rate;

        do {
            System.out.println("Seleccione una opción de conversión:");
            System.out.println("1- De dólar a peso argentino");
            System.out.println("2- De peso argentino a dólar");
            System.out.println("3- De dólar a real brasileño");
            System.out.println("4- De real brasileño a dólar");
            System.out.println("5- De dólar a peso colombiano");
            System.out.println("6- De peso colombiano a dólar");
            System.out.println("7- Salir");
            System.out.print("Opción: ");
            choice = scanner.nextInt();

            if (choice >= 1 && choice <= 6) {
                System.out.print("Ingrese el monto a convertir: ");
                amount = scanner.nextDouble();

                switch (choice) {
                    case 1:
                        rate = 350; // Tasa de cambio ficticia de USD a ARS
                        convertedAmount = convert(amount, rate);
                        System.out.println("El monto convertido es: " + convertedAmount + " ARS");
                        break;
                    case 2:
                        rate = 1 / 350.0; // Tasa de cambio ficticia de ARS a USD
                        convertedAmount = convert(amount, rate);
                        System.out.println("El monto convertido es: " + convertedAmount + " USD");
                        break;
                    case 3:
                        rate = 5.3; // Tasa de cambio ficticia de USD a BRL
                        convertedAmount = convert(amount, rate);
                        System.out.println("El monto convertido es: " + convertedAmount + " BRL");
                        break;
                    case 4:
                        rate = 1 / 5.3; // Tasa de cambio ficticia de BRL a USD
                        convertedAmount = convert(amount, rate);
                        System.out.println("El monto convertido es: " + convertedAmount + " USD");
                        break;
                    case 5:
                        rate = 4.1; // Tasa de cambio ficticia de USD a COP
                        convertedAmount = convert(amount, rate);
                        System.out.println("El monto convertido es: " + convertedAmount + " COP");
                        break;
                    case 6:
                        rate = 1 / 4.1; // Tasa de cambio ficticia de COP a USD
                        convertedAmount = convert(amount, rate);
                        System.out.println("El monto convertido es: " + convertedAmount + " USD");
                        break;
                }
            } else if (choice != 7) {
                System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        } while (choice != 7);

        System.out.println("Programa terminado.");
    }
}
