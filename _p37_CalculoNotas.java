import java.util.Scanner;

public class _p37_CalculoNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa tus 5 calificaciones:");

        double suma = 0.0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Calificación " + i + ": ");
            double calificacion = scanner.nextDouble();
            suma += calificacion;
        }

        double promedio = suma / 5.0;

        System.out.println("Promedio: " + promedio);

        if (promedio > 0 && promedio <= 6) {
            System.out.println("Quedas reprobado");
        } else if (promedio > 6 && promedio <= 7) {
            System.out.println("Pasas de panzazo");
        } else if (promedio > 7 && promedio <= 8) {
            System.out.println("Muy bien, pues mejorar");
        } else if (promedio > 8 && promedio <= 9) {
            System.out.println("Excelente, sigue así");
        } else if (promedio > 9 && promedio <= 10) {
            System.out.println("Perfecto, tu esfuerzo valió la pena");
        } else {
            System.out.println("El promedio está fuera del rango válido.");
        }

        scanner.close();
    }
}