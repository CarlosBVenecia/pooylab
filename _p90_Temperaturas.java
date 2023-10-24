public class _p90_Temperaturas {
    public static void main(String[] args) {
        // Declarar e inicializar el arreglo de números flotantes
        float[] temperaturas = {2.34f, 44.56f, 7.89f, 0.5f, 2.5f, 4.67f, 40.3f, 22.35f, 56.22f};

        // Mostrar el primer elemento (índice 0)
        System.out.println("Primer elemento: " + temperaturas[0]);

        // Mostrar el tercer elemento (índice 2)
        System.out.println("Tercer elemento: " + temperaturas[2]);

        // Mostrar todos los elementos del arreglo
        System.out.println("Elementos del arreglo:");
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println(temperaturas[i]);
        }

        // Poner a 0 todos los elementos mayores a 10
        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] > 10.0f) {
                temperaturas[i] = 0.0f;
            }
        }

        // Mostrar nuevamente los elementos del arreglo después de la modificación
        System.out.println("Elementos del arreglo después de poner a 0 los mayores a 10:");
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println(temperaturas[i]);
        }
    }
}
