import java.util.Scanner;

public class _p75_NumeroMenor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese cuatro números enteros:");
        
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();
        int numero3 = sc.nextInt();
        int numero4 = sc.nextInt();
        
        int menor = encontrarMenor(numero1, numero2, numero3, numero4);
        
        System.out.println("El número menor de los cuatro es: " + menor);
        
        sc.close();
    }
    
    // Función para encontrar el número menor entre cuatro números enteros
    public static int encontrarMenor(int num1, int num2, int num3, int num4) {
        int menor = num1;
        
        if (num2 < menor) {
            menor = num2;
        }
        
        if (num3 < menor) {
            menor = num3;
        }
        
        if (num4 < menor) {
            menor = num4;
        }
        
        return menor;
    }
}