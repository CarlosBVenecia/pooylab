// Imprime la tabla que el ususario pide, hasta donde lo pida

import java.util.Scanner;



public class _p68_TablaMultiplicar {
    public static void main(String[] args) {
        int t, n;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J");System.out.flush();

        System.out.print("Que tabla quieres "); t = obj.nextInt();
        System.out.print("Hasta donde       "); n = obj.nextInt();

        TablaMultiplicar(t, n);

        

    }
}
