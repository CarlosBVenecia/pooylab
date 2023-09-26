// Suma los digitos invididuales de un numero entero, usando una funcion

import java.util.Scanner;

public class _p71_SumaDigitos {

    public static SumaDigitos(int num) {
        int num=0, dig=0, suma=0;
        while(num!=0) {
            dig = num % 10;
            suma = suma + dig;
            num = num / 10;
        }
        return suma;
    }
    public static void main(String[] args){
        int num=0;

        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.print("Dame un numero entero ");
        num = new Scanner(System.in).nextInt();

        
        System.out.printf("\nLa suma de os digitos es %d", SumaDigitos(num));


    }
    
    
}
