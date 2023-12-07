import java.util.InputMismatchException;
import java.util.Scanner;

public class _p130_ExcepcionEdades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] edades = new int[5];

        System.out.println("Captura las edades de 5 personas:");

        for (int i = 0; i < 5; i++) {
            try {
                System.out.print("Edad persona " + (i + 1) + ": ");
                edades[i] = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Introduce un número entero");
                scanner.next(); // Limpiar el buffer del scanner
                i--; // Repetir el bucle para la misma persona
            }
        }

        System.out.print("Captura terminada, las edades son: ");
        for (int edad : edades) {
            System.out.print(edad + " ");
        }
    }
}
