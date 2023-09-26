import java.util.Scanner;

public class _p64_SumaTerminos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántos términos? ");
        int numTerminos = scanner.nextInt();

        int suma = 0;
        int numero = 1; // Inicia con el número 1.

        System.out.print("Salida: ");
        for (int i = 1; i <= numTerminos; i++) {
            suma += numero;
            
            if (i < numTerminos) {
                System.out.print(numero + "+");
            } else {
                System.out.print(numero);
            }

            // Construye el próximo número en la secuencia multiplicando por 10 y sumando 1.
            numero = numero * 10 + 1;
        }

        System.out.println("\nSuma " + suma);

        scanner.close();
    }
}
