import java.util.Scanner;

public class _p77_MedidasLongitud {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Selecciona una opción:");
            System.out.println("1. Convertir pulgadas a centímetros");
            System.out.println("2. Convertir metros a pies");
            System.out.println("3. Salir");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa la cantidad de pulgadas: ");
                    double pulgadas = scanner.nextDouble();
                    double centimetros = convertirPulgadasACentimetros(pulgadas);
                    System.out.println(pulgadas + " pulgadas son " + centimetros + " centímetros");
                    break;

                case 2:
                    System.out.print("Ingresa la cantidad de metros: ");
                    double metros = scanner.nextDouble();
                    double pies = convertirMetrosAPies(metros);
                    System.out.println(metros + " metros son " + pies + " pies");
                    break;

                case 3:
                    System.out.println("Saliendo del programa.");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción válida.");
                    break;
            }

        } while (opcion != 3);
    }

    public static double convertirPulgadasACentimetros(double pulgadas) {
        return pulgadas * 2.54;
    }

    public static double convertirMetrosAPies(double metros) {
        return metros * 3.281;
    }
}