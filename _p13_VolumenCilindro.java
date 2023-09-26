import java.util.Scanner;

public class _p13_VolumenCilindro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definir el valor de PI
        final double PI = 3.14159265359;

        System.out.print("Ingrese el radio del cilindro: ");
        double radio = scanner.nextDouble();

        System.out.print("Ingrese la altura del cilindro: ");
        double altura = scanner.nextDouble();

        // Calcular el volumen del cilindro
        double volumen = PI * (radio * radio) * altura;

        System.out.println("El volumen del cilindro es: " + volumen);

        scanner.close();
    }
}