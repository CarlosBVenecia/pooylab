import java.util.Scanner;

public class _p11_CalcularAngulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario que ingrese los dos primeros ángulos
        System.out.print("Ingresa el primer ángulo: ");
        double angulo1 = sc.nextDouble();
        System.out.print("Ingresa el segundo ángulo: ");
        double angulo2 = sc.nextDouble();

        // Calcular el tercer ángulo
        double angulo3 = 180 - (angulo1 + angulo2);

        // Mostrar el resultado
        System.out.println("El tercer ángulo es: " + angulo3);

        sc.close();
    }
}