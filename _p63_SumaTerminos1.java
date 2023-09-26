import java.util.Scanner;

public class _p63_SumaTerminos1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántos términos? ");
        int numTerminos = scanner.nextInt();

        double suma = 0.0;

        System.out.print("Salida: ");
        for (int i = 1; i <= numTerminos; i++) {
            double termino = 1.0 / i;
            suma += termino;

            if (i < numTerminos) {
                System.out.print("1/" + i + "+");
            } else {
                System.out.print("1/" + i);
            }
        }

        System.out.println("\nSuma " + suma);

        scanner.close();
    }
}