import java.util.Scanner;

public class _p61_SecuenciaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántos renglones? ");
        int numRenglones = scanner.nextInt();

        for (int i = 1; i <= numRenglones; i++) {
            // Imprime los números repetidos en cada renglón.
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println(); // Salto de línea para pasar al siguiente renglón.
        }

        scanner.close();
    }
}