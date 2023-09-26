import java.util.Scanner;

public class _p78_SumaMultiplos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Selecciona una opción:");
            System.out.println("1. Calcular suma de múltiplos de 3");
            System.out.println("2. Calcular suma de múltiplos de 4");
            System.out.println("3. Salir");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    calcularSumaMultiplos(scanner, 3);
                    break;

                case 2:
                    calcularSumaMultiplos(scanner, 4);
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

    public static void calcularSumaMultiplos(Scanner scanner, int constante) {
        System.out.print("Ingresa el valor inicial del rango: ");
        int ini = scanner.nextInt();
        System.out.print("Ingresa el valor final del rango: ");
        int fin = scanner.nextInt();

        if (ini < fin) {
            int suma = 0;
            for (int i = ini; i <= fin; i++) {
                if (i % constante == 0) {
                    suma += i;
                }
            }
            System.out.println("La suma de los múltiplos de " + constante + " entre " + ini + " y " + fin + " es: " + suma);
        } else {
            System.out.println("El rango de números no es válido. El valor inicial debe ser menor que el valor final.");
        }
    }
}
