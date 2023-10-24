import java.util.Random;

public class _p93_ParesImpares {
     public static void main(String[] args) {
        // Declarar la cantidad máxima de elementos (MAX)
        final int MAX = 100;
        
        // Declarar dos arreglos de números enteros
        int[] a = new int[MAX];
        int[] b = new int[MAX];
        
        // Crear un generador de números aleatorios
        Random rand = new Random();
        
        // Rellenar el arreglo a[] con números aleatorios entre 0 y 20
        for (int i = 0; i < MAX; i++) {
            a[i] = rand.nextInt(21); // Genera un número entre 0 y 20
        }
        
        // Mostrar elementos del arreglo a[]
        System.out.println("Elementos del arreglo a[]:");
        for (int i = 0; i < MAX; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(); // Salto de línea
        
        // Contadores para números pares e impares
        int contadorPares = 0;
        int contadorImpares = 0;
        
        // Mostrar elementos pares e impares y contarlos
        for (int i = 0; i < MAX; i++) {
            if (a[i] % 2 == 0) { // Comprobar si es par
                System.out.println("Elemento par: " + a[i]);
                contadorPares++;
            } else {
                System.out.println("Elemento impar: " + a[i]);
                contadorImpares++;
            }
        }
        
        // Mostrar la cuenta de pares e impares
        System.out.println("Cantidad de elementos pares: " + contadorPares);
        System.out.println("Cantidad de elementos impares: " + contadorImpares);
    }
}
