import java.util.Scanner;

public class _p125_Excepcion5 {
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40};

        
        try {
            System.out.println("Que posicion del arreglo quieres acceder ?"); int pos = new Scanner(System.in).nextInt();
            System.out.println("La posicion " + pos + ", contiene el valor " + a[pos]);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Estas accediendo una posicion fuera de los limites del arreglo, no jodas ! ");
        } finally {
            System.out.println("Los elemntos del arreglo son:");
            for (int i : a) {
                System.out.print(i + " ");
            }
        }
    }
}
