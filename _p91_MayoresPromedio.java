import java.util.Scanner;

public class _p91_MayoresPromedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el número de calificaciones (n)
        System.out.print("Ingrese el número de calificaciones: ");
        int n = scanner.nextInt();

        // Declarar e inicializar el arreglo de calificaciones
        float[] calificaciones = new float[n];

        // Capturar las calificaciones del usuario
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la calificación " + (i + 1) + ": ");
            calificaciones[i] = scanner.nextFloat();
        }

        // Mostrar los elementos del arreglo
        System.out.println("Calificaciones ingresadas:");
        for (int i = 0; i < n; i++) {
            System.out.println(calificaciones[i]);
        }

        // Calcular la suma de las calificaciones
        float suma = 0;
        for (int i = 0; i < n; i++) {
            suma += calificaciones[i];
        }

        // Calcular el promedio
        float promedio = suma / n;
        System.out.println("Suma de las calificaciones: " + suma);
        System.out.println("Promedio de las calificaciones: " + promedio);

        // Mostrar las calificaciones mayores al promedio y contar cuántas son
        int contadorMayorAlPromedio = 0;
        System.out.println("Calificaciones mayores al promedio:");
        for (int i = 0; i < n; i++) {
            if (calificaciones[i] > promedio) {
                System.out.println(calificaciones[i]);
                contadorMayorAlPromedio++;
            }
        }
        System.out.println("Cantidad de calificaciones mayores al promedio: " + contadorMayorAlPromedio);

        scanner.close();
    }
}
