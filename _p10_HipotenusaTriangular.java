import java.util.Scanner;
import java.lang.Math;

public class _p10_HipotenusaTriangular {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la longitud del lado 1: ");
        double longitudLado1 = scanner.nextDouble();

        System.out.println("Ingrese la longitud del lado 2: ");
        double longitudLado2 = scanner.nextDouble();

        // Calcula la hipotenusa usando la fórmula
        double hipotenusa = Math.sqrt(longitudLado1 * longitudLado1 + longitudLado2 * longitudLado2);

        System.out.println("La hipotenusa del triángulo rectángulo es: " + hipotenusa);

        // Cierra el scanner
        scanner.close();
    }
}
