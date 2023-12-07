import java.util.InputMismatchException;
import java.util.Scanner;

public class _p128_ExcepcionRaiz {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Introduce un número: ");
                double numero = scanner.nextDouble();

                if (numero < 0) {
                    throw new IllegalArgumentException("Error: No se puede calcular la raíz cuadrada de un número negativo");
                }

                double resultado = Math.sqrt(numero);
                System.out.printf("El resultado es: %.2f%n", resultado);
                break; // Si no hay errores, salir del bucle
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar un número válido.");
                scanner.nextLine(); // Limpiar el buffer del scanner
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
