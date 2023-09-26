import java.util.Scanner;

public class _p33_NumerosConsecutivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.println("Ingrese el tercer número: ");
        int numero3 = scanner.nextInt();

        // Ordena los números para asegurarse de que estén en orden ascendente.
        int[] numeros = {numero1, numero2, numero3};
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] > numeros[j]) {
                    int temp = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = temp;
                }
            }
        }

        // Verifica si los números son consecutivos y muestra el mensaje correspondiente.
        if (numeros[0] + 1 == numeros[1] && numeros[1] + 1 == numeros[2]) {
            System.out.println("Los números " + numeros[0] + ", " + numeros[1] + ", " + numeros[2] + " son consecutivos.");
        } else {
            System.out.println("Los números " + numeros[0] + ", " + numeros[1] + ", " + numeros[2] + " no son consecutivos.");
        }

        scanner.close();
    }
}