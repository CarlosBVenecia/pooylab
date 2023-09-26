import java.util.Scanner;

public class _p62_SecuenciaNumeros2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántos renglones? ");
        int numRenglones = scanner.nextInt();

        for (int i = 1; i <= numRenglones; i++) {
            // Imprime los números desde 1 hasta el valor de i en cada renglón.
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); // Salto de línea para pasar al siguiente renglón.
        }

        scanner.close();
    }
}